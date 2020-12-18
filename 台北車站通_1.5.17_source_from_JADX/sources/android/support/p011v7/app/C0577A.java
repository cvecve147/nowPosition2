package android.support.p011v7.app;

import android.support.p007v4.view.C0429H;
import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0487v;

/* renamed from: android.support.v7.app.A */
class C0577A implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0584C f2085a;

    C0577A(C0584C c) {
        this.f2085a = c;
    }

    public void run() {
        C0584C c = this.f2085a;
        c.f2187A.showAtLocation(c.f2211z, 55, 0, 0);
        this.f2085a.mo2481s();
        if (this.f2085a.mo2483u()) {
            this.f2085a.f2211z.setAlpha(0.0f);
            C0584C c2 = this.f2085a;
            C0429H a = C0487v.m2264a(c2.f2211z);
            a.mo1753a(1.0f);
            c2.f2189C = a;
            this.f2085a.f2189C.mo1755a((C0431I) new C0641z(this));
            return;
        }
        this.f2085a.f2211z.setAlpha(1.0f);
        this.f2085a.f2211z.setVisibility(0);
    }
}
