package android.support.p011v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.Qa */
class C0743Qa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f2903a;

    /* renamed from: b */
    final /* synthetic */ C0744Ra f2904b;

    C0743Qa(C0744Ra ra, View view) {
        this.f2904b = ra;
        this.f2903a = view;
    }

    public void run() {
        this.f2904b.smoothScrollTo(this.f2903a.getLeft() - ((this.f2904b.getWidth() - this.f2903a.getWidth()) / 2), 0);
        this.f2904b.f2906b = null;
    }
}
