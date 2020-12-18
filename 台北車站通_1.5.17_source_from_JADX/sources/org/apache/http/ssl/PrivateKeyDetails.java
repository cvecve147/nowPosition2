package org.apache.http.ssl;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.apache.http.util.Args;

public final class PrivateKeyDetails {
    private final X509Certificate[] certChain;
    private final String type;

    public PrivateKeyDetails(String str, X509Certificate[] x509CertificateArr) {
        Args.notNull(str, "Private key type");
        this.type = str;
        this.certChain = x509CertificateArr;
    }

    public X509Certificate[] getCertChain() {
        return this.certChain;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return this.type + ':' + Arrays.toString(this.certChain);
    }
}
