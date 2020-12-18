package p208e.p221b.p228e.p238h;

import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6417h;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.h.c */
public final class C6393c<T> extends AtomicReference<C6585c> implements C6417h<T>, C6585c, C6223b {

    /* renamed from: a */
    final C6242d<? super T> f17745a;

    /* renamed from: b */
    final C6242d<? super Throwable> f17746b;

    /* renamed from: c */
    final C6239a f17747c;

    /* renamed from: d */
    final C6242d<? super C6585c> f17748d;

    public C6393c(C6242d<? super T> dVar, C6242d<? super Throwable> dVar2, C6239a aVar, C6242d<? super C6585c> dVar3) {
        this.f17745a = dVar;
        this.f17746b = dVar2;
        this.f17747c = aVar;
        this.f17748d = dVar3;
    }

    /* renamed from: a */
    public void mo15709a() {
        cancel();
    }

    /* renamed from: a */
    public void mo13388a(C6585c cVar) {
        if (C6397c.m23931a((AtomicReference<C6585c>) this, cVar)) {
            try {
                this.f17748d.accept(this);
            } catch (Throwable th) {
                C6233b.m23529b(th);
                cVar.cancel();
                mo13390a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo13389a(T t) {
        if (!mo16495b()) {
            try {
                this.f17745a.accept(t);
            } catch (Throwable th) {
                C6233b.m23529b(th);
                ((C6585c) get()).cancel();
                mo13390a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo13390a(Throwable th) {
        Object obj = get();
        C6397c cVar = C6397c.CANCELLED;
        if (obj != cVar) {
            lazySet(cVar);
            try {
                this.f17746b.accept(th);
            } catch (Throwable th2) {
                C6233b.m23529b(th2);
                C6416a.m23988b((Throwable) new C6228a(th, th2));
            }
        } else {
            C6416a.m23988b(th);
        }
    }

    /* renamed from: b */
    public boolean mo16495b() {
        return get() == C6397c.CANCELLED;
    }

    /* renamed from: c */
    public void mo13391c() {
        Object obj = get();
        C6397c cVar = C6397c.CANCELLED;
        if (obj != cVar) {
            lazySet(cVar);
            try {
                this.f17747c.run();
            } catch (Throwable th) {
                C6233b.m23529b(th);
                C6416a.m23988b(th);
            }
        }
    }

    public void cancel() {
        C6397c.m23930a((AtomicReference<C6585c>) this);
    }

    public void request(long j) {
        ((C6585c) get()).request(j);
    }
}
