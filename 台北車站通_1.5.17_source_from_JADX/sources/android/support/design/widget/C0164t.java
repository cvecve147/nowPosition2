package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.widget.C0167w;

/* renamed from: android.support.design.widget.t */
class C0164t extends AnimatorListenerAdapter {

    /* renamed from: a */
    private boolean f882a;

    /* renamed from: b */
    final /* synthetic */ boolean f883b;

    /* renamed from: c */
    final /* synthetic */ C0167w.C0170c f884c;

    /* renamed from: d */
    final /* synthetic */ C0167w f885d;

    C0164t(C0167w wVar, boolean z, C0167w.C0170c cVar) {
        this.f885d = wVar;
        this.f883b = z;
        this.f884c = cVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f882a = true;
    }

    public void onAnimationEnd(Animator animator) {
        C0167w wVar = this.f885d;
        wVar.f895f = 0;
        if (!this.f882a) {
            wVar.f905p.mo839a(this.f883b ? 8 : 4, this.f883b);
            C0167w.C0170c cVar = this.f884c;
            if (cVar != null) {
                cVar.mo893b();
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f885d.f905p.mo839a(0, this.f883b);
        this.f882a = false;
    }
}
