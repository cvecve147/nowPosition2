package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.transition.ra */
class C0252ra extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0212Z f1095a;

    /* renamed from: b */
    final /* synthetic */ View f1096b;

    /* renamed from: c */
    final /* synthetic */ C0254sa f1097c;

    C0252ra(C0254sa saVar, C0212Z z, View view) {
        this.f1097c = saVar;
        this.f1095a = z;
        this.f1096b = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1095a.mo1028b(this.f1096b);
    }
}
