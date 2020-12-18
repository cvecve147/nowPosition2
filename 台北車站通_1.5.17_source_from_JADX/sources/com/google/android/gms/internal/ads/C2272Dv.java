package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;

/* renamed from: com.google.android.gms.internal.ads.Dv */
public final class C2272Dv {

    /* renamed from: a */
    public final int f6919a;

    /* renamed from: b */
    public final byte[] f6920b;

    /* renamed from: c */
    public final Map<String, String> f6921c;

    /* renamed from: d */
    public final List<C2589Ot> f6922d;

    /* renamed from: e */
    public final boolean f6923e;

    /* renamed from: f */
    private final long f6924f;

    private C2272Dv(int i, byte[] bArr, Map<String, String> map, List<C2589Ot> list, boolean z, long j) {
        this.f6919a = i;
        this.f6920b = bArr;
        this.f6921c = map;
        this.f6922d = list == null ? null : Collections.unmodifiableList(list);
        this.f6923e = z;
        this.f6924f = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2272Dv(int r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11, boolean r12, long r13) {
        /*
            r8 = this;
            if (r11 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r4 = r0
            goto L_0x0042
        L_0x0005:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0003
        L_0x0010:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            java.util.Set r1 = r11.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.google.android.gms.internal.ads.Ot r3 = new com.google.android.gms.internal.ads.Ot
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L_0x0021
        L_0x0042:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2272Dv.<init>(int, byte[], java.util.Map, boolean, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2272Dv(int r9, byte[] r10, boolean r11, long r12, java.util.List<com.google.android.gms.internal.ads.C2589Ot> r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r3 = r0
            goto L_0x0033
        L_0x0005:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x0003
        L_0x0010:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L_0x001b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.Ot r2 = (com.google.android.gms.internal.ads.C2589Ot) r2
            java.lang.String r3 = r2.mo8649a()
            java.lang.String r2 = r2.mo8650b()
            r0.put(r3, r2)
            goto L_0x001b
        L_0x0033:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2272Dv.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public C2272Dv(byte[] bArr, Map<String, String> map) {
        this((int) HttpStatus.SC_OK, bArr, map, false, 0);
    }
}
