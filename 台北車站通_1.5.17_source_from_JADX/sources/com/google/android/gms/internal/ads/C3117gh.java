package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gh */
final class C3117gh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f9368a;

    /* renamed from: b */
    private final /* synthetic */ String f9369b;

    /* renamed from: c */
    private final /* synthetic */ int f9370c;

    /* renamed from: d */
    private final /* synthetic */ int f9371d;

    /* renamed from: e */
    private final /* synthetic */ boolean f9372e = false;

    /* renamed from: f */
    private final /* synthetic */ C3088fh f9373f;

    C3117gh(C3088fh fhVar, String str, String str2, int i, int i2, boolean z) {
        this.f9373f = fhVar;
        this.f9368a = str;
        this.f9369b = str2;
        this.f9370c = i;
        this.f9371d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f9368a);
        hashMap.put("cachedSrc", this.f9369b);
        hashMap.put("bytesLoaded", Integer.toString(this.f9370c));
        hashMap.put("totalBytes", Integer.toString(this.f9371d));
        hashMap.put("cacheReady", this.f9372e ? "1" : "0");
        this.f9373f.m12321a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
