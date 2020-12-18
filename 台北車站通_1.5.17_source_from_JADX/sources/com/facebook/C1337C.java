package com.facebook;

import android.util.Pair;
import com.facebook.C1343G;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.C */
class C1337C implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4745a;

    /* renamed from: b */
    final /* synthetic */ C1343G f4746b;

    C1337C(ArrayList arrayList, C1343G g) {
        this.f4745a = arrayList;
        this.f4746b = g;
    }

    public void run() {
        Iterator it = this.f4745a.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((GraphRequest.C1347b) pair.first).mo5885a((C1352H) pair.second);
        }
        for (C1343G.C1344a a : this.f4746b.mo5940g()) {
            a.mo5948a(this.f4746b);
        }
    }
}
