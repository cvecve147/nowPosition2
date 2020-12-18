package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ih */
final class C3173ih implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f9461a;

    /* renamed from: b */
    private final /* synthetic */ String f9462b;

    /* renamed from: c */
    private final /* synthetic */ String f9463c;

    /* renamed from: d */
    private final /* synthetic */ String f9464d;

    /* renamed from: e */
    private final /* synthetic */ C3088fh f9465e;

    C3173ih(C3088fh fhVar, String str, String str2, String str3, String str4) {
        this.f9465e = fhVar;
        this.f9461a = str;
        this.f9462b = str2;
        this.f9463c = str3;
        this.f9464d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f9461a);
        if (!TextUtils.isEmpty(this.f9462b)) {
            hashMap.put("cachedSrc", this.f9462b);
        }
        hashMap.put(SVGParser.XML_STYLESHEET_ATTR_TYPE, C3088fh.m12322b(this.f9463c));
        hashMap.put("reason", this.f9463c);
        if (!TextUtils.isEmpty(this.f9464d)) {
            hashMap.put("message", this.f9464d);
        }
        this.f9465e.m12321a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
