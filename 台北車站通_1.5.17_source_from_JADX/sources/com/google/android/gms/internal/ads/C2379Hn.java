package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;

/* renamed from: com.google.android.gms.internal.ads.Hn */
final class C2379Hn implements C3441rn {

    /* renamed from: a */
    private final C3498tn f7185a;

    /* renamed from: b */
    private final String f7186b;

    /* renamed from: c */
    private final C2407In f7187c;

    C2379Hn(C3498tn tnVar, String str, Object[] objArr) {
        this.f7185a = tnVar;
        this.f7186b = str;
        this.f7187c = new C2407In(tnVar.getClass(), str, objArr);
    }

    /* renamed from: a */
    public final int mo8283a() {
        return (this.f7187c.f7272d & 1) == 1 ? C2577Om.C2582e.f8055i : C2577Om.C2582e.f8056j;
    }

    /* renamed from: b */
    public final boolean mo8284b() {
        return (this.f7187c.f7272d & 2) == 2;
    }

    /* renamed from: c */
    public final C3498tn mo8285c() {
        return this.f7185a;
    }

    /* renamed from: d */
    public final int mo8286d() {
        return this.f7187c.f7273e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C2407In mo8287e() {
        return this.f7187c;
    }

    /* renamed from: f */
    public final int mo8288f() {
        return this.f7187c.f7276h;
    }

    /* renamed from: g */
    public final int mo8289g() {
        return this.f7187c.f7277i;
    }

    /* renamed from: h */
    public final int mo8290h() {
        return this.f7187c.f7278j;
    }

    /* renamed from: i */
    public final int mo8291i() {
        return this.f7187c.f7281m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int[] mo8292j() {
        return this.f7187c.f7282n;
    }

    /* renamed from: k */
    public final int mo8293k() {
        return this.f7187c.f7280l;
    }

    /* renamed from: l */
    public final int mo8294l() {
        return this.f7187c.f7279k;
    }
}
