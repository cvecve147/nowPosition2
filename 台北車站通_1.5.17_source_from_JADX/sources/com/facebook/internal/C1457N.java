package com.facebook.internal;

import java.util.concurrent.Callable;

/* renamed from: com.facebook.internal.N */
class C1457N implements Callable<Void> {

    /* renamed from: a */
    final /* synthetic */ Callable f5076a;

    /* renamed from: b */
    final /* synthetic */ C1458O f5077b;

    C1457N(C1458O o, Callable callable) {
        this.f5077b = o;
        this.f5076a = callable;
    }

    /* JADX INFO: finally extract failed */
    public Void call() {
        try {
            Object unused = this.f5077b.f5078a = this.f5076a.call();
            this.f5077b.f5079b.countDown();
            return null;
        } catch (Throwable th) {
            this.f5077b.f5079b.countDown();
            throw th;
        }
    }
}
