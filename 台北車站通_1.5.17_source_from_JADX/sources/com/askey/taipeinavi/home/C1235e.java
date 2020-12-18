package com.askey.taipeinavi.home;

import android.app.Activity;
import com.askey.taipeinavi.home.HomeActivity;
import com.askey.taipeinavi.p058d.C1210d;
import com.askey.taipeinavi.p058d.C1212f;
import p267i.p274b.p275a.p276a.C6695b;

/* renamed from: com.askey.taipeinavi.home.e */
class C1235e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f4455a;

    /* renamed from: b */
    final /* synthetic */ C6695b.C6696a f4456b;

    /* renamed from: c */
    final /* synthetic */ HomeActivity.C1222a f4457c;

    C1235e(HomeActivity.C1222a aVar, int i, C6695b.C6696a aVar2) {
        this.f4457c = aVar;
        this.f4455a = i;
        this.f4456b = aVar2;
    }

    public void run() {
        switch (this.f4455a) {
            case 100:
                C1212f.m6030a((Activity) HomeActivity.this, this.f4456b.f18591b);
                HomeActivity.this.mo17239m();
                return;
            case 101:
                boolean unused = HomeActivity.this.f4426l = false;
                C1210d.m6028a("Refresh UUPON point failed");
                return;
            case 102:
                HomeActivity.this.mo17239m();
                HomeActivity.this.mo5540t();
                boolean unused2 = HomeActivity.this.f4426l = false;
                return;
            default:
                return;
        }
    }
}
