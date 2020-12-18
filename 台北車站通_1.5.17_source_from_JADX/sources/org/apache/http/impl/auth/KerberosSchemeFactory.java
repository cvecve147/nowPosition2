package org.apache.http.impl.auth;

import org.apache.http.annotation.Immutable;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Immutable
public class KerberosSchemeFactory implements AuthSchemeFactory, AuthSchemeProvider {
    private final boolean stripPort;
    private final boolean useCanonicalHostname;

    public KerberosSchemeFactory() {
        this(true, true);
    }

    public KerberosSchemeFactory(boolean z) {
        this.stripPort = z;
        this.useCanonicalHostname = true;
    }

    public KerberosSchemeFactory(boolean z, boolean z2) {
        this.stripPort = z;
        this.useCanonicalHostname = z2;
    }

    public AuthScheme create(HttpContext httpContext) {
        return new KerberosScheme(this.stripPort, this.useCanonicalHostname);
    }

    public boolean isStripPort() {
        return this.stripPort;
    }

    public boolean isUseCanonicalHostname() {
        return this.useCanonicalHostname;
    }

    public AuthScheme newInstance(HttpParams httpParams) {
        return new KerberosScheme(this.stripPort, this.useCanonicalHostname);
    }
}
