package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0486u;
import android.support.p007v4.widget.C0535b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.I */
public class C0721I extends TextView implements C0486u, C0535b {

    /* renamed from: a */
    private final C0854l f2803a;

    /* renamed from: b */
    private final C0714G f2804b;

    public C0721I(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0721I(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0721I(Context context, AttributeSet attributeSet, int i) {
        super(C0818bb.m4769a(context), attributeSet, i);
        this.f2803a = new C0854l(this);
        this.f2803a.mo4563a(attributeSet, i);
        this.f2804b = C0714G.m3577a((TextView) this);
        this.f2804b.mo3346a(attributeSet, i);
        this.f2804b.mo3340a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0854l lVar = this.f2803a;
        if (lVar != null) {
            lVar.mo4558a();
        }
        C0714G g = this.f2804b;
        if (g != null) {
            g.mo3340a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0535b.f2008a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0714G g = this.f2804b;
        if (g != null) {
            return g.mo3351c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0535b.f2008a) {
            return super.getAutoSizeMinTextSize();
        }
        C0714G g = this.f2804b;
        if (g != null) {
            return g.mo3352d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0535b.f2008a) {
            return super.getAutoSizeStepGranularity();
        }
        C0714G g = this.f2804b;
        if (g != null) {
            return g.mo3353e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0535b.f2008a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0714G g = this.f2804b;
        return g != null ? g.mo3354f() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (C0535b.f2008a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0714G g = this.f2804b;
        if (g != null) {
            return g.mo3355g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0854l lVar = this.f2803a;
        if (lVar != null) {
            return lVar.mo4564b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0854l lVar = this.f2803a;
        if (lVar != null) {
            return lVar.mo4566c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0882r.m5058a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0714G g = this.f2804b;
        if (g != null) {
            g.mo3348a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0714G g = this.f2804b;
        if (g != null && !C0535b.f2008a && g.mo3356h()) {
            this.f2804b.mo3350b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0535b.f2008a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0714G g = this.f2804b;
        if (g != null) {
            g.mo3343a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0535b.f2008a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0714G g = this.f2804b;
        if (g != null) {
            g.mo3349a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0535b.f2008a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0714G g = this.f2804b;
        if (g != null) {
            g.mo3341a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0854l lVar = this.f2803a;
        if (lVar != null) {
            lVar.mo4562a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0854l lVar = this.f2803a;
        if (lVar != null) {
            lVar.mo4559a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0854l lVar = this.f2803a;
        if (lVar != null) {
            lVar.mo4565b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0854l lVar = this.f2803a;
        if (lVar != null) {
            lVar.mo4561a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0714G g = this.f2804b;
        if (g != null) {
            g.mo3344a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0535b.f2008a) {
            super.setTextSize(i, f);
            return;
        }
        C0714G g = this.f2804b;
        if (g != null) {
            g.mo3342a(i, f);
        }
    }
}
