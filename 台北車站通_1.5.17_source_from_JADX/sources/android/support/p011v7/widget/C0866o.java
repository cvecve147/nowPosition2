package android.support.p011v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.widget.C0542g;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p043c.p044a.C1118b;

/* renamed from: android.support.v7.widget.o */
class C0866o {

    /* renamed from: a */
    private final CompoundButton f3550a;

    /* renamed from: b */
    private ColorStateList f3551b = null;

    /* renamed from: c */
    private PorterDuff.Mode f3552c = null;

    /* renamed from: d */
    private boolean f3553d = false;

    /* renamed from: e */
    private boolean f3554e = false;

    /* renamed from: f */
    private boolean f3555f;

    C0866o(CompoundButton compoundButton) {
        this.f3550a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = android.support.p007v4.widget.C0542g.m2708a(r2.f3550a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4605a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f3550a
            android.graphics.drawable.Drawable r0 = android.support.p007v4.widget.C0542g.m2708a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0866o.mo4605a(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4606a() {
        Drawable a = C0542g.m2708a(this.f3550a);
        if (a == null) {
            return;
        }
        if (this.f3553d || this.f3554e) {
            Drawable mutate = C1026a.m5462i(a).mutate();
            if (this.f3553d) {
                C1026a.m5447a(mutate, this.f3551b);
            }
            if (this.f3554e) {
                C1026a.m5450a(mutate, this.f3552c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f3550a.getDrawableState());
            }
            this.f3550a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4607a(ColorStateList colorStateList) {
        this.f3551b = colorStateList;
        this.f3553d = true;
        mo4606a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4608a(PorterDuff.Mode mode) {
        this.f3552c = mode;
        this.f3554e = true;
        mo4606a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4609a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f3550a.getContext().obtainStyledAttributes(attributeSet, C1112j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C1112j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C1112j.CompoundButton_android_button, 0)) != 0) {
                this.f3550a.setButtonDrawable(C1118b.m5721b(this.f3550a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C1112j.CompoundButton_buttonTint)) {
                C0542g.m2709a(this.f3550a, obtainStyledAttributes.getColorStateList(C1112j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C1112j.CompoundButton_buttonTintMode)) {
                C0542g.m2710a(this.f3550a, C0831fa.m4812a(obtainStyledAttributes.getInt(C1112j.CompoundButton_buttonTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo4610b() {
        return this.f3551b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo4611c() {
        return this.f3552c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4612d() {
        if (this.f3555f) {
            this.f3555f = false;
            return;
        }
        this.f3555f = true;
        mo4606a();
    }
}
