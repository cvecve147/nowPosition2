package p208e.p221b.p228e.p232d;

import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.d.c */
public final class C6282c<T> implements C6438q<T>, C6223b {

    /* renamed from: a */
    final C6438q<? super T> f17380a;

    /* renamed from: b */
    final C6242d<? super C6223b> f17381b;

    /* renamed from: c */
    final C6239a f17382c;

    /* renamed from: d */
    C6223b f17383d;

    public C6282c(C6438q<? super T> qVar, C6242d<? super C6223b> dVar, C6239a aVar) {
        this.f17380a = qVar;
        this.f17381b = dVar;
        this.f17382c = aVar;
    }

    /* renamed from: a */
    public void mo15709a() {
        try {
            this.f17382c.run();
        } catch (Throwable th) {
            C6233b.m23529b(th);
            C6416a.m23988b(th);
        }
        this.f17383d.mo15709a();
    }

    /* renamed from: a */
    public void mo13383a(C6223b bVar) {
        try {
            this.f17381b.accept(bVar);
            if (C6249b.m23557a(this.f17383d, bVar)) {
                this.f17383d = bVar;
                this.f17380a.mo13383a((C6223b) this);
            }
        } catch (Throwable th) {
            C6233b.m23529b(th);
            bVar.mo15709a();
            this.f17383d = C6249b.DISPOSED;
            C6250c.m23566a(th, this.f17380a);
        }
    }

    /* renamed from: a */
    public void mo13341a(T t) {
        this.f17380a.mo13341a(t);
    }

    /* renamed from: a */
    public void mo13342a(Throwable th) {
        if (this.f17383d != C6249b.DISPOSED) {
            this.f17380a.mo13342a(th);
        } else {
            C6416a.m23988b(th);
        }
    }

    /* renamed from: c */
    public void mo13343c() {
        if (this.f17383d != C6249b.DISPOSED) {
            this.f17380a.mo13343c();
        }
    }
}
