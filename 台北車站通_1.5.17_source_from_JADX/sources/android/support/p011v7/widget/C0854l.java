package android.support.p011v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.l */
class C0854l {

    /* renamed from: a */
    private final View f3511a;

    /* renamed from: b */
    private final C0871p f3512b;

    /* renamed from: c */
    private int f3513c = -1;

    /* renamed from: d */
    private C0821cb f3514d;

    /* renamed from: e */
    private C0821cb f3515e;

    /* renamed from: f */
    private C0821cb f3516f;

    C0854l(View view) {
        this.f3511a = view;
        this.f3512b = C0871p.m4995a();
    }

    /* renamed from: b */
    private boolean m4904b(Drawable drawable) {
        if (this.f3516f == null) {
            this.f3516f = new C0821cb();
        }
        C0821cb cbVar = this.f3516f;
        cbVar.mo4458a();
        ColorStateList b = C0487v.m2281b(this.f3511a);
        if (b != null) {
            cbVar.f3395d = true;
            cbVar.f3392a = b;
        }
        PorterDuff.Mode c = C0487v.m2285c(this.f3511a);
        if (c != null) {
            cbVar.f3394c = true;
            cbVar.f3393b = c;
        }
        if (!cbVar.f3395d && !cbVar.f3394c) {
            return false;
        }
        C0871p.m4998a(drawable, cbVar, this.f3511a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m4905d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3514d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4558a() {
        Drawable background = this.f3511a.getBackground();
        if (background == null) {
            return;
        }
        if (!m4905d() || !m4904b(background)) {
            C0821cb cbVar = this.f3515e;
            if (cbVar != null || (cbVar = this.f3514d) != null) {
                C0871p.m4998a(background, cbVar, this.f3511a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4559a(int i) {
        this.f3513c = i;
        C0871p pVar = this.f3512b;
        mo4560a(pVar != null ? pVar.mo4628b(this.f3511a.getContext(), i) : null);
        mo4558a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4560a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3514d == null) {
                this.f3514d = new C0821cb();
            }
            C0821cb cbVar = this.f3514d;
            cbVar.f3392a = colorStateList;
            cbVar.f3395d = true;
        } else {
            this.f3514d = null;
        }
        mo4558a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4561a(PorterDuff.Mode mode) {
        if (this.f3515e == null) {
            this.f3515e = new C0821cb();
        }
        C0821cb cbVar = this.f3515e;
        cbVar.f3393b = mode;
        cbVar.f3394c = true;
        mo4558a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4562a(Drawable drawable) {
        this.f3513c = -1;
        mo4560a((ColorStateList) null);
        mo4558a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4563a(AttributeSet attributeSet, int i) {
        C0829eb a = C0829eb.m4793a(this.f3511a.getContext(), attributeSet, C1112j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo4487g(C1112j.ViewBackgroundHelper_android_background)) {
                this.f3513c = a.mo4486g(C1112j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f3512b.mo4628b(this.f3511a.getContext(), this.f3513c);
                if (b != null) {
                    mo4560a(b);
                }
            }
            if (a.mo4487g(C1112j.ViewBackgroundHelper_backgroundTint)) {
                C0487v.m2270a(this.f3511a, a.mo4472a(C1112j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo4487g(C1112j.ViewBackgroundHelper_backgroundTintMode)) {
                C0487v.m2271a(this.f3511a, C0831fa.m4812a(a.mo4480d(C1112j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo4474a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo4564b() {
        C0821cb cbVar = this.f3515e;
        if (cbVar != null) {
            return cbVar.f3392a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4565b(ColorStateList colorStateList) {
        if (this.f3515e == null) {
            this.f3515e = new C0821cb();
        }
        C0821cb cbVar = this.f3515e;
        cbVar.f3392a = colorStateList;
        cbVar.f3395d = true;
        mo4558a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo4566c() {
        C0821cb cbVar = this.f3515e;
        if (cbVar != null) {
            return cbVar.f3393b;
        }
        return null;
    }
}
