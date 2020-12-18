package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.t */
final class C4089t implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Intent f12124a;

    /* renamed from: b */
    private final /* synthetic */ Intent f12125b;

    /* renamed from: c */
    private final /* synthetic */ C4088s f12126c;

    C4089t(C4088s sVar, Intent intent, Intent intent2) {
        this.f12126c = sVar;
        this.f12124a = intent;
        this.f12125b = intent2;
    }

    public final void run() {
        this.f12126c.mo11480c(this.f12124a);
        this.f12126c.m16352d(this.f12125b);
    }
}
