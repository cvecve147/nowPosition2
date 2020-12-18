package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Qr */
public final class C2646Qr extends C2497Lr {

    /* renamed from: c */
    private MessageDigest f8160c;

    /* renamed from: a */
    public final byte[] mo8513a(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a = C2618Pr.m10931a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr = allocate.array();
        } else if (split.length < 5) {
            bArr = new byte[(split.length << 1)];
            for (int i2 = 0; i2 < split.length; i2++) {
                int a2 = C2618Pr.m10931a(split[i2]);
                int i3 = (a2 >> 16) ^ (65535 & a2);
                byte[] bArr2 = {(byte) i3, (byte) (i3 >> 8)};
                int i4 = i2 << 1;
                bArr[i4] = bArr2[0];
                bArr[i4 + 1] = bArr2[1];
            }
        } else {
            bArr = new byte[split.length];
            for (int i5 = 0; i5 < split.length; i5++) {
                int a3 = C2618Pr.m10931a(split[i5]);
                bArr[i5] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
            }
        }
        this.f8160c = mo8512a();
        synchronized (this.f7535b) {
            if (this.f8160c == null) {
                byte[] bArr3 = new byte[0];
                return bArr3;
            }
            this.f8160c.reset();
            this.f8160c.update(bArr);
            byte[] digest = this.f8160c.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, bArr4.length);
            return bArr4;
        }
    }
}
