package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C1930f;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.P */
final class C1906P extends C1930f.C1931a {

    /* renamed from: a */
    private WeakReference<C1899L> f6180a;

    C1906P(C1899L l) {
        this.f6180a = new WeakReference<>(l);
    }

    /* renamed from: a */
    public final void mo7380a() {
        C1899L l = (C1899L) this.f6180a.get();
        if (l != null) {
            l.m8432g();
        }
    }
}
