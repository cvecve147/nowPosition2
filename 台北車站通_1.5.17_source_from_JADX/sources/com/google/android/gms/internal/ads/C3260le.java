package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.le */
final class C3260le extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ C3114ge f9740a;

    private C3260le(C3114ge geVar) {
        this.f9740a = geVar;
    }

    /* synthetic */ C3260le(C3114ge geVar, C3142he heVar) {
        this(geVar);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.f9740a.f9353c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.f9740a.f9353c = false;
        }
    }
}
