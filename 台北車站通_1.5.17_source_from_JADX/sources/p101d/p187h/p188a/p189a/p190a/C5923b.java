package p101d.p187h.p188a.p189a.p190a;

import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p242g.C6416a;
import p263h.C6596b;
import p263h.C6650p;

/* renamed from: d.h.a.a.a.b */
final class C5923b<T> extends C6433l<C6650p<T>> {

    /* renamed from: a */
    private final C6596b<T> f16377a;

    /* renamed from: d.h.a.a.a.b$a */
    private static final class C5924a implements C6223b {

        /* renamed from: a */
        private final C6596b<?> f16378a;

        C5924a(C6596b<?> bVar) {
            this.f16378a = bVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f16378a.cancel();
        }
    }

    C5923b(C6596b<T> bVar) {
        this.f16377a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15707b(C6438q<? super C6650p<T>> qVar) {
        boolean z;
        C6596b<T> clone = this.f16377a.clone();
        qVar.mo13383a((C6223b) new C5924a(clone));
        try {
            C6650p<T> execute = clone.execute();
            if (!clone.isCanceled()) {
                qVar.mo13341a(execute);
            }
            if (!clone.isCanceled()) {
                try {
                    qVar.mo13343c();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            C6233b.m23529b(th);
            if (z) {
                C6416a.m23988b(th);
            } else if (!clone.isCanceled()) {
                try {
                    qVar.mo13342a(th);
                } catch (Throwable th3) {
                    C6233b.m23529b(th3);
                    C6416a.m23988b((Throwable) new C6228a(th, th3));
                }
            }
        }
    }
}
