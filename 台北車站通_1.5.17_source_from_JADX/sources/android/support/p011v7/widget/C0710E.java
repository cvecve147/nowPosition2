package android.support.p011v7.widget;

import android.support.p011v7.widget.C0701B;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.E */
class C0710E implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2770a;

    /* renamed from: b */
    final /* synthetic */ C0701B.C0703b f2771b;

    C0710E(C0701B.C0703b bVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f2771b = bVar;
        this.f2770a = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = C0701B.this.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2770a);
        }
    }
}
