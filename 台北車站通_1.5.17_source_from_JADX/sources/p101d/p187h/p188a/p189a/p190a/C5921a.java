package p101d.p187h.p188a.p189a.p190a;

import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p242g.C6416a;
import p263h.C6650p;

/* renamed from: d.h.a.a.a.a */
final class C5921a<T> extends C6433l<T> {

    /* renamed from: a */
    private final C6433l<C6650p<T>> f16374a;

    /* renamed from: d.h.a.a.a.a$a */
    private static class C5922a<R> implements C6438q<C6650p<R>> {

        /* renamed from: a */
        private final C6438q<? super R> f16375a;

        /* renamed from: b */
        private boolean f16376b;

        C5922a(C6438q<? super R> qVar) {
            this.f16375a = qVar;
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            this.f16375a.mo13383a(bVar);
        }

        /* renamed from: a */
        public void mo13341a(C6650p<R> pVar) {
            if (pVar.mo17053c()) {
                this.f16375a.mo13341a(pVar.mo17051a());
                return;
            }
            this.f16376b = true;
            C5925c cVar = new C5925c(pVar);
            try {
                this.f16375a.mo13342a((Throwable) cVar);
            } catch (Throwable th) {
                C6233b.m23529b(th);
                C6416a.m23988b((Throwable) new C6228a(cVar, th));
            }
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            if (!this.f16376b) {
                this.f16375a.mo13342a(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C6416a.m23988b((Throwable) assertionError);
        }

        /* renamed from: c */
        public void mo13343c() {
            if (!this.f16376b) {
                this.f16375a.mo13343c();
            }
        }
    }

    C5921a(C6433l<C6650p<T>> lVar) {
        this.f16374a = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        this.f16374a.mo16542a(new C5922a(qVar));
    }
}
