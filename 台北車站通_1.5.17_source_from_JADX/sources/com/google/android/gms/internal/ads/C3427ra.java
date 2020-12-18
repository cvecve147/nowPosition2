package com.google.android.gms.internal.ads;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ra */
public final class C3427ra implements C3110ga<C3506tv> {

    /* renamed from: a */
    private final boolean f10102a;

    /* renamed from: b */
    private final boolean f10103b;

    /* renamed from: c */
    private final boolean f10104c;

    public C3427ra(boolean z, boolean z2, boolean z3) {
        this.f10102a = z;
        this.f10103b = z2;
        this.f10104c = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.C2329Fv mo9445a(com.google.android.gms.internal.ads.C2825X r19, org.json.JSONObject r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r19
            r8 = r20
            boolean r5 = r0.f10102a
            boolean r6 = r0.f10103b
            java.lang.String r3 = "images"
            r4 = 0
            r1 = r19
            r2 = r20
            java.util.List r1 = r1.mo9015a(r2, r3, r4, r5, r6)
            boolean r2 = r0.f10102a
            java.lang.String r3 = "secondary_image"
            com.google.android.gms.internal.ads.Wf r2 = r7.mo9014a(r8, r3, r4, r2)
            com.google.android.gms.internal.ads.Wf r3 = r19.mo9012a((org.json.JSONObject) r20)
            java.lang.String r4 = "video"
            com.google.android.gms.internal.ads.Wf r4 = r7.mo9013a((org.json.JSONObject) r8, (java.lang.String) r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0030:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.ads.Wf r5 = (com.google.android.gms.internal.ads.C2804Wf) r5
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.qv r5 = (com.google.android.gms.internal.ads.C3420qv) r5
            r7.add(r5)
            goto L_0x0030
        L_0x0046:
            com.google.android.gms.internal.ads.uh r1 = com.google.android.gms.internal.ads.C2825X.m11524a((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C3520uh>) r4)
            com.google.android.gms.internal.ads.tv r4 = new com.google.android.gms.internal.ads.tv
            java.lang.String r5 = "headline"
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = r0.f10104c
            if (r6 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.C2558Nu.f7787Ne
            com.google.android.gms.internal.ads.Lu r9 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r6 = r9.mo8515a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.Id r6 = com.google.android.gms.ads.internal.C1697X.m7702i()
            android.content.res.Resources r6 = r6.mo8321b()
            if (r6 == 0) goto L_0x0079
            int r9 = com.google.android.gms.ads.p066b.C1636a.f5455s7
            java.lang.String r6 = r6.getString(r9)
            goto L_0x007b
        L_0x0079:
            java.lang.String r6 = "Test Ad"
        L_0x007b:
            if (r5 == 0) goto L_0x00a5
            java.lang.String r9 = java.lang.String.valueOf(r6)
            int r9 = r9.length()
            int r9 = r9 + 3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            int r9 = r9 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r6)
            java.lang.String r6 = " : "
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
        L_0x00a4:
            r6 = r5
        L_0x00a5:
            java.lang.String r5 = "body"
            java.lang.String r9 = r8.getString(r5)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.Zv r2 = (com.google.android.gms.internal.ads.C2903Zv) r2
            java.lang.String r5 = "call_to_action"
            java.lang.String r10 = r8.getString(r5)
            java.lang.String r5 = "advertiser"
            java.lang.String r11 = r8.getString(r5)
            java.lang.Object r3 = r3.get()
            r12 = r3
            com.google.android.gms.internal.ads.mv r12 = (com.google.android.gms.internal.ads.C3306mv) r12
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r3 = 0
            if (r1 == 0) goto L_0x00d2
            com.google.android.gms.internal.ads.Kh r5 = r1.mo8174jb()
            r14 = r5
            goto L_0x00d3
        L_0x00d2:
            r14 = r3
        L_0x00d3:
            if (r1 == 0) goto L_0x00db
            android.view.View r1 = r1.getView()
            r15 = r1
            goto L_0x00dc
        L_0x00db:
            r15 = r3
        L_0x00dc:
            r16 = 0
            r17 = 0
            r5 = r4
            r8 = r9
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3427ra.mo9445a(com.google.android.gms.internal.ads.X, org.json.JSONObject):com.google.android.gms.internal.ads.Fv");
    }
}
