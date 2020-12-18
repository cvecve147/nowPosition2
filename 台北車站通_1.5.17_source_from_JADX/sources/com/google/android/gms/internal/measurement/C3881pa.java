package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.gms.internal.measurement.pa */
final class C3881pa implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C3873na f11577a;

    private C3881pa(C3873na naVar) {
        this.f11577a = naVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f11577a.f11562a.mo10385b().mo10576B().mo10592a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            this.f11577a.f11563b = C3753Jc.m14951a(iBinder);
            if (this.f11577a.f11563b == null) {
                this.f11577a.f11562a.mo10385b().mo10576B().mo10592a("Install Referrer Service implementation was not found");
                return;
            }
            this.f11577a.f11562a.mo10385b().mo10578D().mo10592a("Install Referrer Service connected");
            this.f11577a.f11562a.mo10386c().mo11020a((Runnable) new C3885qa(this));
        } catch (Exception e) {
            this.f11577a.f11562a.mo10385b().mo10576B().mo10593a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C3873na naVar = this.f11577a;
        naVar.f11563b = null;
        naVar.f11562a.mo10385b().mo10578D().mo10592a("Install Referrer Service disconnected");
    }
}
