package android.support.p011v7.widget;

import android.support.p011v7.widget.C0826ea;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.widget.X */
class C0803X implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3324a;

    /* renamed from: b */
    final /* synthetic */ C0826ea f3325b;

    C0803X(C0826ea eaVar, ArrayList arrayList) {
        this.f3325b = eaVar;
        this.f3324a = arrayList;
    }

    public void run() {
        Iterator it = this.f3324a.iterator();
        while (it.hasNext()) {
            this.f3325b.mo4464a((C0826ea.C0827a) it.next());
        }
        this.f3324a.clear();
        this.f3325b.f3411o.remove(this.f3324a);
    }
}
