package android.support.p011v7.widget;

import android.support.p011v7.widget.C0826ea;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.widget.W */
class C0801W implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f3322a;

    /* renamed from: b */
    final /* synthetic */ C0826ea f3323b;

    C0801W(C0826ea eaVar, ArrayList arrayList) {
        this.f3323b = eaVar;
        this.f3322a = arrayList;
    }

    public void run() {
        Iterator it = this.f3322a.iterator();
        while (it.hasNext()) {
            C0826ea.C0828b bVar = (C0826ea.C0828b) it.next();
            this.f3323b.mo4466b(bVar.f3422a, bVar.f3423b, bVar.f3424c, bVar.f3425d, bVar.f3426e);
        }
        this.f3322a.clear();
        this.f3323b.f3410n.remove(this.f3322a);
    }
}
