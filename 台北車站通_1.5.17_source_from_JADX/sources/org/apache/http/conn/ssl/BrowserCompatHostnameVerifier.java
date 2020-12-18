package org.apache.http.conn.ssl;

import org.apache.http.annotation.Immutable;

@Immutable
@Deprecated
public class BrowserCompatHostnameVerifier extends AbstractVerifier {
    public static final BrowserCompatHostnameVerifier INSTANCE = new BrowserCompatHostnameVerifier();

    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }

    public final void verify(String str, String[] strArr, String[] strArr2) {
        verify(str, strArr, strArr2, false);
    }
}
