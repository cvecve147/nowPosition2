package org.apache.http.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@NotThreadSafe
@Deprecated
public class BasicManagedEntity extends HttpEntityWrapper implements ConnectionReleaseTrigger, EofSensorWatcher {
    protected final boolean attemptReuse;
    protected ManagedClientConnection managedConn;

    public BasicManagedEntity(HttpEntity httpEntity, ManagedClientConnection managedClientConnection, boolean z) {
        super(httpEntity);
        Args.notNull(managedClientConnection, "Connection");
        this.managedConn = managedClientConnection;
        this.attemptReuse = z;
    }

    private void ensureConsumed() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            try {
                if (this.attemptReuse) {
                    EntityUtils.consume(this.wrappedEntity);
                    this.managedConn.markReusable();
                } else {
                    managedClientConnection.unmarkReusable();
                }
            } finally {
                releaseManagedConnection();
            }
        }
    }

    public void abortConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            try {
                managedClientConnection.abortConnection();
            } finally {
                this.managedConn = null;
            }
        }
    }

    @Deprecated
    public void consumeContent() {
        ensureConsumed();
    }

    /* JADX INFO: finally extract failed */
    public boolean eofDetected(InputStream inputStream) {
        try {
            if (this.managedConn != null) {
                if (this.attemptReuse) {
                    inputStream.close();
                    this.managedConn.markReusable();
                } else {
                    this.managedConn.unmarkReusable();
                }
            }
            releaseManagedConnection();
            return false;
        } catch (Throwable th) {
            releaseManagedConnection();
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
        ensureConsumed();
    }

    /* access modifiers changed from: protected */
    public void releaseManagedConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            try {
                managedClientConnection.releaseConnection();
            } finally {
                this.managedConn = null;
            }
        }
    }

    public boolean streamAbort(InputStream inputStream) {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection == null) {
            return false;
        }
        managedClientConnection.abortConnection();
        return false;
    }

    public boolean streamClosed(InputStream inputStream) {
        boolean isOpen;
        try {
            if (this.managedConn != null) {
                if (this.attemptReuse) {
                    isOpen = this.managedConn.isOpen();
                    inputStream.close();
                    this.managedConn.markReusable();
                } else {
                    this.managedConn.unmarkReusable();
                }
            }
        } catch (SocketException e) {
            if (isOpen) {
                throw e;
            }
        } catch (Throwable th) {
            releaseManagedConnection();
            throw th;
        }
        releaseManagedConnection();
        return false;
    }

    public void writeTo(OutputStream outputStream) {
        super.writeTo(outputStream);
        ensureConsumed();
    }
}
