package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.j */
class C1528j extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C1529k f5235a;

    C1528j(C1529k kVar) {
        this.f5235a = kVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f5235a.finish();
    }
}
