package p208e.p221b.p228e.p233e.p234a;

import java.util.concurrent.atomic.AtomicLong;
import p208e.p221b.C6247e;
import p208e.p221b.C6417h;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p226c.C6234c;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p228e.p231c.C6278i;
import p208e.p221b.p228e.p236f.C6363a;
import p208e.p221b.p228e.p236f.C6364b;
import p208e.p221b.p228e.p239i.C6395a;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6401d;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.e.a.j */
public final class C6308j<T> extends C6284a<T, T> {

    /* renamed from: c */
    final int f17444c;

    /* renamed from: d */
    final boolean f17445d;

    /* renamed from: e */
    final boolean f17446e;

    /* renamed from: f */
    final C6239a f17447f;

    /* renamed from: e.b.e.e.a.j$a */
    static final class C6309a<T> extends C6395a<T> implements C6417h<T> {

        /* renamed from: a */
        final C6584b<? super T> f17448a;

        /* renamed from: b */
        final C6278i<T> f17449b;

        /* renamed from: c */
        final boolean f17450c;

        /* renamed from: d */
        final C6239a f17451d;

        /* renamed from: e */
        C6585c f17452e;

        /* renamed from: f */
        volatile boolean f17453f;

        /* renamed from: g */
        volatile boolean f17454g;

        /* renamed from: h */
        Throwable f17455h;

        /* renamed from: i */
        final AtomicLong f17456i = new AtomicLong();

        /* renamed from: j */
        boolean f17457j;

        C6309a(C6584b<? super T> bVar, int i, boolean z, boolean z2, C6239a aVar) {
            this.f17448a = bVar;
            this.f17451d = aVar;
            this.f17450c = z2;
            this.f17449b = z ? new C6364b<>(i) : new C6363a<>(i);
        }

        /* renamed from: a */
        public int mo16357a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f17457j = true;
            return 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16399a() {
            int i;
            if (getAndIncrement() == 0) {
                C6278i<T> iVar = this.f17449b;
                C6584b<? super T> bVar = this.f17448a;
                int i2 = 1;
                while (!mo16400a(this.f17454g, iVar.isEmpty(), bVar)) {
                    long j = this.f17456i.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z = this.f17454g;
                        T poll = iVar.poll();
                        boolean z2 = poll == null;
                        if (!mo16400a(z, z2, bVar)) {
                            if (z2) {
                                break;
                            }
                            bVar.mo13389a(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !mo16400a(this.f17454g, iVar.isEmpty(), bVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f17456i.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo13388a(C6585c cVar) {
            if (C6397c.m23929a(this.f17452e, cVar)) {
                this.f17452e = cVar;
                this.f17448a.mo13388a((C6585c) this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: a */
        public void mo13389a(T t) {
            if (!this.f17449b.offer(t)) {
                this.f17452e.cancel();
                C6234c cVar = new C6234c("Buffer is full");
                try {
                    this.f17451d.run();
                } catch (Throwable th) {
                    C6233b.m23529b(th);
                    cVar.initCause(th);
                }
                mo13390a((Throwable) cVar);
            } else if (this.f17457j) {
                this.f17448a.mo13389a(null);
            } else {
                mo16399a();
            }
        }

        /* renamed from: a */
        public void mo13390a(Throwable th) {
            this.f17455h = th;
            this.f17454g = true;
            if (this.f17457j) {
                this.f17448a.mo13390a(th);
            } else {
                mo16399a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16400a(boolean z, boolean z2, C6584b<? super T> bVar) {
            if (this.f17453f) {
                this.f17449b.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f17450c) {
                    Throwable th = this.f17455h;
                    if (th != null) {
                        this.f17449b.clear();
                        bVar.mo13390a(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        bVar.mo13391c();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f17455h;
                    if (th2 != null) {
                        bVar.mo13390a(th2);
                    } else {
                        bVar.mo13391c();
                    }
                    return true;
                }
            }
        }

        /* renamed from: c */
        public void mo13391c() {
            this.f17454g = true;
            if (this.f17457j) {
                this.f17448a.mo13391c();
            } else {
                mo16399a();
            }
        }

        public void cancel() {
            if (!this.f17453f) {
                this.f17453f = true;
                this.f17452e.cancel();
                if (getAndIncrement() == 0) {
                    this.f17449b.clear();
                }
            }
        }

        public void clear() {
            this.f17449b.clear();
        }

        public boolean isEmpty() {
            return this.f17449b.isEmpty();
        }

        public T poll() {
            return this.f17449b.poll();
        }

        public void request(long j) {
            if (!this.f17457j && C6397c.m23928a(j)) {
                C6401d.m23940a(this.f17456i, j);
                mo16399a();
            }
        }
    }

    public C6308j(C6247e<T> eVar, int i, boolean z, boolean z2, C6239a aVar) {
        super(eVar);
        this.f17444c = i;
        this.f17445d = z;
        this.f17446e = z2;
        this.f17447f = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16354b(C6584b<? super T> bVar) {
        this.f17388b.mo16349a(new C6309a(bVar, this.f17444c, this.f17445d, this.f17446e, this.f17447f));
    }
}
