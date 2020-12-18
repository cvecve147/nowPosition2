package android.support.p007v4.app;

import android.support.p007v4.view.C0487v;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: android.support.v4.app.P */
class C0287P implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f1236a;

    /* renamed from: b */
    final /* synthetic */ Map f1237b;

    /* renamed from: c */
    final /* synthetic */ C0289S f1238c;

    C0287P(C0289S s, ArrayList arrayList, Map map) {
        this.f1238c = s;
        this.f1236a = arrayList;
        this.f1237b = map;
    }

    public void run() {
        int size = this.f1236a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1236a.get(i);
            String o = C0487v.m2299o(view);
            if (o != null) {
                C0487v.m2279a(view, C0289S.m1282a((Map<String, String>) this.f1237b, o));
            }
        }
    }
}
