package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.jl */
final class C3207jl extends C2519Ml {

    /* renamed from: d */
    private static final byte[] f9609d = new byte[16];

    C3207jl(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    private static void m12718a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = C2519Ml.m10596a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = C2519Ml.m10596a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = C2519Ml.m10596a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = C2519Ml.m10596a(iArr[i2] ^ iArr[i3], 7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo8533a() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ByteBuffer mo8534a(byte[] bArr, int i) {
        int i2 = 16;
        int[] iArr = new int[16];
        int[] iArr2 = C2519Ml.f7584a;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        int[] a = C2519Ml.m10597a(ByteBuffer.wrap(this.f7585b.mo8219a()));
        int i3 = 4;
        System.arraycopy(a, 0, iArr, 4, a.length);
        iArr[12] = i;
        System.arraycopy(C2519Ml.m10597a(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        int[] iArr3 = (int[]) iArr.clone();
        int i4 = 0;
        while (i4 < 10) {
            m12718a(iArr3, 0, i3, 8, 12);
            m12718a(iArr3, 1, 5, 9, 13);
            m12718a(iArr3, 2, 6, 10, 14);
            m12718a(iArr3, 3, 7, 11, 15);
            m12718a(iArr3, 0, 5, 10, 15);
            m12718a(iArr3, 1, 6, 11, 12);
            m12718a(iArr3, 2, 7, 8, 13);
            m12718a(iArr3, 3, 4, 9, 14);
            i4++;
            i3 = 4;
            i2 = 16;
        }
        int i5 = 0;
        for (int i6 = i2; i5 < i6; i6 = 16) {
            iArr[i5] = iArr[i5] + iArr3[i5];
            i5++;
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, 16);
        return order;
    }
}
