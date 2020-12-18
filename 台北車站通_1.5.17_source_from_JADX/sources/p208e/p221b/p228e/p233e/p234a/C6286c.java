package p208e.p221b.p228e.p233e.p234a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6213a;
import p208e.p221b.C6247e;
import p208e.p221b.C6412f;
import p208e.p221b.C6415g;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p226c.C6234c;
import p208e.p221b.p228e.p229a.C6252e;
import p208e.p221b.p228e.p236f.C6364b;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6401d;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.c */
public final class C6286c<T> extends C6247e<T> {

    /* renamed from: b */
    final C6415g<T> f17390b;

    /* renamed from: c */
    final C6213a f17391c;

    /* renamed from: e.b.e.e.a.c$a */
    static abstract class C6287a<T> extends AtomicLong implements C6412f<T>, C6585c {

        /* renamed from: a */
        final C6584b<? super T> f17392a;

        /* renamed from: b */
        final C6252e f17393b = new C6252e();

        C6287a(C6584b<? super T> bVar) {
            this.f17392a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16381a() {
        }

        /* renamed from: a */
        public void mo16382a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                C6416a.m23988b(th);
                return;
            }
            try {
                this.f17392a.mo13390a(th);
            } finally {
                this.f17393b.mo15709a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16383b() {
        }

        /* renamed from: c */
        public void mo16340c() {
            if (!isCancelled()) {
                try {
                    this.f17392a.mo13391c();
                } finally {
                    this.f17393b.mo15709a();
                }
            }
        }

        public final void cancel() {
            this.f17393b.mo15709a();
            mo16383b();
        }

        public final boolean isCancelled() {
            return this.f17393b.mo16364b();
        }

        public final void request(long j) {
            if (C6397c.m23928a(j)) {
                C6401d.m23940a((AtomicLong) this, j);
                mo16381a();
            }
        }
    }

    /* renamed from: e.b.e.e.a.c$b */
    static final class C6288b<T> extends C6287a<T> {

        /* renamed from: c */
        final C6364b<T> f17394c;

        /* renamed from: d */
        Throwable f17395d;

        /* renamed from: e */
        volatile boolean f17396e;

        /* renamed from: f */
        final AtomicInteger f17397f = new AtomicInteger();

