package com.onesignal;

import com.onesignal.C4416rb;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;

/* renamed from: com.onesignal.mb */
class C4398mb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f12958a;

    /* renamed from: b */
    final /* synthetic */ JSONObject f12959b;

    /* renamed from: c */
    final /* synthetic */ C4416rb.C4417a f12960c;

    C4398mb(String str, JSONObject jSONObject, C4416rb.C4417a aVar) {
        this.f12958a = str;
        this.f12959b = jSONObject;
        this.f12960c = aVar;
    }

    public void run() {
        C4416rb.m17507c(this.f12958a, HttpPost.METHOD_NAME, this.f12959b, this.f12960c, 120000, (String) null);
    }
}
