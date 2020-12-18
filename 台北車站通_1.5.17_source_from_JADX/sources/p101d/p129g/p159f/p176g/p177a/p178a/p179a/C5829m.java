package p101d.p129g.p159f.p176g.p177a.p178a.p179a;

/* renamed from: d.g.f.g.a.a.a.m */
final class C5829m {

    /* renamed from: a */
    private int f16113a = 0;

    /* renamed from: b */
    private C5830a f16114b = C5830a.NUMERIC;

    /* renamed from: d.g.f.g.a.a.a.m$a */
    private enum C5830a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    C5829m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15502a() {
        return this.f16113a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15503a(int i) {
        this.f16113a += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15504b(int i) {
        this.f16113a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15505b() {
        return this.f16114b == C5830a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo15506c() {
        return this.f16114b == C5830a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo15507d() {
        this.f16114b = C5830a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo15508e() {
        this.f16114b = C5830a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15509f() {
        this.f16114b = C5830a.NUMERIC;
    }
}
