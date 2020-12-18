package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.f */
class C0224f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f1032a;

    /* renamed from: b */
    final /* synthetic */ BitmapDrawable f1033b;

    /* renamed from: c */
    final /* synthetic */ View f1034c;

    /* renamed from: d */
    final /* synthetic */ float f1035d;

    /* renamed from: e */
    final /* synthetic */ C0245p f1036e;

    C0224f(C0245p pVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
        this.f1036e = pVar;
        this.f1032a = viewGroup;
        this.f1033b = bitmapDrawable;
        this.f1034c = view;
        this.f1035d = f;
    }

    public void onAnimationEnd(Animator animator) {
        C0236ka.m1119b(this.f1032a).mo1030b(this.f1033b);
        C0236ka.m1115a(this.f1034c, this.f1035d);
    }
}
