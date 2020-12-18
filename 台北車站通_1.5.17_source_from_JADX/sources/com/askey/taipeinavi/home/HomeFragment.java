package com.askey.taipeinavi.home;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1194a;
import com.askey.taipeinavi.common.C1198b;
import com.askey.taipeinavi.p056c.C1190c;
import com.askey.taipeinavi.p058d.C1212f;
import com.askey.taipeinavi.p058d.C1213g;
import com.askey.taipeinavi.quicknavi.C1283i;
import com.whatsmedia.ibeaconshakingproject.shakingDetect.ServiceDetectShaking;
import p101d.p206l.p207a.C6058d;
import p267i.p274b.p282c.C6751l;
import p299tw.navin.navinmap.map.C7091c;

public class HomeFragment extends C1194a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1231a f4438a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f4439b;
    LinearLayout mLLayMain;

    /* renamed from: com.askey.taipeinavi.home.HomeFragment$a */
    private class C1226a implements C7091c.C7093b {
        private C1226a() {
        }

        /* synthetic */ C1226a(HomeFragment homeFragment, C1214A a) {
            this();
        }

        /* renamed from: a */
        public void mo5548a() {
            if (HomeFragment.this.f4438a.mo5561d(HomeFragment.this.mo1396i())) {
                HomeFragment.this.m6129ga();
                boolean unused = HomeFragment.this.f4439b = false;
            }
        }
    }

    /* renamed from: com.askey.taipeinavi.home.HomeFragment$b */
    private class C1227b implements C6751l {
        private C1227b() {
        }

        /* synthetic */ C1227b(HomeFragment homeFragment, C1214A a) {
            this();
        }

        /* renamed from: a */
        public void mo5549a(View view, int i) {
            String m = C1213g.m6070m(HomeFragment.this.mo1396i());
            if (m == null) {
                m = "";
            }
            if (i == 0) {
                C1190c.m5957a().mo5483a(m, C1190c.f4366c);
                HomeFragment.this.f4381b.mo5588h(false);
            } else if (i == 1) {
                C1190c.m5957a().mo5483a(m, C1190c.f4369f);
                HomeFragment.this.f4381b.mo5575a(C1283i.m6327c(HomeFragment.this.f4381b));
            } else if (i == 2) {
                C1190c.m5957a().mo5483a(m, C1190c.f4365b);
                HomeFragment.this.f4381b.mo5597pa();
            } else if (i == 3) {
                C1190c.m5957a().mo5483a(m, C1190c.f4368e);
                HomeFragment.this.f4381b.mo5594ma();
            } else if (i == 4) {
                C1190c.m5957a().mo5483a(m, C1190c.f4367d);
                HomeFragment.this.f4381b.mo5576a(HomeFragment.this.mo1396i().getString(R.string.url_store_list), (int) R.string.btxt_store);
            } else if (i == 5) {
                C1190c.m5957a().mo5483a(m, C1190c.f4370g);
                HomeFragment.this.f4380a.runOnUiThread(new C1218E(this));
            }
            if (i != 5) {
                boolean unused = HomeFragment.this.f4439b = true;
            }
        }
    }

    /* renamed from: com.askey.taipeinavi.home.HomeFragment$c */
    private class C1228c implements C6058d.C6059a {
        private C1228c() {
        }

        /* synthetic */ C1228c(HomeFragment homeFragment, C1214A a) {
            this();
        }

        /* renamed from: a */
        public void mo5550a() {
            HomeFragment.this.f4380a.runOnUiThread(new C1219F(this));
        }

        /* renamed from: a */
        public void mo5551a(String str) {
            HomeFragment.this.m6131ha();
            HomeFragment.this.f4380a.runOnUiThread(new C1220G(this, str));
        }
    }

    /* renamed from: fa */
    private void m6127fa() {
        this.mLLayMain.addView(C1198b.m5995a(mo1396i(), this.mLLayMain, new C1227b(this, (C1214A) null)));
    }

    /* access modifiers changed from: private */
    /* renamed from: ga */
    public void m6129ga() {
        C1212f.m6032a(mo1396i(), (DialogInterface.OnClickListener) new C1214A(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: ha */
    public void m6131ha() {
        this.f4380a.stopService(new Intent(this.f4380a, ServiceDetectShaking.class));
        C6058d.m22969a();
        C6058d.m22968a((Activity) this.f4380a).mo16026h();
    }

    /* renamed from: O */
    public void mo1326O() {
        m6131ha();
        super.mo1326O();
    }

    /* renamed from: P */
    public void mo1327P() {
        this.f4380a.mo5541u();
        this.f4380a.mo17233a(true, R.id.txtAppName);
        super.mo1327P();
        if (this.f4439b) {
            this.f4439b = false;
            if (this.f4438a.mo5560c(mo1396i())) {
                m6129ga();
            }
        }
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        this.f4438a = new C1231a(mo1396i());
        this.f4381b.mo5587ga().mo21123a((C7091c.C7093b) new C1226a(this, (C1214A) null));
        m6127fa();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_home;
    }
}
