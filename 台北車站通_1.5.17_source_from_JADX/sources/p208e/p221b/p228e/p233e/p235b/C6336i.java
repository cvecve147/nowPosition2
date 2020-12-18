package p208e.p221b.p228e.p233e.p235b;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6244f;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p231c.C6274e;
import p208e.p221b.p228e.p231c.C6278i;
import p208e.p221b.p228e.p231c.C6279j;
import p208e.p221b.p228e.p236f.C6363a;
import p208e.p221b.p228e.p236f.C6364b;
import p208e.p221b.p228e.p240j.C6400c;
import p208e.p221b.p228e.p240j.C6404g;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.e.b.i */
public final class C6336i<T, U> extends C6319a<T, U> {

    /* renamed from: b */
    final C6244f<? super T, ? extends C6436o<? extends U>> f17553b;

    /* renamed from: c */
    final boolean f17554c;

    /* renamed from: d */
    final int f17555d;

    /* renamed from: e */
    final int f17556e;

    /* renamed from: e.b.e.e.b.i$a */
    static final class C6337a<T, U> extends AtomicReference<C6223b> implements C6438q<U> {

        /* renamed from: a */
        final long f17557a;

        /* renamed from: b */
        final C6338b<T, U> f17558b;

        /* renamed from: c */
        volatile boolean f17559c;

        /* renamed from: d */
        volatile C6279j<U> f17560d;

        /* renamed from: e */
        int f17561e;

        C6337a(C6338b<T, U> bVar, long j) {
            this.f17557a = j;
            this.f17558b = bVar;
        }

        /* renamed from: a */
        public void mo16414a() {
            C6249b.m23558a((AtomicReference<C6223b>) this);
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23562c(this, bVar) && (bVar instanceof C6274e)) {
                C6274e eVar = (C6274e) bVar;
                int a = eVar.mo16357a(7);
                if (a == 1) {
                    this.f17561e = a;
                    this.f17560d = eVar;
                    this.f17559c = true;
                    this.f17558b.mo16422e();
                } else if (a == 2) {
                    this.f17561e = a;
                    this.f17560d = eVar;
                }
            }
        }

        /* renamed from: a */
        public void mo13341a(U u) {
            if (this.f17561e == 0) {
                this.f17558b.mo16416a(u, this);
            } else {
                this.f17558b.mo16422e();
            }
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            if (this.f17558b.f17571j.mo16502a(th)) {
                C6338b<T, U> bVar = this.f17558b;
                if (!bVar.f17566e) {
                    bVar.mo16421d();
                }
                this.f17559c = true;
                this.f17558b.mo16422e();
                return;
            }
            C6416a.m23988b(th);
        }

