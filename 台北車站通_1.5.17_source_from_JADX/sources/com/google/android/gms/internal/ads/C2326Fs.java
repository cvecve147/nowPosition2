package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fs */
public final class C2326Fs extends C2237Co<C2326Fs> {

    /* renamed from: c */
    private Integer f7026c = null;

    /* renamed from: d */
    private Integer f7027d = null;

    public C2326Fs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C2326Fs m9817b(com.google.android.gms.internal.ads.C3641yo r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.mo10243d()
            if (r0 == 0) goto L_0x007b
            r1 = 8
            r2 = 2
            if (r0 == r1) goto L_0x0048
            r1 = 16
            if (r0 == r1) goto L_0x0016
            boolean r0 = super.mo7936a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x0016:
            int r1 = r7.mo10234a()
            int r3 = r7.mo10249h()     // Catch:{ IllegalArgumentException -> 0x0074 }
            if (r3 < 0) goto L_0x0023
            if (r3 > r2) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r2 = 4
            if (r3 < r2) goto L_0x002f
            if (r3 > r2) goto L_0x002f
        L_0x0028:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            r6.f7027d = r2     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x0000
        L_0x002f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0074 }
            r4 = 51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.append(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            java.lang.String r3 = " is not a valid enum CellularNetworkType"
            r5.append(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            java.lang.String r3 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0074 }
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0074 }
        L_0x0048:
            int r1 = r7.mo10234a()
            int r3 = r7.mo10249h()     // Catch:{ IllegalArgumentException -> 0x0074 }
            if (r3 < 0) goto L_0x005b
            if (r3 > r2) goto L_0x005b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            r6.f7026c = r2     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x0000
        L_0x005b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0074 }
            r4 = 43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.append(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            java.lang.String r3 = " is not a valid enum NetworkType"
            r5.append(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            java.lang.String r3 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0074 }
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0074 }
        L_0x0074:
            r7.mo10246e(r1)
            r6.mo7936a(r7, r0)
            goto L_0x0000
        L_0x007b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2326Fs.m9817b(com.google.android.gms.internal.ads.yo):com.google.android.gms.internal.ads.Fs");
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m9817b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f7026c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        Integer num2 = this.f7027d;
        if (num2 != null) {
            ao.mo7837b(2, num2.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f7026c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        Integer num2 = this.f7027d;
        return num2 != null ? c + C2180Ao.m9380c(2, num2.intValue()) : c;
    }
}
