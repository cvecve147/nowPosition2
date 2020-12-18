package android.support.p007v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.v */
class C0357v extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f1489a;

    /* renamed from: b */
    final /* synthetic */ View f1490b;

    /* renamed from: c */
    final /* synthetic */ C0339l f1491c;

    /* renamed from: d */
    final /* synthetic */ C0360y f1492d;

    C0357v(C0360y yVar, ViewGroup viewGroup, View view, C0339l lVar) {
        this.f1492d = yVar;
        this.f1489a = viewGroup;
        this.f1490b = view;
        this.f1491c = lVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1489a.endViewTransition(this.f1490b);
        Animator f = this.f1491c.mo1387f();
        this.f1491c.mo1346a((Animator) null);
        if (f != null && this.f1489a.indexOfChild(this.f1490b) < 0) {
            C0360y yVar = this.f1492d;
            C0339l lVar = this.f1491c;
            yVar.mo1536a(lVar, lVar.mo1421y(), 0, 0, false);
        }
    }
}
