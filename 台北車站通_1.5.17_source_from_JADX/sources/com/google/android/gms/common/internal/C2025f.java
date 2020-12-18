package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p013b.p018b.p028h.p039h.C1082d;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.common.internal.f */
public final class C2025f {

    /* renamed from: a */
    private final Account f6470a;

    /* renamed from: b */
    private final Set<Scope> f6471b;

    /* renamed from: c */
    private final Set<Scope> f6472c;

    /* renamed from: d */
    private final Map<C1850a<?>, C2027b> f6473d;

    /* renamed from: e */
    private final int f6474e;

    /* renamed from: f */
    private final View f6475f;

    /* renamed from: g */
    private final String f6476g;

    /* renamed from: h */
    private final String f6477h;

    /* renamed from: i */
    private final C5525c f6478i;

    /* renamed from: j */
    private Integer f6479j;

    /* renamed from: com.google.android.gms.common.internal.f$a */
    public static final class C2026a {

        /* renamed from: a */
        private Account f6480a;

        /* renamed from: b */
        private C1082d<Scope> f6481b;

        /* renamed from: c */
        private Map<C1850a<?>, C2027b> f6482c;

        /* renamed from: d */
        private int f6483d = 0;

        /* renamed from: e */
        private View f6484e;

        /* renamed from: f */
        private String f6485f;

        /* renamed from: g */
        private String f6486g;

        /* renamed from: h */
        private C5525c f6487h = C5525c.f15434a;

        /* renamed from: a */
        public final C2026a mo7669a(Account account) {
            this.f6480a = account;
            return this;
        }

        /* renamed from: a */
        public final C2026a mo7670a(String str) {
            this.f6486g = str;
            return this;
        }

        /* renamed from: a */
        public final C2026a mo7671a(Collection<Scope> collection) {
            if (this.f6481b == null) {
                this.f6481b = new C1082d<>();
            }
            this.f6481b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C2025f mo7672a() {
            return new C2025f(this.f6480a, this.f6481b, this.f6482c, this.f6483d, this.f6484e, this.f6485f, this.f6486g, this.f6487h);
        }

        /* renamed from: b */
        public final C2026a mo7673b(String str) {
            this.f6485f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.f$b */
    public static final class C2027b {

        /* renamed from: a */
        public final Set<Scope> f6488a;
    }

    public C2025f(Account account, Set<Scope> set, Map<C1850a<?>, C2027b> map, int i, View view, String str, String str2, C5525c cVar) {
        this.f6470a = account;
        this.f6471b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f6473d = map == null ? Collections.EMPTY_MAP : map;
        this.f6475f = view;
        this.f6474e = i;
        this.f6476g = str;
        this.f6477h = str2;
        this.f6478i = cVar;
        HashSet hashSet = new HashSet(this.f6471b);
        for (C2027b bVar : this.f6473d.values()) {
            hashSet.addAll(bVar.f6488a);
        }
        this.f6472c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public final Account mo7659a() {
        return this.f6470a;
    }

    /* renamed from: a */
    public final void mo7660a(Integer num) {
        this.f6479j = num;
    }

    /* renamed from: b */
    public final Account mo7661b() {
        Account account = this.f6470a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public final Set<Scope> mo7662c() {
        return this.f6472c;
    }

    /* renamed from: d */
    public final Integer mo7663d() {
        return this.f6479j;
    }

    /* renamed from: e */
    public final Map<C1850a<?>, C2027b> mo7664e() {
        return this.f6473d;
    }

    /* renamed from: f */
    public final String mo7665f() {
        return this.f6477h;
    }

    /* renamed from: g */
    public final String mo7666g() {
        return this.f6476g;
    }

    /* renamed from: h */
    public final Set<Scope> mo7667h() {
        return this.f6471b;
    }

    /* renamed from: i */
    public final C5525c mo7668i() {
        return this.f6478i;
    }
}
