package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Nm */
final class C2550Nm implements C3469sn {

    /* renamed from: a */
    private static final C2550Nm f7656a = new C2550Nm();

    private C2550Nm() {
    }

    /* renamed from: a */
    public static C2550Nm m10681a() {
        return f7656a;
    }

    /* renamed from: a */
    public final boolean mo8581a(Class<?> cls) {
        return C2577Om.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3441rn mo8582b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.ads.Om> r0 = com.google.android.gms.internal.ads.C2577Om.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001f
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0024
        L_0x001f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0024:
            r0.<init>(r5)
            throw r0
        L_0x0028:
            java.lang.Class<com.google.android.gms.internal.ads.Om> r0 = com.google.android.gms.internal.ads.C2577Om.class
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x003c }
            com.google.android.gms.internal.ads.Om r0 = com.google.android.gms.internal.ads.C2577Om.m10800a(r0)     // Catch:{ Exception -> 0x003c }
            int r1 = com.google.android.gms.internal.ads.C2577Om.C2582e.f8049c     // Catch:{ Exception -> 0x003c }
            r2 = 0
            java.lang.Object r0 = r0.mo7821a((int) r1, (java.lang.Object) r2, (java.lang.Object) r2)     // Catch:{ Exception -> 0x003c }
            com.google.android.gms.internal.ads.rn r0 = (com.google.android.gms.internal.ads.C3441rn) r0     // Catch:{ Exception -> 0x003c }
            return r0
        L_0x003c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0054
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0059
        L_0x0054:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0059:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2550Nm.mo8582b(java.lang.Class):com.google.android.gms.internal.ads.rn");
    }
}
