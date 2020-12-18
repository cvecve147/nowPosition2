package com.askey.taipeinavi.home;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1203g;
import com.askey.taipeinavi.common.WebViewFragment;
import com.askey.taipeinavi.navigation.NavigationFragment;
import com.askey.taipeinavi.p055b.C1184a;
import com.askey.taipeinavi.p055b.C1185b;
import com.askey.taipeinavi.p058d.C1207a;
import com.askey.taipeinavi.p058d.C1209c;
import com.askey.taipeinavi.p058d.C1210d;
import com.askey.taipeinavi.p058d.C1212f;
import com.askey.taipeinavi.p058d.C1213g;
import com.askey.taipeinavi.parking.C1269b;
import com.askey.taipeinavi.quicknavi.C1281g;
import com.askey.taipeinavi.quicknavi.QuickNavigationFragment;
import com.askey.taipeinavi.setting.MoreLinkFragment;
import com.askey.taipeinavi.setting.SettingFragment;
import com.askey.taipeinavi.sos.SosFragment;
import com.askey.taipeinavi.transport.TransportFragment;
import com.askey.taipeinavi.tutorial.TutorialActivity;
import java.util.ArrayList;
import java.util.List;
import p267i.p274b.p282c.C6740b;
import p267i.p274b.p282c.C6744e;
import p267i.p274b.p282c.C6749j;
import p267i.p274b.p283d.C6775k;
import p299tw.navin.navinmap.map.C7089b;
import p299tw.navin.navinmap.map.C7091c;
import p299tw.navin.navinmap.map.C7095d;

/* renamed from: com.askey.taipeinavi.home.x */
public class C1254x extends C6740b {
    /* access modifiers changed from: private */

    /* renamed from: ba */
    public C6744e f4487ba;
    /* access modifiers changed from: private */

    /* renamed from: ca */
    public C7089b f4488ca = null;

    /* renamed from: da */
    private C1269b f4489da = null;
    /* access modifiers changed from: private */

    /* renamed from: ea */
    public boolean f4490ea;

    /* renamed from: com.askey.taipeinavi.home.x$a */
    private class C1255a implements C6749j {
        private C1255a() {
        }

        /* synthetic */ C1255a(C1254x xVar, C1244n nVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo5481a() {
            return C1254x.this.mo6389fa();
        }
    }

    /* renamed from: com.askey.taipeinavi.home.x$b */
    private class C1256b implements C7091c.C7092a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f4492a;

        C1256b(boolean z) {
            this.f4492a = z;
        }

        /* renamed from: a */
        public void mo5567a() {
            C1209c cVar = new C1209c(C1254x.this.mo1396i());
            cVar.mo5514e("Poi");
            cVar.mo5509b((ArrayList<C7095d>) C1254x.this.f4488ca.mo21010c());
            cVar.mo17135a();
            C1254x.this.f4488ca.mo21002a((List) C1207a.m6013a(C1254x.this.mo1396i()));
            boolean unused = C1254x.this.f4490ea = true;
            C1254x.this.f4487ba.runOnUiThread(new C1258y(this));
        }

        /* renamed from: a */
        public void mo5599a(String str, String str2) {
            C1210d.m6029b("## Map error:" + str);
            C1254x.this.f4487ba.runOnUiThread(new C1259z(this, str));
        }
    }

    /* renamed from: com.askey.taipeinavi.home.x$c */
    private class C1257c implements C1184a {
        private C1257c() {
        }

        /* synthetic */ C1257c(C1254x xVar, C1244n nVar) {
            this();
        }

        /* renamed from: a */
        public void mo5476a(String str) {
            C1209c cVar = new C1209c(C1254x.this.mo1396i());
            cVar.mo5514e("Poi");
            C7095d c = cVar.mo5510c(str);
            cVar.mo17135a();
            if (c != null) {
                C1254x.this.m6197a(false, c, (String) null);
            } else {
                C6775k.m25602a(C1254x.this.mo1396i(), -1, (int) R.string.dialog_poi_not_found_msg, false, (DialogInterface.OnClickListener) null);
            }
        }
    }

