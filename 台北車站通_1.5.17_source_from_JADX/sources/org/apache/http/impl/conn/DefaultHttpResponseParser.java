package org.apache.http.impl.conn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.p297io.AbstractMessageParser;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.p298io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public class DefaultHttpResponseParser extends AbstractMessageParser<HttpResponse> {
    private final CharArrayBuffer lineBuf;
    private final Log log;
    private final HttpResponseFactory responseFactory;

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, MessageConstraints.DEFAULT);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, messageConstraints);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, MessageConstraints messageConstraints) {
        super(sessionInputBuffer, lineParser, messageConstraints);
        this.log = LogFactory.getLog(DefaultHttpResponseParser.class);
        this.responseFactory = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
    }

    @Deprecated
    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.log = LogFactory.getLog(DefaultHttpResponseParser.class);
        Args.notNull(httpResponseFactory, "Response factory");
        this.responseFactory = httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
    }

    /* access modifiers changed from: protected */
    public HttpResponse parseHead(SessionInputBuffer sessionInputBuffer) {
        int i = 0;
        while (true) {
            this.lineBuf.clear();
            int readLine = sessionInputBuffer.readLine(this.lineBuf);
            if (readLine == -1 && i == 0) {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            ParserCursor parserCursor = new ParserCursor(0, this.lineBuf.length());
            if (this.lineParser.hasProtocolVersion(this.lineBuf, parserCursor)) {
                return this.responseFactory.newHttpResponse(this.lineParser.parseStatusLine(this.lineBuf, parserCursor), (HttpContext) null);
            } else if (readLine != -1 && !reject(this.lineBuf, i)) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Garbage in response: " + this.lineBuf.toString());
                }
                i++;
            }
        }
        throw new ProtocolException("The server failed to respond with a valid HTTP response");
    }

    /* access modifiers changed from: protected */
    public boolean reject(CharArrayBuffer charArrayBuffer, int i) {
        return false;
    }
}
