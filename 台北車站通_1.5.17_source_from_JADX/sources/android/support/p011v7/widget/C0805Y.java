package android.support.p011v7.widget;

import android.support.p011v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.widget.Y */
class C0805Y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3326a;

    /* renamed from: b */
    final /* synthetic */ C0826ea f3327b;

    C0805Y(C0826ea eaVar, ArrayList arrayList) {
        this.f3327b = eaVar;
        this.f3326a = arrayList;
    }

    public void run() {
        Iterator it = this.f3326a.iterator();
        while (it.hasNext()) {
            this.f3327b.mo4468t((RecyclerView.C0778w) it.next());
        }
        this.f3326a.clear();
        this.f3327b.f3409m.remove(this.f3326a);
    }
}
