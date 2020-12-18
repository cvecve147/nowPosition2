package org.apache.http.impl.p297io;

import org.apache.http.HttpMessage;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.p298io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
@Deprecated
/* renamed from: org.apache.http.impl.io.HttpResponseParser */
public class HttpResponseParser extends AbstractMessageParser<HttpMessage> {
    private final CharArrayBuffer lineBuf = new CharArrayBuffer(128);
    private final HttpResponseFactory responseFactory;

    public HttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        Args.notNull(httpResponseFactory, "Response factory");
        this.responseFactory = httpResponseFactory;
    }

    /* access modifiers changed from: protected */
    public HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) {
        this.lineBuf.clear();
        if (sessionInputBuffer.readLine(this.lineBuf) != -1) {
            return this.responseFactory.newHttpResponse(this.lineParser.parseStatusLine(this.lineBuf, new ParserCursor(0, this.lineBuf.length())), (HttpContext) null);
        }
        throw new NoHttpResponseException("The target server failed to respond");
    }
}
