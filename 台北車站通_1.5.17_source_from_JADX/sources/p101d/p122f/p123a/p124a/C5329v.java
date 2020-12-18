package p101d.p122f.p123a.p124a;

import java.util.Set;
import p101d.p122f.p123a.p124a.C5301B;

/* renamed from: d.f.a.a.v */
class C5329v implements C5324q {

    /* renamed from: a */
    static final Set<C5301B.C5303b> f15079a = new C5328u();

    /* renamed from: b */
    final int f15080b;

    public C5329v(int i) {
        this.f15080b = i;
    }

    /* renamed from: a */
    public boolean mo14717a(C5301B b) {
        return (f15079a.contains(b.f14990c) && b.f14988a.f15019g == null) && (Math.abs(b.f14988a.f15015c.hashCode() % this.f15080b) != 0);
    }
}
