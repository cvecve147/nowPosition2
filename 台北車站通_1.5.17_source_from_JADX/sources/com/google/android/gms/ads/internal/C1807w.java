package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.w */
final class C1807w implements C1718E<C3520uh> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f5906a;

    C1807w(CountDownLatch countDownLatch) {
        this.f5906a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C2227Cf.m9536d("Adapter returned an ad, but assets substitution failed");
        this.f5906a.countDown();
        ((C3520uh) obj).destroy();
    }
}
