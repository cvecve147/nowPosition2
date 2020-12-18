package com.facebook.internal;

import com.facebook.C1601x;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.O */
public class C1458O<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f5078a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f5079b = new CountDownLatch(1);

    public C1458O(Callable<T> callable) {
        C1601x.m7395h().execute(new FutureTask(new C1457N(this, callable)));
    }

    /* renamed from: b */
    private void m6837b() {
        CountDownLatch countDownLatch = this.f5079b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public T mo6153a() {
        m6837b();
        return this.f5078a;
    }
}
