package android.support.p011v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p007v4.widget.C0565s;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.widget.v */
class C0903v extends PopupWindow {

    /* renamed from: a */
    private static final boolean f3700a = (Build.VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f3701b;

    public C0903v(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m5143a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m5143a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0829eb a = C0829eb.m4793a(context, attributeSet, C1112j.PopupWindow, i, i2);
        if (a.mo4487g(C1112j.PopupWindow_overlapAnchor)) {
            m5144a(a.mo4475a(C1112j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo4477b(C1112j.PopupWindow_android_popupBackground));
        a.mo4474a();
    }

    /* renamed from: a */
    private void m5144a(boolean z) {
        if (f3700a) {
            this.f3701b = z;
        } else {
            C0565s.m2765a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f3700a && this.f3701b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f3700a && this.f3701b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f3700a && this.f3701b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
