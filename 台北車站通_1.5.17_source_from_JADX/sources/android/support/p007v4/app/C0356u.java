package android.support.p007v4.app;

import android.support.p007v4.app.C0360y;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: android.support.v4.app.u */
class C0356u extends C0360y.C0362b {

    /* renamed from: b */
    final /* synthetic */ ViewGroup f1486b;

    /* renamed from: c */
    final /* synthetic */ C0339l f1487c;

    /* renamed from: d */
    final /* synthetic */ C0360y f1488d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0356u(C0360y yVar, Animation.AnimationListener animationListener, ViewGroup viewGroup, C0339l lVar) {
        super(animationListener, (C0354s) null);
        this.f1488d = yVar;
        this.f1486b = viewGroup;
        this.f1487c = lVar;
    }

    public void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.f1486b.post(new C0355t(this));
    }
}
