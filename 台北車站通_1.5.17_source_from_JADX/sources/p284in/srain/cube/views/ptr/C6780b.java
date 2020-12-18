package p284in.srain.cube.views.ptr;

import p284in.srain.cube.views.ptr.p286b.C6781a;

/* renamed from: in.srain.cube.views.ptr.b */
class C6780b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PtrFrameLayout f18835a;

    C6780b(PtrFrameLayout ptrFrameLayout) {
        this.f18835a = ptrFrameLayout;
    }

    public void run() {
        if (PtrFrameLayout.f18784a) {
            C6781a.m25689a(this.f18835a.f18796h, "mRefreshCompleteHook resume.");
        }
        this.f18835a.m25623a(true);
    }
}
