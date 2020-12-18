package p208e.p221b.p228e.p233e.p234a;

import p208e.p221b.C6247e;
import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.f */
public final class C6299f<T> extends C6247e<T> {

    /* renamed from: b */
    private final C6433l<T> f17413b;

    /* renamed from: e.b.e.e.a.f$a */
    static class C6300a<T> implements C6438q<T>, C6585c {

        /* renamed from: a */
        private final C6584b<? super T> f17414a;

        /* renamed from: b */
        private C6223b f17415b;

        C6300a(C6584b<? super T> bVar) {
            this.f17414a = bVar;
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            this.f17415b = bVar;
            this.f17414a.mo13388a((C6585c) this);
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            this.f17414a.mo13389a(t);
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            this.f17414a.mo13390a(th);
        }

        /* renamed from: c */
        public void mo13343c() {
            this.f17414a.mo13391c();
        }

        public void cancel() {
            this.f17415b.mo15709a();
        }

        public void request(long j) {
        }
    }

    public C6299f(C6433l<T> lVar) {
        this.f17413b = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        this.f17413b.mo16542a(new C6300a(bVar));
    }
}
