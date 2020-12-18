package android.support.p011v7.widget;

/* renamed from: android.support.v7.widget.Ba */
class C0704Ba implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2745a;

    C0704Ba(RecyclerView recyclerView) {
        this.f2745a = recyclerView;
    }

    public void run() {
        RecyclerView recyclerView = this.f2745a;
        if (recyclerView.f2941E && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.f2745a;
            if (!recyclerView2.f2935B) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f2947H) {
                recyclerView2.f2945G = true;
            } else {
                recyclerView2.mo3661c();
            }
        }
    }
}
