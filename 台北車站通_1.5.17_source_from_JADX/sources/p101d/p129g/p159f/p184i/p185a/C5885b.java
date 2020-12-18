package p101d.p129g.p159f.p184i.p185a;

import p101d.p129g.p159f.p184i.p185a.C5902k;

/* renamed from: d.g.f.i.a.b */
final class C5885b {

    /* renamed from: a */
    private final int f16283a;

    /* renamed from: b */
    private final byte[] f16284b;

    private C5885b(int i, byte[] bArr) {
        this.f16283a = i;
        this.f16284b = bArr;
    }

    /* renamed from: a */
    static C5885b[] m22315a(byte[] bArr, C5902k kVar, C5898g gVar) {
        if (bArr.length == kVar.mo15665d()) {
            C5902k.C5904b a = kVar.mo15662a(gVar);
            C5902k.C5903a[] a2 = a.mo15670a();
            int i = 0;
            for (C5902k.C5903a a3 : a2) {
                i += a3.mo15668a();
            }
            C5885b[] bVarArr = new C5885b[i];
            int length = a2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                C5902k.C5903a aVar = a2[i2];
                int i4 = i3;
                int i5 = 0;
                while (i5 < aVar.mo15668a()) {
                    int b = aVar.mo15669b();
                    bVarArr[i4] = new C5885b(b, new byte[(a.mo15671b() + b)]);
                    i5++;
                    i4++;
                }
                i2++;
                i3 = i4;
            }
            int length2 = bVarArr[0].f16284b.length;
            int length3 = bVarArr.length - 1;
            while (length3 >= 0 && bVarArr[length3].f16284b.length != length2) {
                length3--;
            }
            int i6 = length3 + 1;
            int b2 = length2 - a.mo15671b();
            int i7 = 0;
            int i8 = 0;
            while (i7 < b2) {
                int i9 = i8;
                int i10 = 0;
                while (i10 < i3) {
                    bVarArr[i10].f16284b[i7] = bArr[i9];
                    i10++;
                    i9++;
                }
                i7++;
                i8 = i9;
            }
            int i11 = i6;
            while (i11 < i3) {
                bVarArr[i11].f16284b[b2] = bArr[i8];
                i11++;
                i8++;
            }
            int length4 = bVarArr[0].f16284b.length;
            while (b2 < length4) {
                int i12 = i8;
                int i13 = 0;
                while (i13 < i3) {
                    bVarArr[i13].f16284b[i13 < i6 ? b2 : b2 + 1] = bArr[i12];
                    i13++;
                    i12++;
                }
                b2++;
                i8 = i12;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo15650a() {
        return this.f16284b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15651b() {
        return this.f16283a;
    }
}
