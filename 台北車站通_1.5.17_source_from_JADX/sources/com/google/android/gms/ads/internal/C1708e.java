package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2369Hd;
import com.google.android.gms.internal.ads.C2427Jf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2483Lf;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2804Wf;
import com.google.android.gms.internal.ads.C2972bg;
import com.google.android.gms.internal.ads.C3050dz;
import com.google.android.gms.internal.ads.C3163hz;
import com.google.android.gms.internal.ads.C3192iz;
import com.google.android.gms.internal.ads.C3282lz;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.zzang;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.e */
public final class C1708e {

    /* renamed from: a */
    private final Object f5664a = new Object();

    /* renamed from: b */
    private Context f5665b;

    /* renamed from: c */
    private long f5666c = 0;

    /* renamed from: a */
    public final void mo6901a(Context context, zzang zzang, String str, Runnable runnable) {
        mo6902a(context, zzang, true, (C2369Hd) null, str, (String) null, runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6902a(Context context, zzang zzang, boolean z, C2369Hd hd, String str, String str2, Runnable runnable) {
        if (C1697X.m7705l().mo7726b() - this.f5666c < 5000) {
            C2227Cf.m9536d("Not retrying to fetch app settings");
            return;
        }
        this.f5666c = C1697X.m7705l().mo7726b();
        boolean z2 = true;
        if (hd != null) {
            if (!(C1697X.m7705l().mo7725a() - hd.mo8254a() > ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7963rd)).longValue()) && hd.mo8255b()) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                C2227Cf.m9536d("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f5665b = applicationContext;
                C3282lz a = C1697X.m7712s().mo9416a(this.f5665b, zzang);
                C3163hz<JSONObject> hzVar = C3192iz.f9538b;
                C3050dz<I, O> a2 = a.mo9706a("google.afma.config.fetchAppSettings", hzVar, hzVar);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    C2804Wf<O> a3 = a2.mo9344a(jSONObject);
                    C2804Wf<B> a4 = C2483Lf.m10497a(a3, C1710f.f5668a, C2972bg.f8939b);
                    if (runnable != null) {
                        a3.mo8923a(runnable, C2972bg.f8939b);
                    }
                    C2427Jf.m10346a(a4, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    C2227Cf.m9533b("Error requesting application settings", e);
                }
            } else {
                C2227Cf.m9536d("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}
