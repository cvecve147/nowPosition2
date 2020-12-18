package p101d.p129g.p159f.p170d.p171a;

import p101d.p129g.p159f.C5790d;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5782e;
import p101d.p129g.p159f.p167c.p169b.C5776a;
import p101d.p129g.p159f.p167c.p169b.C5778c;
import p101d.p129g.p159f.p167c.p169b.C5779d;

/* renamed from: d.g.f.d.a.e */
public final class C5797e {

    /* renamed from: a */
    private final C5778c f16053a = new C5778c(C5776a.f15956f);

    /* renamed from: a */
    private void m21904a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f16053a.mo15420a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C5779d unused) {
            throw C5790d.m21877a();
        }
    }

    /* renamed from: a */
    public C5782e mo15454a(C5775b bVar) {
        C5792a aVar = new C5792a(bVar);
        C5793b[] a = C5793b.m21892a(aVar.mo15449b(), aVar.mo15445a());
        int length = a.length;
        int i = 0;
        for (C5793b b : a) {
            i += b.mo15453b();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2++) {
            C5793b bVar2 = a[i2];
            byte[] a2 = bVar2.mo15452a();
            int b2 = bVar2.mo15453b();
            m21904a(a2, b2);
            for (int i3 = 0; i3 < b2; i3++) {
                bArr[(i3 * length) + i2] = a2[i3];
            }
        }
        return C5795d.m21896a(bArr);
    }
}
