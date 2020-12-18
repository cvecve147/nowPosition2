package android.support.design.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.F */
final class C0112F {

    /* renamed from: a */
    private final ArrayList<C0113a> f635a = new ArrayList<>();

    /* renamed from: b */
    private C0113a f636b = null;

    /* renamed from: c */
    ValueAnimator f637c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f638d = new C0111E(this);

    /* renamed from: android.support.design.widget.F$a */
    static class C0113a {

        /* renamed from: a */
        final int[] f639a;

        /* renamed from: b */
        final ValueAnimator f640b;

        C0113a(int[] iArr, ValueAnimator valueAnimator) {
            this.f639a = iArr;
            this.f640b = valueAnimator;
        }
    }

    C0112F() {
    }

    /* renamed from: a */
    private void m609a(C0113a aVar) {
        this.f637c = aVar.f640b;
        this.f637c.start();
    }

    /* renamed from: b */
    private void m610b() {
        ValueAnimator valueAnimator = this.f637c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f637c = null;
        }
    }

    /* renamed from: a */
    public void mo621a() {
        ValueAnimator valueAnimator = this.f637c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f637c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo622a(int[] iArr) {
        C0113a aVar;
        int size = this.f635a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f635a.get(i);
            if (StateSet.stateSetMatches(aVar.f639a, iArr)) {
                break;
            }
            i++;
        }
        C0113a aVar2 = this.f636b;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                m610b();
            }
            this.f636b = aVar;
            if (aVar != null) {
                m609a(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo623a(int[] iArr, ValueAnimator valueAnimator) {
        C0113a aVar = new C0113a(iArr, valueAnimator);
        valueAnimator.addListener(this.f638d);
        this.f635a.add(aVar);
    }
}
