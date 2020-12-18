package android.support.p011v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p013b.p018b.p028h.p033c.p034a.C1050b;
import p013b.p018b.p028h.p033c.p034a.C1051c;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: android.support.v7.view.menu.c */
abstract class C0651c<T> extends C0652d<T> {

    /* renamed from: b */
    final Context f2474b;

    /* renamed from: c */
    private Map<C1050b, MenuItem> f2475c;

    /* renamed from: d */
    private Map<C1051c, SubMenu> f2476d;

    C0651c(Context context, T t) {
        super(t);
        this.f2474b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo2813a(MenuItem menuItem) {
        if (!(menuItem instanceof C1050b)) {
            return menuItem;
        }
        C1050b bVar = (C1050b) menuItem;
        if (this.f2475c == null) {
            this.f2475c = new C1080b();
        }
        MenuItem menuItem2 = this.f2475c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0683x.m3418a(this.f2474b, bVar);
        this.f2475c.put(bVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo2814a(SubMenu subMenu) {
        if (!(subMenu instanceof C1051c)) {
            return subMenu;
        }
        C1051c cVar = (C1051c) subMenu;
        if (this.f2476d == null) {
            this.f2476d = new C1080b();
        }
        SubMenu subMenu2 = this.f2476d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu a = C0683x.m3419a(this.f2474b, cVar);
        this.f2476d.put(cVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2815a(int i) {
        Map<C1050b, MenuItem> map = this.f2475c;
        if (map != null) {
            Iterator<C1050b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2816b() {
        Map<C1050b, MenuItem> map = this.f2475c;
        if (map != null) {
            map.clear();
        }
        Map<C1051c, SubMenu> map2 = this.f2476d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2817b(int i) {
        Map<C1050b, MenuItem> map = this.f2475c;
        if (map != null) {
            Iterator<C1050b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
