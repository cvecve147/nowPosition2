package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecProvider;
import org.apache.http.protocol.HttpContext;

@Immutable
public class DefaultCookieSpecProvider implements CookieSpecProvider {
    private final CompatibilityLevel compatibilityLevel;
    private volatile CookieSpec cookieSpec;
    private final String[] datepatterns;
    private final boolean oneHeader;
    private final PublicSuffixMatcher publicSuffixMatcher;

    public enum CompatibilityLevel {
        DEFAULT,
        IE_MEDIUM_SECURITY
    }

    public DefaultCookieSpecProvider() {
        this(CompatibilityLevel.DEFAULT, (PublicSuffixMatcher) null, (String[]) null, false);
    }

    public DefaultCookieSpecProvider(PublicSuffixMatcher publicSuffixMatcher2) {
        this(CompatibilityLevel.DEFAULT, publicSuffixMatcher2, (String[]) null, false);
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel2, PublicSuffixMatcher publicSuffixMatcher2) {
        this(compatibilityLevel2, publicSuffixMatcher2, (String[]) null, false);
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel2, PublicSuffixMatcher publicSuffixMatcher2, String[] strArr, boolean z) {
        this.compatibilityLevel = compatibilityLevel2 == null ? CompatibilityLevel.DEFAULT : compatibilityLevel2;
        this.publicSuffixMatcher = publicSuffixMatcher2;
        this.datepatterns = strArr;
        this.oneHeader = z;
    }

    public CookieSpec create(HttpContext httpContext) {
        if (this.cookieSpec == null) {
            synchronized (this) {
                if (this.cookieSpec == null) {
                    RFC2965Spec rFC2965Spec = new RFC2965Spec(this.oneHeader, new RFC2965VersionAttributeHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2965DomainAttributeHandler(), this.publicSuffixMatcher), new RFC2965PortAttributeHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new RFC2965CommentUrlAttributeHandler(), new RFC2965DiscardAttributeHandler());
                    RFC2109Spec rFC2109Spec = new RFC2109Spec(this.oneHeader, new RFC2109VersionHandler(), new BasicPathHandler(), PublicSuffixDomainFilter.decorate(new RFC2109DomainHandler(), this.publicSuffixMatcher), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler());
                    CommonCookieAttributeHandler[] commonCookieAttributeHandlerArr = new CommonCookieAttributeHandler[5];
                    commonCookieAttributeHandlerArr[0] = PublicSuffixDomainFilter.decorate(new BasicDomainHandler(), this.publicSuffixMatcher);
                    commonCookieAttributeHandlerArr[1] = this.compatibilityLevel == CompatibilityLevel.IE_MEDIUM_SECURITY ? new BasicPathHandler() {
                        public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
                        }
                    } : new BasicPathHandler();
                    commonCookieAttributeHandlerArr[2] = new BasicSecureHandler();
                    commonCookieAttributeHandlerArr[3] = new BasicCommentHandler();
                    commonCookieAttributeHandlerArr[4] = new BasicExpiresHandler(this.datepatterns != null ? (String[]) this.datepatterns.clone() : new String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
                    this.cookieSpec = new DefaultCookieSpec(rFC2965Spec, rFC2109Spec, new NetscapeDraftSpec(commonCookieAttributeHandlerArr));
                }
            }
        }
        return this.cookieSpec;
    }
}
