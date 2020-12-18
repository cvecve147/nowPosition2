package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2857Yd;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.q */
public final class C1785q extends C1771c {
    public C1785q(Activity activity) {
        super(activity);
    }

    /* renamed from: e */
    public final void mo6997e(Bundle bundle) {
        C2857Yd.m11615f("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f5840n = 3;
        this.f5828b.finish();
    }
}
