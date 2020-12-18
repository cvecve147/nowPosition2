package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p013b.p018b.p040i.p048f.C1124a;
import p101d.p108c.p109a.C5192g;
import p101d.p108c.p109a.C5210o;
import p101d.p108c.p109a.p110a.C5182c;

public class MDButton extends TextView {

    /* renamed from: a */
    private boolean f4218a = false;

    /* renamed from: b */
    private C5192g f4219b;

    /* renamed from: c */
    private int f4220c;

    /* renamed from: d */
    private Drawable f4221d;

    /* renamed from: e */
    private Drawable f4222e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5855a(context);
    }

    public MDButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5855a(context);
    }

    /* renamed from: a */
    private void m5855a(Context context) {
        this.f4220c = context.getResources().getDimensionPixelSize(C5210o.md_dialog_frame_margin);
        this.f4219b = C5192g.END;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5380a(boolean z, boolean z2) {
        if (this.f4218a != z || z2) {
            setGravity(z ? this.f4219b.mo14355a() | 16 : 17);
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(z ? this.f4219b.mo14356b() : 4);
            }
            C5182c.m20042a((View) this, z ? this.f4221d : this.f4222e);
            if (z) {
                setPadding(this.f4220c, getPaddingTop(), this.f4220c, getPaddingBottom());
            }
            this.f4218a = z;
        }
    }

    public void setAllCapsCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 14) {
            setAllCaps(z);
        } else {
            setTransformationMethod(z ? new C1124a(getContext()) : null);
        }
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f4222e = drawable;
        if (!this.f4218a) {
            mo5380a(false, true);
        }
    }

    public void setStackedGravity(C5192g gVar) {
        this.f4219b = gVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f4221d = drawable;
        if (this.f4218a) {
            mo5380a(true, true);
        }
    }
}
