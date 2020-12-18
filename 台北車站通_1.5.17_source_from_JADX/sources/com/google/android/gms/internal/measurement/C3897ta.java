package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.internal.measurement.ta */
final class C3897ta implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3715Aa f11648a;

    /* renamed from: b */
    private final /* synthetic */ long f11649b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f11650c;

    /* renamed from: d */
    private final /* synthetic */ Context f11651d;

    /* renamed from: e */
    private final /* synthetic */ C3801W f11652e;

    /* renamed from: f */
    private final /* synthetic */ BroadcastReceiver.PendingResult f11653f;

    C3897ta(C3889ra raVar, C3715Aa aa, long j, Bundle bundle, Context context, C3801W w, BroadcastReceiver.PendingResult pendingResult) {
        this.f11648a = aa;
        this.f11649b = j;
        this.f11650c = bundle;
        this.f11651d = context;
        this.f11652e = w;
        this.f11653f = pendingResult;
    }

    public final void run() {
        long a = this.f11648a.mo10393i().f11477k.mo10763a();
        long j = this.f11649b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f11650c.putLong("click_timestamp", j);
        }
        this.f11650c.putString("_cis", "referrer broadcast");
        AppMeasurement.getInstance(this.f11651d).logEventInternal("auto", "_cmp", this.f11650c);
        this.f11652e.mo10580F().mo10592a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f11653f;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
