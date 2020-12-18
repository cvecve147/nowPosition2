package com.onesignal;

import android.app.Activity;

/* renamed from: com.onesignal.E */
class C4235E implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f12564a;

    /* renamed from: b */
    final /* synthetic */ C4250I f12565b;

    C4235E(C4250I i, Activity activity) {
        this.f12565b = i;
        this.f12564a = activity;
    }

    public void run() {
        this.f12565b.m16840c(this.f12564a);
    }
}
