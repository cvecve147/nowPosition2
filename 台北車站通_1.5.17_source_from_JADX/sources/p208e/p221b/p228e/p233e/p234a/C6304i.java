package p208e.p221b.p228e.p233e.p234a;

import java.util.concurrent.atomic.AtomicLong;
import p208e.p221b.C6247e;
import p208e.p221b.C6417h;
import p208e.p221b.C6439r;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p226c.C6234c;
import p208e.p221b.p228e.p231c.C6270a;
import p208e.p221b.p228e.p231c.C6276g;
import p208e.p221b.p228e.p231c.C6279j;
import p208e.p221b.p228e.p236f.C6363a;
import p208e.p221b.p228e.p239i.C6395a;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6401d;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.i */
public final class C6304i<T> extends C6284a<T, T> {

    /* renamed from: c */
    final C6439r f17425c;

    /* renamed from: d */
    final boolean f17426d;

    /* renamed from: e */
    final int f17427e;

    /* renamed from: e.b.e.e.a.i$a */
    static abstract class C6305a<T> extends C6395a<T> implements C6417h<T>, Runnable {

        /* renamed from: a */
        final C6439r.C6442c f17428a;

        /* renamed from: b */
        final boolean f17429b;

        /* renamed from: c */
        final int f17430c;

        /* renamed from: d */
        final int f17431d;

        /* renamed from: e */
        final AtomicLong f17432e = new AtomicLong();

        /* renamed from: f */
        C6585c f17433f;

        /* renamed from: g */
        C6279j<T> f17434g;

        /* renamed from: h */
        volatile boolean f17435h;

        /* renamed from: i */
        volatile boolean f17436i;

        /* renamed from: j */
        Throwable f17437j;

        /* renamed from: k */
        int f17438k;

        /* renamed from: l */
        long f17439l;

        /* renamed from: m */
        boolean f17440m;

        C6305a(C6439r.C6442c cVar, boolean z, int i) {
            this.f17428a = cVar;
            this.f17429b = z;
            this.f17430c = i;
            this.f17431d = i - (i >> 2);
        }

        /* renamed from: a */
        public final int mo16357a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f17440m = true;
            return 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo16393a();

        /* renamed from: a */
        public final void mo13389a(T t) {
            if (!this.f17436i) {
                if (this.f17438k == 2) {
                    mo16397e();
                    return;
                }
                if (!this.f17434g.offer(t)) {
                    this.f17433f.cancel();
                    this.f17437j = new C6234c("Queue is full?!");
                    this.f17436i = true;
                }
                mo16397e();
            }
        }

