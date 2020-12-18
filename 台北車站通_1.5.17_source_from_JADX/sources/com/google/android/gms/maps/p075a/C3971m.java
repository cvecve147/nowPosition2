package com.google.android.gms.maps.p075a;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.maps.a.m */
public final class C3971m {
    private C3971m() {
    }

    /* renamed from: a */
    private static <T extends Parcelable> T m16058a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(C3971m.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(C3971m.class.getClassLoader());
        return bundle2.getParcelable(str);
    }

    /* renamed from: a */
    public static void m16059a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m16058a(bundle, "MapOptions");
            if (a != null) {
                m16060a(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m16058a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m16060a(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m16058a(bundle, "camera");
            if (a3 != null) {
                m16060a(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: a */
    public static void m16060a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(C3971m.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(C3971m.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
