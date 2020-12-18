package p208e.p221b.p228e.p238h;

import p208e.p221b.C6417h;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p231c.C6276g;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.h.b */
public abstract class C6392b<T, R> implements C6417h<T>, C6276g<R> {

    /* renamed from: a */
    protected final C6584b<? super R> f17740a;

    /* renamed from: b */
    protected C6585c f17741b;

    /* renamed from: c */
    protected C6276g<T> f17742c;

    /* renamed from: d */
    protected boolean f17743d;

    /* renamed from: e */
    protected int f17744e;

    public C6392b(C6584b<? super R> bVar) {
        this.f17740a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16491a() {
    }

    /* renamed from: a */
    public final void mo13388a(C6585c cVar) {
        if (C6397c.m23929a(this.f17741b, cVar)) {
            this.f17741b = cVar;
            if (cVar instanceof C6276g) {
                this.f17742c = (C6276g) cVar;
            }
            if (mo16494b()) {
                this.f17740a.mo13388a((C6585c) this);
                mo16491a();
            }
        }
    }

    /* renamed from: a */
    public void mo13390a(Throwable th) {
        if (this.f17743d) {
            C6416a.m23988b(th);
            return;
        }
        this.f17743d = true;
        this.f17740a.mo13390a(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16492b(int i) {
        C6276g<T> gVar = this.f17742c;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = gVar.mo16357a(i);
        if (a != 0) {
            this.f17744e = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16493b(Throwable th) {
        C6233b.m23529b(th);
        this.f17741b.cancel();
        mo13390a(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo16494b() {
        return true;
    }

    /* renamed from: c */
    public void mo13391c() {
        if (!this.f17743d) {
            this.f17743d = true;
            this.f17740a.mo13391c();
        }
    }

    public void cancel() {
        this.f17741b.cancel();
    }

    public void clear() {
        this.f17742c.clear();
    }

    public boolean isEmpty() {
        return this.f17742c.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void request(long j) {
        this.f17741b.request(j);
    }
}
