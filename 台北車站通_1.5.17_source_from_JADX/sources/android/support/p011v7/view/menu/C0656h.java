package android.support.p011v7.view.menu;

import android.os.SystemClock;
import android.support.p011v7.view.menu.C0657i;
import android.support.p011v7.widget.C0904va;
import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.h */
class C0656h implements C0904va {

    /* renamed from: a */
    final /* synthetic */ C0657i f2484a;

    C0656h(C0657i iVar) {
        this.f2484a = iVar;
    }

    /* renamed from: a */
    public void mo2822a(C0662l lVar, MenuItem menuItem) {
        C0657i.C0658a aVar = null;
        this.f2484a.f2491g.removeCallbacksAndMessages((Object) null);
        int size = this.f2484a.f2493i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == this.f2484a.f2493i.get(i).f2512b) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < this.f2484a.f2493i.size()) {
                aVar = this.f2484a.f2493i.get(i2);
            }
            this.f2484a.f2491g.postAtTime(new C0655g(this, aVar, menuItem, lVar), lVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* renamed from: b */
    public void mo2823b(C0662l lVar, MenuItem menuItem) {
        this.f2484a.f2491g.removeCallbacksAndMessages(lVar);
    }
}
