package p101d.p119e.p120a;

/* renamed from: d.e.a.c */
class C5269c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5284q f14905a;

    /* renamed from: b */
    final /* synthetic */ C5270d f14906b;

    C5269c(C5270d dVar, C5284q qVar) {
        this.f14906b = dVar;
        this.f14905a = qVar;
    }

    public void run() {
        try {
            this.f14906b.f14909c.put(this.f14905a);
        } catch (InterruptedException unused) {
        }
    }
}
