package android.support.p011v7.widget;

import android.support.p011v7.widget.RecyclerView;

/* renamed from: android.support.v7.widget.Ca */
class C0706Ca implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2751a;

    C0706Ca(RecyclerView recyclerView) {
        this.f2751a = recyclerView;
    }

    public void run() {
        RecyclerView.C0753f fVar = this.f2751a.f2963W;
        if (fVar != null) {
            fVar.mo3837i();
        }
        this.f2751a.f3001xa = false;
    }
}
