package p208e.p221b.p228e.p232d;

import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.d.d */
public final class C6283d<T> extends AtomicReference<C6223b> implements C6438q<T>, C6223b {

    /* renamed from: a */
    final C6242d<? super T> f17384a;

    /* renamed from: b */
    final C6242d<? super Throwable> f17385b;

    /* renamed from: c */
    final C6239a f17386c;

    /* renamed from: d */
    final C6242d<? super C6223b> f17387d;

    public C6283d(C6242d<? super T> dVar, C6242d<? super Throwable> dVar2, C6239a aVar, C6242d<? super C6223b> dVar3) {
        this.f17384a = dVar;
        this.f17385b = dVar2;
        this.f17386c = aVar;
        this.f17387d = dVar3;
    }

    /* renamed from: a */
    public void mo15709a() {
        C6249b.m23558a((AtomicReference<C6223b>) this);
    }

    /* renamed from: a */
    public void mo13383a(C6223b bVar) {
        if (C6249b.m23562c(this, bVar)) {
            try {
                this.f17387d.accept(this);
            } catch (Throwable th) {
                C6233b.m23529b(th);
                bVar.mo15709a();
                mo13342a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo13341a(T t) {
        if (!mo16380b()) {
            try {
                this.f17384a.accept(t);
            } catch (Throwable th) {
                C6233b.m23529b(th);
                ((C6223b) get()).mo15709a();
                mo13342a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo13342a(Throwable th) {
        if (!mo16380b()) {
            lazySet(C6249b.DISPOSED);
            try {
                this.f17385b.accept(th);
            } catch (Throwable th2) {
                C6233b.m23529b(th2);
                C6416a.m23988b((Throwable) new C6228a(th, th2));
            }
        }
    }

    /* renamed from: b */
    public boolean mo16380b() {
        return get() == C6249b.DISPOSED;
    }

    /* renamed from: c */
    public void mo13343c() {
        if (!mo16380b()) {
            lazySet(C6249b.DISPOSED);
            try {
                this.f17386c.run();
            } catch (Throwable th) {
                C6233b.m23529b(th);
                C6416a.m23988b(th);
            }
        }
    }
}
