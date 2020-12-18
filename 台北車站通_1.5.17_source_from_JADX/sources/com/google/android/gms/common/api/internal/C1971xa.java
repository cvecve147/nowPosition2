package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1925e;
import com.google.android.gms.common.api.internal.C1939j;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.android.gms.common.api.internal.xa */
public final class C1971xa extends C1947la<Boolean> {

    /* renamed from: c */
    private final C1939j.C1940a<?> f6321c;

    public C1971xa(C1939j.C1940a<?> aVar, C5537h<Boolean> hVar) {
        super(4, hVar);
        this.f6321c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7374a(Status status) {
        super.mo7374a(status);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7376a(C1956q qVar, boolean z) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7377a(RuntimeException runtimeException) {
        super.mo7377a(runtimeException);
    }

    /* renamed from: b */
    public final void mo7467b(C1925e.C1926a<?> aVar) {
        C1936ha remove = aVar.mo7437i().remove(this.f6321c);
        if (remove != null) {
            remove.f6266b.mo7475a(aVar.mo7434f(), this.f6284b);
            remove.f6265a.mo7465a();
            return;
        }
        this.f6284b.mo15000b(false);
    }
}
