package android.support.design.widget;

import android.support.design.widget.NavigationView;
import android.support.p011v7.view.menu.C0662l;
import android.view.MenuItem;

/* renamed from: android.support.design.widget.A */
class C0093A implements C0662l.C0663a {

    /* renamed from: a */
    final /* synthetic */ NavigationView f511a;

    C0093A(NavigationView navigationView) {
        this.f511a = navigationView;
    }

    /* renamed from: a */
    public void mo362a(C0662l lVar) {
    }

    /* renamed from: a */
    public boolean mo363a(C0662l lVar, MenuItem menuItem) {
        NavigationView.C0124a aVar = this.f511a.f679h;
        return aVar != null && aVar.mo693a(menuItem);
    }
}
