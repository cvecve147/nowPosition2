package android.support.p007v4.app;

import android.graphics.Rect;
import android.support.p007v4.app.C0277I;
import android.view.View;
import java.util.ArrayList;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: android.support.v4.app.H */
class C0276H implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0289S f1188a;

    /* renamed from: b */
    final /* synthetic */ C1080b f1189b;

    /* renamed from: c */
    final /* synthetic */ Object f1190c;

    /* renamed from: d */
    final /* synthetic */ C0277I.C0278a f1191d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f1192e;

    /* renamed from: f */
    final /* synthetic */ View f1193f;

    /* renamed from: g */
    final /* synthetic */ C0339l f1194g;

    /* renamed from: h */
    final /* synthetic */ C0339l f1195h;

    /* renamed from: i */
    final /* synthetic */ boolean f1196i;

    /* renamed from: j */
    final /* synthetic */ ArrayList f1197j;

    /* renamed from: k */
    final /* synthetic */ Object f1198k;

    /* renamed from: l */
    final /* synthetic */ Rect f1199l;

    C0276H(C0289S s, C1080b bVar, Object obj, C0277I.C0278a aVar, ArrayList arrayList, View view, C0339l lVar, C0339l lVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f1188a = s;
        this.f1189b = bVar;
        this.f1190c = obj;
        this.f1191d = aVar;
        this.f1192e = arrayList;
        this.f1193f = view;
        this.f1194g = lVar;
        this.f1195h = lVar2;
        this.f1196i = z;
        this.f1197j = arrayList2;
        this.f1198k = obj2;
        this.f1199l = rect;
    }

    public void run() {
        C1080b a = C0277I.m1249b(this.f1188a, (C1080b<String, String>) this.f1189b, this.f1190c, this.f1191d);
        if (a != null) {
            this.f1192e.addAll(a.values());
            this.f1192e.add(this.f1193f);
        }
        C0277I.m1254b(this.f1194g, this.f1195h, this.f1196i, (C1080b<String, View>) a, false);
        Object obj = this.f1190c;
        if (obj != null) {
            this.f1188a.mo963b(obj, (ArrayList<View>) this.f1197j, (ArrayList<View>) this.f1192e);
            View a2 = C0277I.m1248b((C1080b<String, View>) a, this.f1191d, this.f1198k, this.f1196i);
            if (a2 != null) {
                this.f1188a.mo1172a(a2, this.f1199l);
            }
        }
    }
}
