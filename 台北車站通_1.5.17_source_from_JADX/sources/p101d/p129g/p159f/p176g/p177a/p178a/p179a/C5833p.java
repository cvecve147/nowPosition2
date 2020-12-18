package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

import p101d.p129g.p159f.C5811f;

/* renamed from: d.g.f.g.a.a.a.p */
final class C5833p extends C5834q {

    /* renamed from: b */
    private final int f16123b;

    /* renamed from: c */
    private final int f16124c;

    C5833p(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw C5811f.m21947a();
        }
        this.f16123b = i2;
        this.f16124c = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15515b() {
        return this.f16123b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15516c() {
        return this.f16124c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo15517d() {
        return this.f16123b == 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo15518e() {
        return this.f16124c == 10;
    }
}
