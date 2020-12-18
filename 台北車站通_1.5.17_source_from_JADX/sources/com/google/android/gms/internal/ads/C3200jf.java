package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.jf */
public final class C3200jf {
    /* renamed from: a */
    public static boolean m12710a(zzjj zzjj) {
        Bundle bundle = zzjj.f10887m;
        if (bundle == null) {
            bundle = new Bundle();
        }
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }
}
