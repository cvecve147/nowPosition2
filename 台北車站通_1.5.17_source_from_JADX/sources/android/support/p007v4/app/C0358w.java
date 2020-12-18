package android.support.p007v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.w */
class C0358w extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f1493a;

    /* renamed from: b */
    final /* synthetic */ View f1494b;

    /* renamed from: c */
    final /* synthetic */ C0339l f1495c;

    /* renamed from: d */
    final /* synthetic */ C0360y f1496d;

    C0358w(C0360y yVar, ViewGroup viewGroup, View view, C0339l lVar) {
        this.f1496d = yVar;
        this.f1493a = viewGroup;
        this.f1494b = view;
        this.f1495c = lVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1493a.endViewTransition(this.f1494b);
        animator.removeListener(this);
        View view = this.f1495c.f1406K;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
