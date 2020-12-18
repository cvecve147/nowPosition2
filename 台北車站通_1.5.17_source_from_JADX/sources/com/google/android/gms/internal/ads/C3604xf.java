package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xf */
final class C3604xf {

    /* renamed from: a */
    long f10501a;

    /* renamed from: b */
    final String f10502b;

    /* renamed from: c */
    final String f10503c;

    /* renamed from: d */
    final long f10504d;

    /* renamed from: e */
    final long f10505e;

    /* renamed from: f */
    final long f10506f;

    /* renamed from: g */
    final long f10507g;

    /* renamed from: h */
    final List<C2589Ot> f10508h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C3604xf(java.lang.String r16, com.google.android.gms.internal.ads.C3471sp r17) {
        /*
            r15 = this;
            r0 = r17
            java.lang.String r3 = r0.f10219b
            long r4 = r0.f10220c
            long r6 = r0.f10221d
            long r8 = r0.f10222e
            long r10 = r0.f10223f
            java.util.List<com.google.android.gms.internal.ads.Ot> r1 = r0.f10225h
            if (r1 == 0) goto L_0x0012
            r12 = r1
            goto L_0x0047
        L_0x0012:
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f10224g
            java.util.ArrayList r2 = new java.util.ArrayList
            int r12 = r1.size()
            r2.<init>(r12)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0046
            java.lang.Object r12 = r1.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            com.google.android.gms.internal.ads.Ot r13 = new com.google.android.gms.internal.ads.Ot
            java.lang.Object r14 = r12.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r13.<init>(r14, r12)
            r2.add(r13)
            goto L_0x0025
        L_0x0046:
            r12 = r2
        L_0x0047:
            r1 = r15
            r2 = r16
            r1.<init>(r2, r3, r4, r6, r8, r10, r12)
            byte[] r0 = r0.f10218a
            int r0 = r0.length
            long r0 = (long) r0
            r2 = r15
            r2.f10501a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3604xf.<init>(java.lang.String, com.google.android.gms.internal.ads.sp):void");
    }

    private C3604xf(String str, String str2, long j, long j2, long j3, long j4, List<C2589Ot> list) {
        this.f10502b = str;
        this.f10503c = "".equals(str2) ? null : str2;
        this.f10504d = j;
        this.f10505e = j2;
        this.f10506f = j3;
        this.f10507g = j4;
        this.f10508h = list;
    }

    /* renamed from: a */
    static C3604xf m14415a(C2831Xf xf) {
        if (C2830Xe.m11544a((InputStream) xf) == 538247942) {
            return new C3604xf(C2830Xe.m11546a(xf), C2830Xe.m11546a(xf), C2830Xe.m11553b((InputStream) xf), C2830Xe.m11553b((InputStream) xf), C2830Xe.m11553b((InputStream) xf), C2830Xe.m11553b((InputStream) xf), C2830Xe.m11554b(xf));
        }
        throw new IOException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo10209a(OutputStream outputStream) {
        try {
            C2830Xe.m11547a(outputStream, 538247942);
            C2830Xe.m11549a(outputStream, this.f10502b);
            C2830Xe.m11549a(outputStream, this.f10503c == null ? "" : this.f10503c);
            C2830Xe.m11548a(outputStream, this.f10504d);
            C2830Xe.m11548a(outputStream, this.f10505e);
            C2830Xe.m11548a(outputStream, this.f10506f);
            C2830Xe.m11548a(outputStream, this.f10507g);
            List<C2589Ot> list = this.f10508h;
            if (list != null) {
                C2830Xe.m11547a(outputStream, list.size());
                for (C2589Ot next : list) {
                    C2830Xe.m11549a(outputStream, next.mo8649a());
                    C2830Xe.m11549a(outputStream, next.mo8650b());
                }
            } else {
                C2830Xe.m11547a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            C3656zb.m14679a("%s", e.toString());
            return false;
        }
    }
}
