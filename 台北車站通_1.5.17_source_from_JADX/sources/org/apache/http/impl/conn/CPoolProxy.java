package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.protocol.HttpContext;

@NotThreadSafe
class CPoolProxy implements ManagedHttpClientConnection, HttpContext {
    private volatile CPoolEntry poolEntry;

    CPoolProxy(CPoolEntry cPoolEntry) {
        this.poolEntry = cPoolEntry;
    }

    public static CPoolEntry detach(HttpClientConnection httpClientConnection) {
        return getProxy(httpClientConnection).detach();
    }

    public static CPoolEntry getPoolEntry(HttpClientConnection httpClientConnection) {
        CPoolEntry poolEntry2 = getProxy(httpClientConnection).getPoolEntry();
        if (poolEntry2 != null) {
            return poolEntry2;
        }
        throw new ConnectionShutdownException();
    }

    private static CPoolProxy getProxy(HttpClientConnection httpClientConnection) {
        if (CPoolProxy.class.isInstance(httpClientConnection)) {
            return CPoolProxy.class.cast(httpClientConnection);
        }
        throw new IllegalStateException("Unexpected connection proxy class: " + httpClientConnection.getClass());
    }

    public static HttpClientConnection newProxy(CPoolEntry cPoolEntry) {
        return new CPoolProxy(cPoolEntry);
    }

    public void bind(Socket socket) {
        getValidConnection().bind(socket);
    }

    public void close() {
        CPoolEntry cPoolEntry = this.poolEntry;
        if (cPoolEntry != null) {
            cPoolEntry.closeConnection();
        }
    }

    /* access modifiers changed from: package-private */
    public CPoolEntry detach() {
        CPoolEntry cPoolEntry = this.poolEntry;
        this.poolEntry = null;
        return cPoolEntry;
    }

    public void flush() {
        getValidConnection().flush();
    }

    public Object getAttribute(String str) {
        ManagedHttpClientConnection validConnection = getValidConnection();
        if (validConnection instanceof HttpContext) {
            return ((HttpContext) validConnection).getAttribute(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ManagedHttpClientConnection getConnection() {
        CPoolEntry cPoolEntry = this.poolEntry;
        if (cPoolEntry == null) {
            return null;
        }
        return (ManagedHttpClientConnection) cPoolEntry.getConnection();
    }

    public String getId() {
        return getValidConnection().getId();
    }

    public InetAddress getLocalAddress() {
        return getValidConnection().getLocalAddress();
    }

    public int getLocalPort() {
        return getValidConnection().getLocalPort();
    }

    public HttpConnectionMetrics getMetrics() {
        return getValidConnection().getMetrics();
    }

    /* access modifiers changed from: package-private */
    public CPoolEntry getPoolEntry() {
        return this.poolEntry;
    }

    public InetAddress getRemoteAddress() {
        return getValidConnection().getRemoteAddress();
    }

    public int getRemotePort() {
        return getValidConnection().getRemotePort();
    }

    public SSLSession getSSLSession() {
        return getValidConnection().getSSLSession();
    }

    public Socket getSocket() {
        return getValidConnection().getSocket();
    }

    public int getSocketTimeout() {
        return getValidConnection().getSocketTimeout();
    }

    /* access modifiers changed from: package-private */
    public ManagedHttpClientConnection getValidConnection() {
        ManagedHttpClientConnection connection = getConnection();
        if (connection != null) {
            return connection;
        }
        throw new ConnectionShutdownException();
    }

    public boolean isOpen() {
        CPoolEntry cPoolEntry = this.poolEntry;
        if (cPoolEntry != null) {
            return !cPoolEntry.isClosed();
        }
        return false;
    }

    public boolean isResponseAvailable(int i) {
        return getValidConnection().isResponseAvailable(i);
    }

    public boolean isStale() {
        ManagedHttpClientConnection connection = getConnection();
        if (connection != null) {
            return connection.isStale();
        }
        return true;
    }

    public void receiveResponseEntity(HttpResponse httpResponse) {
        getValidConnection().receiveResponseEntity(httpResponse);
    }

    public HttpResponse receiveResponseHeader() {
        return getValidConnection().receiveResponseHeader();
    }

    public Object removeAttribute(String str) {
        ManagedHttpClientConnection validConnection = getValidConnection();
        if (validConnection instanceof HttpContext) {
            return ((HttpContext) validConnection).removeAttribute(str);
        }
        return null;
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        getValidConnection().sendRequestEntity(httpEntityEnclosingRequest);
    }

    public void sendRequestHeader(HttpRequest httpRequest) {
        getValidConnection().sendRequestHeader(httpRequest);
    }

    public void setAttribute(String str, Object obj) {
        ManagedHttpClientConnection validConnection = getValidConnection();
        if (validConnection instanceof HttpContext) {
            ((HttpContext) validConnection).setAttribute(str, obj);
        }
    }

    public void setSocketTimeout(int i) {
        getValidConnection().setSocketTimeout(i);
    }

    public void shutdown() {
        CPoolEntry cPoolEntry = this.poolEntry;
        if (cPoolEntry != null) {
            cPoolEntry.shutdownConnection();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CPoolProxy{");
        ManagedHttpClientConnection connection = getConnection();
        if (connection != null) {
            sb.append(connection);
        } else {
            sb.append("detached");
        }
        sb.append('}');
        return sb.toString();
    }
}
