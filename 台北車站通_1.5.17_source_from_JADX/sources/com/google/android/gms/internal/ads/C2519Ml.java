package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.Ml */
abstract class C2519Ml implements C2377Hl {

    /* renamed from: a */
    static final int[] f7584a = m10597a(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));

    /* renamed from: b */
    final C2349Gl f7585b;

    /* renamed from: c */
    private final int f7586c;

    C2519Ml(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f7585b = C2349Gl.m9971a(bArr);
            this.f7586c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    static int m10596a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: a */
    static int[] m10597a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo8533a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract ByteBuffer mo8534a(byte[] bArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8535a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo8533a() >= bArr.length) {
            byte[] a = C2461Kl.m10431a(mo8533a());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a2 = mo8534a(a, this.f7586c + i2);
                if (i2 == i - 1) {
                    C3177il.m12630a(byteBuffer, wrap, a2, remaining % 64);
                } else {
                    C3177il.m12630a(byteBuffer, wrap, a2, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: a */
    public final byte[] mo8282a(byte[] bArr) {
        int length = bArr.length;
        mo8533a();
        if (length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(mo8533a() + bArr.length);
            mo8535a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
