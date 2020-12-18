package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.widget.C0521E;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p043c.p044a.C1118b;

/* renamed from: android.support.v7.widget.AppCompatRadioButton */
public class AppCompatRadioButton extends RadioButton implements C0521E {

    /* renamed from: a */
    private final C0866o f2728a;

    /* renamed from: b */
    private final C0714G f2729b;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0818bb.m4769a(context), attributeSet, i);
        this.f2728a = new C0866o(this);
        this.f2728a.mo4609a(attributeSet, i);
        this.f2729b = new C0714G(this);
        this.f2729b.mo3346a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0866o oVar = this.f2728a;
        return oVar != null ? oVar.mo4605a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0866o oVar = this.f2728a;
        if (oVar != null) {
            return oVar.mo4610b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0866o oVar = this.f2728a;
        if (oVar != null) {
            return oVar.mo4611c();
        }
        return null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1118b.m5721b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0866o oVar = this.f2728a;
        if (oVar != null) {
            oVar.mo4612d();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0866o oVar = this.f2728a;
        if (oVar != null) {
            oVar.mo4607a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0866o oVar = this.f2728a;
        if (oVar != null) {
            oVar.mo4608a(mode);
        }
    }
}
