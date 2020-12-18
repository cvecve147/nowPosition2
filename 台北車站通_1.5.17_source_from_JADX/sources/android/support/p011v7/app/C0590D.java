package android.support.p011v7.app;

import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0432J;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.app.C0584C;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.app.D */
class C0590D extends C0432J {

    /* renamed from: a */
    final /* synthetic */ C0584C.C0586b f2236a;

    C0590D(C0584C.C0586b bVar) {
        this.f2236a = bVar;
    }

    /* renamed from: b */
    public void mo1764b(View view) {
        C0584C.this.f2211z.setVisibility(8);
        C0584C c = C0584C.this;
        PopupWindow popupWindow = c.f2187A;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (c.f2211z.getParent() instanceof View) {
            C0487v.m2262C((View) C0584C.this.f2211z.getParent());
        }
        C0584C.this.f2211z.removeAllViews();
        C0584C.this.f2189C.mo1755a((C0431I) null);
        C0584C.this.f2189C = null;
    }
}
