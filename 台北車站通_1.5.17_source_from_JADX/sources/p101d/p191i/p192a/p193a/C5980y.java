package p101d.p191i.p192a.p193a;

import android.os.Handler;

/* renamed from: d.i.a.a.y */
class C5980y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Boolean f16607a;

    /* renamed from: b */
    final /* synthetic */ Boolean f16608b;

    /* renamed from: c */
    final /* synthetic */ Handler f16609c;

    /* renamed from: d */
    final /* synthetic */ C5934B f16610d;

    C5980y(C5934B b, Boolean bool, Boolean bool2, Handler handler) {
        this.f16610d = b;
        this.f16607a = bool;
        this.f16608b = bool2;
        this.f16609c = handler;
    }

    public void run() {
        if (this.f16607a.booleanValue()) {
            this.f16610d.m22473c();
        }
        if (this.f16608b.booleanValue()) {
            this.f16610d.m22475d();
        }
        if (this.f16610d.f16441f.booleanValue()) {
            this.f16609c.postDelayed(this, (long) this.f16610d.f16442g.intValue());
        }
    }
}
