package android.support.p011v7.widget;

import android.support.p011v7.widget.ActionMenuView;
import android.support.p011v7.widget.Toolbar;
import android.view.MenuItem;

/* renamed from: android.support.v7.widget.fb */
class C0832fb implements ActionMenuView.C0700e {

    /* renamed from: a */
    final /* synthetic */ Toolbar f3433a;

    C0832fb(Toolbar toolbar) {
        this.f3433a = toolbar;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Toolbar.C0795c cVar = this.f3433a.f3274G;
        if (cVar != null) {
            return cVar.onMenuItemClick(menuItem);
        }
        return false;
    }
}
