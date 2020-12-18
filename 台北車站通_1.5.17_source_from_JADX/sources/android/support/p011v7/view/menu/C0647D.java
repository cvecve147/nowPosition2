package android.support.p011v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p011v7.view.menu.C0662l;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.D */
public class C0647D extends C0662l implements SubMenu {

    /* renamed from: A */
    private C0662l f2422A;

    /* renamed from: B */
    private C0668p f2423B;

    public C0647D(Context context, C0662l lVar, C0668p pVar) {
        super(context);
        this.f2422A = lVar;
        this.f2423B = pVar;
    }

    /* renamed from: a */
    public void mo2708a(C0662l.C0663a aVar) {
        this.f2422A.mo2708a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2709a(C0662l lVar, MenuItem menuItem) {
        return super.mo2709a(lVar, menuItem) || this.f2422A.mo2709a(lVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo2710a(C0668p pVar) {
        return this.f2422A.mo2710a(pVar);
    }

    /* renamed from: b */
    public boolean mo2711b(C0668p pVar) {
        return this.f2422A.mo2711b(pVar);
    }

    /* renamed from: d */
    public String mo2712d() {
        C0668p pVar = this.f2423B;
        int itemId = pVar != null ? pVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo2712d() + ":" + itemId;
    }

    public MenuItem getItem() {
        return this.f2423B;
    }

    /* renamed from: m */
    public C0662l mo2714m() {
        return this.f2422A.mo2714m();
    }

    /* renamed from: o */
    public boolean mo2715o() {
        return this.f2422A.mo2715o();
    }

    /* renamed from: p */
    public boolean mo2716p() {
        return this.f2422A.mo2716p();
    }

    /* renamed from: s */
    public Menu mo2717s() {
        return this.f2422A;
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo2883d(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo2849a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo2887e(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo2851a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo2850a(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f2423B.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f2423B.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f2422A.setQwertyMode(z);
    }
}
