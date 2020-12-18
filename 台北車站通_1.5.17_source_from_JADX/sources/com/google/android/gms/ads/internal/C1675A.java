package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3390pt;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.A */
final class C1675A extends TimerTask {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f5499a;

    /* renamed from: b */
    private final /* synthetic */ Timer f5500b;

    /* renamed from: c */
    private final /* synthetic */ C1700a f5501c;

    C1675A(C1700a aVar, CountDownLatch countDownLatch, Timer timer) {
        this.f5501c = aVar;
        this.f5499a = countDownLatch;
        this.f5500b = timer;
    }

    public final void run() {
        if (((long) ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7903hd)).intValue()) != this.f5499a.getCount()) {
            C2227Cf.m9532b("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.f5499a.getCount() == 0) {
                this.f5500b.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.f5501c.f5648f.f5616c.getPackageName()).concat("_adsTrace_");
        try {
            C2227Cf.m9532b("Starting method tracing");
            this.f5499a.countDown();
            long a = C1697X.m7705l().mo7725a();
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 20);
            sb.append(concat);
            sb.append(a);
            Debug.startMethodTracing(sb.toString(), ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7909id)).intValue());
        } catch (Exception e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
