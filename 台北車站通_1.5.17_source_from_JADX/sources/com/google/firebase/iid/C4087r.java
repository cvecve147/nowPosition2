package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: com.google.firebase.iid.r */
final class C4087r extends BroadcastReceiver {

    /* renamed from: a */
    private C4086q f12118a;

    public C4087r(C4086q qVar) {
        this.f12118a = qVar;
    }

    /* renamed from: a */
    public final void mo11524a() {
        if (FirebaseInstanceId.m16251h()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f12118a.mo11521a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        C4086q qVar = this.f12118a;
        if (qVar != null && qVar.mo11522b()) {
            if (FirebaseInstanceId.m16251h()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m16246a((Runnable) this.f12118a, 0);
            this.f12118a.mo11521a().unregisterReceiver(this);
            this.f12118a = null;
        }
    }
}
