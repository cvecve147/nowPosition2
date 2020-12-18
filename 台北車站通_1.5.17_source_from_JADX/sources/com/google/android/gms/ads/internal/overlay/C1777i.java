package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2717Td;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3289me;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.i */
final class C1777i extends C2717Td {

    /* renamed from: d */
    final /* synthetic */ C1771c f5856d;

    private C1777i(C1771c cVar) {
        this.f5856d = cVar;
    }

    /* synthetic */ C1777i(C1771c cVar, C1773e eVar) {
        this(cVar);
    }

    /* renamed from: c */
    public final void mo7015c() {
    }

    /* renamed from: d */
    public final void mo7016d() {
        Bitmap a = C1697X.m7718y().mo9381a(Integer.valueOf(this.f5856d.f5829c.f5825o.f5928f));
        if (a != null) {
            C3289me g = C1697X.m7700g();
            C1771c cVar = this.f5856d;
            Activity activity = cVar.f5828b;
            zzaq zzaq = cVar.f5829c.f5825o;
            C3114ge.f9351a.post(new C1778j(this, g.mo9713a(activity, a, zzaq.f5926d, zzaq.f5927e)));
        }
    }
}
