package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.N */
final class C1688N implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f5541a;

    /* renamed from: b */
    private final /* synthetic */ C1687M f5542b;

    C1688N(C1687M m, WeakReference weakReference) {
        this.f5542b = m;
        this.f5541a = weakReference;
    }

    public final void run() {
        boolean unused = this.f5542b.f5538d = false;
        C1700a aVar = (C1700a) this.f5541a.get();
        if (aVar != null) {
            zzjj a = this.f5542b.f5537c;
            if (aVar.mo6873d(a)) {
                aVar.mo6812b(a);
                return;
            }
            C2227Cf.m9534c("Ad is not visible. Not refreshing ad.");
            aVar.f5647e.mo6785b(a);
        }
    }
}
