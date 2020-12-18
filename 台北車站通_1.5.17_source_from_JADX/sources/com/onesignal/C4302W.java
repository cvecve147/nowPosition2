package com.onesignal;

import android.content.Context;

/* renamed from: com.onesignal.W */
class C4302W implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f12728a;

    C4302W(Context context) {
        this.f12728a = context;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        C4305X.m17094b(this.f12728a);
    }
}
