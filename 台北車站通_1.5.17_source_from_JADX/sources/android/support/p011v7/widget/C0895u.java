package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0486u;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p043c.p044a.C1118b;

/* renamed from: android.support.v7.widget.u */
public class C0895u extends MultiAutoCompleteTextView implements C0486u {

    /* renamed from: a */
    private static final int[] f3655a = {16843126};

    /* renamed from: b */
    private final C0854l f3656b;

    /* renamed from: c */
    private final C0714G f3657c;

    public C0895u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.autoCompleteTextViewStyle);
    }

    public C0895u(Context context, AttributeSet attributeSet, int i) {
        super(C0818bb.m4769a(context), attributeSet, i);
        C0829eb a = C0829eb.m4793a(getContext(), attributeSet, f3655a, i, 0);
        if (a.mo4487g(0)) {
            setDropDownBackgroundDrawable(a.mo4477b(0));
        }
        a.mo4474a();
        this.f3656b = new C0854l(this);
        this.f3656b.mo4563a(attributeSet, i);
        this.f3657c = C0714G.m3577a((TextView) this);
        this.f3657c.mo3346a(attributeSet, i);
        this.f3657c.mo3340a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0854l lVar = this.f3656b;
        if (lVar != null) {
            lVar.mo4558a();
        }
        C0714G g = this.f3657c;
        if (g != null) {
            g.mo3340a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0854l lVar = this.f3656b;
        if (lVar != null) {
            return lVar.mo4564b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0854l lVar = this.f3656b;
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

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0854l lVar = this.f3656b;
        if (lVar != null) {
            lVar.mo4562a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0854l lVar = this.f3656b;
        if (lVar != null) {
            lVar.mo4559a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1118b.m5721b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0854l lVar = this.f3656b;
        if (lVar != null) {
            lVar.mo4565b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0854l lVar = this.f3656b;
        if (lVar != null) {
            lVar.mo4561a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0714G g = this.f3657c;
        if (g != null) {
            g.mo3344a(context, i);
        }
    }
}
