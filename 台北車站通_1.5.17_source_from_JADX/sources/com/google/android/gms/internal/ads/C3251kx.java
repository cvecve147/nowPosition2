package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C2011d;

/* renamed from: com.google.android.gms.internal.ads.kx */
final class C3251kx implements C2011d.C2012a {

    /* renamed from: a */
    private final /* synthetic */ C3116gg f9728a;

    /* renamed from: b */
    private final /* synthetic */ zzsg f9729b;

    /* renamed from: c */
    final /* synthetic */ C3190ix f9730c;

    C3251kx(C3190ix ixVar, C3116gg ggVar, zzsg zzsg) {
        this.f9730c = ixVar;
        this.f9728a = ggVar;
        this.f9729b = zzsg;
    }

    /* renamed from: f */
    public final void mo7570f(int i) {
    }

    /* renamed from: j */
    public final void mo7571j(Bundle bundle) {
        synchronized (this.f9730c.f9534d) {
            if (!this.f9730c.f9532b) {
                boolean unused = this.f9730c.f9532b = true;
                C3048dx d = this.f9730c.f9531a;
                if (d != null) {
                    this.f9728a.mo8923a(new C3308mx(this.f9728a, C3057ee.m12269a((Runnable) new C3280lx(this, d, this.f9728a, this.f9729b))), C2972bg.f8939b);
                }
            }
        }
    }
}
