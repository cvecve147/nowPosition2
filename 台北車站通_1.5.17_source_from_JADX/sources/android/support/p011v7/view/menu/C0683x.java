package android.support.p011v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p013b.p018b.p028h.p033c.p034a.C1049a;
import p013b.p018b.p028h.p033c.p034a.C1050b;
import p013b.p018b.p028h.p033c.p034a.C1051c;

/* renamed from: android.support.v7.view.menu.x */
public final class C0683x {
    /* renamed from: a */
    public static Menu m3417a(Context context, C1049a aVar) {
        return new C0684y(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m3418a(Context context, C1050b bVar) {
        return Build.VERSION.SDK_INT >= 16 ? new C0674r(context, bVar) : new C0669q(context, bVar);
    }

    /* renamed from: a */
    public static SubMenu m3419a(Context context, C1051c cVar) {
        return new C0648E(context, cVar);
    }
}
