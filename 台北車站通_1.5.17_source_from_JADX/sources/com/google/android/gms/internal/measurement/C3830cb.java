package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.cb */
final class C3830cb implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ C3814Za f11403a;

    C3830cb(C3814Za za) {
        this.f11403a = za;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object call() {
        /*
            r8 = this;
            com.google.android.gms.internal.measurement.Za r0 = r8.f11403a
            com.google.android.gms.internal.measurement.ha r0 = r0.mo10455q()
            java.lang.String r0 = r0.mo10753z()
            if (r0 == 0) goto L_0x000d
            return r0
        L_0x000d:
            com.google.android.gms.internal.measurement.Za r0 = r8.f11403a
            com.google.android.gms.internal.measurement.Za r0 = r0.mo10567h()
            com.google.android.gms.internal.measurement.wa r1 = r0.mo10386c()
            boolean r1 = r1.mo11023z()
            r2 = 0
            if (r1 == 0) goto L_0x002c
            com.google.android.gms.internal.measurement.W r0 = r0.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()
            java.lang.String r1 = "Cannot retrieve app instance id from analytics worker thread"
        L_0x0028:
            r0.mo10592a(r1)
            goto L_0x0066
        L_0x002c:
            r0.mo10386c()
            boolean r1 = com.google.android.gms.internal.measurement.C3909wa.m15801y()
            if (r1 == 0) goto L_0x0040
            com.google.android.gms.internal.measurement.W r0 = r0.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()
            java.lang.String r1 = "Cannot retrieve app instance id from main thread"
            goto L_0x0028
        L_0x0040:
            com.google.android.gms.common.util.e r1 = r0.mo10382a()
            long r1 = r1.mo7726b()
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.String r5 = r0.mo10624c((long) r3)
            com.google.android.gms.common.util.e r6 = r0.mo10382a()
            long r6 = r6.mo7726b()
            long r6 = r6 - r1
            if (r5 != 0) goto L_0x0065
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0065
            long r3 = r3 - r6
            java.lang.String r0 = r0.mo10624c((long) r3)
            r2 = r0
            goto L_0x0066
        L_0x0065:
            r2 = r5
        L_0x0066:
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.measurement.Za r0 = r8.f11403a
            com.google.android.gms.internal.measurement.ha r0 = r0.mo10455q()
            r0.mo10750d((java.lang.String) r2)
            return r2
        L_0x0072:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3830cb.call():java.lang.Object");
    }
}
