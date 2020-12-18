package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ia */
final /* synthetic */ class C3166ia implements Runnable {

    /* renamed from: a */
    private final C3138ha f9455a;

    /* renamed from: b */
    private final JSONObject f9456b;

    /* renamed from: c */
    private final C3116gg f9457c;

    C3166ia(C3138ha haVar, JSONObject jSONObject, C3116gg ggVar) {
        this.f9455a = haVar;
        this.f9456b = jSONObject;
        this.f9457c = ggVar;
    }

    public final void run() {
        this.f9455a.mo9487a(this.f9456b, this.f9457c);
    }
}
