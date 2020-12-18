package android.support.p011v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.ba */
class C0817ba extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ RecyclerView.C0778w f3378a;

    /* renamed from: b */
    final /* synthetic */ int f3379b;

    /* renamed from: c */
    final /* synthetic */ View f3380c;

    /* renamed from: d */
    final /* synthetic */ int f3381d;

    /* renamed from: e */
    final /* synthetic */ ViewPropertyAnimator f3382e;

    /* renamed from: f */
    final /* synthetic */ C0826ea f3383f;

    C0817ba(C0826ea eaVar, RecyclerView.C0778w wVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3383f = eaVar;
        this.f3378a = wVar;
        this.f3379b = i;
        this.f3380c = view;
        this.f3381d = i2;
        this.f3382e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f3379b != 0) {
            this.f3380c.setTranslationX(0.0f);
        }
        if (this.f3381d != 0) {
            this.f3380c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f3382e.setListener((Animator.AnimatorListener) null);
        this.f3383f.mo4359j(this.f3378a);
        this.f3383f.f3413q.remove(this.f3378a);
        this.f3383f.mo4467j();
    }

    public void onAnimationStart(Animator animator) {
        this.f3383f.mo4360k(this.f3378a);
    }
}
