package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1870f;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.r */
final class C1958r implements C1870f.C1871a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f6298a;

    /* renamed from: b */
    private final /* synthetic */ C1956q f6299b;

    C1958r(C1956q qVar, BasePendingResult basePendingResult) {
        this.f6299b = qVar;
        this.f6298a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo7318a(Status status) {
        this.f6299b.f6296a.remove(this.f6298a);
    }
}
