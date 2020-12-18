package android.support.p011v7.view.menu;

import android.support.p011v7.view.menu.C0657i;
import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.g */
class C0655g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0657i.C0658a f2480a;

    /* renamed from: b */
    final /* synthetic */ MenuItem f2481b;

    /* renamed from: c */
    final /* synthetic */ C0662l f2482c;

    /* renamed from: d */
    final /* synthetic */ C0656h f2483d;

    C0655g(C0656h hVar, C0657i.C0658a aVar, MenuItem menuItem, C0662l lVar) {
        this.f2483d = hVar;
        this.f2480a = aVar;
        this.f2481b = menuItem;
        this.f2482c = lVar;
    }

    public void run() {
        C0657i.C0658a aVar = this.f2480a;
        if (aVar != null) {
            this.f2483d.f2484a.f2485A = true;
            aVar.f2512b.mo2860a(false);
            this.f2483d.f2484a.f2485A = false;
        }
        if (this.f2481b.isEnabled() && this.f2481b.hasSubMenu()) {
            this.f2482c.mo2861a(this.f2481b, 4);
        }
    }
}
