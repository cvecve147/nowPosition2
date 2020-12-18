package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C2227Cf;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.G */
final class C1720G implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ JSONObject f5674a;

    /* renamed from: b */
    private final /* synthetic */ C1719F f5675b;

    C1720G(C1719F f, JSONObject jSONObject) {
        this.f5675b = f;
        this.f5674a = jSONObject;
    }

    public final void run() {
        this.f5675b.f5672b.mo8150a("fetchHttpRequestCompleted", this.f5674a);
        C2227Cf.m9532b("Dispatched http response.");
    }
}
