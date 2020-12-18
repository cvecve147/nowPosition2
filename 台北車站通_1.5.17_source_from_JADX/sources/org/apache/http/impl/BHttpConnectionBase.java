package org.apache.http.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpMessage;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.p297io.ChunkedInputStream;
import org.apache.http.impl.p297io.ChunkedOutputStream;
import org.apache.http.impl.p297io.ContentLengthInputStream;
import org.apache.http.impl.p297io.ContentLengthOutputStream;
import org.apache.http.impl.p297io.EmptyInputStream;
import org.apache.http.impl.p297io.HttpTransportMetricsImpl;
import org.apache.http.impl.p297io.IdentityInputStream;
import org.apache.http.impl.p297io.IdentityOutputStream;
import org.apache.http.impl.p297io.SessionInputBufferImpl;
import org.apache.http.impl.p297io.SessionOutputBufferImpl;
import org.apache.http.p298io.SessionInputBuffer;
import org.apache.http.p298io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.NetUtils;

@NotThreadSafe
public class BHttpConnectionBase implements HttpConnection, HttpInetConnection {
    private final HttpConnectionMetricsImpl connMetrics;
    private final SessionInputBufferImpl inbuffer;
    private final ContentLengthStrategy incomingContentStrategy;
    private final MessageConstraints messageConstraints;
    private final SessionOutputBufferImpl outbuffer;
    private final ContentLengthStrategy outgoingContentStrategy;
    private final AtomicReference<Socket> socketHolder;

    protected BHttpConnectionBase(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints2, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2) {
        int i3 = i;
        MessageConstraints messageConstraints3 = messageConstraints2;
        Args.positive(i, "Buffer size");
        HttpTransportMetricsImpl httpTransportMetricsImpl = new HttpTransportMetricsImpl();
        HttpTransportMetricsImpl httpTransportMetricsImpl2 = new HttpTransportMetricsImpl();
        this.inbuffer = new SessionInputBufferImpl(httpTransportMetricsImpl, i, -1, messageConstraints3 != null ? messageConstraints3 : MessageConstraints.DEFAULT, charsetDecoder);
        int i4 = i2;
        this.outbuffer = new SessionOutputBufferImpl(httpTransportMetricsImpl2, i, i2, charsetEncoder);
        this.messageConstraints = messageConstraints3;
        this.connMetrics = new HttpConnectionMetricsImpl(httpTransportMetricsImpl, httpTransportMetricsImpl2);
        this.incomingContentStrategy = contentLengthStrategy != null ? contentLengthStrategy : LaxContentLengthStrategy.INSTANCE;
        this.outgoingContentStrategy = contentLengthStrategy2 != null ? contentLengthStrategy2 : StrictContentLengthStrategy.INSTANCE;
        this.socketHolder = new AtomicReference<>();
    }

