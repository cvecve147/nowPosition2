package org.apache.http.impl.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.logging.Log;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.p298io.HttpMessageParserFactory;
import org.apache.http.p298io.HttpMessageWriterFactory;

@NotThreadSafe
class LoggingManagedHttpClientConnection extends DefaultManagedHttpClientConnection {
    private final Log headerlog;
    private final Log log;
    private final Wire wire;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoggingManagedHttpClientConnection(String str, Log log2, Log log3, Log log4, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(str, i, i2, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2, httpMessageWriterFactory, httpMessageParserFactory);
        this.log = log2;
        this.headerlog = log3;
        this.wire = new Wire(log4, str);
    }

    public void close() {
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            log2.debug(getId() + ": Close connection");
        }
        super.close();
    }

    /* access modifiers changed from: protected */
    public InputStream getSocketInputStream(Socket socket) {
        InputStream socketInputStream = super.getSocketInputStream(socket);
        return this.wire.enabled() ? new LoggingInputStream(socketInputStream, this.wire) : socketInputStream;
    }

    /* access modifiers changed from: protected */
    public OutputStream getSocketOutputStream(Socket socket) {
        OutputStream socketOutputStream = super.getSocketOutputStream(socket);
        return this.wire.enabled() ? new LoggingOutputStream(socketOutputStream, this.wire) : socketOutputStream;
    }

    /* access modifiers changed from: protected */
    public void onRequestSubmitted(HttpRequest httpRequest) {
        if (httpRequest != null && this.headerlog.isDebugEnabled()) {
            this.headerlog.debug(getId() + " >> " + httpRequest.getRequestLine().toString());
            for (Header header : httpRequest.getAllHeaders()) {
                this.headerlog.debug(getId() + " >> " + header.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResponseReceived(HttpResponse httpResponse) {
        if (httpResponse != null && this.headerlog.isDebugEnabled()) {
            this.headerlog.debug(getId() + " << " + httpResponse.getStatusLine().toString());
            for (Header header : httpResponse.getAllHeaders()) {
                this.headerlog.debug(getId() + " << " + header.toString());
            }
        }
    }

    public void shutdown() {
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            log2.debug(getId() + ": Shutdown connection");
        }
        super.shutdown();
    }
}
