package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.uj */
public final class C3522uj implements C2778Vi {

    /* renamed from: a */
    private static final byte[] f10298a = new byte[0];

    /* renamed from: b */
    private final C2489Lk f10299b;

    /* renamed from: c */
    private final C2778Vi f10300c;

    public C3522uj(C2489Lk lk, C2778Vi vi) {
        this.f10299b = lk;
        this.f10300c = vi;
    }

    /* renamed from: a */
    public final byte[] mo8580a(byte[] bArr, byte[] bArr2) {
        byte[] i = C3237kj.m12890b(this.f10299b).mo9040i();
        byte[] a = this.f10300c.mo8580a(i, f10298a);
        byte[] a2 = ((C2778Vi) C3237kj.m12885a(this.f10299b.mo8493l(), i)).mo8580a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }
}
