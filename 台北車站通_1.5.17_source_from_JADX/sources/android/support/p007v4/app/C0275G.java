package android.support.p007v4.app;

import android.graphics.Rect;
import android.view.View;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: android.support.v4.app.G */
class C0275G implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0339l f1181a;

    /* renamed from: b */
    final /* synthetic */ C0339l f1182b;

    /* renamed from: c */
    final /* synthetic */ boolean f1183c;

    /* renamed from: d */
    final /* synthetic */ C1080b f1184d;

    /* renamed from: e */
    final /* synthetic */ View f1185e;

    /* renamed from: f */
    final /* synthetic */ C0289S f1186f;

    /* renamed from: g */
    final /* synthetic */ Rect f1187g;

    C0275G(C0339l lVar, C0339l lVar2, boolean z, C1080b bVar, View view, C0289S s, Rect rect) {
        this.f1181a = lVar;
        this.f1182b = lVar2;
        this.f1183c = z;
        this.f1184d = bVar;
        this.f1185e = view;
        this.f1186f = s;
        this.f1187g = rect;
    }

    public void run() {
        C0277I.m1254b(this.f1181a, this.f1182b, this.f1183c, (C1080b<String, View>) this.f1184d, false);
        View view = this.f1185e;
        if (view != null) {
            this.f1186f.mo1172a(view, this.f1187g);
        }
    }
}
