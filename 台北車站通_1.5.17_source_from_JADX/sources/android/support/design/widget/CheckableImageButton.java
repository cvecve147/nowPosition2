package android.support.design.widget;

import android.content.Context;
import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.widget.C0885s;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageButton;
import p013b.p018b.p040i.p041a.C1103a;

public class CheckableImageButton extends C0885s implements Checkable {

    /* renamed from: c */
    private static final int[] f561c = {16842912};

    /* renamed from: d */
    private boolean f562d;

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0487v.m2274a((View) this, (C0459c) new C0155k(this));
    }

    public boolean isChecked() {
        return this.f562d;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f562d ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f561c.length), f561c) : super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f562d != z) {
            this.f562d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.f562d);
    }
}
