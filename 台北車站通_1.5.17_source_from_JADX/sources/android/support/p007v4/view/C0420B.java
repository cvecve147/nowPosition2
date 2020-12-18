package android.support.p007v4.view;

/* renamed from: android.support.v4.view.B */
class C0420B implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewPager f1644a;

    C0420B(ViewPager viewPager) {
        this.f1644a = viewPager;
    }

    public void run() {
        this.f1644a.setScrollState(0);
        this.f1644a.mo1821h();
    }
}
