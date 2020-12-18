package p208e.p209a.p210a.p211a;

import java.util.concurrent.CountDownLatch;

/* renamed from: e.a.a.a.e */
class C6198e implements C6204j {

    /* renamed from: a */
    final CountDownLatch f17283a = new CountDownLatch(this.f17284b);

    /* renamed from: b */
    final /* synthetic */ int f17284b;

    /* renamed from: c */
    final /* synthetic */ C6199f f17285c;

    C6198e(C6199f fVar, int i) {
        this.f17285c = fVar;
        this.f17284b = i;
    }

    /* renamed from: a */
    public void mo16273a(Exception exc) {
        this.f17285c.f17292g.mo16273a(exc);
    }

    /* renamed from: a */
    public void mo16274a(Object obj) {
        this.f17283a.countDown();
        if (this.f17283a.getCount() == 0) {
            this.f17285c.f17297l.set(true);
            this.f17285c.f17292g.mo16274a(this.f17285c);
        }
    }
}
