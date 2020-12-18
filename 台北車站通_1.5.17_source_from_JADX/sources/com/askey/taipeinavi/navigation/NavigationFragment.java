package com.askey.taipeinavi.navigation;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1194a;
import com.askey.taipeinavi.p059ui.C1318a;
import com.askey.taipeinavi.p059ui.C1319b;
import com.askey.taipeinavi.p059ui.SearchResultView;
import com.openlife.checkme.sdk.C4978b;
import p101d.p204k.p205a.C6053f;
import p299tw.navin.navinmap.map.C7089b;
import p299tw.navin.navinmap.map.C7095d;
import p299tw.navin.navinmap.map.C7101g;

public class NavigationFragment extends C1194a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7089b f4498a = null;

    /* renamed from: b */
    private View f4499b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f4500c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C7095d f4501d = null;
    RelativeLayout mRootLayout;
    SearchResultView mSearchResultView;

    /* renamed from: com.askey.taipeinavi.navigation.NavigationFragment$a */
    private class C1260a implements C1318a {
        private C1260a() {
        }

        /* synthetic */ C1260a(NavigationFragment navigationFragment, C1262a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5604a(C7095d dVar) {
            NavigationFragment.this.f4498a.mo21124b(true);
            boolean unused = NavigationFragment.this.f4500c = false;
            NavigationFragment.this.f4380a.mo5526a(false, false);
            NavigationFragment.this.f4380a.mo5530d(dVar.mo21127a());
            NavigationFragment.this.f4498a.mo21004a(dVar);
        }
    }

    /* renamed from: com.askey.taipeinavi.navigation.NavigationFragment$b */
    private class C1261b implements C1319b {
        private C1261b() {
        }

        /* synthetic */ C1261b(NavigationFragment navigationFragment, C1262a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5544a() {
            NavigationFragment.this.f4498a.mo21124b(false);
        }

        /* renamed from: a */
        public void mo5545a(String str) {
            NavigationFragment.this.mSearchResultView.mo5545a(str);
        }

        /* renamed from: b */
        public void mo5546b(String str) {
            NavigationFragment.this.mSearchResultView.mo5546b(str);
        }

        public void onCancel() {
            if (NavigationFragment.this.f4500c) {
                NavigationFragment.this.f4380a.onBackPressed();
            } else {
                NavigationFragment.this.mSearchResultView.onCancel();
            }
        }
    }

    /* renamed from: fa */
    private void m6245fa() {
        boolean z;
        String str;
        Bundle g = mo1390g();
        if (g != null) {
            z = g.getBoolean("searching");
            str = g.getString("mapRid");
        } else {
            z = false;
            str = null;
        }
        this.mSearchResultView.setOnResultItemClickListener(new C1260a(this, (C1262a) null));
        this.mSearchResultView.mo5657b();
        this.f4380a.mo5525a((C1319b) new C1261b(this, (C1262a) null));
        this.f4380a.mo5526a(z, true);
        this.f4498a.mo20995a(C7101g.GROUP_NAVIGATION);
        this.f4499b = this.f4498a.mo21011d();
        this.f4380a.mo17239m();
        if (z) {
            this.f4500c = true;
        } else if (this.f4501d == null) {
            new C6053f(this.f4380a).mo16004c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").mo16543b(new C1262a(this));
        } else {
            this.f4499b.postDelayed(new C1263b(this), 500);
        }
        this.mRootLayout.addView(this.f4499b, 0, new RelativeLayout.LayoutParams(-2, -2));
        if (str != null) {
            this.f4498a.mo21009b(str);
        }
    }

    /* renamed from: M */
    public void mo1293M() {
        this.f4498a.mo21124b(true);
        this.f4380a.mo5525a((C1319b) null);
        this.mSearchResultView.mo5658c();
        this.mRootLayout.removeView(this.f4499b);
        C7089b bVar = this.f4498a;
        if (bVar != null) {
            bVar.mo21017j();
        }
        this.f4499b = null;
        C4978b.m19617a().mo13993b();
        super.mo1293M();
    }

    /* renamed from: a */
    public void mo5602a(C7089b bVar) {
        this.f4498a = bVar;
    }

    /* renamed from: a */
    public void mo5603a(C7095d dVar) {
        this.f4501d = dVar;
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        C4978b.m19617a().mo13994c();
        m6245fa();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_navigation;
    }
}
