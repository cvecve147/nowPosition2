package com.askey.taipeinavi.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.p007v4.app.C0270D;
import android.support.p007v4.app.C0339l;
import android.support.p007v4.widget.DrawerLayout;
import android.support.p011v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.TaipeiNaviActivity;
import com.askey.taipeinavi.p053a.C1178b;
import com.askey.taipeinavi.p056c.C1190c;
import com.askey.taipeinavi.p058d.C1212f;
import com.askey.taipeinavi.p058d.C1213g;
import com.askey.taipeinavi.p059ui.C1319b;
import com.askey.taipeinavi.p059ui.SearchView;
import com.openlife.checkme.sdk.C4978b;
import com.openlife.checkme.sdk.C4995e;
import com.stomap.stomapbutterflysdk.C5103b;
import com.stomap.stomapbutterflysdk.STOMAPButterflySDK;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p206l.p207a.C6058d;
import p267i.p274b.p275a.p276a.C6695b;
import p267i.p274b.p282c.C6744e;
import p267i.p274b.p282c.C6749j;
import p267i.p274b.p283d.C6775k;

public class HomeActivity extends C6744e {

    /* renamed from: a */
    private static HomeActivity f4415a;

    /* renamed from: b */
    private static int f4416b;

    /* renamed from: c */
    private TextView f4417c;

    /* renamed from: d */
    private TextView f4418d;

    /* renamed from: e */
    private TextView f4419e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f4420f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1254x f4421g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1319b f4422h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1229I f4423i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4978b f4424j = C4978b.m19617a();

    /* renamed from: k */
    private C4995e f4425k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f4426l = false;
    DrawerLayout mDLayMain;
    EditText mEtxtSearch;
    NavigationView mNavView;
    SearchView mSearchView;
    TextView mTbtnToolbarBack;
    TextView mTbtnToolbarRight;
    View mToolbarHome;
    View mToolbarNormal;
    TextView mTxtToolbarTitle;

    /* renamed from: com.askey.taipeinavi.home.HomeActivity$a */
    private class C1222a implements C1178b.C1181c {
        private C1222a() {
        }

        /* synthetic */ C1222a(HomeActivity homeActivity, C1232b bVar) {
            this();
        }

        /* renamed from: a */
        public void mo5473a(int i) {
            HomeActivity.this.runOnUiThread(new C1236f(this, i));
        }

        /* renamed from: a */
        public void mo5474a(int i, C6695b.C6696a aVar) {
            HomeActivity.this.runOnUiThread(new C1235e(this, i, aVar));
        }
    }

    /* renamed from: com.askey.taipeinavi.home.HomeActivity$b */
    private class C1223b implements View.OnClickListener {

        /* renamed from: a */
        private C1225d f4428a;

        private C1223b() {
            this.f4428a = new C1225d(HomeActivity.this, (C1232b) null);
        }

        /* synthetic */ C1223b(HomeActivity homeActivity, C1232b bVar) {
            this();
        }

