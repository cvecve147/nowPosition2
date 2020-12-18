package android.support.p011v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p011v7.widget.C0826ea;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.da */
class C0823da extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0826ea.C0827a f3398a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f3399b;

    /* renamed from: c */
    final /* synthetic */ View f3400c;

    /* renamed from: d */
    final /* synthetic */ C0826ea f3401d;

    C0823da(C0826ea eaVar, C0826ea.C0827a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3401d = eaVar;
        this.f3398a = aVar;
        this.f3399b = viewPropertyAnimator;
        this.f3400c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3399b.setListener((Animator.AnimatorListener) null);
        this.f3400c.setAlpha(1.0f);
        this.f3400c.setTranslationX(0.0f);
        this.f3400c.setTranslationY(0.0f);
        this.f3401d.mo4349a(this.f3398a.f3417b, false);
        this.f3401d.f3415s.remove(this.f3398a.f3417b);
        this.f3401d.mo4467j();
    }

    public void onAnimationStart(Animator animator) {
        this.f3401d.mo4352b(this.f3398a.f3417b, false);
    }
}
