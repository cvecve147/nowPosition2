package android.support.design.widget;

import android.support.p007v4.view.p010b.C0453a;
import android.support.p007v4.view.p010b.C0454b;
import android.support.p007v4.view.p010b.C0455c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.design.widget.a */
class C0145a {

    /* renamed from: a */
    static final Interpolator f816a = new LinearInterpolator();

    /* renamed from: b */
    static final Interpolator f817b = new C0454b();

    /* renamed from: c */
    static final Interpolator f818c = new C0453a();

    /* renamed from: d */
    static final Interpolator f819d = new C0455c();

    /* renamed from: e */
    static final Interpolator f820e = new DecelerateInterpolator();

    /* renamed from: a */
    static float m781a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    static int m782a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
