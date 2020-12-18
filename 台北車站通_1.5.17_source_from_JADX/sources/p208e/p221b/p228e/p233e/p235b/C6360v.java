package p208e.p221b.p228e.p233e.p235b;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6433l;
import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6244f;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p236f.C6364b;

/* renamed from: e.b.e.e.b.v */
public final class C6360v<T, R> extends C6433l<R> {

    /* renamed from: a */
    final C6436o<? extends T>[] f17632a;

    /* renamed from: b */
    final Iterable<? extends C6436o<? extends T>> f17633b;

    /* renamed from: c */
    final C6244f<? super Object[], ? extends R> f17634c;

    /* renamed from: d */
    final int f17635d;

    /* renamed from: e */
    final boolean f17636e;

    /* renamed from: e.b.e.e.b.v$a */
    static final class C6361a<T, R> extends AtomicInteger implements C6223b {

        /* renamed from: a */
        final C6438q<? super R> f17637a;

        /* renamed from: b */
        final C6244f<? super Object[], ? extends R> f17638b;

        /* renamed from: c */
        final C6362b<T, R>[] f17639c;

        /* renamed from: d */
        final T[] f17640d;

        /* renamed from: e */
        final boolean f17641e;

        /* renamed from: f */
        volatile boolean f17642f;

        C6361a(C6438q<? super R> qVar, C6244f<? super Object[], ? extends R> fVar, int i, boolean z) {
            this.f17637a = qVar;
            this.f17638b = fVar;
            this.f17639c = new C6362b[i];
            this.f17640d = new Object[i];
            this.f17641e = z;
        }

        /* renamed from: a */
        public void mo15709a() {
            if (!this.f17642f) {
                this.f17642f = true;
                mo16444c();
                if (getAndIncrement() == 0) {
                    mo16445d();
                }
            }
        }

        /* renamed from: a */
        public void mo16441a(C6436o<? extends T>[] oVarArr, int i) {
            C6362b<T, R>[] bVarArr = this.f17639c;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new C6362b<>(this, i);
            }
            lazySet(0);
            this.f17637a.mo13383a((C6223b) this);
            for (int i3 = 0; i3 < length && !this.f17642f; i3++) {
                oVarArr[i3].mo16542a(bVarArr[i3]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16442a(boolean z, boolean z2, C6438q<? super R> qVar, boolean z3, C6362b<?, ?> bVar) {
            if (this.f17642f) {
                mo16443b();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = bVar.f17646d;
                    if (th != null) {
                        mo16443b();
                        qVar.mo13342a(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        mo16443b();
                        qVar.mo13343c();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = bVar.f17646d;
                    mo16443b();
                    if (th2 != null) {
                        qVar.mo13342a(th2);
                    } else {
                        qVar.mo13343c();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16443b() {
            mo16445d();
            mo16444c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo16444c() {
            for (C6362b<T, R> a : this.f17639c) {
                a.mo16447a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16445d() {
            for (C6362b<T, R> bVar : this.f17639c) {
                bVar.f17644b.clear();
            }
        }

        /* renamed from: e */
        public void mo16446e() {
            Throwable th;
            if (getAndIncrement() == 0) {
                C6362b<T, R>[] bVarArr = this.f17639c;
                C6438q<? super R> qVar = this.f17637a;
                T[] tArr = this.f17640d;
                boolean z = this.f17641e;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C6362b<T, R> bVar : bVarArr) {
                        if (tArr[i3] == null) {
                            boolean z2 = bVar.f17645c;
                            T poll = bVar.f17644b.poll();
                            boolean z3 = poll == null;
                            if (!mo16442a(z2, z3, qVar, z, bVar)) {
                                if (!z3) {
                                    tArr[i3] = poll;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (bVar.f17645c && !z && (th = bVar.f17646d) != null) {
                            mo16443b();
                            qVar.mo13342a(th);
                            return;
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            Object apply = this.f17638b.apply(tArr.clone());
                            C6268b.m23590a(apply, "The zipper returned a null value");
                            qVar.mo13341a(apply);
                            Arrays.fill(tArr, (Object) null);
                        } catch (Throwable th2) {
                            C6233b.m23529b(th2);
                            mo16443b();
                            qVar.mo13342a(th2);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e.b.e.e.b.v$b */
    static final class C6362b<T, R> implements C6438q<T> {

        /* renamed from: a */
        final C6361a<T, R> f17643a;

        /* renamed from: b */
        final C6364b<T> f17644b;

        /* renamed from: c */
        volatile boolean f17645c;

        /* renamed from: d */
        Throwable f17646d;

        /* renamed from: e */
        final AtomicReference<C6223b> f17647e = new AtomicReference<>();

        C6362b(C6361a<T, R> aVar, int i) {
            this.f17643a = aVar;
            this.f17644b = new C6364b<>(i);
        }

        /* renamed from: a */
        public void mo16447a() {
            C6249b.m23558a(this.f17647e);
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            C6249b.m23562c(this.f17647e, bVar);
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            this.f17644b.offer(t);
            this.f17643a.mo16446e();
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            this.f17646d = th;
            this.f17645c = true;
            this.f17643a.mo16446e();
        }

        /* renamed from: c */
        public void mo13343c() {
            this.f17645c = true;
            this.f17643a.mo16446e();
        }
    }

    public C6360v(C6436o<? extends T>[] oVarArr, Iterable<? extends C6436o<? extends T>> iterable, C6244f<? super Object[], ? extends R> fVar, int i, boolean z) {
        this.f17632a = oVarArr;
        this.f17633b = iterable;
        this.f17634c = fVar;
        this.f17635d = i;
        this.f17636e = z;
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super R> qVar) {
        int i;
        C6436o<? extends T>[] oVarArr = this.f17632a;
        if (oVarArr == null) {
            oVarArr = new C6433l[8];
            i = 0;
            for (C6436o<? extends T> oVar : this.f17633b) {
                if (i == oVarArr.length) {
                    C6436o<? extends T>[] oVarArr2 = new C6436o[((i >> 2) + i)];
                    System.arraycopy(oVarArr, 0, oVarArr2, 0, i);
                    oVarArr = oVarArr2;
                }
                oVarArr[i] = oVar;
                i++;
            }
        } else {
            i = oVarArr.length;
        }
        if (i == 0) {
            C6250c.m23565a((C6438q<?>) qVar);
        } else {
            new C6361a(qVar, this.f17634c, i, this.f17636e).mo16441a(oVarArr, this.f17635d);
        }
    }
}
