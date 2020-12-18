package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.v */
final class C1805v implements C1718E<C3520uh> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f5901a;

    C1805v(CountDownLatch countDownLatch) {
        this.f5901a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        this.f5901a.countDown();
        ((C3520uh) obj).getView().setVisibility(0);
    }
}
