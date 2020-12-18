package org.apache.http.impl.p297io;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p298io.HttpMessageWriter;
import org.apache.http.p298io.HttpMessageWriterFactory;
import org.apache.http.p298io.SessionOutputBuffer;

@Immutable
/* renamed from: org.apache.http.impl.io.DefaultHttpResponseWriterFactory */
public class DefaultHttpResponseWriterFactory implements HttpMessageWriterFactory<HttpResponse> {
    public static final DefaultHttpResponseWriterFactory INSTANCE = new DefaultHttpResponseWriterFactory();
    private final LineFormatter lineFormatter;

    public DefaultHttpResponseWriterFactory() {
        this((LineFormatter) null);
    }

    public DefaultHttpResponseWriterFactory(LineFormatter lineFormatter2) {
        this.lineFormatter = lineFormatter2 == null ? BasicLineFormatter.INSTANCE : lineFormatter2;
    }

    public HttpMessageWriter<HttpResponse> create(SessionOutputBuffer sessionOutputBuffer) {
        return new DefaultHttpResponseWriter(sessionOutputBuffer, this.lineFormatter);
    }
}
