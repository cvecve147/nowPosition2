package org.apache.http.impl.p297io;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.message.LineFormatter;
import org.apache.http.p298io.SessionOutputBuffer;

@NotThreadSafe
/* renamed from: org.apache.http.impl.io.DefaultHttpResponseWriter */
public class DefaultHttpResponseWriter extends AbstractMessageWriter<HttpResponse> {
    public DefaultHttpResponseWriter(SessionOutputBuffer sessionOutputBuffer) {
        super(sessionOutputBuffer, (LineFormatter) null);
    }

    public DefaultHttpResponseWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    /* access modifiers changed from: protected */
    public void writeHeadLine(HttpResponse httpResponse) {
        this.lineFormatter.formatStatusLine(this.lineBuf, httpResponse.getStatusLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
