package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Cb */
final class C2223Cb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f6794a;

    /* renamed from: b */
    final /* synthetic */ String f6795b;

    /* renamed from: c */
    private final /* synthetic */ C2166Ab f6796c;

    C2223Cb(C2166Ab ab, JSONObject jSONObject, String str) {
        this.f6796c = ab;
        this.f6794a = jSONObject;
        this.f6795b = str;
    }

    public final void run() {
        C2653Qy unused = this.f6796c.f6670o = C2166Ab.f6662g.mo8022b((C2209Bp) null);
        this.f6796c.f6670o.mo9535a(new C2252Db(this), new C2280Eb(this));
    }
}
