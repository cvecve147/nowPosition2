package p208e.p221b.p228e.p233e.p235b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p208e.p221b.C6433l;
import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6244f;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p231c.C6274e;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.e.b.q */
public final class C6350q {

    /* renamed from: e.b.e.e.b.q$a */
    public static final class C6351a<T> extends AtomicInteger implements C6274e<T>, Runnable {

        /* renamed from: a */
        final C6438q<? super T> f17616a;

        /* renamed from: b */
        final T f17617b;

        public C6351a(C6438q<? super T> qVar, T t) {
            this.f17616a = qVar;
            this.f17617b = t;
        }

        /* renamed from: a */
        public int mo16357a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        /* renamed from: a */
        public void mo15709a() {
            set(3);
        }

        public void clear() {
            lazySet(3);
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f17617b;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f17616a.mo13341a(this.f17617b);
                if (get() == 2) {
                    lazySet(3);
                    this.f17616a.mo13343c();
                }
            }
        }
    }

    /* renamed from: e.b.e.e.b.q$b */
    static final class C6352b<T, R> extends C6433l<R> {

        /* renamed from: a */
        final T f17618a;

        /* renamed from: b */
        final C6244f<? super T, ? extends C6436o<? extends R>> f17619b;

        C6352b(T t, C6244f<? super T, ? extends C6436o<? extends R>> fVar) {
            this.f17618a = t;
            this.f17619b = fVar;
        }

        /* renamed from: b */
        public void mo15707b(C6438q<? super R> qVar) {
            try {
                Object apply = this.f17619b.apply(this.f17618a);
                C6268b.m23590a(apply, "The mapper returned a null ObservableSource");
                C6436o oVar = (C6436o) apply;
                if (oVar instanceof Callable) {
                    try {
                        Object call = ((Callable) oVar).call();
                        if (call == null) {
                            C6250c.m23565a((C6438q<?>) qVar);
                            return;
                        }
                        C6351a aVar = new C6351a(qVar, call);
                        qVar.mo13383a((C6223b) aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C6233b.m23529b(th);
                        C6250c.m23566a(th, qVar);
                    }
                } else {
                    oVar.mo16542a(qVar);
                }
            } catch (Throwable th2) {
                C6250c.m23566a(th2, qVar);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> C6433l<U> m23799a(T t, C6244f<? super T, ? extends C6436o<? extends U>> fVar) {
        return C6416a.m23975a(new C6352b(t, fVar));
    }

    /* renamed from: a */
    public static <T, R> boolean m23800a(C6436o<T> oVar, C6438q<? super R> qVar, C6244f<? super T, ? extends C6436o<? extends R>> fVar) {
        if (!(oVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) oVar).call();
            if (call == null) {
                C6250c.m23565a((C6438q<?>) qVar);
                return true;
            }
            Object apply = fVar.apply(call);
            C6268b.m23590a(apply, "The mapper returned a null ObservableSource");
            C6436o oVar2 = (C6436o) apply;
            if (oVar2 instanceof Callable) {
                Object call2 = ((Callable) oVar2).call();
                if (call2 == null) {
                    C6250c.m23565a((C6438q<?>) qVar);
                    return true;
                }
                C6351a aVar = new C6351a(qVar, call2);
                qVar.mo13383a((C6223b) aVar);
                aVar.run();
            } else {
                oVar2.mo16542a(qVar);
            }
            return true;
        } catch (Throwable th) {
            C6233b.m23529b(th);
            C6250c.m23566a(th, qVar);
            return true;
        }
    }
}
