package com.onesignal;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.C4284Q;
import p013b.p018b.p028h.p029a.C1024f;

public class GcmIntentService extends IntentService {
    public GcmIntentService() {
        super("GcmIntentService");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            C4277O.m16969a((Context) this, (C4388k) new C4393l(extras), (C4284Q.C4285a) null);
            C1024f.m5439a(intent);
        }
    }
}
