package android.support.p011v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p011v7.widget.C0826ea;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.ca */
class C0820ca extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0826ea.C0827a f3388a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f3389b;

    /* renamed from: c */
    final /* synthetic */ View f3390c;

    /* renamed from: d */
    final /* synthetic */ C0826ea f3391d;

    C0820ca(C0826ea eaVar, C0826ea.C0827a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3391d = eaVar;
        this.f3388a = aVar;
        this.f3389b = viewPropertyAnimator;
        this.f3390c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3389b.setListener((Animator.AnimatorListener) null);
        this.f3390c.setAlpha(1.0f);
        this.f3390c.setTranslationX(0.0f);
        this.f3390c.setTranslationY(0.0f);
        this.f3391d.mo4349a(this.f3388a.f3416a, true);
        this.f3391d.f3415s.remove(this.f3388a.f3416a);
        this.f3391d.mo4467j();
    }

    public void onAnimationStart(Animator animator) {
        this.f3391d.mo4352b(this.f3388a.f3416a, true);
    }
}
