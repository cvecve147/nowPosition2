package android.support.p011v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.widget.C0535b;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p013b.p018b.p028h.p029a.p030a.C1014d;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.G */
class C0714G {

    /* renamed from: a */
    final TextView f2778a;

    /* renamed from: b */
    private C0821cb f2779b;

    /* renamed from: c */
    private C0821cb f2780c;

    /* renamed from: d */
    private C0821cb f2781d;

    /* renamed from: e */
    private C0821cb f2782e;

    /* renamed from: f */
    private final C0723J f2783f;

    /* renamed from: g */
    private int f2784g = 0;

    /* renamed from: h */
    private Typeface f2785h;

    /* renamed from: i */
    private boolean f2786i;

    C0714G(TextView textView) {
        this.f2778a = textView;
        this.f2783f = new C0723J(this.f2778a);
    }

    /* renamed from: a */
    static C0714G m3577a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new C0719H(textView) : new C0714G(textView);
    }

    /* renamed from: a */
    protected static C0821cb m3578a(Context context, C0871p pVar, int i) {
        ColorStateList b = pVar.mo4628b(context, i);
        if (b == null) {
            return null;
        }
        C0821cb cbVar = new C0821cb();
        cbVar.f3395d = true;
        cbVar.f3392a = b;
        return cbVar;
    }

    /* renamed from: a */
    private void m3579a(Context context, C0829eb ebVar) {
        String d;
        Typeface typeface;
        this.f2784g = ebVar.mo4480d(C1112j.TextAppearance_android_textStyle, this.f2784g);
        boolean z = false;
        if (ebVar.mo4487g(C1112j.TextAppearance_android_fontFamily) || ebVar.mo4487g(C1112j.TextAppearance_fontFamily)) {
            this.f2785h = null;
            int i = ebVar.mo4487g(C1112j.TextAppearance_fontFamily) ? C1112j.TextAppearance_fontFamily : C1112j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.f2785h = ebVar.mo4473a(i, this.f2784g, (C1014d.C1015a) new C0712F(this, new WeakReference(this.f2778a)));
                    if (this.f2785h == null) {
                        z = true;
                    }
                    this.f2786i = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2785h == null && (d = ebVar.mo4481d(i)) != null) {
                this.f2785h = Typeface.create(d, this.f2784g);
            }
        } else if (ebVar.mo4487g(C1112j.TextAppearance_android_typeface)) {
            this.f2786i = false;
            int d2 = ebVar.mo4480d(C1112j.TextAppearance_android_typeface, 1);
            if (d2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (d2 == 2) {
                typeface = Typeface.SERIF;
            } else if (d2 == 3) {
                typeface = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f2785h = typeface;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3581a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2786i) {
            this.f2785h = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f2784g);
            }
        }
    }

    /* renamed from: b */
    private void m3582b(int i, float f) {
        this.f2783f.mo3425a(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3340a() {
        if (this.f2779b != null || this.f2780c != null || this.f2781d != null || this.f2782e != null) {
            Drawable[] compoundDrawables = this.f2778a.getCompoundDrawables();
            mo3345a(compoundDrawables[0], this.f2779b);
            mo3345a(compoundDrawables[1], this.f2780c);
            mo3345a(compoundDrawables[2], this.f2781d);
            mo3345a(compoundDrawables[3], this.f2782e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3341a(int i) {
        this.f2783f.mo3424a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3342a(int i, float f) {
        if (!C0535b.f2008a && !mo3356h()) {
            m3582b(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3343a(int i, int i2, int i3, int i4) {
        this.f2783f.mo3426a(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3344a(Context context, int i) {
        ColorStateList a;
        C0829eb a2 = C0829eb.m4791a(context, i, C1112j.TextAppearance);
        if (a2.mo4487g(C1112j.TextAppearance_textAllCaps)) {
            mo3347a(a2.mo4475a(C1112j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.mo4487g(C1112j.TextAppearance_android_textColor) && (a = a2.mo4472a(C1112j.TextAppearance_android_textColor)) != null) {
            this.f2778a.setTextColor(a);
        }
        m3579a(context, a2);
        a2.mo4474a();
        Typeface typeface = this.f2785h;
        if (typeface != null) {
            this.f2778a.setTypeface(typeface, this.f2784g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3345a(Drawable drawable, C0821cb cbVar) {
        if (drawable != null && cbVar != null) {
            C0871p.m4998a(drawable, cbVar, this.f2778a.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo3346a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.f2778a.getContext();
        C0871p a = C0871p.m4995a();
        C0829eb a2 = C0829eb.m4793a(context, attributeSet, C1112j.AppCompatTextHelper, i, 0);
        int g = a2.mo4486g(C1112j.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo4487g(C1112j.AppCompatTextHelper_android_drawableLeft)) {
            this.f2779b = m3578a(context, a, a2.mo4486g(C1112j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo4487g(C1112j.AppCompatTextHelper_android_drawableTop)) {
            this.f2780c = m3578a(context, a, a2.mo4486g(C1112j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo4487g(C1112j.AppCompatTextHelper_android_drawableRight)) {
            this.f2781d = m3578a(context, a, a2.mo4486g(C1112j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo4487g(C1112j.AppCompatTextHelper_android_drawableBottom)) {
            this.f2782e = m3578a(context, a, a2.mo4486g(C1112j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a2.mo4474a();
        boolean z3 = this.f2778a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            C0829eb a3 = C0829eb.m4791a(context, g, C1112j.TextAppearance);
            if (z3 || !a3.mo4487g(C1112j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo4475a(C1112j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m3579a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList a4 = a3.mo4487g(C1112j.TextAppearance_android_textColor) ? a3.mo4472a(C1112j.TextAppearance_android_textColor) : null;
                colorStateList = a3.mo4487g(C1112j.TextAppearance_android_textColorHint) ? a3.mo4472a(C1112j.TextAppearance_android_textColorHint) : null;
                if (a3.mo4487g(C1112j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = a3.mo4472a(C1112j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList4 = a4;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.mo4474a();
        } else {
            z2 = false;
            z = false;
            colorStateList2 = null;
            colorStateList = null;
        }
        C0829eb a5 = C0829eb.m4793a(context, attributeSet, C1112j.TextAppearance, i, 0);
        if (z3 || !a5.mo4487g(C1112j.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = a5.mo4475a(C1112j.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a5.mo4487g(C1112j.TextAppearance_android_textColor)) {
                colorStateList3 = a5.mo4472a(C1112j.TextAppearance_android_textColor);
            }
            if (a5.mo4487g(C1112j.TextAppearance_android_textColorHint)) {
                colorStateList = a5.mo4472a(C1112j.TextAppearance_android_textColorHint);
            }
            if (a5.mo4487g(C1112j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a5.mo4472a(C1112j.TextAppearance_android_textColorLink);
            }
        }
        m3579a(context, a5);
        a5.mo4474a();
        if (colorStateList3 != null) {
            this.f2778a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f2778a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f2778a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            mo3347a(z);
        }
        Typeface typeface = this.f2785h;
        if (typeface != null) {
            this.f2778a.setTypeface(typeface, this.f2784g);
        }
        this.f2783f.mo3427a(attributeSet, i);
        if (C0535b.f2008a && this.f2783f.mo3433f() != 0) {
            int[] e = this.f2783f.mo3432e();
            if (e.length <= 0) {
                return;
            }
            if (((float) this.f2778a.getAutoSizeStepGranularity()) != -1.0f) {
                this.f2778a.setAutoSizeTextTypeUniformWithConfiguration(this.f2783f.mo3430c(), this.f2783f.mo3429b(), this.f2783f.mo3431d(), 0);
            } else {
                this.f2778a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3347a(boolean z) {
        this.f2778a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3348a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0535b.f2008a) {
            mo3350b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3349a(int[] iArr, int i) {
        this.f2783f.mo3428a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3350b() {
        this.f2783f.mo3423a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3351c() {
        return this.f2783f.mo3429b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3352d() {
        return this.f2783f.mo3430c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3353e() {
        return this.f2783f.mo3431d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int[] mo3354f() {
        return this.f2783f.mo3432e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo3355g() {
        return this.f2783f.mo3433f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo3356h() {
        return this.f2783f.mo3434g();
    }
}
