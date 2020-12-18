package android.support.p011v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.sa */
class C0886sa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0896ua f3636a;

    C0886sa(C0896ua uaVar) {
        this.f3636a = uaVar;
    }

    public void run() {
        View b = this.f3636a.mo4747b();
        if (b != null && b.getWindowToken() != null) {
            this.f3636a.mo2705v();
        }
    }
}
