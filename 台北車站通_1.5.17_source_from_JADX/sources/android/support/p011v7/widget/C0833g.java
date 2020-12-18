package android.support.p011v7.widget;

/* renamed from: android.support.v7.widget.g */
class C0833g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f3434a;

    C0833g(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3434a = actionBarOverlayLayout;
    }

    public void run() {
        this.f3434a.mo3150h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3434a;
        actionBarOverlayLayout.f2673y = actionBarOverlayLayout.f2653e.animate().translationY((float) (-this.f3434a.f2653e.getHeight())).setListener(this.f3434a.f2674z);
    }
}
