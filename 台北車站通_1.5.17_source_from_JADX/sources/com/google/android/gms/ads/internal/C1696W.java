package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.ads.internal.W */
final class C1696W {

    /* renamed from: a */
    private final String f5557a;

    /* renamed from: b */
    private final Map<String, String> f5558b = new TreeMap();

    /* renamed from: c */
    private String f5559c;

    /* renamed from: d */
    private String f5560d;

    public C1696W(String str) {
        this.f5557a = str;
    }

    /* renamed from: a */
    public final String mo6831a() {
        return this.f5559c;
    }

    /* renamed from: a */
    public final void mo6832a(zzjj zzjj, zzang zzang) {
        this.f5559c = zzjj.f10884j.f10904a;
        Bundle bundle = zzjj.f10887m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) C3390pt.m13458f().mo8515a(C2558Nu.f7999xd);
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    this.f5560d = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f5558b.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            this.f5558b.put("SDKVersion", zzang.f10855a);
        }
    }

    /* renamed from: b */
    public final String mo6833b() {
        return this.f5560d;
    }

    /* renamed from: c */
    public final String mo6834c() {
        return this.f5557a;
    }

    /* renamed from: d */
    public final Map<String, String> mo6835d() {
        return this.f5558b;
    }
}
