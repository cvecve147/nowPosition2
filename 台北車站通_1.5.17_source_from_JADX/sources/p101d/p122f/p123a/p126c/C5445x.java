package p101d.p122f.p123a.p126c;

import java.util.Date;
import java.util.concurrent.Callable;
import p208e.p209a.p210a.p211a.p212a.p220g.C6182q;
import p208e.p209a.p210a.p211a.p212a.p220g.C6184s;
import p208e.p209a.p210a.p211a.p212a.p220g.C6188v;

/* renamed from: d.f.a.c.x */
class C5445x implements Callable<Void> {

    /* renamed from: a */
    final /* synthetic */ Date f15318a;

    /* renamed from: b */
    final /* synthetic */ Thread f15319b;

    /* renamed from: c */
    final /* synthetic */ Throwable f15320c;

    /* renamed from: d */
    final /* synthetic */ C5446y f15321d;

    C5445x(C5446y yVar, Date date, Thread thread, Throwable th) {
        this.f15321d = yVar;
        this.f15318a = date;
        this.f15319b = thread;
        this.f15320c = th;
    }

    public Void call() {
        this.f15321d.f15330i.mo14760u();
        this.f15321d.m20888a(this.f15318a, this.f15319b, this.f15320c);
        C6188v a = C6184s.m23368b().mo16254a();
        C6182q qVar = a != null ? a.f17256b : null;
        this.f15321d.mo14894a(qVar);
        this.f15321d.m20910k();
        if (qVar != null) {
            this.f15321d.mo14892a(qVar.f17245g);
        }
        if (!this.f15321d.m20901b(a)) {
            this.f15321d.m20880a(a);
        }
        return null;
    }
}
