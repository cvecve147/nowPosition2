package com.onesignal;

import com.onesignal.C4416rb;
import org.apache.http.client.methods.HttpPut;
import org.json.JSONObject;

/* renamed from: com.onesignal.lb */
class C4395lb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f12953a;

    /* renamed from: b */
    final /* synthetic */ JSONObject f12954b;

    /* renamed from: c */
    final /* synthetic */ C4416rb.C4417a f12955c;

    C4395lb(String str, JSONObject jSONObject, C4416rb.C4417a aVar) {
        this.f12953a = str;
        this.f12954b = jSONObject;
        this.f12955c = aVar;
    }

    public void run() {
        C4416rb.m17507c(this.f12953a, HttpPut.METHOD_NAME, this.f12954b, this.f12955c, 120000, (String) null);
    }
}
