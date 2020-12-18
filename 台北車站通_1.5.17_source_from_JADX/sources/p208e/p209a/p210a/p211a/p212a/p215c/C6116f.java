package p208e.p209a.p210a.p211a.p212a.p215c;

import p208e.p209a.p210a.p211a.p212a.p215c.C6110e;

/* renamed from: e.a.a.a.a.c.f */
class C6116f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f17103a;

    /* renamed from: b */
    final /* synthetic */ C6110e.C6113c f17104b;

    C6116f(C6110e.C6113c cVar, Runnable runnable) {
        this.f17104b = cVar;
        this.f17103a = runnable;
    }

    public void run() {
        try {
            this.f17103a.run();
        } finally {
            this.f17104b.mo16112a();
        }
    }
}
