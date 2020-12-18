package org.apache.http.impl.auth;

import java.nio.charset.Charset;
import org.apache.http.annotation.Immutable;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Immutable
public class DigestSchemeFactory implements AuthSchemeFactory, AuthSchemeProvider {
    private final Charset charset;

    public DigestSchemeFactory() {
        this((Charset) null);
    }

    public DigestSchemeFactory(Charset charset2) {
        this.charset = charset2;
    }

    public AuthScheme create(HttpContext httpContext) {
        return new DigestScheme(this.charset);
    }

    public AuthScheme newInstance(HttpParams httpParams) {
        return new DigestScheme();
    }
}
