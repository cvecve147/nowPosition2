package p101d.p191i.p192a.p193a;

import p101d.p191i.p192a.p193a.C5942H;

/* renamed from: d.i.a.a.G */
class C5941G implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5942H.C5943a f16461a;

    C5941G(C5942H.C5943a aVar) {
        this.f16461a = aVar;
    }

    public void run() {
        do {
            C5942H.m22507e();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (C5942H.f16473l != 15);
        C5942H.m22511i();
    }
}
