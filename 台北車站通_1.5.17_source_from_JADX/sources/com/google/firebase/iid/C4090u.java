package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.u */
final class C4090u {

    /* renamed from: a */
    final Intent f12127a;

    /* renamed from: b */
    private final BroadcastReceiver.PendingResult f12128b;

    /* renamed from: c */
    private boolean f12129c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f12130d;

    C4090u(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f12127a = intent;
        this.f12128b = pendingResult;
        this.f12130d = scheduledExecutorService.schedule(new C4091v(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11530a() {
        if (!this.f12129c) {
            this.f12128b.finish();
            this.f12130d.cancel(false);
            this.f12129c = true;
        }
    }
}