        C6288b(C6584b<? super T> bVar, int i) {
            super(bVar);
            this.f17394c = new C6364b<>(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16381a() {
            mo16387d();
        }

        /* renamed from: a */
        public void mo16339a(T t) {
            if (!this.f17396e && !isCancelled()) {
                if (t == null) {
                    mo16382a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f17394c.offer(t);
                mo16387d();
            }
        }

        /* renamed from: a */
        public void mo16382a(Throwable th) {
            if (this.f17396e || isCancelled()) {
                C6416a.m23988b(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f17395d = th;
            this.f17396e = true;
            mo16387d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16383b() {
            if (this.f17397f.getAndIncrement() == 0) {
                this.f17394c.clear();
            }
        }

        /* renamed from: c */
        public void mo16340c() {
            this.f17396e = true;
            mo16387d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16387d() {
            int i;
            if (this.f17397f.getAndIncrement() == 0) {
                C6584b<? super T> bVar = this.f17392a;
                C6364b<T> bVar2 = this.f17394c;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            bVar2.clear();
                            return;
                        } else {
                            boolean z = this.f17396e;
                            T poll = bVar2.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable th = this.f17395d;
                                if (th != null) {
                                    super.mo16382a(th);
                                    return;
                                } else {
                                    super.mo16340c();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                bVar.mo13389a(poll);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            bVar2.clear();
                            return;
                        }
                        boolean z3 = this.f17396e;
                        boolean isEmpty = bVar2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.f17395d;
                            if (th2 != null) {
                                super.mo16382a(th2);
                                return;
                            } else {
                                super.mo16340c();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C6401d.m23941b(this, j2);
                    }
                    i2 = this.f17397f.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }

    /* renamed from: e.b.e.e.a.c$c */
    static final class C6289c<T> extends C6293g<T> {
        C6289c(C6584b<? super T> bVar) {
            super(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16388d() {
        }
    }

    /* renamed from: e.b.e.e.a.c$d */
    static final class C6290d<T> extends C6293g<T> {
        C6290d(C6584b<? super T> bVar) {
            super(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16388d() {
            mo16382a(new C6234c("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: e.b.e.e.a.c$e */
    static final class C6291e<T> extends C6287a<T> {

        /* renamed from: c */
        final AtomicReference<T> f17398c = new AtomicReference<>();

        /* renamed from: d */
        Throwable f17399d;

        /* renamed from: e */
        volatile boolean f17400e;

        /* renamed from: f */
        final AtomicInteger f17401f = new AtomicInteger();

        C6291e(C6584b<? super T> bVar) {
            super(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16381a() {
            mo16389d();
        }

        /* renamed from: a */
        public void mo16339a(T t) {
            if (!this.f17400e && !isCancelled()) {
                if (t == null) {
                    mo16382a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f17398c.set(t);
                mo16389d();
            }
        }

        /* renamed from: a */
        public void mo16382a(Throwable th) {
            if (this.f17400e || isCancelled()) {
                C6416a.m23988b(th);
                return;
            }
            if (th == null) {
                mo16382a((Throwable) new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f17399d = th;
            this.f17400e = true;
            mo16389d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16383b() {
            if (this.f17401f.getAndIncrement() == 0) {
                this.f17398c.lazySet((Object) null);
            }
        }

        /* renamed from: c */
        public void mo16340c() {
            this.f17400e = true;
            mo16389d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16389d() {
            int i;
            boolean z;
            if (this.f17401f.getAndIncrement() == 0) {
                C6584b<? super T> bVar = this.f17392a;
                AtomicReference<T> atomicReference = this.f17398c;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        z = false;
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        } else {
                            boolean z2 = this.f17400e;
                            T andSet = atomicReference.getAndSet((Object) null);
                            boolean z3 = andSet == null;
                            if (z2 && z3) {
                                Throwable th = this.f17399d;
                                if (th != null) {
                                    super.mo16382a(th);
                                    return;
                                } else {
                                    super.mo16340c();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                bVar.mo13389a(andSet);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        }
                        boolean z4 = this.f17400e;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.f17399d;
                            if (th2 != null) {
                                super.mo16382a(th2);
                                return;
                            } else {
                                super.mo16340c();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C6401d.m23941b(this, j2);
                    }
                    i2 = this.f17401f.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }

    /* renamed from: e.b.e.e.a.c$f */
    static final class C6292f<T> extends C6287a<T> {
        C6292f(C6584b<? super T> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo16339a(T t) {
            long j;
            if (!isCancelled()) {
                if (t != null) {
                    this.f17392a.mo13389a(t);
                    do {
                        j = get();
                        if (j == 0 || compareAndSet(j, j - 1)) {
                            return;
                        }
                        j = get();
                        return;
                    } while (compareAndSet(j, j - 1));
                    return;
                }
                mo16382a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: e.b.e.e.a.c$g */
    static abstract class C6293g<T> extends C6287a<T> {
        C6293g(C6584b<? super T> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public final void mo16339a(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    mo16382a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.f17392a.mo13389a(t);
                    C6401d.m23941b(this, 1);
                } else {
                    mo16388d();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo16388d();
    }

    public C6286c(C6415g<T> gVar, C6213a aVar) {
        this.f17390b = gVar;
        this.f17391c = aVar;
    }

    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        int i = C6285b.f17389a[this.f17391c.ordinal()];
        C6287a bVar2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new C6288b(bVar, C6247e.m23533a()) : new C6291e(bVar) : new C6289c(bVar) : new C6290d(bVar) : new C6292f(bVar);
        bVar.mo13388a((C6585c) bVar2);
        try {
            this.f17390b.mo13355a(bVar2);
        } catch (Throwable th) {
            C6233b.m23529b(th);
            bVar2.mo16382a(th);
        }
    }
}
