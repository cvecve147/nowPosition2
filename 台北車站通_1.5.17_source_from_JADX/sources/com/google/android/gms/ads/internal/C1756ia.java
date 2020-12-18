package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2329Fv;
import com.google.android.gms.internal.ads.C2626Pz;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3568vz;
import com.google.android.gms.internal.ads.C3681zz;

/* renamed from: com.google.android.gms.ads.internal.ia */
final class C1756ia implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2282Ed f5764a;

    /* renamed from: b */
    private final /* synthetic */ C1713ga f5765b;

    C1756ia(C1713ga gaVar, C2282Ed ed) {
        this.f5765b = gaVar;
        this.f5764a = ed;
    }

    public final void run() {
        this.f5765b.mo6859a(new C2254Dd(this.f5764a, (C3520uh) null, (C3568vz) null, (C2626Pz) null, (String) null, (C3681zz) null, (C2329Fv) null, (String) null));
    }
}
