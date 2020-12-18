package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hh */
final class C3145hh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f9419a;

    /* renamed from: b */
    private final /* synthetic */ String f9420b;

    /* renamed from: c */
    private final /* synthetic */ int f9421c;

    /* renamed from: d */
    private final /* synthetic */ C3088fh f9422d;

    C3145hh(C3088fh fhVar, String str, String str2, int i) {
        this.f9422d = fhVar;
        this.f9419a = str;
        this.f9420b = str2;
        this.f9421c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f9419a);
        hashMap.put("cachedSrc", this.f9420b);
        hashMap.put("totalBytes", Integer.toString(this.f9421c));
        this.f9422d.m12321a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
