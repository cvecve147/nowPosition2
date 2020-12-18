package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1850a.C1854d;
import com.google.android.gms.common.api.C1869e;
import com.google.android.gms.common.api.internal.C1925e;
import com.google.android.gms.common.internal.C2025f;
import p101d.p129g.p131b.p132a.p143f.C5524b;
import p101d.p129g.p131b.p132a.p143f.C5525c;

/* renamed from: com.google.android.gms.common.api.internal.Ja */
public final class C1896Ja<O extends C1850a.C1854d> extends C1869e<O> {

    /* renamed from: j */
    private final C1850a.C1861f f6128j;

    /* renamed from: k */
    private final C1884Da f6129k;

    /* renamed from: l */
    private final C2025f f6130l;

    /* renamed from: m */
    private final C1850a.C1851a<? extends C5524b, C5525c> f6131m;

    public C1896Ja(Context context, C1850a<O> aVar, Looper looper, C1850a.C1861f fVar, C1884Da da, C2025f fVar2, C1850a.C1851a<? extends C5524b, C5525c> aVar2) {
        super(context, aVar, looper);
        this.f6128j = fVar;
        this.f6129k = da;
        this.f6130l = fVar2;
        this.f6131m = aVar2;
        this.f6070i.mo7419a((C1869e<?>) this);
    }

    /* renamed from: a */
    public final C1850a.C1861f mo7310a(Looper looper, C1925e.C1926a<O> aVar) {
        this.f6129k.mo7344a((C1886Ea) aVar);
        return this.f6128j;
    }

    /* renamed from: a */
    public final C1943ja mo7312a(Context context, Handler handler) {
        return new C1943ja(context, handler, this.f6130l, this.f6131m);
    }

    /* renamed from: f */
    public final C1850a.C1861f mo7357f() {
        return this.f6128j;
    }
}
