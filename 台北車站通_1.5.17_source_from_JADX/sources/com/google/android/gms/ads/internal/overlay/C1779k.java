package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.util.C2092n;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2845Xs;
import com.google.android.gms.internal.ads.C3114ge;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.k */
public final class C1779k {
    /* renamed from: a */
    public static void m8016a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f5821k == 4 && adOverlayInfoParcel.f5813c == null) {
            C2845Xs xs = adOverlayInfoParcel.f5812b;
            if (xs != null) {
                xs.mo6490f();
            }
            C1697X.m7695b();
            C1769a.m7989a(context, adOverlayInfoParcel.f5811a, adOverlayInfoParcel.f5819i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f5823m.f10858d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.m7987a(intent, adOverlayInfoParcel);
        if (!C2092n.m9168i()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C1697X.m7698e();
        C3114ge.m12407a(context, intent);
    }
}
