package com.onesignal;

import com.onesignal.C4416rb;
import org.json.JSONObject;

/* renamed from: com.onesignal.nb */
class C4401nb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f12964a;

    /* renamed from: b */
    final /* synthetic */ C4416rb.C4417a f12965b;

    /* renamed from: c */
    final /* synthetic */ String f12966c;

    C4401nb(String str, C4416rb.C4417a aVar, String str2) {
        this.f12964a = str;
        this.f12965b = aVar;
        this.f12966c = str2;
    }

    public void run() {
        C4416rb.m17507c(this.f12964a, (String) null, (JSONObject) null, this.f12965b, 60000, this.f12966c);
    }
}
