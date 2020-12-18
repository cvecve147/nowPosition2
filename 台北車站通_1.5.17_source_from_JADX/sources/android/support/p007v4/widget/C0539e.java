package android.support.p007v4.widget;

import android.animation.Animator;
import android.support.p007v4.widget.C0540f;

/* renamed from: android.support.v4.widget.e */
class C0539e implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C0540f.C0541a f2016a;

    /* renamed from: b */
    final /* synthetic */ C0540f f2017b;

    C0539e(C0540f fVar, C0540f.C0541a aVar) {
        this.f2017b = fVar;
        this.f2016a = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        this.f2017b.m2667a(1.0f, this.f2016a, true);
        this.f2016a.mo2345l();
        this.f2016a.mo2343j();
        if (this.f2017b.f2026i) {
            boolean unused = this.f2017b.f2026i = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.f2016a.mo2326a(false);
            return;
        }
        C0540f fVar = this.f2017b;
        float unused2 = fVar.f2025h = fVar.f2025h + 1.0f;
    }

    public void onAnimationStart(Animator animator) {
        float unused = this.f2017b.f2025h = 0.0f;
    }
}
