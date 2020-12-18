package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.widget.TabLayout;

/* renamed from: android.support.design.widget.K */
class C0120K extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f669a;

    /* renamed from: b */
    final /* synthetic */ TabLayout.C0135d f670b;

    C0120K(TabLayout.C0135d dVar, int i) {
        this.f670b = dVar;
        this.f669a = i;
    }

    public void onAnimationEnd(Animator animator) {
        TabLayout.C0135d dVar = this.f670b;
        dVar.f738c = this.f669a;
        dVar.f739d = 0.0f;
    }
}
