package com.openlife.checkme.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.openlife.checkme.net.model.BeaconNotificationData;
import java.util.List;

/* renamed from: com.openlife.checkme.sdk.c */
class C4993c extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C4995e f14183a;

    C4993c(C4995e eVar) {
        this.f14183a = eVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getExtras() != null && intent.getSerializableExtra("SERVICE_INTENT_NAME") != null) {
            List list = (List) intent.getSerializableExtra("SERVICE_INTENT_NAME");
            List unused = this.f14183a.m19684a((List<BeaconNotificationData>) list);
            if (!list.isEmpty()) {
                this.f14183a.m19689c((List<BeaconNotificationData>) list);
            }
        }
    }
}
