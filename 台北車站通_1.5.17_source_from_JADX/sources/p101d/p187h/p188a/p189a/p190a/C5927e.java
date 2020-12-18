package p101d.p187h.p188a.p189a.p190a;

import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p242g.C6416a;
import p263h.C6650p;

/* renamed from: d.h.a.a.a.e */
final class C5927e<T> extends C6433l<C5926d<T>> {

    /* renamed from: a */
    private final C6433l<C6650p<T>> f16384a;

    /* renamed from: d.h.a.a.a.e$a */
    private static class C5928a<R> implements C6438q<C6650p<R>> {

        /* renamed from: a */
        private final C6438q<? super C5926d<R>> f16385a;

        C5928a(C6438q<? super C5926d<R>> qVar) {
            this.f16385a = qVar;
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            this.f16385a.mo13383a(bVar);
        }

        /* renamed from: a */
        public void mo13341a(C6650p<R> pVar) {
            this.f16385a.mo13341a(C5926d.m22428a(pVar));
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            try {
                this.f16385a.mo13341a(C5926d.m22429a(th));
                this.f16385a.mo13343c();
            } catch (Throwable th2) {
                C6233b.m23529b(th2);
                C6416a.m23988b((Throwable) new C6228a(th, th2));
            }
        }

        /* renamed from: c */
        public void mo13343c() {
            this.f16385a.mo13343c();
        }
    }

    C5927e(C6433l<C6650p<T>> lVar) {
        this.f16384a = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15707b(C6438q<? super C5926d<T>> qVar) {
        this.f16384a.mo16542a(new C5928a(qVar));
    }
}
