package p101d.p129g.p159f.p170d.p171a;

import p101d.p129g.p159f.p170d.p171a.C5799g;

/* renamed from: d.g.f.d.a.b */
final class C5793b {

    /* renamed from: a */
    private final int f16037a;

    /* renamed from: b */
    private final byte[] f16038b;

    private C5793b(int i, byte[] bArr) {
        this.f16037a = i;
        this.f16038b = bArr;
    }

    /* renamed from: a */
    static C5793b[] m21892a(byte[] bArr, C5799g gVar) {
        C5799g.C5801b c = gVar.mo15457c();
        C5799g.C5800a[] a = c.mo15465a();
        int i = 0;
        for (C5799g.C5800a a2 : a) {
            i += a2.mo15463a();
        }
        C5793b[] bVarArr = new C5793b[i];
        int length = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C5799g.C5800a aVar = a[i2];
            int i4 = i3;
            int i5 = 0;
            while (i5 < aVar.mo15463a()) {
                int b = aVar.mo15464b();
                bVarArr[i4] = new C5793b(b, new byte[(c.mo15466b() + b)]);
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
        int length2 = bVarArr[0].f16038b.length - c.mo15466b();
        int i6 = length2 - 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = i8;
            int i10 = 0;
            while (i10 < i3) {
                bVarArr[i10].f16038b[i7] = bArr[i9];
                i10++;
                i9++;
            }
            i7++;
            i8 = i9;
        }
        boolean z = gVar.mo15461g() == 24;
        int i11 = z ? 8 : i3;
        int i12 = i8;
        int i13 = 0;
        while (i13 < i11) {
            bVarArr[i13].f16038b[i6] = bArr[i12];
            i13++;
            i12++;
        }
        int length3 = bVarArr[0].f16038b.length;
        while (length2 < length3) {
            int i14 = 0;
            while (i14 < i3) {
                int i15 = z ? (i14 + 8) % i3 : i14;
                bVarArr[i15].f16038b[(!z || i15 <= 7) ? length2 : length2 - 1] = bArr[i12];
                i14++;
                i12++;
            }
            length2++;
        }
        if (i12 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo15452a() {
        return this.f16038b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15453b() {
        return this.f16037a;
    }
}
