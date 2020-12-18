package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.support.p007v4.view.C0487v;
import android.support.transition.C0195M;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.r */
public class C0250r extends C0254sa {

    /* renamed from: android.support.transition.r$a */
    private static class C0251a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f1093a;

        /* renamed from: b */
        private boolean f1094b = false;

        C0251a(View view) {
            this.f1093a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0236ka.m1115a(this.f1093a, 1.0f);
            if (this.f1094b) {
                this.f1093a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C0487v.m2306v(this.f1093a) && this.f1093a.getLayerType() == 0) {
                this.f1094b = true;
                this.f1093a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C0250r(int i) {
        mo1102a(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f1014a.get("android:fade:transitionAlpha");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m1171a(android.support.transition.C0208V r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f1014a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0250r.m1171a(android.support.transition.V, float):float");
    }

    /* renamed from: a */
    private Animator m1172a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0236ka.m1115a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0236ka.f1048d, new float[]{f2});
        ofFloat.addListener(new C0251a(view));
        mo974a((C0195M.C0198c) new C0248q(this, view));
        return ofFloat;
    }

    /* renamed from: a */
    public Animator mo1096a(ViewGroup viewGroup, View view, C0208V v, C0208V v2) {
        float f = 0.0f;
        float a = m1171a(v, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m1172a(view, f, 1.0f);
    }

    /* renamed from: b */
    public Animator mo1097b(ViewGroup viewGroup, View view, C0208V v, C0208V v2) {
        C0236ka.m1123e(view);
        return m1172a(view, m1171a(v, 1.0f), 0.0f);
    }

    /* renamed from: c */
    public void mo991c(C0208V v) {
        super.mo991c(v);
        v.f1014a.put("android:fade:transitionAlpha", Float.valueOf(C0236ka.m1121c(v.f1015b)));
    }
}
