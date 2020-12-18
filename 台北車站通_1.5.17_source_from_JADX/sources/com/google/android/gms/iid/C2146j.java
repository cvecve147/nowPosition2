package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.j */
final class C2146j extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ C2144h f6637a;

    C2146j(C2144h hVar) {
        this.f6637a = hVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Received GSF callback via dynamic receiver");
        }
        this.f6637a.mo7765a(intent);
    }
}
