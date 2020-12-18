package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2717Td;
import com.google.android.gms.internal.ads.C3114ge;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.p */
final class C1793p extends C2717Td {

    /* renamed from: d */
    private final int f5878d;

    /* renamed from: e */
    final /* synthetic */ C1763m f5879e;

    public C1793p(C1763m mVar, int i) {
        this.f5879e = mVar;
        this.f5878d = i;
    }

    /* renamed from: c */
    public final void mo7015c() {
    }

    /* renamed from: d */
    public final void mo7016d() {
        C1763m mVar = this.f5879e;
        boolean z = mVar.f5648f.f5606J;
        boolean lc = mVar.mo6972lc();
        boolean a = this.f5879e.f5796r;
        float b = this.f5879e.f5797s;
        int i = this.f5879e.f5648f.f5606J ? this.f5878d : -1;
        boolean c = this.f5879e.f5798t;
        C2254Dd dd = this.f5879e.f5648f.f5623j;
        zzaq zzaq = new zzaq(z, lc, a, b, i, c, dd.f6857O, dd.f6860R);
        int requestedOrientation = this.f5879e.f5648f.f5623j.f6863b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f5879e.f5648f.f5623j.f6869h;
        }
        int i2 = requestedOrientation;
        C1763m mVar2 = this.f5879e;
        C1698Y y = mVar2.f5648f;
        C2254Dd dd2 = y.f5623j;
        C3114ge.f9351a.post(new C1795q(this, new AdOverlayInfoParcel(mVar2, mVar2, mVar2, dd2.f6863b, i2, y.f5618e, dd2.f6846D, zzaq)));
    }
}
