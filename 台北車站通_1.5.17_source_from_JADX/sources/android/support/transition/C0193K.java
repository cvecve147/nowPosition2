package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: android.support.transition.K */
class C0193K extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C1080b f956a;

    /* renamed from: b */
    final /* synthetic */ C0195M f957b;

    C0193K(C0195M m, C1080b bVar) {
        this.f957b = m;
        this.f956a = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f956a.remove(animator);
        this.f957b.f962A.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f957b.f962A.add(animator);
    }
}
