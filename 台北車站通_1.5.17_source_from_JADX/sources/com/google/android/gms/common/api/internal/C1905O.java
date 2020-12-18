package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.common.api.internal.O */
final class C1905O extends Handler {

    /* renamed from: a */
    private final /* synthetic */ C1899L f6179a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1905O(C1899L l, Looper looper) {
        super(looper);
        this.f6179a = l;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f6179a.m8434i();
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            this.f6179a.m8432g();
        }
    }
}
