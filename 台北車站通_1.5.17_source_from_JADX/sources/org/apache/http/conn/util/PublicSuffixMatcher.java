package org.apache.http.conn.util;

import java.net.IDN;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.util.Args;

@ThreadSafe
public final class PublicSuffixMatcher {
    private final Map<String, DomainType> exceptions;
    private final Map<String, DomainType> rules;

    public PublicSuffixMatcher(Collection<PublicSuffixList> collection) {
        Args.notNull(collection, "Domain suffix lists");
        this.rules = new ConcurrentHashMap();
        this.exceptions = new ConcurrentHashMap();
        for (PublicSuffixList next : collection) {
            DomainType type = next.getType();
            for (String put : next.getRules()) {
                this.rules.put(put, type);
            }
            List<String> exceptions2 = next.getExceptions();
            if (exceptions2 != null) {
                for (String put2 : exceptions2) {
                    this.exceptions.put(put2, type);
                }
            }
        }
    }

    public PublicSuffixMatcher(Collection<String> collection, Collection<String> collection2) {
        this(DomainType.UNKNOWN, collection, collection2);
    }

    public PublicSuffixMatcher(DomainType domainType, Collection<String> collection, Collection<String> collection2) {
        Args.notNull(domainType, "Domain type");
        Args.notNull(collection, "Domain suffix rules");
        this.rules = new ConcurrentHashMap(collection.size());
        for (String put : collection) {
            this.rules.put(put, domainType);
        }
        this.exceptions = new ConcurrentHashMap();
        if (collection2 != null) {
            for (String put2 : collection2) {
                this.exceptions.put(put2, domainType);
            }
        }
    }

    private static boolean hasEntry(Map<String, DomainType> map, String str, DomainType domainType) {
        DomainType domainType2;
        if (map == null || (domainType2 = map.get(str)) == null) {
            return false;
        }
        return domainType == null || domainType2.equals(domainType);
    }

    private boolean hasException(String str, DomainType domainType) {
        return hasEntry(this.exceptions, str, domainType);
    }

    private boolean hasRule(String str, DomainType domainType) {
        return hasEntry(this.rules, str, domainType);
    }

    public String getDomainRoot(String str) {
        return getDomainRoot(str, (DomainType) null);
    }

    public String getDomainRoot(String str, DomainType domainType) {
        if (str == null || str.startsWith(".")) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String str2 = null;
        while (lowerCase != null) {
            if (!hasException(IDN.toUnicode(lowerCase), domainType)) {
                if (hasRule(IDN.toUnicode(lowerCase), domainType)) {
                    break;
                }
                int indexOf = lowerCase.indexOf(46);
                String substring = indexOf != -1 ? lowerCase.substring(indexOf + 1) : null;
                if (substring != null) {
                    if (hasRule("*." + IDN.toUnicode(substring), domainType)) {
                        break;
                    }
                }
                if (indexOf != -1) {
                    str2 = lowerCase;
                }
                lowerCase = substring;
            } else {
                return lowerCase;
            }
        }
        return str2;
    }

    public boolean matches(String str) {
        return matches(str, (DomainType) null);
    }

    public boolean matches(String str, DomainType domainType) {
        if (str == null) {
            return false;
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        return getDomainRoot(str, domainType) == null;
    }
}
