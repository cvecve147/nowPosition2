package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.C1697X;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Pu */
public final class C2621Pu {

    /* renamed from: a */
    private String f8125a;

    /* renamed from: b */
    private Map<String, String> f8126b;

    /* renamed from: c */
    private Context f8127c = null;

    /* renamed from: d */
    private String f8128d = null;

    public C2621Pu(Context context, String str) {
        this.f8127c = context;
        this.f8128d = str;
        this.f8125a = (String) C3390pt.m13458f().mo8515a(C2558Nu.f7906ia);
        this.f8126b = new LinkedHashMap();
        this.f8126b.put("s", "gmob_sdk");
        this.f8126b.put("v", "3");
        this.f8126b.put("os", Build.VERSION.RELEASE);
        this.f8126b.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.f8126b;
        C1697X.m7698e();
        map.put("device", C3114ge.m12424b());
        this.f8126b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.f8126b;
        C1697X.m7698e();
        map2.put("is_lite_sdk", C3114ge.m12444k(context) ? "1" : "0");
        Future<C2909_b> a = C1697X.m7709p().mo9225a(this.f8127c);
        try {
            a.get();
            this.f8126b.put("network_coarse", Integer.toString(a.get().f8745n));
            this.f8126b.put("network_fine", Integer.toString(a.get().f8746o));
        } catch (Exception e) {
            C1697X.m7702i().mo8319a((Throwable) e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo8699a() {
        return this.f8127c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo8700b() {
        return this.f8128d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo8701c() {
        return this.f8125a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<String, String> mo8702d() {
        return this.f8126b;
    }
}
