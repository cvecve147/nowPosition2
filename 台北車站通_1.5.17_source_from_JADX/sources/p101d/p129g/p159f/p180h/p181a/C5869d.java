package p101d.p129g.p159f.p180h.p181a;

/* renamed from: d.g.f.h.a.d */
final class C5869d {

    /* renamed from: a */
    private final int f16240a;

    /* renamed from: b */
    private final int f16241b;

    /* renamed from: c */
    private final int f16242c;

    /* renamed from: d */
    private final int f16243d;

    /* renamed from: e */
    private int f16244e = -1;

    C5869d(int i, int i2, int i3, int i4) {
        this.f16240a = i;
        this.f16241b = i2;
        this.f16242c = i3;
        this.f16243d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15605a() {
        return this.f16242c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15606a(int i) {
        return i != -1 && this.f16242c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15607b() {
        return this.f16241b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15608b(int i) {
        this.f16244e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15609c() {
        return this.f16244e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15610d() {
        return this.f16240a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo15611e() {
        return this.f16243d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo15612f() {
        return this.f16241b - this.f16240a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo15613g() {
        return mo15606a(this.f16244e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo15614h() {
        this.f16244e = ((this.f16243d / 30) * 3) + (this.f16242c / 3);
    }

    public String toString() {
        return this.f16244e + "|" + this.f16243d;
    }
}
