package p101d.p122f.p123a.p124a;

import p208e.p209a.p210a.p211a.p212a.p215c.p216a.C6106e;

/* renamed from: d.f.a.a.t */
class C5327t {

    /* renamed from: a */
    long f15077a;

    /* renamed from: b */
    private C6106e f15078b;

    public C5327t(C6106e eVar) {
        if (eVar != null) {
            this.f15078b = eVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    /* renamed from: a */
    public void mo14720a() {
        this.f15077a = 0;
        this.f15078b = this.f15078b.mo16098b();
    }

    /* renamed from: a */
    public boolean mo14721a(long j) {
        return j - this.f15077a >= this.f15078b.mo16097a() * 1000000;
    }

    /* renamed from: b */
    public void mo14722b(long j) {
        this.f15077a = j;
        this.f15078b = this.f15078b.mo16099c();
    }
}
