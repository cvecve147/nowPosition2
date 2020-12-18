package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2329Fv;
import com.google.android.gms.internal.ads.C2626Pz;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3568vz;
import com.google.android.gms.internal.ads.C3681zz;

/* renamed from: com.google.android.gms.ads.internal.E */
final class C1679E implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2282Ed f5513a;

    /* renamed from: b */
    private final /* synthetic */ C1678D f5514b;

    C1679E(C1678D d, C2282Ed ed) {
        this.f5514b = d;
        this.f5513a = ed;
    }

    public final void run() {
        this.f5514b.mo6859a(new C2254Dd(this.f5513a, (C3520uh) null, (C3568vz) null, (C2626Pz) null, (String) null, (C3681zz) null, (C2329Fv) null, (String) null));
    }
}
