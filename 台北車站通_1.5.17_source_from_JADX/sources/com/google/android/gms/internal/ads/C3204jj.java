package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.jj */
public final class C3204jj<P> {

    /* renamed from: a */
    private final P f9605a;

    /* renamed from: b */
    private final byte[] f9606b;

    /* renamed from: c */
    private final C2432Jk f9607c;

    /* renamed from: d */
    private final C2978bl f9608d;

    public C3204jj(P p, byte[] bArr, C2432Jk jk, C2978bl blVar) {
        this.f9605a = p;
        this.f9606b = Arrays.copyOf(bArr, bArr.length);
        this.f9607c = jk;
        this.f9608d = blVar;
    }

    /* renamed from: a */
    public final P mo9593a() {
        return this.f9605a;
    }

    /* renamed from: b */
    public final byte[] mo9594b() {
        byte[] bArr = this.f9606b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
