package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.C4002b;
import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.G */
final class C1889G extends C4002b {

    /* renamed from: a */
    private final WeakReference<C1974z> f6121a;

    C1889G(C1974z zVar) {
        this.f6121a = new WeakReference<>(zVar);
    }

    /* renamed from: a */
    public final void mo7352a(SignInResponse signInResponse) {
        C1974z zVar = (C1974z) this.f6121a.get();
        if (zVar != null) {
            zVar.f6327a.mo7382a((C1909T) new C1891H(this, zVar, zVar, signInResponse));
        }
    }
}