        /* renamed from: c */
        public void mo13343c() {
            this.f17559c = true;
            this.f17558b.mo16422e();
        }
    }

    /* renamed from: e.b.e.e.b.i$b */
    static final class C6338b<T, U> extends AtomicInteger implements C6223b, C6438q<T> {

        /* renamed from: a */
        static final C6337a<?, ?>[] f17562a = new C6337a[0];

        /* renamed from: b */
        static final C6337a<?, ?>[] f17563b = new C6337a[0];

        /* renamed from: c */
        final C6438q<? super U> f17564c;

        /* renamed from: d */
        final C6244f<? super T, ? extends C6436o<? extends U>> f17565d;

        /* renamed from: e */
        final boolean f17566e;

        /* renamed from: f */
        final int f17567f;

        /* renamed from: g */
        final int f17568g;

        /* renamed from: h */
        volatile C6278i<U> f17569h;

        /* renamed from: i */
        volatile boolean f17570i;

        /* renamed from: j */
        final C6400c f17571j = new C6400c();

        /* renamed from: k */
        volatile boolean f17572k;

        /* renamed from: l */
        final AtomicReference<C6337a<?, ?>[]> f17573l;

        /* renamed from: m */
        C6223b f17574m;

        /* renamed from: n */
        long f17575n;

        /* renamed from: o */
        long f17576o;

        /* renamed from: p */
        int f17577p;

        /* renamed from: q */
        Queue<C6436o<? extends U>> f17578q;

        /* renamed from: r */
        int f17579r;

        C6338b(C6438q<? super U> qVar, C6244f<? super T, ? extends C6436o<? extends U>> fVar, boolean z, int i, int i2) {
            this.f17564c = qVar;
            this.f17565d = fVar;
            this.f17566e = z;
            this.f17567f = i;
            this.f17568g = i2;
            if (i != Integer.MAX_VALUE) {
                this.f17578q = new ArrayDeque(i);
            }
            this.f17573l = new AtomicReference<>(f17562a);
        }

        /* renamed from: a */
        public void mo15709a() {
            Throwable a;
            if (!this.f17572k) {
                this.f17572k = true;
                if (mo16421d() && (a = this.f17571j.mo16501a()) != null && a != C6404g.f17769a) {
                    C6416a.m23988b(a);
                }
            }
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23557a(this.f17574m, bVar)) {
                this.f17574m = bVar;
                this.f17564c.mo13383a((C6223b) this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16415a(C6436o<? extends U> oVar) {
            while (oVar instanceof Callable) {
                mo16417a((Callable) oVar);
                if (this.f17567f != Integer.MAX_VALUE) {
                    synchronized (this) {
                        oVar = this.f17578q.poll();
                        if (oVar == null) {
                            this.f17579r--;
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            long j = this.f17575n;
            this.f17575n = 1 + j;
            C6337a aVar = new C6337a(this, j);
            if (mo16418a(aVar)) {
                oVar.mo16542a(aVar);
            }
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            if (!this.f17570i) {
                try {
                    Object apply = this.f17565d.apply(t);
                    C6268b.m23590a(apply, "The mapper returned a null ObservableSource");
                    C6436o oVar = (C6436o) apply;
                    if (this.f17567f != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.f17579r == this.f17567f) {
                                this.f17578q.offer(oVar);
                                return;
                            }
                            this.f17579r++;
                        }
                    }
                    mo16415a(oVar);
                } catch (Throwable th) {
                    C6233b.m23529b(th);
                    this.f17574m.mo15709a();
                    mo13342a(th);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16416a(U u, C6337a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C6279j jVar = aVar.f17560d;
                if (jVar == null) {
                    jVar = new C6364b(this.f17568g);
                    aVar.f17560d = jVar;
                }
                jVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f17564c.mo13341a(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo16423f();
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            if (this.f17570i) {
                C6416a.m23988b(th);
            } else if (this.f17571j.mo16502a(th)) {
                this.f17570i = true;
                mo16422e();
            } else {
                C6416a.m23988b(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16417a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call != null) {
                    if (get() != 0 || !compareAndSet(0, 1)) {
                        C6278i<U> iVar = this.f17569h;
                        if (iVar == null) {
                            int i = this.f17567f;
                            iVar = i == Integer.MAX_VALUE ? new C6364b<>(this.f17568g) : new C6363a<>(i);
                            this.f17569h = iVar;
                        }
                        if (!iVar.offer(call)) {
                            mo13342a((Throwable) new IllegalStateException("Scalar queue full?!"));
                            return;
                        } else if (getAndIncrement() != 0) {
                            return;
                        }
                    } else {
                        this.f17564c.mo13341a(call);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                    mo16423f();
                }
            } catch (Throwable th) {
                C6233b.m23529b(th);
                this.f17571j.mo16502a(th);
                mo16422e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16418a(C6337a<T, U> aVar) {
            C6337a<?, ?>[] aVarArr;
            C6337a[] aVarArr2;
            do {
                aVarArr = (C6337a[]) this.f17573l.get();
                if (aVarArr == f17563b) {
                    aVar.mo16414a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C6337a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f17573l.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16419b(C6337a<T, U> aVar) {
            C6337a<T, U>[] aVarArr;
            C6337a<?, ?>[] aVarArr2;
            do {
                aVarArr = (C6337a[]) this.f17573l.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f17562a;
                        } else {
                            C6337a<?, ?>[] aVarArr3 = new C6337a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f17573l.compareAndSet(aVarArr, aVarArr2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo16420b() {
            if (this.f17572k) {
                return true;
            }
            Throwable th = (Throwable) this.f17571j.get();
            if (this.f17566e || th == null) {
                return false;
            }
            mo16421d();
            Throwable a = this.f17571j.mo16501a();
            if (a != C6404g.f17769a) {
                this.f17564c.mo13342a(a);
            }
            return true;
        }

        /* renamed from: c */
        public void mo13343c() {
            if (!this.f17570i) {
                this.f17570i = true;
                mo16422e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo16421d() {
            C6337a<?, ?>[] aVarArr;
            this.f17574m.mo15709a();
            C6337a<?, ?>[] aVarArr2 = (C6337a[]) this.f17573l.get();
            C6337a<?, ?>[] aVarArr3 = f17563b;
            if (aVarArr2 == aVarArr3 || (aVarArr = (C6337a[]) this.f17573l.getAndSet(aVarArr3)) == f17563b) {
                return false;
            }
            for (C6337a<?, ?> a : aVarArr) {
                a.mo16414a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo16422e() {
            if (getAndIncrement() == 0) {
                mo16423f();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a2, code lost:
            if (r11 != null) goto L_0x0090;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo16423f() {
            /*
                r12 = this;
                e.b.q<? super U> r0 = r12.f17564c
                r1 = 1
                r2 = r1
            L_0x0004:
                boolean r3 = r12.mo16420b()
                if (r3 == 0) goto L_0x000b
                return
            L_0x000b:
                e.b.e.c.i<U> r3 = r12.f17569h
                if (r3 == 0) goto L_0x0023
            L_0x000f:
                boolean r4 = r12.mo16420b()
                if (r4 == 0) goto L_0x0016
                return
            L_0x0016:
                java.lang.Object r4 = r3.poll()
                if (r4 != 0) goto L_0x001f
                if (r4 != 0) goto L_0x000f
                goto L_0x0023
            L_0x001f:
                r0.mo13341a(r4)
                goto L_0x000f
            L_0x0023:
                boolean r3 = r12.f17570i
                e.b.e.c.i<U> r4 = r12.f17569h
                java.util.concurrent.atomic.AtomicReference<e.b.e.e.b.i$a<?, ?>[]> r5 = r12.f17573l
                java.lang.Object r5 = r5.get()
                e.b.e.e.b.i$a[] r5 = (p208e.p221b.p228e.p233e.p235b.C6336i.C6337a[]) r5
                int r6 = r5.length
                if (r3 == 0) goto L_0x0050
                if (r4 == 0) goto L_0x003a
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L_0x0050
            L_0x003a:
                if (r6 != 0) goto L_0x0050
                e.b.e.j.c r1 = r12.f17571j
                java.lang.Throwable r1 = r1.mo16501a()
                java.lang.Throwable r2 = p208e.p221b.p228e.p240j.C6404g.f17769a
                if (r1 == r2) goto L_0x004f
                if (r1 != 0) goto L_0x004c
                r0.mo13343c()
                goto L_0x004f
            L_0x004c:
                r0.mo13342a((java.lang.Throwable) r1)
            L_0x004f:
                return
            L_0x0050:
                r3 = 0
                if (r6 == 0) goto L_0x00f1
                long r7 = r12.f17576o
                int r4 = r12.f17577p
                if (r6 <= r4) goto L_0x0061
                r9 = r5[r4]
                long r9 = r9.f17557a
                int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r9 == 0) goto L_0x0082
            L_0x0061:
                if (r6 > r4) goto L_0x0064
                r4 = r3
            L_0x0064:
                r9 = r4
                r4 = r3
            L_0x0066:
                if (r4 >= r6) goto L_0x0079
                r10 = r5[r9]
                long r10 = r10.f17557a
                int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r10 != 0) goto L_0x0071
                goto L_0x0079
            L_0x0071:
                int r9 = r9 + 1
                if (r9 != r6) goto L_0x0076
                r9 = r3
            L_0x0076:
                int r4 = r4 + 1
                goto L_0x0066
            L_0x0079:
                r12.f17577p = r9
                r4 = r5[r9]
                long r7 = r4.f17557a
                r12.f17576o = r7
                r4 = r9
            L_0x0082:
                r8 = r3
                r7 = r4
                r4 = r8
            L_0x0085:
                if (r4 >= r6) goto L_0x00e8
                boolean r9 = r12.mo16420b()
                if (r9 == 0) goto L_0x008e
                return
            L_0x008e:
                r9 = r5[r7]
            L_0x0090:
                boolean r10 = r12.mo16420b()
                if (r10 == 0) goto L_0x0097
                return
            L_0x0097:
                e.b.e.c.j<U> r10 = r9.f17560d
                if (r10 != 0) goto L_0x009c
                goto L_0x00a4
            L_0x009c:
                java.lang.Object r11 = r10.poll()     // Catch:{ Throwable -> 0x00cd }
                if (r11 != 0) goto L_0x00c3
                if (r11 != 0) goto L_0x0090
            L_0x00a4:
                boolean r10 = r9.f17559c
                e.b.e.c.j<U> r11 = r9.f17560d
                if (r10 == 0) goto L_0x00bd
                if (r11 == 0) goto L_0x00b2
                boolean r10 = r11.isEmpty()
                if (r10 == 0) goto L_0x00bd
            L_0x00b2:
                r12.mo16419b(r9)
                boolean r8 = r12.mo16420b()
                if (r8 == 0) goto L_0x00bc
                return
            L_0x00bc:
                r8 = r1
            L_0x00bd:
                int r7 = r7 + 1
                if (r7 != r6) goto L_0x00e6
                r7 = r3
                goto L_0x00e6
            L_0x00c3:
                r0.mo13341a(r11)
                boolean r11 = r12.mo16420b()
                if (r11 == 0) goto L_0x009c
                return
            L_0x00cd:
                r8 = move-exception
                p208e.p221b.p226c.C6233b.m23529b(r8)
                r9.mo16414a()
                e.b.e.j.c r10 = r12.f17571j
                r10.mo16502a(r8)
                boolean r8 = r12.mo16420b()
                if (r8 == 0) goto L_0x00e0
                return
            L_0x00e0:
                r12.mo16419b(r9)
                int r4 = r4 + 1
                r8 = r1
            L_0x00e6:
                int r4 = r4 + r1
                goto L_0x0085
            L_0x00e8:
                r12.f17577p = r7
                r3 = r5[r7]
                long r3 = r3.f17557a
                r12.f17576o = r3
                r3 = r8
            L_0x00f1:
                if (r3 == 0) goto L_0x0116
                int r3 = r12.f17567f
                r4 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r4) goto L_0x0004
                monitor-enter(r12)
                java.util.Queue<e.b.o<? extends U>> r3 = r12.f17578q     // Catch:{ all -> 0x0113 }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0113 }
                e.b.o r3 = (p208e.p221b.C6436o) r3     // Catch:{ all -> 0x0113 }
                if (r3 != 0) goto L_0x010d
                int r3 = r12.f17579r     // Catch:{ all -> 0x0113 }
                int r3 = r3 - r1
                r12.f17579r = r3     // Catch:{ all -> 0x0113 }
                monitor-exit(r12)     // Catch:{ all -> 0x0113 }
                goto L_0x0004
            L_0x010d:
                monitor-exit(r12)     // Catch:{ all -> 0x0113 }
                r12.mo16415a(r3)
                goto L_0x0004
            L_0x0113:
                r0 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x0113 }
                throw r0
            L_0x0116:
                int r2 = -r2
                int r2 = r12.addAndGet(r2)
                if (r2 != 0) goto L_0x0004
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p228e.p233e.p235b.C6336i.C6338b.mo16423f():void");
        }
    }

    public C6336i(C6436o<T> oVar, C6244f<? super T, ? extends C6436o<? extends U>> fVar, boolean z, int i, int i2) {
        super(oVar);
        this.f17553b = fVar;
        this.f17554c = z;
        this.f17555d = i;
        this.f17556e = i2;
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super U> qVar) {
        if (!C6350q.m23800a(this.f17483a, qVar, this.f17553b)) {
            this.f17483a.mo16542a(new C6338b(qVar, this.f17553b, this.f17554c, this.f17555d, this.f17556e));
        }
    }
}
