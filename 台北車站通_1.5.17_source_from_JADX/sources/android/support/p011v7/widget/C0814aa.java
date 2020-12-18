package android.support.p011v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.aa */
class C0814aa extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ RecyclerView.C0778w f3373a;

    /* renamed from: b */
    final /* synthetic */ View f3374b;

    /* renamed from: c */
    final /* synthetic */ ViewPropertyAnimator f3375c;

    /* renamed from: d */
    final /* synthetic */ C0826ea f3376d;

    C0814aa(C0826ea eaVar, RecyclerView.C0778w wVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3376d = eaVar;
        this.f3373a = wVar;
        this.f3374b = view;
        this.f3375c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f3374b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f3375c.setListener((Animator.AnimatorListener) null);
        this.f3376d.mo4357h(this.f3373a);
        this.f3376d.f3412p.remove(this.f3373a);
        this.f3376d.mo4467j();
    }

    public void onAnimationStart(Animator animator) {
        this.f3376d.mo4358i(this.f3373a);
    }
}
