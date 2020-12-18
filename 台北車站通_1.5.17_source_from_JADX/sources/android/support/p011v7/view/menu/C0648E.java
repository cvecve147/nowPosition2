package android.support.p011v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p013b.p018b.p028h.p033c.p034a.C1051c;

/* renamed from: android.support.v7.view.menu.E */
class C0648E extends C0684y implements SubMenu {
    C0648E(Context context, C1051c cVar) {
        super(context, cVar);
    }

    /* renamed from: c */
    public C1051c mo2726c() {
        return (C1051c) this.f2477a;
    }

    public void clearHeader() {
        mo2726c().clearHeader();
    }

    public MenuItem getItem() {
        return mo2813a(mo2726c().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        mo2726c().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo2726c().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo2726c().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo2726c().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo2726c().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        mo2726c().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        mo2726c().setIcon(drawable);
        return this;
    }
}
