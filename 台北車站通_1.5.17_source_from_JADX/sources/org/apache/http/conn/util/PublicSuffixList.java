package org.apache.http.conn.util;

import java.util.Collections;
import java.util.List;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public final class PublicSuffixList {
    private final List<String> exceptions;
    private final List<String> rules;
    private final DomainType type;

    public PublicSuffixList(List<String> list, List<String> list2) {
        this(DomainType.UNKNOWN, list, list2);
    }

    public PublicSuffixList(DomainType domainType, List<String> list, List<String> list2) {
        Args.notNull(domainType, "Domain type");
        this.type = domainType;
        Args.notNull(list, "Domain suffix rules");
        this.rules = Collections.unmodifiableList(list);
        this.exceptions = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
    }

    public List<String> getExceptions() {
        return this.exceptions;
    }

    public List<String> getRules() {
        return this.rules;
    }

    public DomainType getType() {
        return this.type;
    }
}
