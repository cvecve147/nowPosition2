package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Zd */
public final class C2885Zd extends Handler {
    public C2885Zd(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            C1697X.m7698e();
            C3114ge.m12411a(C1697X.m7702i().mo8314a(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C1697X.m7702i().mo8319a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }
}