    /* JADX INFO: finally extract failed */
    private int fillInputBuffer(int i) {
        Socket socket = this.socketHolder.get();
        int soTimeout = socket.getSoTimeout();
        try {
            socket.setSoTimeout(i);
            int fillBuffer = this.inbuffer.fillBuffer();
            socket.setSoTimeout(soTimeout);
            return fillBuffer;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean awaitInput(int i) {
        if (this.inbuffer.hasBufferedData()) {
            return true;
        }
        fillInputBuffer(i);
        return this.inbuffer.hasBufferedData();
    }

    /* access modifiers changed from: protected */
    public void bind(Socket socket) {
        Args.notNull(socket, "Socket");
        this.socketHolder.set(socket);
        this.inbuffer.bind((InputStream) null);
        this.outbuffer.bind((OutputStream) null);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:6:0x0018] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.net.Socket> r0 = r2.socketHolder
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.net.Socket r0 = (java.net.Socket) r0
            if (r0 == 0) goto L_0x0024
            org.apache.http.impl.io.SessionInputBufferImpl r1 = r2.inbuffer     // Catch:{ all -> 0x001f }
            r1.clear()     // Catch:{ all -> 0x001f }
            org.apache.http.impl.io.SessionOutputBufferImpl r1 = r2.outbuffer     // Catch:{ all -> 0x001f }
            r1.flush()     // Catch:{ all -> 0x001f }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x001b, UnsupportedOperationException -> 0x001b }
        L_0x001b:
            r0.close()
            goto L_0x0024
        L_0x001f:
            r1 = move-exception
            r0.close()
            throw r1
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.BHttpConnectionBase.close():void");
    }

    /* access modifiers changed from: protected */
    public InputStream createInputStream(long j, SessionInputBuffer sessionInputBuffer) {
        return j == -2 ? new ChunkedInputStream(sessionInputBuffer, this.messageConstraints) : j == -1 ? new IdentityInputStream(sessionInputBuffer) : j == 0 ? EmptyInputStream.INSTANCE : new ContentLengthInputStream(sessionInputBuffer, j);
    }

    /* access modifiers changed from: protected */
    public OutputStream createOutputStream(long j, SessionOutputBuffer sessionOutputBuffer) {
        return j == -2 ? new ChunkedOutputStream(2048, sessionOutputBuffer) : j == -1 ? new IdentityOutputStream(sessionOutputBuffer) : new ContentLengthOutputStream(sessionOutputBuffer, j);
    }

    /* access modifiers changed from: protected */
    public void doFlush() {
        this.outbuffer.flush();
    }

    /* access modifiers changed from: protected */
    public void ensureOpen() {
        Socket socket = this.socketHolder.get();
        Asserts.check(socket != null, "Connection is not open");
        if (!this.inbuffer.isBound()) {
            this.inbuffer.bind(getSocketInputStream(socket));
        }
        if (!this.outbuffer.isBound()) {
            this.outbuffer.bind(getSocketOutputStream(socket));
        }
    }

    public InetAddress getLocalAddress() {
        Socket socket = this.socketHolder.get();
        if (socket != null) {
            return socket.getLocalAddress();
        }
        return null;
    }

    public int getLocalPort() {
        Socket socket = this.socketHolder.get();
        if (socket != null) {
            return socket.getLocalPort();
        }
        return -1;
    }

    public HttpConnectionMetrics getMetrics() {
        return this.connMetrics;
    }

    public InetAddress getRemoteAddress() {
        Socket socket = this.socketHolder.get();
        if (socket != null) {
            return socket.getInetAddress();
        }
        return null;
    }

    public int getRemotePort() {
        Socket socket = this.socketHolder.get();
        if (socket != null) {
            return socket.getPort();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public SessionInputBuffer getSessionInputBuffer() {
        return this.inbuffer;
    }

    /* access modifiers changed from: protected */
    public SessionOutputBuffer getSessionOutputBuffer() {
        return this.outbuffer;
    }

    /* access modifiers changed from: protected */
    public Socket getSocket() {
        return this.socketHolder.get();
    }

    /* access modifiers changed from: protected */
    public InputStream getSocketInputStream(Socket socket) {
        return socket.getInputStream();
    }

    /* access modifiers changed from: protected */
    public OutputStream getSocketOutputStream(Socket socket) {
        return socket.getOutputStream();
    }

    public int getSocketTimeout() {
        Socket socket = this.socketHolder.get();
        if (socket != null) {
            try {
                return socket.getSoTimeout();
            } catch (SocketException unused) {
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void incrementRequestCount() {
        this.connMetrics.incrementRequestCount();
    }

    /* access modifiers changed from: protected */
    public void incrementResponseCount() {
        this.connMetrics.incrementResponseCount();
    }

    public boolean isOpen() {
        return this.socketHolder.get() != null;
    }

    public boolean isStale() {
        if (!isOpen()) {
            return true;
        }
        try {
            return fillInputBuffer(1) < 0;
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpEntity prepareInput(org.apache.http.HttpMessage r9) {
        /*
            r8 = this;
            org.apache.http.entity.BasicHttpEntity r0 = new org.apache.http.entity.BasicHttpEntity
            r0.<init>()
            org.apache.http.entity.ContentLengthStrategy r1 = r8.incomingContentStrategy
            long r1 = r1.determineLength(r9)
            org.apache.http.impl.io.SessionInputBufferImpl r3 = r8.inbuffer
            java.io.InputStream r3 = r8.createInputStream(r1, r3)
            r4 = -2
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r5 = -1
            if (r4 != 0) goto L_0x0024
            r1 = 1
            r0.setChunked(r1)
        L_0x001d:
            r0.setContentLength(r5)
        L_0x0020:
            r0.setContent(r3)
            goto L_0x0034
        L_0x0024:
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 0
            if (r4 != 0) goto L_0x002d
            r0.setChunked(r7)
            goto L_0x001d
        L_0x002d:
            r0.setChunked(r7)
            r0.setContentLength(r1)
            goto L_0x0020
        L_0x0034:
            java.lang.String r1 = "Content-Type"
            org.apache.http.Header r1 = r9.getFirstHeader(r1)
            if (r1 == 0) goto L_0x003f
            r0.setContentType((org.apache.http.Header) r1)
        L_0x003f:
            java.lang.String r1 = "Content-Encoding"
            org.apache.http.Header r9 = r9.getFirstHeader(r1)
            if (r9 == 0) goto L_0x004a
            r0.setContentEncoding((org.apache.http.Header) r9)
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.BHttpConnectionBase.prepareInput(org.apache.http.HttpMessage):org.apache.http.HttpEntity");
    }

    /* access modifiers changed from: protected */
    public OutputStream prepareOutput(HttpMessage httpMessage) {
        return createOutputStream(this.outgoingContentStrategy.determineLength(httpMessage), this.outbuffer);
    }

    public void setSocketTimeout(int i) {
        Socket socket = this.socketHolder.get();
        if (socket != null) {
            try {
                socket.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    public void shutdown() {
        Socket andSet = this.socketHolder.getAndSet((Object) null);
        if (andSet != null) {
            try {
                andSet.setSoLinger(true, 0);
            } catch (IOException unused) {
            } catch (Throwable th) {
                andSet.close();
                throw th;
            }
            andSet.close();
        }
    }

    public String toString() {
        Socket socket = this.socketHolder.get();
        if (socket == null) {
            return "[Not bound]";
        }
        StringBuilder sb = new StringBuilder();
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        SocketAddress localSocketAddress = socket.getLocalSocketAddress();
        if (!(remoteSocketAddress == null || localSocketAddress == null)) {
            NetUtils.formatAddress(sb, localSocketAddress);
            sb.append("<->");
            NetUtils.formatAddress(sb, remoteSocketAddress);
        }
        return sb.toString();
    }
}
