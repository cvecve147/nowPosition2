package com.google.android.gms.internal.ads;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Td */
public abstract class C2717Td implements C3660ze<C2804Wf> {

    /* renamed from: a */
    private final Runnable f8332a = new C2746Ud(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile Thread f8333b;

    /* renamed from: c */
    private boolean f8334c = false;

    public C2717Td() {
    }

    public C2717Td(boolean z) {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8107a() {
        return this.f8334c ? C3057ee.m12272b(this.f8332a) : C3057ee.m12269a(this.f8332a);
    }

    /* renamed from: c */
    public abstract void mo7015c();

    public final void cancel() {
        mo7015c();
        if (this.f8333b != null) {
            this.f8333b.interrupt();
        }
    }

    /* renamed from: d */
    public abstract void mo7016d();

    /* renamed from: e */
    public final C2804Wf mo8892e() {
        return this.f8334c ? C3057ee.m12272b(this.f8332a) : C3057ee.m12269a(this.f8332a);
    }
}
