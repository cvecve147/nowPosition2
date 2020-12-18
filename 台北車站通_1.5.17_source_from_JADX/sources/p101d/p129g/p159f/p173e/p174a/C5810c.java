package p101d.p129g.p159f.p173e.p174a;

import java.util.Map;
import p101d.p129g.p159f.C5790d;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5782e;
import p101d.p129g.p159f.p167c.p169b.C5776a;
import p101d.p129g.p159f.p167c.p169b.C5778c;
import p101d.p129g.p159f.p167c.p169b.C5779d;

/* renamed from: d.g.f.e.a.c */
public final class C5810c {

    /* renamed from: a */
    private final C5778c f16091a = new C5778c(C5776a.f15958h);

    /* renamed from: a */
    private void m21945a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f16091a.mo15420a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (C5779d unused) {
            throw C5790d.m21877a();
        }
    }

    /* renamed from: a */
    public C5782e mo15476a(C5775b bVar, Map<C5806e, ?> map) {
        int i;
        byte[] a = new C5808a(bVar).mo15475a();
        m21945a(a, 0, 10, 10, 0);
        byte b = a[0] & 15;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr = a;
            m21945a(bArr, 20, 84, 40, 1);
            m21945a(bArr, 20, 84, 40, 2);
            i = 94;
        } else if (b == 5) {
            byte[] bArr2 = a;
            m21945a(bArr2, 20, 68, 56, 1);
            m21945a(bArr2, 20, 68, 56, 2);
            i = 78;
        } else {
            throw C5811f.m21947a();
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(a, 0, bArr3, 0, 10);
        System.arraycopy(a, 20, bArr3, 10, bArr3.length - 10);
        return C5809b.m21939a(bArr3, (int) b);
    }
}
