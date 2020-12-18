package android.support.p011v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.Z */
class C0808Z extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ RecyclerView.C0778w f3348a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f3349b;

    /* renamed from: c */
    final /* synthetic */ View f3350c;

    /* renamed from: d */
    final /* synthetic */ C0826ea f3351d;

    C0808Z(C0826ea eaVar, RecyclerView.C0778w wVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3351d = eaVar;
        this.f3348a = wVar;
        this.f3349b = viewPropertyAnimator;
        this.f3350c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3349b.setListener((Animator.AnimatorListener) null);
        this.f3350c.setAlpha(1.0f);
        this.f3351d.mo4361l(this.f3348a);
        this.f3351d.f3414r.remove(this.f3348a);
        this.f3351d.mo4467j();
    }

    public void onAnimationStart(Animator animator) {
        this.f3351d.mo4362m(this.f3348a);
    }
}
