package p101d.p129g.p159f;

import p101d.p129g.p159f.p167c.C5772a;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.c */
public final class C5771c {

    /* renamed from: a */
    private final C5751b f15936a;

    /* renamed from: b */
    private C5775b f15937b;

    public C5771c(C5751b bVar) {
        if (bVar != null) {
            this.f15936a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C5772a mo15361a(int i, C5772a aVar) {
        return this.f15936a.mo15341a(i, aVar);
    }

    /* renamed from: a */
    public C5775b mo15362a() {
        if (this.f15937b == null) {
            this.f15937b = this.f15936a.mo15342a();
        }
        return this.f15937b;
    }

    /* renamed from: b */
    public int mo15363b() {
        return this.f15936a.mo15343b();
    }

    /* renamed from: c */
    public int mo15364c() {
        return this.f15936a.mo15345d();
    }

    /* renamed from: d */
    public boolean mo15365d() {
        return this.f15936a.mo15344c().mo15481d();
    }

    /* renamed from: e */
    public C5771c mo15366e() {
        this.f15936a.mo15344c().mo15482e();
        throw null;
    }

    public String toString() {
        try {
            return mo15362a().toString();
        } catch (C5882i unused) {
            return "";
        }
    }
}
