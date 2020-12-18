package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: android.support.v7.widget.P */
class C0740P implements C0779S {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RectF f2902a = new RectF();

    C0740P() {
    }

    /* renamed from: a */
    private C0736Na m3861a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0736Na(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: j */
    private C0736Na m3862j(C0742Q q) {
        return (C0736Na) q.mo3443c();
    }

    /* renamed from: a */
    public float mo3559a(C0742Q q) {
        return m3862j(q).mo3582d();
    }

    /* renamed from: a */
    public void mo3542a() {
        C0736Na.f2876b = new C0738O(this);
    }

    /* renamed from: a */
    public void mo3560a(C0742Q q, float f) {
        m3862j(q).mo3581c(f);
    }

    /* renamed from: a */
    public void mo3561a(C0742Q q, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0736Na a = m3861a(context, colorStateList, f, f2, f3);
        a.mo3577a(q.mo3441a());
        q.mo3440a(a);
        mo3600i(q);
    }

    /* renamed from: a */
    public void mo3562a(C0742Q q, ColorStateList colorStateList) {
        m3862j(q).mo3575a(colorStateList);
    }

    /* renamed from: b */
    public void mo3563b(C0742Q q) {
        m3862j(q).mo3577a(q.mo3441a());
        mo3600i(q);
    }

    /* renamed from: b */
    public void mo3564b(C0742Q q, float f) {
        m3862j(q).mo3579b(f);
        mo3600i(q);
    }

    /* renamed from: c */
    public float mo3565c(C0742Q q) {
        return m3862j(q).mo3580c();
    }

    /* renamed from: c */
    public void mo3566c(C0742Q q, float f) {
        m3862j(q).mo3574a(f);
        mo3600i(q);
    }

    /* renamed from: d */
    public float mo3567d(C0742Q q) {
        return m3862j(q).mo3585f();
    }

    /* renamed from: e */
    public ColorStateList mo3568e(C0742Q q) {
        return m3862j(q).mo3573a();
    }

    /* renamed from: f */
    public float mo3569f(C0742Q q) {
        return m3862j(q).mo3578b();
    }

    /* renamed from: g */
    public float mo3570g(C0742Q q) {
        return m3862j(q).mo3584e();
    }

    /* renamed from: h */
    public void mo3571h(C0742Q q) {
    }

    /* renamed from: i */
    public void mo3600i(C0742Q q) {
        Rect rect = new Rect();
        m3862j(q).mo3576a(rect);
        q.mo3438a((int) Math.ceil((double) mo3570g(q)), (int) Math.ceil((double) mo3559a(q)));
        q.mo3439a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
