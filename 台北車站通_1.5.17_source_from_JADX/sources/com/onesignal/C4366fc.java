package com.onesignal;

import android.app.Activity;

/* renamed from: com.onesignal.fc */
class C4366fc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f12895a;

    /* renamed from: b */
    final /* synthetic */ String f12896b;

    /* renamed from: c */
    final /* synthetic */ C4384jc f12897c;

    C4366fc(C4384jc jcVar, Activity activity, String str) {
        this.f12897c = jcVar;
        this.f12895a = activity;
        this.f12896b = str;
    }

    public void run() {
        this.f12897c.m17408d(this.f12895a);
        this.f12897c.f12929d.loadData(this.f12896b, "text/html; charset=utf-8", "base64");
    }
}
