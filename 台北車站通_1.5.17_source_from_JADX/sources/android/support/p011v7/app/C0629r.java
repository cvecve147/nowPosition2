package android.support.p011v7.app;

import android.content.Context;
import android.support.p011v7.app.C0584C;
import android.support.p011v7.app.C0635u;
import android.support.p011v7.view.menu.C0662l;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: android.support.v7.app.r */
class C0629r extends C0635u {

    /* renamed from: android.support.v7.app.r$a */
    class C0630a extends C0635u.C0636a {
        C0630a(Window.Callback callback) {
            super(callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0662l lVar;
            C0584C.C0588d a = C0629r.this.mo2442a(0, true);
            if (a == null || (lVar = a.f2225j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, lVar, i);
            }
        }
    }

    C0629r(Context context, Window window, C0624n nVar) {
        super(context, window, nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo2644a(Window.Callback callback) {
        return new C0630a(callback);
    }
}
