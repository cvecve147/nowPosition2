package android.support.p011v7.widget;

/* renamed from: android.support.v7.widget.f */
class C0830f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f3430a;

    C0830f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3430a = actionBarOverlayLayout;
    }

    public void run() {
        this.f3430a.mo3150h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3430a;
        actionBarOverlayLayout.f2673y = actionBarOverlayLayout.f2653e.animate().translationY(0.0f).setListener(this.f3430a.f2674z);
    }
}
