package org.apache.http.conn.ssl;

import org.apache.http.annotation.Immutable;

@Immutable
@Deprecated
public class StrictHostnameVerifier extends AbstractVerifier {
    public static final StrictHostnameVerifier INSTANCE = new StrictHostnameVerifier();

    public final String toString() {
        return "STRICT";
    }

    public final void verify(String str, String[] strArr, String[] strArr2) {
        verify(str, strArr, strArr2, true);
    }
}
