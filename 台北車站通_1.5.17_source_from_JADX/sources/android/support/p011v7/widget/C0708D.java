package android.support.p011v7.widget;

import android.support.p011v7.widget.C0701B;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.widget.D */
class C0708D implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0701B.C0703b f2769a;

    C0708D(C0701B.C0703b bVar) {
        this.f2769a = bVar;
    }

    public void onGlobalLayout() {
        C0701B.C0703b bVar = this.f2769a;
        if (!bVar.mo3273b(C0701B.this)) {
            this.f2769a.dismiss();
            return;
        }
        this.f2769a.mo3274i();
        C0708D.super.mo2705v();
    }
}
