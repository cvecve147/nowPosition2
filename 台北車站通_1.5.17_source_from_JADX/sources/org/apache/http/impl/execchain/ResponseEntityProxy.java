package org.apache.http.impl.execchain;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.conn.EofSensorInputStream;
import org.apache.http.conn.EofSensorWatcher;
import org.apache.http.entity.HttpEntityWrapper;

@NotThreadSafe
class ResponseEntityProxy extends HttpEntityWrapper implements EofSensorWatcher {
    private final ConnectionHolder connHolder;

    ResponseEntityProxy(HttpEntity httpEntity, ConnectionHolder connectionHolder) {
        super(httpEntity);
        this.connHolder = connectionHolder;
    }

    private void cleanup() {
        ConnectionHolder connectionHolder = this.connHolder;
        if (connectionHolder != null) {
            connectionHolder.abortConnection();
        }
    }

    public static void enchance(HttpResponse httpResponse, ConnectionHolder connectionHolder) {
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && entity.isStreaming() && connectionHolder != null) {
            httpResponse.setEntity(new ResponseEntityProxy(entity, connectionHolder));
        }
    }

    @Deprecated
    public void consumeContent() {
        releaseConnection();
    }

    /* JADX INFO: finally extract failed */
    public boolean eofDetected(InputStream inputStream) {
        try {
            inputStream.close();
            releaseConnection();
            cleanup();
            return false;
        } catch (Throwable th) {
            cleanup();
            throw th;
        }
    }

    public InputStream getContent() {
        return new EofSensorInputStream(this.wrappedEntity.getContent(), this);
    }

    public boolean isRepeatable() {
        return false;
    }

    public void releaseConnection() {
        ConnectionHolder connectionHolder = this.connHolder;
        if (connectionHolder != null) {
            try {
                if (connectionHolder.isReusable()) {
                    this.connHolder.releaseConnection();
                }
            } finally {
                cleanup();
            }
        }
    }

    public boolean streamAbort(InputStream inputStream) {
        cleanup();
        return false;
    }

    public boolean streamClosed(InputStream inputStream) {
        boolean z;
        try {
            z = this.connHolder != null && !this.connHolder.isReleased();
            inputStream.close();
            releaseConnection();
        } catch (SocketException e) {
            if (z) {
                throw e;
            }
        } catch (Throwable th) {
            cleanup();
            throw th;
        }
        cleanup();
        return false;
    }

    public String toString() {
        return "ResponseEntityProxy{" + this.wrappedEntity + '}';
    }

    public void writeTo(OutputStream outputStream) {
        try {
            this.wrappedEntity.writeTo(outputStream);
            releaseConnection();
        } finally {
            cleanup();
        }
    }
}
