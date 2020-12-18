package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p011v7.widget.C0855la;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C0855la {

    /* renamed from: a */
    private C0855la.C0856a f2777a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0855la.C0856a aVar = this.f2777a;
        if (aVar != null) {
            aVar.mo2668a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0855la.C0856a aVar) {
        this.f2777a = aVar;
    }
}
