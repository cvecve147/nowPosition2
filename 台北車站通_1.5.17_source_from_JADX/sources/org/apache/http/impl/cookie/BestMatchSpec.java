package org.apache.http.impl.cookie;

import org.apache.http.annotation.ThreadSafe;

@Deprecated
@ThreadSafe
public class BestMatchSpec extends DefaultCookieSpec {
    public BestMatchSpec() {
        this((String[]) null, false);
    }

    public BestMatchSpec(String[] strArr, boolean z) {
        super(strArr, z);
    }

    public String toString() {
        return "best-match";
    }
}
