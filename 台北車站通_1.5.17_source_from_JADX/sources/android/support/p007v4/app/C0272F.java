package android.support.p007v4.app;

import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.F */
class C0272F implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f1142a;

    /* renamed from: b */
    final /* synthetic */ C0289S f1143b;

    /* renamed from: c */
    final /* synthetic */ View f1144c;

    /* renamed from: d */
    final /* synthetic */ C0339l f1145d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f1146e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f1147f;

    /* renamed from: g */
    final /* synthetic */ ArrayList f1148g;

    /* renamed from: h */
    final /* synthetic */ Object f1149h;

    C0272F(Object obj, C0289S s, View view, C0339l lVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f1142a = obj;
        this.f1143b = s;
        this.f1144c = view;
        this.f1145d = lVar;
        this.f1146e = arrayList;
        this.f1147f = arrayList2;
        this.f1148g = arrayList3;
        this.f1149h = obj2;
    }

    public void run() {
        Object obj = this.f1142a;
        if (obj != null) {
            this.f1143b.mo961b(obj, this.f1144c);
            this.f1147f.addAll(C0277I.m1252b(this.f1143b, this.f1142a, this.f1145d, (ArrayList<View>) this.f1146e, this.f1144c));
        }
        if (this.f1148g != null) {
            if (this.f1149h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f1144c);
                this.f1143b.mo957a(this.f1149h, (ArrayList<View>) this.f1148g, (ArrayList<View>) arrayList);
            }
            this.f1148g.clear();
            this.f1148g.add(this.f1144c);
        }
    }
}
