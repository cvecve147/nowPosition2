package android.support.p011v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import p013b.p018b.p040i.p043c.p044a.C1118b;

/* renamed from: android.support.v7.widget.n */
public class C0863n extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f3547a = {16843016};

    /* renamed from: b */
    private final C0714G f3548b;

    public C0863n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0863n(Context context, AttributeSet attributeSet, int i) {
        super(C0818bb.m4769a(context), attributeSet, i);
        this.f3548b = C0714G.m3577a((TextView) this);
        this.f3548b.mo3346a(attributeSet, i);
        this.f3548b.mo3340a();
        C0829eb a = C0829eb.m4793a(getContext(), attributeSet, f3547a, i, 0);
        setCheckMarkDrawable(a.mo4477b(0));
        a.mo4474a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0714G g = this.f3548b;
        if (g != null) {
            g.mo3340a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0882r.m5058a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1118b.m5721b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0714G g = this.f3548b;
        if (g != null) {
            g.mo3344a(context, i);
        }
    }
}
