package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.C4284Q;

public class RestoreJobService extends JobIntentService {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12324a(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            C4277O.m16969a(getApplicationContext(), (C4388k) new C4393l(extras), (C4284Q.C4285a) null);
        }
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo12327c() {
        return super.mo12327c();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
