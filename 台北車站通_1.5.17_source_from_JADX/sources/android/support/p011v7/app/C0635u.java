package android.support.p011v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.p011v7.app.C0631s;
import android.view.ActionMode;
import android.view.Window;

/* renamed from: android.support.v7.app.u */
class C0635u extends C0631s {

    /* renamed from: Y */
    private final UiModeManager f2381Y;

    /* renamed from: android.support.v7.app.u$a */
    class C0636a extends C0631s.C0632a {
        C0636a(Window.Callback callback) {
            super(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0635u.this.mo2658v() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo2659a(callback);
        }
    }

    C0635u(Context context, Window window, C0624n nVar) {
        super(context, window, nVar);
        this.f2381Y = (UiModeManager) context.getSystemService("uimode");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo2644a(Window.Callback callback) {
        return new C0636a(callback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2657g(int i) {
        if (i == 0 && this.f2381Y.getNightMode() == 0) {
            return -1;
        }
        return super.mo2657g(i);
    }
}
