package com.google.android.gms.internal.ads;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.qa */
public final class C3399qa implements C3110ga<C3449rv> {

    /* renamed from: a */
    private final boolean f10060a;

    /* renamed from: b */
    private final boolean f10061b;

    /* renamed from: c */
    private final boolean f10062c;

    public C3399qa(boolean z, boolean z2, boolean z3) {
        this.f10060a = z;
        this.f10061b = z2;
        this.f10062c = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ed  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.C2329Fv mo9445a(com.google.android.gms.internal.ads.C2825X r22, org.json.JSONObject r23) {
        /*
            r21 = this;
            r0 = r21
            r7 = r22
            r8 = r23
            boolean r5 = r0.f10060a
            boolean r6 = r0.f10061b
            java.lang.String r3 = "images"
            r4 = 0
            r1 = r22
            r2 = r23
            java.util.List r1 = r1.mo9015a(r2, r3, r4, r5, r6)
            boolean r2 = r0.f10060a
            java.lang.String r3 = "app_icon"
            r4 = 1
            com.google.android.gms.internal.ads.Wf r2 = r7.mo9014a(r8, r3, r4, r2)
            java.lang.String r3 = "video"
            com.google.android.gms.internal.ads.Wf r3 = r7.mo9013a((org.json.JSONObject) r8, (java.lang.String) r3)
            com.google.android.gms.internal.ads.Wf r4 = r22.mo9012a((org.json.JSONObject) r23)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.ads.Wf r5 = (com.google.android.gms.internal.ads.C2804Wf) r5
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.qv r5 = (com.google.android.gms.internal.ads.C3420qv) r5
            r7.add(r5)
            goto L_0x0031
        L_0x0047:
            com.google.android.gms.internal.ads.uh r1 = com.google.android.gms.internal.ads.C2825X.m11524a((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C3520uh>) r3)
            com.google.android.gms.internal.ads.rv r3 = new com.google.android.gms.internal.ads.rv
            java.lang.String r5 = "headline"
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = r0.f10062c
            if (r6 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.C2558Nu.f7787Ne
            com.google.android.gms.internal.ads.Lu r9 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r6 = r9.mo8515a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.Id r6 = com.google.android.gms.ads.internal.C1697X.m7702i()
            android.content.res.Resources r6 = r6.mo8321b()
            if (r6 == 0) goto L_0x007a
            int r9 = com.google.android.gms.ads.p066b.C1636a.f5455s7
            java.lang.String r6 = r6.getString(r9)
            goto L_0x007c
        L_0x007a:
            java.lang.String r6 = "Test Ad"
        L_0x007c:
            if (r5 == 0) goto L_0x00a6
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
        L_0x00a5:
            r6 = r5
        L_0x00a6:
            java.lang.String r5 = "body"
            java.lang.String r9 = r8.getString(r5)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.Zv r2 = (com.google.android.gms.internal.ads.C2903Zv) r2
            java.lang.String r5 = "call_to_action"
            java.lang.String r10 = r8.getString(r5)
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r5 = "rating"
            double r11 = r8.optDouble(r5, r11)
            java.lang.String r5 = "store"
            java.lang.String r13 = r8.optString(r5)
            java.lang.String r5 = "price"
            java.lang.String r14 = r8.optString(r5)
            java.lang.Object r4 = r4.get()
            r15 = r4
            com.google.android.gms.internal.ads.mv r15 = (com.google.android.gms.internal.ads.C3306mv) r15
            android.os.Bundle r16 = new android.os.Bundle
            r16.<init>()
            r4 = 0
            if (r1 == 0) goto L_0x00e2
            com.google.android.gms.internal.ads.Kh r5 = r1.mo8174jb()
            r17 = r5
            goto L_0x00e4
        L_0x00e2:
            r17 = r4
        L_0x00e4:
            if (r1 == 0) goto L_0x00ed
            android.view.View r1 = r1.getView()
            r18 = r1
            goto L_0x00ef
        L_0x00ed:
            r18 = r4
        L_0x00ef:
            r19 = 0
            r20 = 0
            r5 = r3
            r8 = r9
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3399qa.mo9445a(com.google.android.gms.internal.ads.X, org.json.JSONObject):com.google.android.gms.internal.ads.Fv");
    }
}
