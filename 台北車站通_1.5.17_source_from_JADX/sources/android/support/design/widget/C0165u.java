package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.widget.C0167w;

/* renamed from: android.support.design.widget.u */
class C0165u extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f886a;

    /* renamed from: b */
    final /* synthetic */ C0167w.C0170c f887b;

    /* renamed from: c */
    final /* synthetic */ C0167w f888c;

    C0165u(C0167w wVar, boolean z, C0167w.C0170c cVar) {
        this.f888c = wVar;
        this.f886a = z;
        this.f887b = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f888c.f895f = 0;
        C0167w.C0170c cVar = this.f887b;
        if (cVar != null) {
            cVar.mo892a();
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f888c.f905p.mo839a(0, this.f886a);
    }
}
