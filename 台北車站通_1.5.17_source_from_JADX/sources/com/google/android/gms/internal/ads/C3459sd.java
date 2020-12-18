package com.google.android.gms.internal.ads;

import android.content.Context;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.sd */
public final class C3459sd implements C3331nr {

    /* renamed from: a */
    private final Context f10180a;

    /* renamed from: b */
    private final Object f10181b;

    /* renamed from: c */
    private String f10182c;

    /* renamed from: d */
    private boolean f10183d;

    public C3459sd(Context context, String str) {
        this.f10180a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10182c = str;
        this.f10183d = false;
        this.f10181b = new Object();
    }

    /* renamed from: a */
    public final void mo8146a(C3302mr mrVar) {
        mo9995a(mrVar.f9820m);
    }

    /* renamed from: a */
    public final void mo9994a(String str) {
        this.f10182c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9995a(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.td r0 = com.google.android.gms.ads.internal.C1697X.m7689B()
            android.content.Context r1 = r3.f10180a
            boolean r0 = r0.mo10040d(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f10181b
            monitor-enter(r0)
            boolean r1 = r3.f10183d     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f10183d = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f10182c     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f10183d     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.td r4 = com.google.android.gms.ads.internal.C1697X.m7689B()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f10180a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f10182c     // Catch:{ all -> 0x003f }
            r4.mo10032a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.td r4 = com.google.android.gms.ads.internal.C1697X.m7689B()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f10180a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f10182c     // Catch:{ all -> 0x003f }
            r4.mo10036b(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3459sd.mo9995a(boolean):void");
    }
}
