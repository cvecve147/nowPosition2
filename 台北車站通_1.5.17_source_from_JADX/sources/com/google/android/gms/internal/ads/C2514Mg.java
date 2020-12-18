package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.C2092n;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Mg */
public final class C2514Mg extends C2314Fg {
    /* renamed from: a */
    public final C2285Eg mo8083a(Context context, C2749Ug ug, int i, boolean z, C2930_u _uVar, C2720Tg tg) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(C2092n.m9161b() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11))) {
            return null;
        }
        return new C3462sg(context, z, ug.mo8192rb().mo9497d(), tg, new C2776Vg(context, ug.mo8201ub(), ug.mo8206zb(), _uVar, ug.mo8204xb()));
    }
}
