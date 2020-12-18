package p208e.p221b.p228e.p233e.p234a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6247e;
import p208e.p221b.C6417h;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6401d;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.m */
public final class C6314m<T> extends C6284a<T, T> {

    /* renamed from: e.b.e.e.a.m$a */
    static final class C6315a<T> extends AtomicInteger implements C6417h<T>, C6585c {

        /* renamed from: a */
        final C6584b<? super T> f17466a;

        /* renamed from: b */
        C6585c f17467b;

        /* renamed from: c */
        volatile boolean f17468c;

        /* renamed from: d */
        Throwable f17469d;

        /* renamed from: e */
        volatile boolean f17470e;

        /* renamed from: f */
        final AtomicLong f17471f = new AtomicLong();

        /* renamed from: g */
        final AtomicReference<T> f17472g = new AtomicReference<>();

        C6315a(C6584b<? super T> bVar) {
            this.f17466a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16401a() {
            boolean z;
            if (getAndIncrement() == 0) {
                C6584b<? super T> bVar = this.f17466a;
                AtomicLong atomicLong = this.f17471f;
                AtomicReference<T> atomicReference = this.f17472g;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.f17468c;
                        T andSet = atomicReference.getAndSet((Object) null);
                        boolean z3 = andSet == null;
                        if (!mo16402a(z2, z3, bVar, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            bVar.mo13389a(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f17468c;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo16402a(z4, z, bVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C6401d.m23941b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* renamed from: a */
        public void mo13388a(C6585c cVar) {
            if (C6397c.m23929a(this.f17467b, cVar)) {
                this.f17467b = cVar;
                this.f17466a.mo13388a((C6585c) this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        public void mo13389a(T t) {
            this.f17472g.lazySet(t);
            mo16401a();
        }

        /* renamed from: a */
        public void mo13390a(Throwable th) {
            this.f17469d = th;
            this.f17468c = true;
            mo16401a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16402a(boolean z, boolean z2, C6584b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f17470e) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f17469d;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
                    bVar.mo13390a(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    bVar.mo13391c();
                    return true;
                }
            }
        }

        /* renamed from: c */
        public void mo13391c() {
            this.f17468c = true;
            mo16401a();
        }

        public void cancel() {
            if (!this.f17470e) {
                this.f17470e = true;
                this.f17467b.cancel();
                if (getAndIncrement() == 0) {
                    this.f17472g.lazySet((Object) null);
                }
            }
        }

        public void request(long j) {
            if (C6397c.m23928a(j)) {
                C6401d.m23940a(this.f17471f, j);
                mo16401a();
            }
        }
    }

    public C6314m(C6247e<T> eVar) {
        super(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        this.f17388b.mo16349a(new C6315a(bVar));
    }
}
