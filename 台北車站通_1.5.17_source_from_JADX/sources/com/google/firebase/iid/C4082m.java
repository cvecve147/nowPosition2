package com.google.firebase.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.firebase.iid.m */
final class C4082m extends Handler {

    /* renamed from: a */
    private final /* synthetic */ C4081l f12100a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4082m(C4081l lVar, Looper looper) {
        super(looper);
        this.f12100a = lVar;
    }

    public final void handleMessage(Message message) {
        this.f12100a.m16323a(message);
    }
}
