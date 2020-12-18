package android.support.design.internal;

import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.C0679v;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.design.internal.d */
class C0077d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0078e f483a;

    C0077d(C0078e eVar) {
        this.f483a = eVar;
    }

    public void onClick(View view) {
        this.f483a.mo328b(true);
        C0668p itemData = ((NavigationMenuItemView) view).getItemData();
        C0078e eVar = this.f483a;
        boolean a = eVar.f487d.mo2862a((MenuItem) itemData, (C0679v) eVar, 0);
        if (itemData != null && itemData.isCheckable() && a) {
            this.f483a.f489f.mo342a(itemData);
        }
        this.f483a.mo328b(false);
        this.f483a.mo321a(false);
    }
}
