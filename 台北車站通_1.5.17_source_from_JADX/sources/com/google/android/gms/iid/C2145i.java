package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.iid.i */
final class C2145i extends Handler {

    /* renamed from: a */
    private final /* synthetic */ C2144h f6636a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2145i(C2144h hVar, Looper looper) {
        super(looper);
        this.f6636a = hVar;
    }

    public final void handleMessage(Message message) {
        this.f6636a.mo7766a(message);
    }
}
