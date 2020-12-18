package org.apache.http.impl.p297io;

import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p298io.HttpMessageWriter;
import org.apache.http.p298io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
/* renamed from: org.apache.http.impl.io.AbstractMessageWriter */
public abstract class AbstractMessageWriter<T extends HttpMessage> implements HttpMessageWriter<T> {
    protected final CharArrayBuffer lineBuf;
    protected final LineFormatter lineFormatter;
    protected final SessionOutputBuffer sessionBuffer;

    public AbstractMessageWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter2) {
        Args.notNull(sessionOutputBuffer, "Session input buffer");
        this.sessionBuffer = sessionOutputBuffer;
        this.lineFormatter = lineFormatter2 == null ? BasicLineFormatter.INSTANCE : lineFormatter2;
        this.lineBuf = new CharArrayBuffer(128);
    }

    @Deprecated
    public AbstractMessageWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter2, HttpParams httpParams) {
        Args.notNull(sessionOutputBuffer, "Session input buffer");
        this.sessionBuffer = sessionOutputBuffer;
        this.lineBuf = new CharArrayBuffer(128);
        this.lineFormatter = lineFormatter2 == null ? BasicLineFormatter.INSTANCE : lineFormatter2;
    }

    public void write(T t) {
        Args.notNull(t, "HTTP message");
        writeHeadLine(t);
        HeaderIterator headerIterator = t.headerIterator();
        while (headerIterator.hasNext()) {
            this.sessionBuffer.writeLine(this.lineFormatter.formatHeader(this.lineBuf, headerIterator.nextHeader()));
        }
        this.lineBuf.clear();
        this.sessionBuffer.writeLine(this.lineBuf);
    }

    /* access modifiers changed from: protected */
    public abstract void writeHeadLine(T t);
}
