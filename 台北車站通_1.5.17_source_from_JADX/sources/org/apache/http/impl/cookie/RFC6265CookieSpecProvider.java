package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Immutable
public class RFC6265CookieSpecProvider implements CookieSpecProvider {
    private final CompatibilityLevel compatibilityLevel;
    private volatile CookieSpec cookieSpec;
    private final PublicSuffixMatcher publicSuffixMatcher;

    /* renamed from: org.apache.http.impl.cookie.RFC6265CookieSpecProvider$2 */
    static /* synthetic */ class C70202 {

        /* renamed from: $SwitchMap$org$apache$http$impl$cookie$RFC6265CookieSpecProvider$CompatibilityLevel */
        static final /* synthetic */ int[] f19308x14f07ea0 = new int[CompatibilityLevel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel[] r0 = org.apache.http.impl.cookie.RFC6265CookieSpecProvider.CompatibilityLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19308x14f07ea0 = r0
                int[] r0 = f19308x14f07ea0     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel r1 = org.apache.http.impl.cookie.RFC6265CookieSpecProvider.CompatibilityLevel.STRICT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f19308x14f07ea0     // Catch:{ NoSuchFieldError -> 0x001f }
                org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel r1 = org.apache.http.impl.cookie.RFC6265CookieSpecProvider.CompatibilityLevel.IE_MEDIUM_SECURITY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.RFC6265CookieSpecProvider.C70202.<clinit>():void");
        }
    }

    public enum CompatibilityLevel {
        STRICT,
        RELAXED,
        IE_MEDIUM_SECURITY
    }

    public RFC6265CookieSpecProvider() {
        this(CompatibilityLevel.RELAXED, (PublicSuffixMatcher) null);
    }

    public RFC6265CookieSpecProvider(PublicSuffixMatcher publicSuffixMatcher2) {
        this(CompatibilityLevel.RELAXED, publicSuffixMatcher2);
    }

    public RFC6265CookieSpecProvider(CompatibilityLevel compatibilityLevel2, PublicSuffixMatcher publicSuffixMatcher2) {
        this.compatibilityLevel = compatibilityLevel2 == null ? CompatibilityLevel.RELAXED : compatibilityLevel2;
        this.publicSuffixMatcher = publicSuffixMatcher2;
    }

    public CookieSpec create(HttpContext httpContext) {
        CookieSpec rFC6265StrictSpec;
        if (this.cookieSpec == null) {
            synchronized (this) {
                if (this.cookieSpec == null) {
                    int i = C70202.f19308x14f07ea0[this.compatibilityLevel.ordinal()];
                    if (i == 1) {
                        rFC6265StrictSpec = new RFC6265StrictSpec(new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(RFC6265StrictSpec.DATE_PATTERNS));
                    } else if (i != 2) {
                        rFC6265StrictSpec = new RFC6265LaxSpec(new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new LaxMaxAgeHandler(), new BasicSecureHandler(), new LaxExpiresHandler());
                    } else {
                        rFC6265StrictSpec = new RFC6265LaxSpec(new BasicPathHandler() {
                            public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
                            }
                        }, PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicExpiresHandler(RFC6265StrictSpec.DATE_PATTERNS));
                    }
                    this.cookieSpec = rFC6265StrictSpec;
                }
            }
        }
        return this.cookieSpec;
    }
}
