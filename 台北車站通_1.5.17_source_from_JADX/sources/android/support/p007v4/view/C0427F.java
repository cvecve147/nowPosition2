package android.support.p007v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v4.view.F */
class C0427F extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0431I f1648a;

    /* renamed from: b */
    final /* synthetic */ View f1649b;

    /* renamed from: c */
    final /* synthetic */ C0429H f1650c;

    C0427F(C0429H h, C0431I i, View view) {
        this.f1650c = h;
        this.f1648a = i;
        this.f1649b = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1648a.mo1763a(this.f1649b);
    }

    public void onAnimationEnd(Animator animator) {
        this.f1648a.mo1764b(this.f1649b);
    }

    public void onAnimationStart(Animator animator) {
        this.f1648a.mo1765c(this.f1649b);
    }
}
