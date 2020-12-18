package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.vl */
public final class C3554vl implements C2778Vi {

    /* renamed from: a */
    private final C2377Hl f10383a;

    /* renamed from: b */
    private final C3119gj f10384b;

    /* renamed from: c */
    private final int f10385c;

    public C3554vl(C2377Hl hl, C3119gj gjVar, int i) {
        this.f10383a = hl;
        this.f10384b = gjVar;
        this.f10385c = i;
    }

    /* renamed from: a */
    public final byte[] mo8580a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f10383a.mo8282a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return C3177il.m12631a(a, this.f10384b.mo8339a(C3177il.m12631a(bArr2, a, copyOf)));
    }
}
