package com.google.firebase.iid;

import android.util.Log;

/* renamed from: com.google.firebase.iid.x */
final class C4093x implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4090u f12134a;

    /* renamed from: b */
    private final /* synthetic */ C4092w f12135b;

    C4093x(C4092w wVar, C4090u uVar) {
        this.f12135b = wVar;
        this.f12134a = uVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f12135b.f12133a.mo11480c(this.f12134a.f12127a);
        this.f12134a.mo11530a();
    }
}
