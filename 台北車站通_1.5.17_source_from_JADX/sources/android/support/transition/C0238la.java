package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.transition.la */
class C0238la implements C0249qa {
    C0238la() {
    }

    /* renamed from: a */
    public void mo1083a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0189G.save_non_transition_alpha, (Object) null);
        }
    }

    /* renamed from: a */
    public void mo1084a(View view, float f) {
        Float f2 = (Float) view.getTag(C0189G.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public void mo1085a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }

    /* renamed from: a */
    public void mo1086a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1086a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: b */
    public void mo1087b(View view) {
        if (view.getTag(C0189G.save_non_transition_alpha) == null) {
            view.setTag(C0189G.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: b */
    public void mo1088b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1088b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: c */
    public float mo1089c(View view) {
        Float f = (Float) view.getTag(C0189G.save_non_transition_alpha);
        return f != null ? view.getAlpha() / f.floatValue() : view.getAlpha();
    }

    /* renamed from: d */
    public C0262va mo1090d(View view) {
        return new C0258ta(view.getWindowToken());
    }

    /* renamed from: e */
    public C0230ha mo1091e(View view) {
        return C0225fa.m1085c(view);
    }
}
