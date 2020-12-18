package p208e.p221b.p228e.p238h;

import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p231c.C6270a;
import p208e.p221b.p228e.p231c.C6276g;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.h.a */
public abstract class C6391a<T, R> implements C6270a<T>, C6276g<R> {

    /* renamed from: a */
    protected final C6270a<? super R> f17735a;

    /* renamed from: b */
    protected C6585c f17736b;

    /* renamed from: c */
    protected C6276g<T> f17737c;

    /* renamed from: d */
    protected boolean f17738d;

    /* renamed from: e */
    protected int f17739e;

    public C6391a(C6270a<? super R> aVar) {
        this.f17735a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16487a() {
    }

    /* renamed from: a */
    public final void mo13388a(C6585c cVar) {
        if (C6397c.m23929a(this.f17736b, cVar)) {
            this.f17736b = cVar;
            if (cVar instanceof C6276g) {
                this.f17737c = (C6276g) cVar;
            }
            if (mo16490b()) {
                this.f17735a.mo13388a(this);
                mo16487a();
            }
        }
    }

    /* renamed from: a */
    public void mo13390a(Throwable th) {
        if (this.f17738d) {
            C6416a.m23988b(th);
            return;
        }
        this.f17738d = true;
        this.f17735a.mo13390a(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16488b(int i) {
        C6276g<T> gVar = this.f17737c;
        if (gVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = gVar.mo16357a(i);
        if (a != 0) {
            this.f17739e = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16489b(Throwable th) {
        C6233b.m23529b(th);
        this.f17736b.cancel();
        mo13390a(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo16490b() {
        return true;
    }

    /* renamed from: c */
    public void mo13391c() {
        if (!this.f17738d) {
            this.f17738d = true;
            this.f17735a.mo13391c();
        }
    }

    public void cancel() {
        this.f17736b.cancel();
    }

    public void clear() {
        this.f17737c.clear();
    }

    public boolean isEmpty() {
        return this.f17737c.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void request(long j) {
        this.f17736b.request(j);
    }
}
