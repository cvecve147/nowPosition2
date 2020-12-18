package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.hq */
public final class C3154hq extends C2239Cq {

    /* renamed from: i */
    private static volatile C2982bp f9440i;

    /* renamed from: j */
    private static final Object f9441j = new Object();

    /* renamed from: k */
    private C3609xk f9442k = null;

    public C3154hq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2, C3609xk xkVar) {
        super(sp, str, str2, _lVar, i, 27);
        this.f9442k = xkVar;
    }

    /* renamed from: c */
    private final String m12558c() {
        try {
            if (this.f6814b.mo8847l() != null) {
                this.f6814b.mo8847l().get();
            }
            C2921_l k = this.f6814b.mo8846k();
            if (k == null || k.f8848y == null) {
                return null;
            }
            return k.f8848y;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7939a() {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.bp r0 = f9440i
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.bp r0 = f9440i
            java.lang.String r0 = r0.f8956b
            boolean r0 = com.google.android.gms.internal.ads.C2925_p.m11873b(r0)
            if (r0 != 0) goto L_0x002b
            com.google.android.gms.internal.ads.bp r0 = f9440i
            java.lang.String r0 = r0.f8956b
            java.lang.String r3 = "E"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x002b
            com.google.android.gms.internal.ads.bp r0 = f9440i
            java.lang.String r0 = r0.f8956b
            java.lang.String r3 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = f9441j
            monitor-enter(r0)
            com.google.android.gms.internal.ads.xk r3 = r11.f9442k     // Catch:{ all -> 0x00e0 }
            r3 = 0
            boolean r4 = com.google.android.gms.internal.ads.C2925_p.m11873b(r3)     // Catch:{ all -> 0x00e0 }
            r5 = 4
            r6 = 2
            r7 = 3
            if (r4 != 0) goto L_0x003f
            r4 = r5
            goto L_0x0082
        L_0x003f:
            com.google.android.gms.internal.ads.xk r4 = r11.f9442k     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.ads.C2925_p.m11873b(r3)     // Catch:{ all -> 0x00e0 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00e0 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00e0 }
            if (r4 == 0) goto L_0x0081
            com.google.android.gms.internal.ads.Sp r4 = r11.f6814b     // Catch:{ all -> 0x00e0 }
            boolean r4 = r4.mo8844i()     // Catch:{ all -> 0x00e0 }
            if (r4 == 0) goto L_0x007c
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C2558Nu.f8010zc     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.ads.Lu r8 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x00e0 }
            java.lang.Object r4 = r8.mo8515a(r4)     // Catch:{ all -> 0x00e0 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00e0 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00e0 }
            if (r4 == 0) goto L_0x007c
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C2558Nu.f7707Ac     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.ads.Lu r8 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x00e0 }
            java.lang.Object r4 = r8.mo8515a(r4)     // Catch:{ all -> 0x00e0 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00e0 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00e0 }
            if (r4 == 0) goto L_0x007c
            r4 = r1
            goto L_0x007d
        L_0x007c:
            r4 = r2
        L_0x007d:
            if (r4 == 0) goto L_0x0081
            r4 = r7
            goto L_0x0082
        L_0x0081:
            r4 = r6
        L_0x0082:
            java.lang.reflect.Method r8 = r11.f6818f     // Catch:{ all -> 0x00e0 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.ads.Sp r10 = r11.f6814b     // Catch:{ all -> 0x00e0 }
            android.content.Context r10 = r10.mo8832a()     // Catch:{ all -> 0x00e0 }
            r9[r2] = r10     // Catch:{ all -> 0x00e0 }
            if (r4 != r6) goto L_0x0091
            r2 = r1
        L_0x0091:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00e0 }
            r9[r1] = r2     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C2558Nu.f7974tc     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r2.mo8515a(r1)     // Catch:{ all -> 0x00e0 }
            r9[r6] = r1     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r8.invoke(r3, r9)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00e0 }
            com.google.android.gms.internal.ads.bp r2 = new com.google.android.gms.internal.ads.bp     // Catch:{ all -> 0x00e0 }
            r2.<init>(r1)     // Catch:{ all -> 0x00e0 }
            f9440i = r2     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r2.f8956b     // Catch:{ all -> 0x00e0 }
            boolean r1 = com.google.android.gms.internal.ads.C2925_p.m11873b(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00c4
            com.google.android.gms.internal.ads.bp r1 = f9440i     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r1.f8956b     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "E"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00de
        L_0x00c4:
            if (r4 == r7) goto L_0x00d0
            if (r4 == r5) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            com.google.android.gms.internal.ads.bp r1 = f9440i     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r3.f8656c     // Catch:{ all -> 0x00e0 }
            r1.f8956b = r2     // Catch:{ all -> 0x00e0 }
            goto L_0x00de
        L_0x00d0:
            java.lang.String r1 = r11.m12558c()     // Catch:{ all -> 0x00e0 }
            boolean r2 = com.google.android.gms.internal.ads.C2925_p.m11873b(r1)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x00de
            com.google.android.gms.internal.ads.bp r2 = f9440i     // Catch:{ all -> 0x00e0 }
            r2.f8956b = r1     // Catch:{ all -> 0x00e0 }
        L_0x00de:
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x00e3
        L_0x00e0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            throw r1
        L_0x00e3:
            com.google.android.gms.internal.ads._l r0 = r11.f6817e
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bp r1 = f9440i     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x0116
            com.google.android.gms.internal.ads._l r1 = r11.f6817e     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads.bp r2 = f9440i     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.f8956b     // Catch:{ all -> 0x0118 }
            r1.f8848y = r2     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads._l r1 = r11.f6817e     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads.bp r2 = f9440i     // Catch:{ all -> 0x0118 }
            long r2 = r2.f8957c     // Catch:{ all -> 0x0118 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0118 }
            r1.f8785E = r2     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads._l r1 = r11.f6817e     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads.bp r2 = f9440i     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.f8958d     // Catch:{ all -> 0x0118 }
            r1.f8784D = r2     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads._l r1 = r11.f6817e     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads.bp r2 = f9440i     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.f8959e     // Catch:{ all -> 0x0118 }
            r1.f8795O = r2     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads._l r1 = r11.f6817e     // Catch:{ all -> 0x0118 }
            com.google.android.gms.internal.ads.bp r2 = f9440i     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = r2.f8960f     // Catch:{ all -> 0x0118 }
            r1.f8796P = r2     // Catch:{ all -> 0x0118 }
        L_0x0116:
            monitor-exit(r0)     // Catch:{ all -> 0x0118 }
            return
        L_0x0118:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0118 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3154hq.mo7939a():void");
    }
}
