package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Ap */
public final class C2181Ap extends C3671zp {
    private C2181Ap(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: a */
    public static C2181Ap m9394a(String str, Context context, boolean z) {
        C3671zp.m14714a(context, z);
        return new C2181Ap(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<Callable<Void>> mo7841a(C2701Sp sp, C2921_l _lVar, C3609xk xkVar) {
        if (sp.mo8838c() == null || !this.f10689y) {
            return super.mo7841a(sp, _lVar, xkVar);
        }
        int n = sp.mo8849n();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo7841a(sp, _lVar, xkVar));
        arrayList.add(new C3273lq(sp, "1QeH3Cf7T53ayw17Ebbo9YTdhU+IFx0X5nCtC5gZQym4uicOVPXxYWmMK9k58i8n", "bHJRpFJ+2R5LAbYQUBDMyfYpLd1oiGixlpIqMJOBQPY=", _lVar, n, 24));
        return arrayList;
    }
}
