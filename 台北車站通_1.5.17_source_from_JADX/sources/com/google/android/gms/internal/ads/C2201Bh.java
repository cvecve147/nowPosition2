package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1804ua;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Bh */
public final class C2201Bh {
    /* renamed from: a */
    public static C2804Wf<C3520uh> m9440a(Context context, zzang zzang, String str, C2209Bp bp, C1804ua uaVar) {
        return C2483Lf.m10497a(C2483Lf.m10495a(null), new C2229Ch(context, bp, zzang, uaVar, str), C2972bg.f8938a);
    }

    /* renamed from: a */
    public static C3520uh m9441a(Context context, C3146hi hiVar, String str, boolean z, boolean z2, C2209Bp bp, zzang zzang, C2930_u _uVar, C1690P p, C1804ua uaVar, C3275ls lsVar) {
        C2558Nu.m10773a(context);
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7844Ya)).booleanValue()) {
            return C3321ni.m13152a(context, hiVar, str, z2, z, bp, zzang, _uVar, p, uaVar, lsVar);
        }
        try {
            return (C3520uh) C3171if.m12584a(new C2258Dh(context, hiVar, str, z, z2, bp, zzang, _uVar, p, uaVar, lsVar));
        } catch (Throwable th) {
            throw new C2315Fh("Webview initialization failed.", th);
        }
    }
}
