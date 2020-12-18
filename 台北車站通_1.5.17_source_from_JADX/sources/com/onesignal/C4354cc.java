package com.onesignal;

import android.app.Activity;

/* renamed from: com.onesignal.cc */
class C4354cc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4384jc f12876a;

    /* renamed from: b */
    final /* synthetic */ Activity f12877b;

    /* renamed from: c */
    final /* synthetic */ String f12878c;

    C4354cc(C4384jc jcVar, Activity activity, String str) {
        this.f12876a = jcVar;
        this.f12877b = activity;
        this.f12878c = str;
    }

    public void run() {
        this.f12876a.m17387a(this.f12877b, this.f12878c);
    }
}
