package com.onesignal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.onesignal.C4426tb;

public class SyncService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C4426tb.m17581a((Context) this, (C4426tb.C4429c) new C4426tb.C4427a(this));
        return 1;
    }
}
