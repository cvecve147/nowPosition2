package com.onesignal;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import p013b.p018b.p028h.p029a.C1024f;

public class NotificationRestoreService extends IntentService {
    public NotificationRestoreService() {
        super("NotificationRestoreService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            Thread.currentThread().setPriority(10);
            C4306Xa.m17176f((Context) this);
            C4305X.m17094b(this);
            C1024f.m5439a(intent);
        }
    }
}
