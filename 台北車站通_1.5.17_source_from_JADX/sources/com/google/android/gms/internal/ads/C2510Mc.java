package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.internal.ads.Mc */
final class C2510Mc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2626Pz f7562a;

    /* renamed from: b */
    private final /* synthetic */ zzjj f7563b;

    /* renamed from: c */
    private final /* synthetic */ C2688Sc f7564c;

    /* renamed from: d */
    private final /* synthetic */ C2452Kc f7565d;

    C2510Mc(C2452Kc kc, C2626Pz pz, zzjj zzjj, C2688Sc sc) {
        this.f7565d = kc;
        this.f7562a = pz;
        this.f7563b = zzjj;
        this.f7564c = sc;
    }

    public final void run() {
        try {
            this.f7562a.mo8714a(C5468d.m20961a(this.f7565d.f7428f), this.f7563b, (String) null, (C2910_c) this.f7564c, this.f7565d.f7432j);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(this.f7565d.f7426d);
            C2227Cf.m9535c(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "), e);
            C2452Kc kc = this.f7565d;
            kc.mo8392a(kc.f7426d, 0);
        }
    }
}
