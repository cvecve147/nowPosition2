package com.google.android.gms.internal.ads;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Wr */
public final class C2816Wr {

    /* renamed from: a */
    private final C2497Lr f8567a;

    /* renamed from: b */
    private final int f8568b;

    /* renamed from: c */
    private String f8569c;

    /* renamed from: d */
    private String f8570d;

    /* renamed from: e */
    private final boolean f8571e = false;

    /* renamed from: f */
    private final int f8572f;

    /* renamed from: g */
    private final int f8573g;

    public C2816Wr(int i, int i2, int i3) {
        this.f8568b = i;
        if (i2 > 64 || i2 < 0) {
            this.f8572f = 64;
        } else {
            this.f8572f = i2;
        }
        if (i3 <= 0) {
            this.f8573g = 1;
        } else {
            this.f8573g = i3;
        }
        this.f8567a = new C2760Ur(this.f8572f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0108, code lost:
        if (r2.size() < r1.f8568b) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0113 A[LOOP:0: B:1:0x0012->B:65:0x0113, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0117 A[EDGE_INSN: B:76:0x0117->B:66:0x0117 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo9010a(java.util.ArrayList<java.lang.String> r17, java.util.ArrayList<com.google.android.gms.internal.ads.C2467Kr> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            com.google.android.gms.internal.ads.Xr r2 = new com.google.android.gms.internal.ads.Xr
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0012:
            int r5 = r18.size()
            java.lang.String r6 = ""
            if (r4 >= r5) goto L_0x0117
            java.lang.Object r5 = r0.get(r4)
            com.google.android.gms.internal.ads.Kr r5 = (com.google.android.gms.internal.ads.C2467Kr) r5
            int r5 = r5.mo8464e()
            r7 = r17
            java.lang.Object r5 = r7.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.text.Normalizer$Form r8 = java.text.Normalizer.Form.NFKC
            java.lang.String r5 = java.text.Normalizer.normalize(r5, r8)
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r8)
            java.lang.String r8 = "\n"
            java.lang.String[] r5 = r5.split(r8)
            int r8 = r5.length
            if (r8 == 0) goto L_0x0110
            r8 = 0
        L_0x0042:
            int r10 = r5.length
            if (r8 >= r10) goto L_0x0110
            r10 = r5[r8]
            java.lang.String r11 = "'"
            int r11 = r10.indexOf(r11)
            r12 = -1
            if (r11 == r12) goto L_0x00aa
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            r12 = 1
            r13 = 0
        L_0x0057:
            int r14 = r12 + 2
            int r15 = r11.length()
            if (r14 > r15) goto L_0x009d
            char r15 = r11.charAt(r12)
            r3 = 39
            if (r15 != r3) goto L_0x009a
            int r3 = r12 + -1
            char r3 = r11.charAt(r3)
            r13 = 32
            if (r3 == r13) goto L_0x0094
            int r3 = r12 + 1
            char r15 = r11.charAt(r3)
            r9 = 115(0x73, float:1.61E-43)
            if (r15 == r9) goto L_0x0083
            char r3 = r11.charAt(r3)
            r9 = 83
            if (r3 != r9) goto L_0x0094
        L_0x0083:
            int r3 = r11.length()
            if (r14 == r3) goto L_0x008f
            char r3 = r11.charAt(r14)
            if (r3 != r13) goto L_0x0094
        L_0x008f:
            r11.insert(r12, r13)
            r12 = r14
            goto L_0x0097
        L_0x0094:
            r11.setCharAt(r12, r13)
        L_0x0097:
            r3 = 1
            r13 = 1
            goto L_0x009b
        L_0x009a:
            r3 = 1
        L_0x009b:
            int r12 = r12 + r3
            goto L_0x0057
        L_0x009d:
            if (r13 == 0) goto L_0x00a4
            java.lang.String r3 = r11.toString()
            goto L_0x00a5
        L_0x00a4:
            r3 = 0
        L_0x00a5:
            if (r3 == 0) goto L_0x00aa
            r1.f8570d = r3
            goto L_0x00ab
        L_0x00aa:
            r3 = r10
        L_0x00ab:
            r9 = 1
            java.lang.String[] r3 = com.google.android.gms.internal.ads.C2618Pr.m10932a(r3, r9)
            int r10 = r3.length
            int r11 = r1.f8573g
            if (r10 < r11) goto L_0x010c
            r10 = 0
        L_0x00b6:
            int r11 = r3.length
            if (r10 >= r11) goto L_0x0102
            r12 = r6
            r11 = 0
        L_0x00bb:
            int r13 = r1.f8573g
            if (r11 >= r13) goto L_0x00f0
            int r13 = r10 + r11
            int r14 = r3.length
            if (r13 < r14) goto L_0x00c6
            r11 = 0
            goto L_0x00f1
        L_0x00c6:
            if (r11 <= 0) goto L_0x00d2
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r14 = " "
            java.lang.String r12 = r12.concat(r14)
        L_0x00d2:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13 = r3[r13]
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r14 = r13.length()
            if (r14 == 0) goto L_0x00e7
            java.lang.String r12 = r12.concat(r13)
            goto L_0x00ed
        L_0x00e7:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r12)
            r12 = r13
        L_0x00ed:
            int r11 = r11 + 1
            goto L_0x00bb
        L_0x00f0:
            r11 = r9
        L_0x00f1:
            if (r11 == 0) goto L_0x0102
            r2.add(r12)
            int r11 = r2.size()
            int r12 = r1.f8568b
            if (r11 < r12) goto L_0x00ff
            goto L_0x010a
        L_0x00ff:
            int r10 = r10 + 1
            goto L_0x00b6
        L_0x0102:
            int r3 = r2.size()
            int r10 = r1.f8568b
            if (r3 < r10) goto L_0x010c
        L_0x010a:
            r9 = 0
            goto L_0x0111
        L_0x010c:
            int r8 = r8 + 1
            goto L_0x0042
        L_0x0110:
            r9 = 1
        L_0x0111:
            if (r9 == 0) goto L_0x0117
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0117:
            com.google.android.gms.internal.ads.Or r3 = new com.google.android.gms.internal.ads.Or
            r3.<init>()
            r1.f8569c = r6
            java.util.Iterator r0 = r2.iterator()
        L_0x0122:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x013e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.Lr r4 = r1.f8567a     // Catch:{ IOException -> 0x0138 }
            byte[] r2 = r4.mo8513a(r2)     // Catch:{ IOException -> 0x0138 }
            r3.mo8647a(r2)     // Catch:{ IOException -> 0x0138 }
            goto L_0x0122
        L_0x0138:
            r0 = move-exception
            java.lang.String r2 = "Error while writing hash to byteStream"
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r2, r0)
        L_0x013e:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2816Wr.mo9010a(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }
}
