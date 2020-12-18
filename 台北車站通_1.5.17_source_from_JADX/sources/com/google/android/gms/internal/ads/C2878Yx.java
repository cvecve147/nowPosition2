package com.google.android.gms.internal.ads;

import android.os.Bundle;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Yx */
public final class C2878Yx {

    /* renamed from: a */
    private static C2878Yx f8669a = new C2878Yx();

    /* renamed from: b */
    private int f8670b;

    /* renamed from: c */
    private int f8671c;

    /* renamed from: d */
    private int f8672d;

    /* renamed from: e */
    private int f8673e;

    /* renamed from: f */
    private int f8674f;

    /* renamed from: a */
    public static C2878Yx m11651a() {
        return f8669a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9081a(int i) {
        this.f8670b += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9082b() {
        this.f8671c++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9083c() {
        this.f8672d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9084d() {
        this.f8673e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9085e() {
        this.f8674f++;
    }

    /* renamed from: f */
    public final int mo9086f() {
        return this.f8671c;
    }

    /* renamed from: g */
    public final int mo9087g() {
        return this.f8672d;
    }

    /* renamed from: h */
    public final int mo9088h() {
        return this.f8673e;
    }

    /* renamed from: i */
    public final int mo9089i() {
        return this.f8674f;
    }

    /* renamed from: j */
    public final Bundle mo9090j() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f8670b);
        bundle.putInt("ipds", this.f8671c);
        bundle.putInt("ipde", this.f8672d);
        bundle.putInt("iph", this.f8673e);
        bundle.putInt("ipm", this.f8674f);
        return bundle;
    }
}
