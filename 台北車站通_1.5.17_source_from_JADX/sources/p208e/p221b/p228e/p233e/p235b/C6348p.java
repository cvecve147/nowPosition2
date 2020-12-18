package p208e.p221b.p228e.p233e.p235b;

import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p231c.C6274e;
import p208e.p221b.p228e.p231c.C6279j;
import p208e.p221b.p228e.p232d.C6280a;
import p208e.p221b.p228e.p236f.C6364b;
import p208e.p221b.p228e.p237g.C6386m;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.e.b.p */
public final class C6348p<T> extends C6319a<T, T> {

    /* renamed from: b */
    final C6439r f17602b;

    /* renamed from: c */
    final boolean f17603c;

    /* renamed from: d */
    final int f17604d;

    /* renamed from: e.b.e.e.b.p$a */
    static final class C6349a<T> extends C6280a<T> implements C6438q<T>, Runnable {

        /* renamed from: a */
        final C6438q<? super T> f17605a;

        /* renamed from: b */
        final C6439r.C6442c f17606b;

        /* renamed from: c */
        final boolean f17607c;

        /* renamed from: d */
        final int f17608d;

        /* renamed from: e */
        C6279j<T> f17609e;

        /* renamed from: f */
        C6223b f17610f;

        /* renamed from: g */
        Throwable f17611g;

        /* renamed from: h */
        volatile boolean f17612h;

        /* renamed from: i */
        volatile boolean f17613i;

        /* renamed from: j */
        int f17614j;

        /* renamed from: k */
        boolean f17615k;

        C6349a(C6438q<? super T> qVar, C6439r.C6442c cVar, boolean z, int i) {
            this.f17605a = qVar;
            this.f17606b = cVar;
            this.f17607c = z;
            this.f17608d = i;
        }

        /* renamed from: a */
        public int mo16357a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f17615k = true;
            return 2;
        }

        /* renamed from: a */
        public void mo15709a() {
            if (!this.f17613i) {
                this.f17613i = true;
                this.f17610f.mo15709a();
                this.f17606b.mo15709a();
                if (getAndIncrement() == 0) {
                    this.f17609e.clear();
                }
            }
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23557a(this.f17610f, bVar)) {
                this.f17610f = bVar;
                if (bVar instanceof C6274e) {
                    C6274e eVar = (C6274e) bVar;
                    int a = eVar.mo16357a(7);
                    if (a == 1) {
                        this.f17614j = a;
                        this.f17609e = eVar;
                        this.f17612h = true;
                        this.f17605a.mo13383a((C6223b) this);
                        mo16433e();
                        return;
                    } else if (a == 2) {
                        this.f17614j = a;
                        this.f17609e = eVar;
                        this.f17605a.mo13383a((C6223b) this);
                        return;
                    }
                }
                this.f17609e = new C6364b(this.f17608d);
                this.f17605a.mo13383a((C6223b) this);
            }
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            if (!this.f17612h) {
                if (this.f17614j != 2) {
                    this.f17609e.offer(t);
                }
                mo16433e();
            }
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            if (this.f17612h) {
                C6416a.m23988b(th);
                return;
            }
            this.f17611g = th;
            this.f17612h = true;
            mo16433e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16430a(boolean z, boolean z2, C6438q<? super T> qVar) {
            if (this.f17613i) {
                this.f17609e.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f17611g;
                if (this.f17607c) {
                    if (!z2) {
                        return false;
                    }
                    if (th != null) {
                        qVar.mo13342a(th);
                    } else {
                        qVar.mo13343c();
                    }
                    this.f17606b.mo15709a();
                    return true;
                } else if (th != null) {
                    this.f17609e.clear();
                    qVar.mo13342a(th);
                    this.f17606b.mo15709a();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    qVar.mo13343c();
                    this.f17606b.mo15709a();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16431b() {
            int i = 1;
            while (!this.f17613i) {
                boolean z = this.f17612h;
                Throwable th = this.f17611g;
                if (this.f17607c || !z || th == null) {
                    this.f17605a.mo13341a(null);
                    if (z) {
                        Throwable th2 = this.f17611g;
                        if (th2 != null) {
                            this.f17605a.mo13342a(th2);
                        } else {
                            this.f17605a.mo13343c();
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    this.f17605a.mo13342a(th);
                }
                this.f17606b.mo15709a();
                return;
            }
        }

        /* renamed from: c */
        public void mo13343c() {
            if (!this.f17612h) {
                this.f17612h = true;
                mo16433e();
            }
        }

        public void clear() {
            this.f17609e.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16432d() {
            C6279j<T> jVar = this.f17609e;
            C6438q<? super T> qVar = this.f17605a;
            int i = 1;
            while (!mo16430a(this.f17612h, jVar.isEmpty(), qVar)) {
                while (true) {
                    boolean z = this.f17612h;
                    try {
                        T poll = jVar.poll();
                        boolean z2 = poll == null;
                        if (!mo16430a(z, z2, qVar)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                qVar.mo13341a(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C6233b.m23529b(th);
                        this.f17610f.mo15709a();
                        jVar.clear();
                        qVar.mo13342a(th);
                        this.f17606b.mo15709a();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo16433e() {
            if (getAndIncrement() == 0) {
                this.f17606b.mo16457a((Runnable) this);
            }
        }

        public boolean isEmpty() {
            return this.f17609e.isEmpty();
        }

        public T poll() {
            return this.f17609e.poll();
        }

        public void run() {
            if (this.f17615k) {
                mo16431b();
            } else {
                mo16432d();
            }
        }
    }

    public C6348p(C6436o<T> oVar, C6439r rVar, boolean z, int i) {
        super(oVar);
        this.f17602b = rVar;
        this.f17603c = z;
        this.f17604d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        C6439r rVar = this.f17602b;
        if (rVar instanceof C6386m) {
            this.f17483a.mo16542a(qVar);
            return;
        }
        this.f17483a.mo16542a(new C6349a(qVar, rVar.mo16319a(), this.f17603c, this.f17604d));
    }
}
