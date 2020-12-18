package org.apache.http.impl.p297io;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.message.LineFormatter;
import org.apache.http.p298io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

@NotThreadSafe
@Deprecated
/* renamed from: org.apache.http.impl.io.HttpResponseWriter */
public class HttpResponseWriter extends AbstractMessageWriter<HttpResponse> {
    public HttpResponseWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        super(sessionOutputBuffer, lineFormatter, httpParams);
    }

    /* access modifiers changed from: protected */
    public void writeHeadLine(HttpResponse httpResponse) {
        this.lineFormatter.formatStatusLine(this.lineBuf, httpResponse.getStatusLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
