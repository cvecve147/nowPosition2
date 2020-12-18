package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: android.support.v7.widget.N */
class C0735N implements C0779S {
    C0735N() {
    }

    /* renamed from: j */
    private C0734Ma m3815j(C0742Q q) {
        return (C0734Ma) q.mo3443c();
    }

    /* renamed from: a */
    public float mo3559a(C0742Q q) {
        return mo3569f(q) * 2.0f;
    }

    /* renamed from: a */
    public void mo3542a() {
    }

    /* renamed from: a */
    public void mo3560a(C0742Q q, float f) {
        q.mo3444d().setElevation(f);
    }

    /* renamed from: a */
    public void mo3561a(C0742Q q, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        q.mo3440a(new C0734Ma(colorStateList, f));
        View d = q.mo3444d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo3564b(q, f3);
    }

    /* renamed from: a */
    public void mo3562a(C0742Q q, ColorStateList colorStateList) {
        m3815j(q).mo3546a(colorStateList);
    }

    /* renamed from: b */
    public void mo3563b(C0742Q q) {
        mo3564b(q, mo3565c(q));
    }

    /* renamed from: b */
    public void mo3564b(C0742Q q, float f) {
        m3815j(q).mo3545a(f, q.mo3442b(), q.mo3441a());
        mo3572i(q);
    }

    /* renamed from: c */
    public float mo3565c(C0742Q q) {
        return m3815j(q).mo3547b();
    }

    /* renamed from: c */
    public void mo3566c(C0742Q q, float f) {
        m3815j(q).mo3544a(f);
    }

    /* renamed from: d */
    public float mo3567d(C0742Q q) {
        return q.mo3444d().getElevation();
    }

    /* renamed from: e */
    public ColorStateList mo3568e(C0742Q q) {
        return m3815j(q).mo3543a();
    }

    /* renamed from: f */
    public float mo3569f(C0742Q q) {
        return m3815j(q).mo3548c();
    }

    /* renamed from: g */
    public float mo3570g(C0742Q q) {
        return mo3569f(q) * 2.0f;
    }

    /* renamed from: h */
    public void mo3571h(C0742Q q) {
        mo3564b(q, mo3565c(q));
    }

    /* renamed from: i */
    public void mo3572i(C0742Q q) {
        if (!q.mo3442b()) {
            q.mo3439a(0, 0, 0, 0);
            return;
        }
        float c = mo3565c(q);
        float f = mo3569f(q);
        int ceil = (int) Math.ceil((double) C0736Na.m3831a(c, f, q.mo3441a()));
        int ceil2 = (int) Math.ceil((double) C0736Na.m3834b(c, f, q.mo3441a()));
        q.mo3439a(ceil, ceil2, ceil, ceil2);
    }
}
