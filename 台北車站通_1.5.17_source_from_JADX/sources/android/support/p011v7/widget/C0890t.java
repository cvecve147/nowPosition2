package android.support.p011v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p007v4.widget.C0558o;
import android.util.AttributeSet;
import android.widget.ImageView;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p043c.p044a.C1118b;

/* renamed from: android.support.v7.widget.t */
public class C0890t {

    /* renamed from: a */
    private final ImageView f3644a;

    /* renamed from: b */
    private C0821cb f3645b;

    /* renamed from: c */
    private C0821cb f3646c;

    /* renamed from: d */
    private C0821cb f3647d;

    public C0890t(ImageView imageView) {
        this.f3644a = imageView;
    }

    /* renamed from: a */
    private boolean m5073a(Drawable drawable) {
        if (this.f3647d == null) {
            this.f3647d = new C0821cb();
        }
        C0821cb cbVar = this.f3647d;
        cbVar.mo4458a();
        ColorStateList a = C0558o.m2742a(this.f3644a);
        if (a != null) {
            cbVar.f3395d = true;
            cbVar.f3392a = a;
        }
        PorterDuff.Mode b = C0558o.m2745b(this.f3644a);
        if (b != null) {
            cbVar.f3394c = true;
            cbVar.f3393b = b;
        }
        if (!cbVar.f3395d && !cbVar.f3394c) {
            return false;
        }
        C0871p.m4998a(drawable, cbVar, this.f3644a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m5074e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f3645b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4706a() {
        Drawable drawable = this.f3644a.getDrawable();
        if (drawable != null) {
            C0831fa.m4814b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m5074e() || !m5073a(drawable)) {
            C0821cb cbVar = this.f3646c;
            if (cbVar != null || (cbVar = this.f3645b) != null) {
                C0871p.m4998a(drawable, cbVar, this.f3644a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public void mo4707a(int i) {
        if (i != 0) {
            Drawable b = C1118b.m5721b(this.f3644a.getContext(), i);
            if (b != null) {
                C0831fa.m4814b(b);
            }
            this.f3644a.setImageDrawable(b);
        } else {
            this.f3644a.setImageDrawable((Drawable) null);
        }
        mo4706a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4708a(ColorStateList colorStateList) {
        if (this.f3646c == null) {
            this.f3646c = new C0821cb();
        }
        C0821cb cbVar = this.f3646c;
        cbVar.f3392a = colorStateList;
        cbVar.f3395d = true;
        mo4706a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4709a(PorterDuff.Mode mode) {
        if (this.f3646c == null) {
            this.f3646c = new C0821cb();
        }
        C0821cb cbVar = this.f3646c;
        cbVar.f3393b = mode;
        cbVar.f3394c = true;
        mo4706a();
    }

    /* renamed from: a */
    public void mo4710a(AttributeSet attributeSet, int i) {
        int g;
        C0829eb a = C0829eb.m4793a(this.f3644a.getContext(), attributeSet, C1112j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f3644a.getDrawable();
            if (!(drawable != null || (g = a.mo4486g(C1112j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C1118b.m5721b(this.f3644a.getContext(), g)) == null)) {
                this.f3644a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0831fa.m4814b(drawable);
            }
            if (a.mo4487g(C1112j.AppCompatImageView_tint)) {
                C0558o.m2743a(this.f3644a, a.mo4472a(C1112j.AppCompatImageView_tint));
            }
            if (a.mo4487g(C1112j.AppCompatImageView_tintMode)) {
                C0558o.m2744a(this.f3644a, C0831fa.m4812a(a.mo4480d(C1112j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo4474a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo4711b() {
        C0821cb cbVar = this.f3646c;
        if (cbVar != null) {
            return cbVar.f3392a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo4712c() {
        C0821cb cbVar = this.f3646c;
        if (cbVar != null) {
            return cbVar.f3393b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4713d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f3644a.getBackground() instanceof RippleDrawable);
    }
}
