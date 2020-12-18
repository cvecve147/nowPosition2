package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.Nl */
abstract class C2549Nl implements C2778Vi {

    /* renamed from: a */
    private final byte[] f7653a;

    /* renamed from: b */
    private final C2519Ml f7654b;

    /* renamed from: c */
    private final C2519Ml f7655c;

    C2549Nl(byte[] bArr) {
        this.f7653a = (byte[]) bArr.clone();
        this.f7654b = mo8579a(bArr, 1);
        this.f7655c = mo8579a(bArr, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C2519Ml mo8579a(byte[] bArr, int i);

    /* renamed from: a */
    public byte[] mo8580a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.f7654b.mo8533a();
        if (length <= 2147483619) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f7654b.mo8533a() + 16);
            if (allocate.remaining() >= bArr.length + this.f7654b.mo8533a() + 16) {
                int position = allocate.position();
                this.f7654b.mo8535a(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f7654b.mo8533a()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f7655c.mo8534a(bArr3, 0).get(bArr4);
                int length2 = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length2;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length2);
                order.put(allocate);
                order.position(i2);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                byte[] a = C2433Jl.m10353a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