        public void onClick(View view) {
            if (!C6775k.m25615b(HomeActivity.this)) {
                C1212f.m6040d(HomeActivity.this);
                return;
            }
            switch (view.getId()) {
                case R.id.tbtnLogin /*2131296869*/:
                    if (C1213g.m6074q(HomeActivity.this)) {
                        C1213g.m6077t(HomeActivity.this);
                        C1213g.m6078u(HomeActivity.this);
                        HomeActivity.this.m6093e(false);
                        HomeActivity.this.f4424j.mo13991a("");
                        return;
                    }
                    HomeActivity.this.f4421g.mo5574a((C1221H) this.f4428a);
                    return;
                case R.id.tbtnRegister /*2131296870*/:
                    HomeActivity.this.f4421g.mo5583b((C1221H) this.f4428a);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.askey.taipeinavi.home.HomeActivity$c */
    private class C1224c implements C1319b {
        private C1224c() {
        }

        /* synthetic */ C1224c(HomeActivity homeActivity, C1232b bVar) {
            this();
        }

        /* renamed from: a */
        public void mo5544a() {
            if (HomeActivity.this.f4422h != null) {
                HomeActivity.this.f4422h.mo5544a();
            }
        }

        /* renamed from: a */
        public void mo5545a(String str) {
            if (HomeActivity.this.f4422h != null) {
                HomeActivity.this.f4422h.mo5545a(str);
            }
        }

        /* renamed from: b */
        public void mo5546b(String str) {
            HomeActivity.this.mo5529c(false);
            if (HomeActivity.this.f4422h != null) {
                HomeActivity.this.f4422h.mo5546b(str);
            }
        }

        public void onCancel() {
            HomeActivity.this.mo5526a(false, false);
            if (HomeActivity.this.f4422h != null) {
                HomeActivity.this.f4422h.onCancel();
            }
        }
    }

    /* renamed from: com.askey.taipeinavi.home.HomeActivity$d */
    private class C1225d implements C1221H {
        private C1225d() {
        }

        /* synthetic */ C1225d(HomeActivity homeActivity, C1232b bVar) {
            this();
        }

        /* renamed from: a */
        public void mo5524a(String str) {
            HomeActivity.this.mo17243q();
            HomeActivity.this.f4421g.mo1304ea();
            HomeActivity.this.f4423i.mo5552a(str);
        }
    }

    /* renamed from: c */
    private void m6089c(Intent intent) {
        if (this.f4425k.mo14016a(intent)) {
            this.f4425k.mo14018b(intent);
        }
    }

    /* renamed from: e */
    public static void m6092e(String str) {
        C6775k.m25614a((Context) f4415a, (String) null, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m6093e(boolean z) {
        TextView textView;
        String str;
        if (z) {
            this.f4417c.setText(R.string.txt_logout);
            this.f4417c.setTextColor(C1006a.m5386a((Context) this, (int) R.color.nav_logout));
            this.f4417c.setBackgroundResource(R.drawable.bg_radius);
            this.f4418d.setVisibility(4);
            this.f4419e.setText(R.string.txt_welcome_login);
            textView = this.f4420f;
            str = C1213g.m6072o(this);
        } else {
            this.f4417c.setText(R.string.txt_login);
            this.f4417c.setTextColor(C1006a.m5386a((Context) this, (int) R.color.nav_login));
            this.f4417c.setBackgroundResource(R.drawable.bg_radius_fill);
            this.f4418d.setVisibility(0);
            this.f4419e.setText(R.string.txt_welcome_not_login);
            textView = this.f4420f;
            str = "0";
        }
        textView.setText(str);
    }

    /* renamed from: f */
    private void m6095f(String str) {
        Intent intent = new Intent(this, STOMAPButterflySDK.class);
        intent.putExtra("APIKEY", "5a509130fe0d431d9da4e2e4e4912d85");
        intent.putExtra("ALIASKEY", str);
        intent.putExtra("ALIASTYPE", C5103b.OTHER);
        startService(intent);
    }

    /* renamed from: f */
    private void m6096f(boolean z) {
        super.mo17233a(z, R.id.flayContainer);
        int i = z ? R.color.main_status_bar : 17170445;
        mo17237d(i);
        mo17241o().setBackgroundColor(C1006a.m5386a((Context) this, i));
    }

    /* renamed from: s */
    public static int m6097s() {
        return f4416b;
    }

    /* renamed from: w */
    private void m6098w() {
        String m = C1213g.m6070m(this);
        if (m != null) {
            m6095f(m);
        }
        C1190c.m5957a().mo5482a(getApplication());
    }

    /* renamed from: a */
    public void mo5525a(C1319b bVar) {
        this.f4422h = bVar;
    }

    /* renamed from: a */
    public void mo5526a(boolean z, boolean z2) {
        mo5542v();
        this.mSearchView.setVisibility(0);
        if (z2) {
            this.mSearchView.mo5661a();
        }
        this.mSearchView.setSearchFocus(z);
        mo5529c(!z);
    }

    /* renamed from: b */
    public void mo5527b(boolean z, int i) {
        mo5529c(z);
    }

    /* renamed from: c */
    public void mo5528c(String str) {
        this.mTbtnToolbarRight.setText(str);
    }

    /* renamed from: c */
    public void mo5529c(boolean z) {
        TextView textView;
        int i;
        if (z) {
            textView = this.mTbtnToolbarBack;
            i = 0;
        } else {
            textView = this.mTbtnToolbarBack;
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: d */
    public void mo5530d(String str) {
        this.mEtxtSearch.setText(str);
    }

    /* renamed from: d */
    public void mo5531d(boolean z) {
        TextView textView;
        int i;
        if (z) {
            textView = this.mTbtnToolbarRight;
            i = 0;
        } else {
            textView = this.mTbtnToolbarRight;
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: f */
    public void mo5532f(int i) {
        this.mTbtnToolbarRight.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    /* renamed from: g */
    public void mo5533g(int i) {
        this.mToolbarHome.setVisibility(8);
        this.mToolbarNormal.setVisibility(0);
        this.mSearchView.setVisibility(8);
        if (i != -1) {
            this.mTxtToolbarTitle.setText(i);
        }
        m6096f(true);
        this.mDLayMain.setDrawerLockMode(1);
    }

    public void onBackClicked() {
        onBackPressed();
    }

    public void onBackPressed() {
        View.OnClickListener onClickListener = this.f18753h;
        if (onClickListener != null) {
            onClickListener.onClick(this.mTbtnToolbarBack);
            return;
        }
        C6749j jVar = this.f18748c;
        if (jVar == null || !jVar.mo5481a()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_home);
        f4415a = this;
        this.f4423i = new C1229I(this, new C1222a(this, (C1232b) null));
        this.f4425k = new C4995e(this);
        this.f4425k.mo14015a((C4995e.C4996a) new C1232b(this));
        this.f4424j.mo13988a((int) R.color.taipeinavi);
        this.f4424j.mo13993b();
        if (bundle != null) {
            startActivity(new Intent(this, TaipeiNaviActivity.class));
            finish();
            return;
        }
        this.f4421g = new C1254x();
        C0270D a = mo1430d().mo1494a();
        a.mo1123a((int) R.id.flayContainer, (C0339l) this.f4421g);
        a.mo1122a();
        ButterKnife.m5840a((Activity) this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mo2613a(toolbar);
        mo17230a(toolbar, R.id.txtToolbarTitle, -1, -1);
        this.mSearchView.setOnSearchViewListener(new C1224c(this, (C1232b) null));
        this.mDLayMain.mo2061a((DrawerLayout.C0518c) new C1233c(this));
        View a2 = this.mNavView.mo675a(0);
        a2.setPadding((int) getResources().getDimension(R.dimen.drawer_nav_header_left), mo17240n(), (int) getResources().getDimension(R.dimen.drawer_nav_header_right), (int) getResources().getDimension(R.dimen.drawer_nav_header_bottom));
        this.mNavView.setNavigationItemSelectedListener(new C1234d(this));
        C1223b bVar = new C1223b(this, (C1232b) null);
        this.f4417c = (TextView) a2.findViewById(R.id.tbtnLogin);
        this.f4417c.setOnClickListener(bVar);
        this.f4418d = (TextView) a2.findViewById(R.id.tbtnRegister);
        this.f4418d.setOnClickListener(bVar);
        this.f4419e = (TextView) a2.findViewById(R.id.txtHelloSub);
        this.f4420f = (TextView) a2.findViewById(R.id.txtPoint);
        m6093e(C1213g.m6074q(this));
        String stringExtra = getIntent().getStringExtra("BUNDLE_EMERGENCY_MESSAGE");
        if (stringExtra != null) {
            getIntent().removeExtra("BUNDLE_EMERGENCY_MESSAGE");
            m6092e(stringExtra);
        }
        mo17236b(true);
        m6089c(getIntent());
        m6098w();
    }

    public void onDestroy() {
        f4416b = 0;
        this.f4425k.mo14014a();
        this.f4423i.mo5469a();
        this.f4423i = null;
        f4415a = null;
        C6058d.m22969a();
        C6058d.m22968a((Activity) this).mo16026h();
        super.onDestroy();
    }

    public void onDrawerClicked() {
        mo5540t();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        m6089c(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        f4416b = 2;
        this.f4425k.mo14017b();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        f4416b = 1;
        super.onResume();
        this.f4425k.mo14019c();
    }

    public void onRightButtonClicked() {
        View.OnClickListener onClickListener = this.f18754i;
        if (onClickListener != null) {
            onClickListener.onClick(this.mTbtnToolbarRight);
        }
    }

    public void onSearchClicked() {
        this.f4421g.mo5588h(true);
    }

    public void onSosClicked() {
        this.f4421g.mo5596oa();
    }

    /* renamed from: r */
    public void mo5539r() {
        this.mDLayMain.mo2057a(8388611);
    }

    /* renamed from: t */
    public void mo5540t() {
        this.mDLayMain.mo2089f(8388611);
    }

    /* renamed from: u */
    public void mo5541u() {
        this.mToolbarHome.setVisibility(0);
        this.mToolbarNormal.setVisibility(8);
        m6096f(false);
        this.mDLayMain.setDrawerLockMode(0);
    }

    /* renamed from: v */
    public void mo5542v() {
        mo5533g(-1);
    }
}
