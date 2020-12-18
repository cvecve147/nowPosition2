package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import org.apache.http.annotation.Immutable;
import org.ietf.jgss.GSSCredential;

@Immutable
public class KerberosCredentials implements Credentials, Serializable {
    private static final long serialVersionUID = 487421613855550713L;
    private final GSSCredential gssCredential;

    public KerberosCredentials(GSSCredential gSSCredential) {
        this.gssCredential = gSSCredential;
    }

    public GSSCredential getGSSCredential() {
        return this.gssCredential;
    }

    public String getPassword() {
        return null;
    }

    public Principal getUserPrincipal() {
        return null;
    }
}
