package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.T */
abstract class C1909T {

    /* renamed from: a */
    private final C1907Q f6196a;

    protected C1909T(C1907Q q) {
        this.f6196a = q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7343a();

    /* renamed from: a */
    public final void mo7386a(C1908S s) {
        s.f6181a.lock();
        try {
            if (s.f6191k == this.f6196a) {
                mo7343a();
            }
        } finally {
            s.f6181a.unlock();
        }
    }
}
