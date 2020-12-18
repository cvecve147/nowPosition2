package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1850a.C1854d;
import com.google.android.gms.common.api.C1869e;
import com.google.android.gms.common.api.C1874i;

/* renamed from: com.google.android.gms.common.api.internal.da */
public final class C1924da<O extends C1850a.C1854d> extends C1966v {

    /* renamed from: c */
    private final C1869e<O> f6215c;

    public C1924da(C1869e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f6215c = eVar;
    }

    /* renamed from: a */
    public final Looper mo7244a() {
        return this.f6215c.mo7316d();
    }

    /* renamed from: a */
    public final <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7246a(T t) {
        this.f6215c.mo7311a(t);
        return t;
    }

    /* renamed from: a */
    public final void mo7249a(C1953oa oaVar) {
    }
}
