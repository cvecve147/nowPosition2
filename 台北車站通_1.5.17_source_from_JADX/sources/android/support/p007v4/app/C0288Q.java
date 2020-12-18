package android.support.p007v4.app;

import android.support.p007v4.view.C0487v;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: android.support.v4.app.Q */
class C0288Q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f1239a;

    /* renamed from: b */
    final /* synthetic */ Map f1240b;

    /* renamed from: c */
    final /* synthetic */ C0289S f1241c;

    C0288Q(C0289S s, ArrayList arrayList, Map map) {
        this.f1241c = s;
        this.f1239a = arrayList;
        this.f1240b = map;
    }

    public void run() {
        int size = this.f1239a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1239a.get(i);
            C0487v.m2279a(view, (String) this.f1240b.get(C0487v.m2299o(view)));
        }
    }
}
