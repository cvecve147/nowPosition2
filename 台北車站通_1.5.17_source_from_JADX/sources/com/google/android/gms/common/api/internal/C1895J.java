package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.J */
abstract class C1895J implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1974z f6127a;

    private C1895J(C1974z zVar) {
        this.f6127a = zVar;
    }

    /* synthetic */ C1895J(C1974z zVar, C1875A a) {
        this(zVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7341a();

    public void run() {
        this.f6127a.f6328b.lock();
        try {
            if (!Thread.interrupted()) {
                mo7341a();
            }
        } catch (RuntimeException e) {
            this.f6127a.f6327a.mo7383a(e);
        } catch (Throwable th) {
            this.f6127a.f6328b.unlock();
            throw th;
        }
        this.f6127a.f6328b.unlock();
    }
}
