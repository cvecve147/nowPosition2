package android.support.p007v4.view;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: android.support.v4.view.s */
public final class C0484s {

    /* renamed from: a */
    private Object f1804a;

    private C0484s(Object obj) {
        this.f1804a = obj;
    }

    /* renamed from: a */
    public static C0484s m2258a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new C0484s(PointerIcon.getSystemIcon(context, i)) : new C0484s((Object) null);
    }

    /* renamed from: a */
    public Object mo1990a() {
        return this.f1804a;
    }
}
