package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1991e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2011d;
import com.google.android.gms.common.internal.C2033l;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.k */
public abstract class C2032k<T extends IInterface> extends C2011d<T> implements C1850a.C1861f, C2033l.C2034a {

    /* renamed from: D */
    private final C2025f f6490D;

    /* renamed from: E */
    private final Set<Scope> f6491E;

    /* renamed from: F */
    private final Account f6492F;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C2032k(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C2025f r13, com.google.android.gms.common.api.GoogleApiClient.C1848b r14, com.google.android.gms.common.api.GoogleApiClient.C1849c r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.m r3 = com.google.android.gms.common.internal.C2035m.m8974a(r10)
            com.google.android.gms.common.e r4 = com.google.android.gms.common.C1991e.m8751a()
            com.google.android.gms.common.internal.C2061y.m9067a(r14)
            r7 = r14
            com.google.android.gms.common.api.GoogleApiClient$b r7 = (com.google.android.gms.common.api.GoogleApiClient.C1848b) r7
            com.google.android.gms.common.internal.C2061y.m9067a(r15)
            r8 = r15
            com.google.android.gms.common.api.GoogleApiClient$c r8 = (com.google.android.gms.common.api.GoogleApiClient.C1849c) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C2032k.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.f, com.google.android.gms.common.api.GoogleApiClient$b, com.google.android.gms.common.api.GoogleApiClient$c):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C2032k(Context context, Looper looper, C2035m mVar, C1991e eVar, int i, C2025f fVar, GoogleApiClient.C1848b bVar, GoogleApiClient.C1849c cVar) {
        super(context, looper, mVar, eVar, i, m8956a(bVar), m8957a(cVar), fVar.mo7665f());
        this.f6490D = fVar;
        this.f6492F = fVar.mo7659a();
        Set<Scope> c = fVar.mo7662c();
        m8958b(c);
        this.f6491E = c;
    }

    /* renamed from: a */
    private static C2011d.C2012a m8956a(GoogleApiClient.C1848b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C2003F(bVar);
    }

    /* renamed from: a */
    private static C2011d.C2013b m8957a(GoogleApiClient.C1849c cVar) {
        if (cVar == null) {
            return null;
        }
        return new C2004G(cVar);
    }

    /* renamed from: b */
    private final Set<Scope> m8958b(Set<Scope> set) {
        mo7679a(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<Scope> mo7679a(Set<Scope> set) {
        return set;
    }

    /* renamed from: g */
    public int mo7297g() {
        return super.mo7297g();
    }

    /* renamed from: o */
    public final Account mo7632o() {
        return this.f6492F;
    }

    /* renamed from: v */
    public Feature[] mo7639v() {
        return new Feature[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Set<Scope> mo7640w() {
        return this.f6491E;
    }
}
