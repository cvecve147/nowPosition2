package android.support.p011v7.app;

/* renamed from: android.support.v7.app.v */
class C0637v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0584C f2383a;

    C0637v(C0584C c) {
        this.f2383a = c;
    }

    public void run() {
        C0584C c = this.f2383a;
        if ((c.f2201O & 1) != 0) {
            c.mo2471e(0);
        }
        C0584C c2 = this.f2383a;
        if ((c2.f2201O & SVGParser.ENTITY_WATCH_BUFFER_SIZE) != 0) {
            c2.mo2471e(108);
        }
        C0584C c3 = this.f2383a;
        c3.f2200N = false;
        c3.f2201O = 0;
    }
}
