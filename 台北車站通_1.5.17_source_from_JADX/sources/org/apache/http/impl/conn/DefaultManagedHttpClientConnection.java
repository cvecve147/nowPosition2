package org.apache.http.impl.conn;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.p298io.HttpMessageParserFactory;
import org.apache.http.p298io.HttpMessageWriterFactory;
import org.apache.http.protocol.HttpContext;

@NotThreadSafe
public class DefaultManagedHttpClientConnection extends DefaultBHttpClientConnection implements ManagedHttpClientConnection, HttpContext {
    private final Map<String, Object> attributes;

    /* renamed from: id */
    private final String f19304id;
    private volatile boolean shutdown;

    public DefaultManagedHttpClientConnection(String str, int i) {
        this(str, i, i, (CharsetDecoder) null, (CharsetEncoder) null, (MessageConstraints) null, (ContentLengthStrategy) null, (ContentLengthStrategy) null, (HttpMessageWriterFactory<HttpRequest>) null, (HttpMessageParserFactory<HttpResponse>) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultManagedHttpClientConnection(String str, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(i, i2, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2, httpMessageWriterFactory, httpMessageParserFactory);
        this.f19304id = str;
        this.attributes = new ConcurrentHashMap();
    }

    public void bind(Socket socket) {
        if (!this.shutdown) {
            super.bind(socket);
        } else {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
    }

    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    public String getId() {
        return this.f19304id;
    }

    public SSLSession getSSLSession() {
        Socket socket = super.getSocket();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    public Socket getSocket() {
        return super.getSocket();
    }

    public Object removeAttribute(String str) {
        return this.attributes.remove(str);
    }

    public void setAttribute(String str, Object obj) {
        this.attributes.put(str, obj);
    }

    public void shutdown() {
        this.shutdown = true;
        super.shutdown();
    }
}
