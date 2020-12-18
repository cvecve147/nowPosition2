package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.common.api.internal.U */
final class C1910U extends Handler {

    /* renamed from: a */
    private final /* synthetic */ C1908S f6197a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1910U(C1908S s, Looper looper) {
        super(looper);
        this.f6197a = s;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C1909T) message.obj).mo7386a(this.f6197a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
