package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.p067c.C1640b;
import com.google.android.gms.ads.p067c.C1641c;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2845Xs;
import com.google.android.gms.internal.ads.C3334nu;

/* renamed from: com.google.android.gms.ads.h */
public final class C1669h {

    /* renamed from: a */
    private final C3334nu f5492a;

    public C1669h(Context context) {
        this.f5492a = new C3334nu(context);
        C2061y.m9068a(context, (Object) "Context cannot be null");
    }

    /* renamed from: a */
    public final void mo6700a() {
        this.f5492a.mo9804a();
    }

    /* renamed from: a */
    public final void mo6701a(C1628a aVar) {
        this.f5492a.mo9805a(aVar);
        if (aVar != null && (aVar instanceof C2845Xs)) {
            this.f5492a.mo9808a((C2845Xs) aVar);
        } else if (aVar == null) {
            this.f5492a.mo9808a((C2845Xs) null);
        }
    }

    /* renamed from: a */
    public final void mo6702a(C1640b bVar) {
        this.f5492a.mo9806a(bVar);
    }

    /* renamed from: a */
    public final void mo6703a(C1641c cVar) {
        this.f5492a.mo9807a(cVar);
    }

    /* renamed from: a */
    public final void mo6704a(C1637c cVar) {
        this.f5492a.mo9809a(cVar.mo6566a());
    }

    /* renamed from: a */
    public final void mo6705a(String str) {
        this.f5492a.mo9810a(str);
    }

    /* renamed from: a */
    public final void mo6706a(boolean z) {
        this.f5492a.mo9811a(z);
    }

    /* renamed from: b */
    public final Bundle mo6707b() {
        return this.f5492a.mo9812b();
    }

    /* renamed from: b */
    public final void mo6708b(boolean z) {
        this.f5492a.mo9813b(true);
    }
}
