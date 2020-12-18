package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C1997i;
import com.google.android.gms.common.C2063j;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Bd */
final class C2197Bd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f6737a;

    /* renamed from: b */
    private final /* synthetic */ C3116gg f6738b;

    C2197Bd(C2168Ad ad, Context context, C3116gg ggVar) {
        this.f6737a = context;
        this.f6738b = ggVar;
    }

    public final void run() {
        try {
            this.f6738b.mo9464b(AdvertisingIdClient.getAdvertisingIdInfo(this.f6737a));
        } catch (C1997i | C2063j | IOException | IllegalStateException e) {
            this.f6738b.mo9463a(e);
            C2227Cf.m9533b("Exception while getting advertising Id info", e);
        }
    }
}
