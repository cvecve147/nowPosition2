package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.H */
class C0719H extends C0714G {

    /* renamed from: j */
    private C0821cb f2800j;

    /* renamed from: k */
    private C0821cb f2801k;

    C0719H(TextView textView) {
        super(textView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3340a() {
        super.mo3340a();
        if (this.f2800j != null || this.f2801k != null) {
            Drawable[] compoundDrawablesRelative = this.f2778a.getCompoundDrawablesRelative();
            mo3345a(compoundDrawablesRelative[0], this.f2800j);
            mo3345a(compoundDrawablesRelative[2], this.f2801k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3346a(AttributeSet attributeSet, int i) {
        super.mo3346a(attributeSet, i);
        Context context = this.f2778a.getContext();
        C0871p a = C0871p.m4995a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTextHelper_android_drawableStart)) {
            this.f2800j = C0714G.m3578a(context, a, obtainStyledAttributes.getResourceId(C1112j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTextHelper_android_drawableEnd)) {
            this.f2801k = C0714G.m3578a(context, a, obtainStyledAttributes.getResourceId(C1112j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
