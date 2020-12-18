package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.ij */
public final class C3175ij<P> {

    /* renamed from: a */
    private static final Charset f9493a = Charset.forName(HTTP.UTF_8);

    /* renamed from: b */
    private ConcurrentMap<String, List<C3204jj<P>>> f9494b = new ConcurrentHashMap();

    /* renamed from: c */
    private C3204jj<P> f9495c;

    /* renamed from: a */
    public final C3204jj<P> mo9549a() {
        return this.f9495c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3204jj<P> mo9550a(P r6, com.google.android.gms.internal.ads.C2608Pk.C2610b r7) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.jj r0 = new com.google.android.gms.internal.ads.jj
            int[] r1 = com.google.android.gms.internal.ads.C2916_i.f8780a
            com.google.android.gms.internal.ads.bl r2 = r7.mo8686p()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 5
            r3 = 1
            if (r1 == r3) goto L_0x002f
            r4 = 2
            if (r1 == r4) goto L_0x002f
            r4 = 3
            if (r1 == r4) goto L_0x0026
            r2 = 4
            if (r1 != r2) goto L_0x001e
            byte[] r1 = com.google.android.gms.internal.ads.C2890Zi.f8689a
            goto L_0x0044
        L_0x001e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "unknown output prefix type"
            r6.<init>(r7)
            throw r6
        L_0x0026:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteBuffer r1 = r1.put(r3)
            goto L_0x0038
        L_0x002f:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r2 = 0
            java.nio.ByteBuffer r1 = r1.put(r2)
        L_0x0038:
            int r2 = r7.mo8685o()
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
        L_0x0044:
            com.google.android.gms.internal.ads.Jk r2 = r7.mo8684n()
            com.google.android.gms.internal.ads.bl r7 = r7.mo8686p()
            r0.<init>(r6, r1, r2, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r0)
            java.lang.String r7 = new java.lang.String
            byte[] r1 = r0.mo9594b()
            java.nio.charset.Charset r2 = f9493a
            r7.<init>(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<com.google.android.gms.internal.ads.jj<P>>> r1 = r5.f9494b
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            java.lang.Object r6 = r1.put(r7, r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0084
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r6)
            r1.add(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<com.google.android.gms.internal.ads.jj<P>>> r6 = r5.f9494b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r6.put(r7, r1)
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3175ij.mo9550a(java.lang.Object, com.google.android.gms.internal.ads.Pk$b):com.google.android.gms.internal.ads.jj");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9551a(C3204jj<P> jjVar) {
        this.f9495c = jjVar;
    }
}
