package com.onesignal;

import com.onesignal.C4416rb;
import org.json.JSONObject;

/* renamed from: com.onesignal.ob */
class C4404ob implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Thread[] f12973a;

    /* renamed from: b */
    final /* synthetic */ String f12974b;

    /* renamed from: c */
    final /* synthetic */ String f12975c;

    /* renamed from: d */
    final /* synthetic */ JSONObject f12976d;

    /* renamed from: e */
    final /* synthetic */ C4416rb.C4417a f12977e;

    /* renamed from: f */
    final /* synthetic */ int f12978f;

    /* renamed from: g */
    final /* synthetic */ String f12979g;

    C4404ob(Thread[] threadArr, String str, String str2, JSONObject jSONObject, C4416rb.C4417a aVar, int i, String str3) {
        this.f12973a = threadArr;
        this.f12974b = str;
        this.f12975c = str2;
        this.f12976d = jSONObject;
        this.f12977e = aVar;
        this.f12978f = i;
        this.f12979g = str3;
    }

    public void run() {
        this.f12973a[0] = C4416rb.m17509d(this.f12974b, this.f12975c, this.f12976d, this.f12977e, this.f12978f, this.f12979g);
    }
}
