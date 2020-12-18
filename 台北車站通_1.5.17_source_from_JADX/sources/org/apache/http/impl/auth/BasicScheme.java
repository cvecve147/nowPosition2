package org.apache.http.impl.auth;

import java.nio.charset.Charset;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.Credentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;
import p250g.p251a.p252a.p253a.p254a.C6459a;

@NotThreadSafe
public class BasicScheme extends RFC2617Scheme {
    private static final long serialVersionUID = -1931571557597830536L;
    private boolean complete;

    public BasicScheme() {
        this(Consts.ASCII);
    }

    public BasicScheme(Charset charset) {
        super(charset);
        this.complete = false;
    }

    @Deprecated
    public BasicScheme(ChallengeState challengeState) {
        super(challengeState);
    }

    @Deprecated
    public static Header authenticate(Credentials credentials, String str, boolean z) {
        Args.notNull(credentials, "Credentials");
        Args.notNull(str, "charset");
        StringBuilder sb = new StringBuilder();
        sb.append(credentials.getUserPrincipal().getName());
        sb.append(":");
        sb.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] a = C6459a.m24131a(EncodingUtils.getBytes(sb.toString(), str), false);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        charArrayBuffer.append(z ? "Proxy-Authorization" : "Authorization");
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(a, 0, a.length);
        return new BufferedHeader(charArrayBuffer);
    }

    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, (HttpContext) new BasicHttpContext());
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(credentials, "Credentials");
        Args.notNull(httpRequest, "HTTP request");
        StringBuilder sb = new StringBuilder();
        sb.append(credentials.getUserPrincipal().getName());
        sb.append(":");
        sb.append(credentials.getPassword() == null ? "null" : credentials.getPassword());
        byte[] c = new C6459a(0).mo16637c(EncodingUtils.getBytes(sb.toString(), getCredentialsCharset(httpRequest)));
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        charArrayBuffer.append(isProxy() ? "Proxy-Authorization" : "Authorization");
        charArrayBuffer.append(": Basic ");
        charArrayBuffer.append(c, 0, c.length);
        return new BufferedHeader(charArrayBuffer);
    }

    public String getSchemeName() {
        return "basic";
    }

    public boolean isComplete() {
        return this.complete;
    }

    public boolean isConnectionBased() {
        return false;
    }

    public void processChallenge(Header header) {
        super.processChallenge(header);
        this.complete = true;
    }

    public String toString() {
        return "BASIC [complete=" + this.complete + "]";
    }
}
