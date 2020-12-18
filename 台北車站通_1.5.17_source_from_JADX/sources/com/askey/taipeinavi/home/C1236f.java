package com.askey.taipeinavi.home;

import com.askey.taipeinavi.home.HomeActivity;
import com.askey.taipeinavi.p058d.C1213g;

/* renamed from: com.askey.taipeinavi.home.f */
class C1236f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f4458a;

    /* renamed from: b */
    final /* synthetic */ HomeActivity.C1222a f4459b;

    C1236f(HomeActivity.C1222a aVar, int i) {
        this.f4459b = aVar;
        this.f4458a = i;
    }

    public void run() {
        switch (this.f4458a) {
            case 100:
                String b = HomeActivity.this.f4423i.mo5553b();
                C1213g.m6061f(HomeActivity.this, b);
                HomeActivity.this.f4424j.mo13991a(b);
                HomeActivity.this.m6093e(true);
                HomeActivity.this.f4423i.mo5556c(C1213g.m6071n(HomeActivity.this));
                return;
            case 101:
                break;
            case 102:
                HomeActivity.this.mo17239m();
                HomeActivity.this.mo5540t();
                break;
            default:
                return;
        }
        String b2 = HomeActivity.this.f4423i.mo5554b(this.f4458a);
        C1213g.m6064g(HomeActivity.this, b2);
        HomeActivity.this.f4420f.setText(b2);
        boolean unused = HomeActivity.this.f4426l = false;
    }
}
