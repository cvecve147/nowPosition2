package org.apache.http.impl.auth;

import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public abstract class AuthSchemeBase implements ContextAwareAuthScheme {
    protected ChallengeState challengeState;

    public AuthSchemeBase() {
    }

    @Deprecated
    public AuthSchemeBase(ChallengeState challengeState2) {
        this.challengeState = challengeState2;
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return authenticate(credentials, httpRequest);
    }

    public ChallengeState getChallengeState() {
        return this.challengeState;
    }

    public boolean isProxy() {
        ChallengeState challengeState2 = this.challengeState;
        return challengeState2 != null && challengeState2 == ChallengeState.PROXY;
    }

    /* access modifiers changed from: protected */
    public abstract void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2);

    public void processChallenge(Header header) {
        ChallengeState challengeState2;
        int i;
        CharArrayBuffer charArrayBuffer;
        Args.notNull(header, "Header");
        String name = header.getName();
        if (name.equalsIgnoreCase("WWW-Authenticate")) {
            challengeState2 = ChallengeState.TARGET;
        } else if (name.equalsIgnoreCase("Proxy-Authenticate")) {
            challengeState2 = ChallengeState.PROXY;
        } else {
            throw new MalformedChallengeException("Unexpected header name: " + name);
        }
        this.challengeState = challengeState2;
        if (header instanceof FormattedHeader) {
            FormattedHeader formattedHeader = (FormattedHeader) header;
            charArrayBuffer = formattedHeader.getBuffer();
            i = formattedHeader.getValuePos();
        } else {
            String value = header.getValue();
            if (value != null) {
                charArrayBuffer = new CharArrayBuffer(value.length());
                charArrayBuffer.append(value);
                i = 0;
            } else {
                throw new MalformedChallengeException("Header value is null");
            }
        }
        while (i < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
            i++;
        }
        int i2 = i;
        while (i2 < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i2))) {
            i2++;
        }
        String substring = charArrayBuffer.substring(i, i2);
        if (substring.equalsIgnoreCase(getSchemeName())) {
            parseChallenge(charArrayBuffer, i2, charArrayBuffer.length());
            return;
        }
        throw new MalformedChallengeException("Invalid scheme identifier: " + substring);
    }

    public String toString() {
        String schemeName = getSchemeName();
        return schemeName != null ? schemeName.toUpperCase(Locale.ROOT) : super.toString();
    }
}