        /* renamed from: a */
        public final void mo13390a(Throwable th) {
            if (this.f17436i) {
                C6416a.m23988b(th);
                return;
            }
            this.f17437j = th;
            this.f17436i = true;
            mo16397e();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
            if (r3 != null) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo16394a(boolean r3, boolean r4, p250g.p262c.C6584b<?> r5) {
            /*
                r2 = this;
                boolean r0 = r2.f17435h
                r1 = 1
                if (r0 == 0) goto L_0x0009
                r2.clear()
                return r1
            L_0x0009:
                if (r3 == 0) goto L_0x002d
                boolean r3 = r2.f17429b
                if (r3 == 0) goto L_0x001c
                if (r4 == 0) goto L_0x002d
                java.lang.Throwable r3 = r2.f17437j
                if (r3 == 0) goto L_0x0029
                goto L_0x0023
            L_0x0016:
                e.b.r$c r3 = r2.f17428a
                r3.mo15709a()
                return r1
            L_0x001c:
                java.lang.Throwable r3 = r2.f17437j
                if (r3 == 0) goto L_0x0027
                r2.clear()
            L_0x0023:
                r5.mo13390a((java.lang.Throwable) r3)
                goto L_0x0016
            L_0x0027:
                if (r4 == 0) goto L_0x002d
            L_0x0029:
                r5.mo13391c()
                goto L_0x0016
            L_0x002d:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p228e.p233e.p234a.C6304i.C6305a.mo16394a(boolean, boolean, g.c.b):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo16395b();

        /* renamed from: c */
        public final void mo13391c() {
            if (!this.f17436i) {
                this.f17436i = true;
                mo16397e();
            }
        }

        public final void cancel() {
            if (!this.f17435h) {
                this.f17435h = true;
                this.f17433f.cancel();
                this.f17428a.mo15709a();
                if (getAndIncrement() == 0) {
                    this.f17434g.clear();
                }
            }
        }

        public final void clear() {
            this.f17434g.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo16396d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final void mo16397e() {
            if (getAndIncrement() == 0) {
                this.f17428a.mo16457a((Runnable) this);
            }
        }

        public final boolean isEmpty() {
            return this.f17434g.isEmpty();
        }

        public final void request(long j) {
            if (C6397c.m23928a(j)) {
                C6401d.m23940a(this.f17432e, j);
                mo16397e();
            }
        }

        public final void run() {
            if (this.f17440m) {
                mo16395b();
            } else if (this.f17438k == 1) {
                mo16396d();
            } else {
                mo16393a();
            }
        }
    }

    /* renamed from: e.b.e.e.a.i$b */
    static final class C6306b<T> extends C6305a<T> {

        /* renamed from: n */
        final C6270a<? super T> f17441n;

        /* renamed from: o */
        long f17442o;

        C6306b(C6270a<? super T> aVar, C6439r.C6442c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f17441n = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16393a() {
            int i;
            C6270a<? super T> aVar = this.f17441n;
            C6279j<T> jVar = this.f17434g;
            long j = this.f17439l;
            long j2 = this.f17442o;
            int i2 = 1;
            while (true) {
                long j3 = this.f17432e.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f17436i;
                    try {
                        T poll = jVar.poll();
                        boolean z2 = poll == null;
                        if (!mo16394a(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.mo16378b(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f17431d)) {
                                this.f17433f.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C6233b.m23529b(th);
                        this.f17433f.cancel();
                        jVar.clear();
                        aVar.mo13390a(th);
                        this.f17428a.mo15709a();
                        return;
                    }
                }
                if (i != 0 || !mo16394a(this.f17436i, jVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f17439l = j;
                        this.f17442o = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo13388a(C6585c cVar) {
            if (C6397c.m23929a(this.f17433f, cVar)) {
                this.f17433f = cVar;
                if (cVar instanceof C6276g) {
                    C6276g gVar = (C6276g) cVar;
                    int a = gVar.mo16357a(7);
                    if (a == 1) {
                        this.f17438k = 1;
                        this.f17434g = gVar;
                        this.f17436i = true;
                        this.f17441n.mo13388a(this);
                        return;
                    } else if (a == 2) {
                        this.f17438k = 2;
                        this.f17434g = gVar;
                        this.f17441n.mo13388a(this);
                        cVar.request((long) this.f17430c);
                        return;
                    }
                }
                this.f17434g = new C6363a(this.f17430c);
                this.f17441n.mo13388a(this);
                cVar.request((long) this.f17430c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16395b() {
            int i = 1;
            while (!this.f17435h) {
                boolean z = this.f17436i;
                this.f17441n.mo13389a(null);
                if (z) {
                    Throwable th = this.f17437j;
                    if (th != null) {
                        this.f17441n.mo13390a(th);
                    } else {
                        this.f17441n.mo13391c();
                    }
                    this.f17428a.mo15709a();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
            if (r9.f17435h == false) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
            if (r1.isEmpty() == false) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
            r5 = get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
            if (r4 != r5) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
            r9.f17439l = r2;
            r4 = addAndGet(-r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
            if (r4 != 0) goto L_0x0007;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
            r4 = r5;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo16396d() {
            /*
                r9 = this;
                e.b.e.c.a<? super T> r0 = r9.f17441n
                e.b.e.c.j<T> r1 = r9.f17434g
                long r2 = r9.f17439l
                r4 = 1
            L_0x0007:
                java.util.concurrent.atomic.AtomicLong r5 = r9.f17432e
                long r5 = r5.get()
            L_0x000d:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x003c
                java.lang.Object r7 = r1.poll()     // Catch:{ Throwable -> 0x002f }
                boolean r8 = r9.f17435h
                if (r8 == 0) goto L_0x001a
                return
            L_0x001a:
                if (r7 != 0) goto L_0x0025
            L_0x001c:
                r0.mo13391c()
            L_0x001f:
                e.b.r$c r0 = r9.f17428a
                r0.mo15709a()
                return
            L_0x0025:
                boolean r7 = r0.mo16378b(r7)
                if (r7 == 0) goto L_0x000d
                r7 = 1
                long r2 = r2 + r7
                goto L_0x000d
            L_0x002f:
                r1 = move-exception
                p208e.p221b.p226c.C6233b.m23529b(r1)
                g.c.c r2 = r9.f17433f
                r2.cancel()
                r0.mo13390a((java.lang.Throwable) r1)
                goto L_0x001f
            L_0x003c:
                boolean r5 = r9.f17435h
                if (r5 == 0) goto L_0x0041
                return
            L_0x0041:
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L_0x0048
                goto L_0x001c
            L_0x0048:
                int r5 = r9.get()
                if (r4 != r5) goto L_0x0058
                r9.f17439l = r2
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto L_0x0007
                return
            L_0x0058:
                r4 = r5
                goto L_0x0007
            */
            throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p228e.p233e.p234a.C6304i.C6306b.mo16396d():void");
        }

        public T poll() {
            T poll = this.f17434g.poll();
            if (!(poll == null || this.f17438k == 1)) {
                long j = this.f17442o + 1;
                if (j == ((long) this.f17431d)) {
                    this.f17442o = 0;
                    this.f17433f.request(j);
                } else {
                    this.f17442o = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: e.b.e.e.a.i$c */
    static final class C6307c<T> extends C6305a<T> implements C6417h<T> {

        /* renamed from: n */
        final C6584b<? super T> f17443n;

        C6307c(C6584b<? super T> bVar, C6439r.C6442c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f17443n = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16393a() {
            int i;
            C6584b<? super T> bVar = this.f17443n;
            C6279j<T> jVar = this.f17434g;
            long j = this.f17439l;
            int i2 = 1;
            while (true) {
                long j2 = this.f17432e.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f17436i;
                    try {
                        T poll = jVar.poll();
                        boolean z2 = poll == null;
                        if (!mo16394a(z, z2, bVar)) {
                            if (z2) {
                                break;
                            }
                            bVar.mo13389a(poll);
                            j++;
                            if (j == ((long) this.f17431d)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f17432e.addAndGet(-j);
                                }
                                this.f17433f.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C6233b.m23529b(th);
                        this.f17433f.cancel();
                        jVar.clear();
                        bVar.mo13390a(th);
                        this.f17428a.mo15709a();
                        return;
                    }
                }
                if (i != 0 || !mo16394a(this.f17436i, jVar.isEmpty(), bVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f17439l = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo13388a(C6585c cVar) {
            if (C6397c.m23929a(this.f17433f, cVar)) {
                this.f17433f = cVar;
                if (cVar instanceof C6276g) {
                    C6276g gVar = (C6276g) cVar;
                    int a = gVar.mo16357a(7);
                    if (a == 1) {
                        this.f17438k = 1;
                        this.f17434g = gVar;
                        this.f17436i = true;
                        this.f17443n.mo13388a((C6585c) this);
                        return;
                    } else if (a == 2) {
                        this.f17438k = 2;
                        this.f17434g = gVar;
                        this.f17443n.mo13388a((C6585c) this);
                        cVar.request((long) this.f17430c);
                        return;
                    }
                }
                this.f17434g = new C6363a(this.f17430c);
                this.f17443n.mo13388a((C6585c) this);
                cVar.request((long) this.f17430c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16395b() {
            int i = 1;
            while (!this.f17435h) {
                boolean z = this.f17436i;
                this.f17443n.mo13389a(null);
                if (z) {
                    Throwable th = this.f17437j;
                    if (th != null) {
                        this.f17443n.mo13390a(th);
                    } else {
                        this.f17443n.mo13391c();
                    }
                    this.f17428a.mo15709a();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
            if (r9.f17435h == false) goto L_0x003e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            if (r1.isEmpty() == false) goto L_0x0045;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
            r5 = get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
            if (r4 != r5) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
            r9.f17439l = r2;
            r4 = addAndGet(-r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
            if (r4 != 0) goto L_0x0007;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
            r4 = r5;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo16396d() {
            /*
                r9 = this;
                g.c.b<? super T> r0 = r9.f17443n
                e.b.e.c.j<T> r1 = r9.f17434g
                long r2 = r9.f17439l
                r4 = 1
            L_0x0007:
                java.util.concurrent.atomic.AtomicLong r5 = r9.f17432e
                long r5 = r5.get()
            L_0x000d:
                int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x0039
                java.lang.Object r7 = r1.poll()     // Catch:{ Throwable -> 0x002c }
                boolean r8 = r9.f17435h
                if (r8 == 0) goto L_0x001a
                return
            L_0x001a:
                if (r7 != 0) goto L_0x0025
            L_0x001c:
                r0.mo13391c()
            L_0x001f:
                e.b.r$c r0 = r9.f17428a
                r0.mo15709a()
                return
            L_0x0025:
                r0.mo13389a(r7)
                r7 = 1
                long r2 = r2 + r7
                goto L_0x000d
            L_0x002c:
                r1 = move-exception
                p208e.p221b.p226c.C6233b.m23529b(r1)
                g.c.c r2 = r9.f17433f
                r2.cancel()
                r0.mo13390a((java.lang.Throwable) r1)
                goto L_0x001f
            L_0x0039:
                boolean r5 = r9.f17435h
                if (r5 == 0) goto L_0x003e
                return
            L_0x003e:
                boolean r5 = r1.isEmpty()
                if (r5 == 0) goto L_0x0045
                goto L_0x001c
            L_0x0045:
                int r5 = r9.get()
                if (r4 != r5) goto L_0x0055
                r9.f17439l = r2
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto L_0x0007
                return
            L_0x0055:
                r4 = r5
                goto L_0x0007
            */
            throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p228e.p233e.p234a.C6304i.C6307c.mo16396d():void");
        }

        public T poll() {
            T poll = this.f17434g.poll();
            if (!(poll == null || this.f17438k == 1)) {
                long j = this.f17439l + 1;
                if (j == ((long) this.f17431d)) {
                    this.f17439l = 0;
                    this.f17433f.request(j);
                } else {
                    this.f17439l = j;
                }
            }
            return poll;
        }
    }

    public C6304i(C6247e<T> eVar, C6439r rVar, boolean z, int i) {
        super(eVar);
        this.f17425c = rVar;
        this.f17426d = z;
        this.f17427e = i;
    }

    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        C6417h hVar;
        C6247e<T> eVar;
        C6439r.C6442c a = this.f17425c.mo16319a();
        if (bVar instanceof C6270a) {
            eVar = this.f17388b;
            hVar = new C6306b((C6270a) bVar, a, this.f17426d, this.f17427e);
        } else {
            eVar = this.f17388b;
            hVar = new C6307c(bVar, a, this.f17426d, this.f17427e);
        }
        eVar.mo16349a((C6417h<? super T>) hVar);
    }
}