    /* renamed from: a */
    private void m6196a(C7091c.C7092a aVar) {
        this.f4487ba.mo17243q();
        this.f4488ca.mo20991a(C1213g.m6070m(mo1396i()));
        this.f4488ca.mo21122a(aVar);
        this.f4488ca.mo21012e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6197a(boolean z, C7095d dVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("searching", z);
        if (str != null) {
            bundle.putString("mapRid", str);
        }
        this.f4488ca.mo20998a(C1213g.m6073p(mo1396i()));
        NavigationFragment navigationFragment = new NavigationFragment();
        navigationFragment.mo5602a(this.f4488ca);
        navigationFragment.mo5603a(dVar);
        navigationFragment.mo1405m(bundle);
        mo17225a(navigationFragment, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6201c(String str, int i) {
        C1185b bVar = new C1185b();
        bVar.mo5477a((C1184a) new C1257c(this, (C1244n) null));
        mo5577a(str, i, (C1203g) bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m6202i(boolean z) {
        m6197a(z, (C7095d) null, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ra */
    public void m6203ra() {
        if (C1213g.m6075r(this.f4487ba)) {
            C1212f.m6033a((Context) this.f4487ba, (View.OnClickListener) new C1245o(this));
        }
    }

    /* renamed from: K */
    public void mo1324K() {
        C7089b bVar = this.f4488ca;
        if (bVar != null) {
            bVar.mo21014g();
            this.f4488ca = null;
        }
        C1269b bVar2 = this.f4489da;
        if (bVar2 != null) {
            bVar2.mo5616b();
            this.f4489da = null;
        }
        super.mo1324K();
    }

    /* renamed from: O */
    public void mo1326O() {
        super.mo1326O();
        C7089b bVar = this.f4488ca;
        if (bVar != null) {
            bVar.mo21013f();
        }
    }

    /* renamed from: P */
    public void mo1327P() {
        super.mo1327P();
        C7089b bVar = this.f4488ca;
        if (bVar != null) {
            bVar.mo21015h();
        }
    }

    /* renamed from: a */
    public void mo5574a(C1221H h) {
        mo5578a("https://app-ol.tpestn.askeycloudapi.com/uupon/login", (int) R.string.txt_login, h);
    }

    /* renamed from: a */
    public void mo5575a(C1281g gVar) {
        QuickNavigationFragment quickNavigationFragment = new QuickNavigationFragment();
        quickNavigationFragment.mo5631a(gVar);
        mo17225a(quickNavigationFragment, true);
    }

    /* renamed from: a */
    public void mo5576a(String str, int i) {
        if (!this.f4490ea) {
            m6196a((C7091c.C7092a) new C1252v(this, true, str, i));
        } else {
            m6201c(str, i);
        }
    }

    /* renamed from: a */
    public void mo5577a(String str, int i, C1203g gVar) {
        mo5580a(str, mo1396i().getString(i), gVar);
    }

    /* renamed from: a */
    public void mo5578a(String str, int i, C1221H h) {
        C1230J j = new C1230J();
        j.mo5557a(h);
        mo5577a(str, i, (C1203g) j);
    }

    /* renamed from: a */
    public void mo5579a(String str, String str2) {
        mo5580a(str, str2, (C1203g) null);
    }

    /* renamed from: a */
    public void mo5580a(String str, String str2, C1203g gVar) {
        WebViewFragment webViewFragment = new WebViewFragment();
        webViewFragment.mo5487c(str);
        webViewFragment.mo5486b(str2);
        webViewFragment.mo5485a(gVar);
        mo17225a(webViewFragment, true);
    }

    /* renamed from: a */
    public void mo5581a(ArrayList<C7095d> arrayList) {
        C1212f.m6041d(mo1396i(), new C1249s(this, arrayList));
    }

    /* renamed from: a */
    public void mo5582a(C7095d dVar) {
        m6197a(false, dVar, (String) null);
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        if (!this.f18739W) {
            this.f18739W = true;
            mo17225a(new HomeFragment(), false);
        }
        this.f4487ba = (C6744e) mo1337a();
        this.f4487ba.mo17231a((C6749j) new C1255a(this, (C1244n) null));
        this.f4487ba.mo17243q();
        if (bundle == null) {
            C1213g.m6046a(this.f4487ba, "817007630132138", "R2Z2SOoil8h38HdkXJL1yFNwsWXsLmWb");
            this.f4488ca = new C7089b(this.f4487ba, "817007630132138", "R2Z2SOoil8h38HdkXJL1yFNwsWXsLmWb");
            m6196a((C7091c.C7092a) new C1244n(this, false));
        }
    }

    /* renamed from: b */
    public void mo5583b(C1221H h) {
        mo5578a("https://uupon.tw/joinMember/joinConnectCard.do?refer=navi", (int) R.string.txt_register, h);
    }

    /* renamed from: b */
    public void mo5584b(String str) {
        C1212f.m6041d(mo1396i(), new C1250t(this, str));
    }

    /* renamed from: b */
    public void mo5585b(String str, int i) {
        mo5580a(str, mo1396i().getString(i), (C1203g) null);
    }

    /* renamed from: c */
    public void mo5586c(String str) {
        m6197a(false, (C7095d) null, str);
    }

    /* renamed from: ga */
    public C7089b mo5587ga() {
        return this.f4488ca;
    }

    /* renamed from: h */
    public void mo5588h(boolean z) {
        if (!this.f4490ea) {
            m6196a((C7091c.C7092a) new C1248r(this, true, z));
        } else {
            m6202i(z);
        }
    }

    /* renamed from: ha */
    public boolean mo5589ha() {
        return this.f4490ea;
    }

    /* renamed from: ia */
    public void mo5590ia() {
        mo5585b("https://www.surveycake.com/s/womN6", (int) R.string.btxt_evaluation);
    }

    /* renamed from: ja */
    public void mo5591ja() {
        mo5579a("https://www.facebook.com/%E5%8F%B0%E5%8C%97%E8%BB%8A%E7%AB%99%E9%80%9A-Taipei-Main-Station-Navigator-123000762421579", "");
    }

    /* renamed from: ka */
    public void mo5592ka() {
        mo5579a("https://hello.gov.taipei/Front/main", "");
    }

    /* renamed from: la */
    public void mo5593la() {
        mo17225a(new MoreLinkFragment(), true);
    }

    /* renamed from: ma */
    public void mo5594ma() {
        if (this.f4489da == null) {
            this.f4489da = new C1269b(mo1396i(), new C1253w(this), C1213g.m6070m(this.f4487ba));
        }
        if (!this.f4489da.mo5615a()) {
            this.f4487ba.mo17243q();
        }
        this.f4489da.mo5617c();
    }

    /* renamed from: na */
    public void mo5595na() {
        mo17225a(new SettingFragment(), true);
    }

    /* renamed from: oa */
    public void mo5596oa() {
        if (!this.f4490ea) {
            m6196a((C7091c.C7092a) new C1246p(this, true));
        }
        mo17225a(new SosFragment(), true);
    }

    /* renamed from: pa */
    public void mo5597pa() {
        mo17225a(new TransportFragment(), true);
    }

    /* renamed from: qa */
    public void mo5598qa() {
        this.f4487ba.startActivity(new Intent(this.f4487ba, TutorialActivity.class));
    }
}
