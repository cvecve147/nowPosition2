package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.support.p007v4.view.C0487v;
import android.view.View;

/* renamed from: android.support.transition.n */
class C0241n extends AnimatorListenerAdapter {

    /* renamed from: a */
    private boolean f1052a;

    /* renamed from: b */
    final /* synthetic */ View f1053b;

    /* renamed from: c */
    final /* synthetic */ Rect f1054c;

    /* renamed from: d */
    final /* synthetic */ int f1055d;

    /* renamed from: e */
    final /* synthetic */ int f1056e;

    /* renamed from: f */
    final /* synthetic */ int f1057f;

    /* renamed from: g */
    final /* synthetic */ int f1058g;

    /* renamed from: h */
    final /* synthetic */ C0245p f1059h;

    C0241n(C0245p pVar, View view, Rect rect, int i, int i2, int i3, int i4) {
        this.f1059h = pVar;
        this.f1053b = view;
        this.f1054c = rect;
        this.f1055d = i;
        this.f1056e = i2;
        this.f1057f = i3;
        this.f1058g = i4;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1052a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f1052a) {
            C0487v.m2272a(this.f1053b, this.f1054c);
            C0236ka.m1117a(this.f1053b, this.f1055d, this.f1056e, this.f1057f, this.f1058g);
        }
    }
}
