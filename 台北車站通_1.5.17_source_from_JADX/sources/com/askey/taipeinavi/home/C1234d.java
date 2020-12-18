package com.askey.taipeinavi.home;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.p058d.C1212f;
import com.askey.taipeinavi.p058d.C1213g;
import com.openlife.checkme.activity.splash.p090a.C4789a;

/* renamed from: com.askey.taipeinavi.home.d */
class C1234d implements NavigationView.C0124a {

    /* renamed from: a */
    final /* synthetic */ HomeActivity f4454a;

    C1234d(HomeActivity homeActivity) {
        this.f4454a = homeActivity;
    }

    /* renamed from: a */
    public boolean mo693a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navContactUs /*2131296662*/:
                C1212f.m6031a(this.f4454a);
                break;
            case R.id.navEvaluation /*2131296663*/:
                this.f4454a.f4421g.mo5590ia();
                C1213g.m6054c((Context) this.f4454a, false);
                break;
            case R.id.navMission /*2131296665*/:
                if (C1213g.m6074q(this.f4454a)) {
                    C4789a aVar = new C4789a();
                    aVar.mo13235a(C1213g.m6071n(this.f4454a));
                    this.f4454a.f4424j.mo13992a((Activity) this.f4454a, aVar);
                    break;
                } else {
                    C1212f.m6042e(this.f4454a);
                    return true;
                }
            case R.id.navSetting /*2131296666*/:
                this.f4454a.f4421g.mo5595na();
                break;
            default:
                return true;
        }
        this.f4454a.mo5539r();
        return true;
    }
}
