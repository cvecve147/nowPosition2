package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Pq */
public final class C2617Pq implements C3644yr {

    /* renamed from: a */
    private WeakReference<C2244Cv> f8123a;

    public C2617Pq(C2244Cv cv) {
        this.f8123a = new WeakReference<>(cv);
    }

    /* renamed from: a */
    public final boolean mo8695a() {
        return this.f8123a.get() == null;
    }

    /* renamed from: b */
    public final C3644yr mo8696b() {
        return new C2675Rq((C2244Cv) this.f8123a.get());
    }

    /* renamed from: c */
    public final View mo8697c() {
        C2244Cv cv = (C2244Cv) this.f8123a.get();
        if (cv != null) {
            return cv.mo7955Fb();
        }
        return null;
    }
}
