package p101d.p129g.p159f.p180h.p181a.p182a;

import p101d.p129g.p159f.C5790d;

/* renamed from: d.g.f.h.a.a.a */
public final class C5864a {

    /* renamed from: a */
    private final C5865b f16221a = C5865b.f16222a;

    /* renamed from: a */
    private int[] m22170a(C5866c cVar) {
        int a = cVar.mo15583a();
        int[] iArr = new int[a];
        int i = 0;
        for (int i2 = 1; i2 < this.f16221a.mo15576b() && i < a; i2++) {
            if (cVar.mo15584a(i2) == 0) {
                iArr[i] = this.f16221a.mo15577b(i2);
                i++;
            }
        }
        if (i == a) {
            return iArr;
        }
        throw C5790d.m21877a();
    }

    /* renamed from: a */
    private int[] m22171a(C5866c cVar, C5866c cVar2, int[] iArr) {
        int a = cVar2.mo15583a();
        int[] iArr2 = new int[a];
        for (int i = 1; i <= a; i++) {
            iArr2[a - i] = this.f16221a.mo15580c(i, cVar2.mo15587b(i));
        }
        C5866c cVar3 = new C5866c(this.f16221a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int b = this.f16221a.mo15577b(iArr[i2]);
            iArr3[i2] = this.f16221a.mo15580c(this.f16221a.mo15582d(0, cVar.mo15584a(b)), this.f16221a.mo15577b(cVar3.mo15584a(b)));
        }
        return iArr3;
    }

    /* renamed from: a */
    private C5866c[] m22172a(C5866c cVar, C5866c cVar2, int i) {
        if (cVar.mo15583a() < cVar2.mo15583a()) {
            C5866c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C5866c c = this.f16221a.mo15581c();
        C5866c a = this.f16221a.mo15575a();
        while (true) {
            C5866c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C5866c cVar5 = a;
            C5866c cVar6 = c;
            c = cVar5;
            if (cVar.mo15583a() < i / 2) {
                int b = c.mo15587b(0);
                if (b != 0) {
                    int b2 = this.f16221a.mo15577b(b);
                    return new C5866c[]{c.mo15591c(b2), cVar.mo15591c(b2)};
                }
                throw C5790d.m21877a();
            } else if (!cVar.mo15589b()) {
                C5866c c2 = this.f16221a.mo15581c();
                int b3 = this.f16221a.mo15577b(cVar.mo15587b(cVar.mo15583a()));
                while (r11.mo15583a() >= cVar.mo15583a() && !r11.mo15589b()) {
                    int a2 = r11.mo15583a() - cVar.mo15583a();
                    int c3 = this.f16221a.mo15580c(r11.mo15587b(r11.mo15583a()), b3);
                    c2 = c2.mo15586a(this.f16221a.mo15578b(a2, c3));
                    r11 = r11.mo15592c(cVar.mo15585a(a2, c3));
                }
                a = c2.mo15588b(c).mo15592c(cVar6).mo15590c();
            } else {
                throw C5790d.m21877a();
            }
        }
    }

    /* renamed from: a */
    public int mo15572a(int[] iArr, int i, int[] iArr2) {
        C5866c cVar = new C5866c(this.f16221a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int a = cVar.mo15584a(this.f16221a.mo15573a(i3));
            iArr3[i - i3] = a;
            if (a != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C5866c a2 = this.f16221a.mo15575a();
        if (iArr2 != null) {
            C5866c cVar2 = a2;
            for (int length : iArr2) {
                int a3 = this.f16221a.mo15573a((iArr.length - 1) - length);
                C5865b bVar = this.f16221a;
                cVar2 = cVar2.mo15588b(new C5866c(bVar, new int[]{bVar.mo15582d(0, a3), 1}));
            }
        }
        C5866c[] a4 = m22172a(this.f16221a.mo15578b(i, 1), new C5866c(this.f16221a, iArr3), i);
        C5866c cVar3 = a4[0];
        C5866c cVar4 = a4[1];
        int[] a5 = m22170a(cVar3);
        int[] a6 = m22171a(cVar4, cVar3, a5);
        while (i2 < a5.length) {
            int length2 = (iArr.length - 1) - this.f16221a.mo15579c(a5[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f16221a.mo15582d(iArr[length2], a6[i2]);
                i2++;
            } else {
                throw C5790d.m21877a();
            }
        }
        return a5.length;
    }
}
