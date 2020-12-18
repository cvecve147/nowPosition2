package org.apache.http.impl.p297io;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.Immutable;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p298io.HttpMessageWriter;
import org.apache.http.p298io.HttpMessageWriterFactory;
import org.apache.http.p298io.SessionOutputBuffer;

@Immutable
/* renamed from: org.apache.http.impl.io.DefaultHttpRequestWriterFactory */
public class DefaultHttpRequestWriterFactory implements HttpMessageWriterFactory<HttpRequest> {
    public static final DefaultHttpRequestWriterFactory INSTANCE = new DefaultHttpRequestWriterFactory();
    private final LineFormatter lineFormatter;

    public DefaultHttpRequestWriterFactory() {
        this((LineFormatter) null);
    }

    public DefaultHttpRequestWriterFactory(LineFormatter lineFormatter2) {
        this.lineFormatter = lineFormatter2 == null ? BasicLineFormatter.INSTANCE : lineFormatter2;
    }

    public HttpMessageWriter<HttpRequest> create(SessionOutputBuffer sessionOutputBuffer) {
        return new DefaultHttpRequestWriter(sessionOutputBuffer, this.lineFormatter);
    }
}
