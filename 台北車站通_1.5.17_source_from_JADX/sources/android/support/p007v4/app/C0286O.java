package android.support.p007v4.app;

import android.support.p007v4.view.C0487v;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.O */
class C0286O implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f1230a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f1231b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f1232c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f1233d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f1234e;

    /* renamed from: f */
    final /* synthetic */ C0289S f1235f;

    C0286O(C0289S s, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1235f = s;
        this.f1230a = i;
        this.f1231b = arrayList;
        this.f1232c = arrayList2;
        this.f1233d = arrayList3;
        this.f1234e = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f1230a; i++) {
            C0487v.m2279a((View) this.f1231b.get(i), (String) this.f1232c.get(i));
            C0487v.m2279a((View) this.f1233d.get(i), (String) this.f1234e.get(i));
        }
    }
}
