package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import org.apache.http.annotation.Immutable;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Immutable
public class NTUserPrincipal implements Principal, Serializable {
    private static final long serialVersionUID = -6870169797924406894L;
    private final String domain;
    private final String ntname;
    private final String username;

    public NTUserPrincipal(String str, String str2) {
        String str3;
        Args.notNull(str2, "User name");
        this.username = str2;
        this.domain = str != null ? str.toUpperCase(Locale.ROOT) : null;
        String str4 = this.domain;
        if (str4 == null || str4.isEmpty()) {
            str3 = this.username;
        } else {
            str3 = this.domain + TokenParser.ESCAPE + this.username;
        }
        this.ntname = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NTUserPrincipal)) {
            return false;
        }
        NTUserPrincipal nTUserPrincipal = (NTUserPrincipal) obj;
        return LangUtils.equals((Object) this.username, (Object) nTUserPrincipal.username) && LangUtils.equals((Object) this.domain, (Object) nTUserPrincipal.domain);
    }

    public String getDomain() {
        return this.domain;
    }

    public String getName() {
        return this.ntname;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(17, (Object) this.username), (Object) this.domain);
    }

    public String toString() {
        return this.ntname;
    }
}
