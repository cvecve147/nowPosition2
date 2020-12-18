package p101d.p129g.p159f.p167c.p169b;

/* renamed from: d.g.f.c.b.c */
public final class C5778c {

    /* renamed from: a */
    private final C5776a f15968a;

    public C5778c(C5776a aVar) {
        this.f15968a = aVar;
    }

    /* renamed from: a */
    private int[] m21833a(C5777b bVar) {
        int a = bVar.mo15411a();
        int i = 0;
        if (a == 1) {
            return new int[]{bVar.mo15415b(1)};
        }
        int[] iArr = new int[a];
        for (int i2 = 1; i2 < this.f15968a.mo15406c() && i < a; i2++) {
            if (bVar.mo15412a(i2) == 0) {
                iArr[i] = this.f15968a.mo15403b(i2);
                i++;
            }
        }
        if (i == a) {
            return iArr;
        }
        throw new C5779d("Error locator degree does not match number of roots");
    }

    /* renamed from: a */
    private int[] m21834a(C5777b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int b = this.f15968a.mo15403b(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int c = this.f15968a.mo15408c(iArr[i3], b);
                    i2 = this.f15968a.mo15408c(i2, (c & 1) == 0 ? c | 1 : c & -2);
                }
            }
            iArr2[i] = this.f15968a.mo15408c(bVar.mo15412a(b), this.f15968a.mo15403b(i2));
            if (this.f15968a.mo15401a() != 0) {
                iArr2[i] = this.f15968a.mo15408c(iArr2[i], b);
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private C5777b[] m21835a(C5777b bVar, C5777b bVar2, int i) {
        if (bVar.mo15411a() < bVar2.mo15411a()) {
            C5777b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C5777b d = this.f15968a.mo15409d();
        C5777b b = this.f15968a.mo15404b();
        do {
            C5777b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C5777b bVar5 = b;
            C5777b bVar6 = d;
            d = bVar5;
            if (bVar.mo15411a() < i / 2) {
                int b2 = d.mo15415b(0);
                if (b2 != 0) {
                    int b3 = this.f15968a.mo15403b(b2);
                    return new C5777b[]{d.mo15418c(b3), bVar.mo15418c(b3)};
                }
                throw new C5779d("sigmaTilde(0) was zero");
            } else if (!bVar.mo15417b()) {
                C5777b d2 = this.f15968a.mo15409d();
                int b4 = this.f15968a.mo15403b(bVar.mo15415b(bVar.mo15411a()));
                while (r11.mo15411a() >= bVar.mo15411a() && !r11.mo15417b()) {
                    int a = r11.mo15411a() - bVar.mo15411a();
                    int c = this.f15968a.mo15408c(r11.mo15415b(r11.mo15411a()), b4);
                    d2 = d2.mo15414a(this.f15968a.mo15405b(a, c));
                    r11 = r11.mo15414a(bVar.mo15413a(a, c));
                }
                b = d2.mo15416b(d).mo15414a(bVar6);
            } else {
                throw new C5779d("r_{i-1} was zero");
            }
        } while (r11.mo15411a() < bVar.mo15411a());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void mo15420a(int[] iArr, int i) {
        C5777b bVar = new C5777b(this.f15968a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C5776a aVar = this.f15968a;
            int a = bVar.mo15412a(aVar.mo15402a(aVar.mo15401a() + i3));
            iArr2[(iArr2.length - 1) - i3] = a;
            if (a != 0) {
                z = false;
            }
        }
        if (!z) {
            C5777b[] a2 = m21835a(this.f15968a.mo15405b(i, 1), new C5777b(this.f15968a, iArr2), i);
            C5777b bVar2 = a2[0];
            C5777b bVar3 = a2[1];
            int[] a3 = m21833a(bVar2);
            int[] a4 = m21834a(bVar3, a3);
            while (i2 < a3.length) {
                int length = (iArr.length - 1) - this.f15968a.mo15407c(a3[i2]);
                if (length >= 0) {
                    iArr[length] = C5776a.m21815a(iArr[length], a4[i2]);
                    i2++;
                } else {
                    throw new C5779d("Bad error location");
                }
            }
        }
    }
}
