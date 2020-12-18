package com.askey.taipeinavi.home;

import android.support.design.widget.NavigationView;
import android.support.p007v4.widget.DrawerLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.p059ui.SearchView;

public class HomeActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HomeActivity f4432a;

    /* renamed from: b */
    private View f4433b;

    /* renamed from: c */
    private View f4434c;

    /* renamed from: d */
    private View f4435d;

    /* renamed from: e */
    private View f4436e;

    /* renamed from: f */
    private View f4437f;

    public HomeActivity_ViewBinding(HomeActivity homeActivity, View view) {
        this.f4432a = homeActivity;
        homeActivity.mToolbarHome = C1153c.m5849a(view, R.id.toolbarHome, "field 'mToolbarHome'");
        homeActivity.mToolbarNormal = C1153c.m5849a(view, R.id.toolbarNormal, "field 'mToolbarNormal'");
        homeActivity.mTxtToolbarTitle = (TextView) C1153c.m5853c(view, R.id.txtToolbarTitle, "field 'mTxtToolbarTitle'", TextView.class);
        View a = C1153c.m5849a(view, R.id.tbtnToolbarBack, "field 'mTbtnToolbarBack' and method 'onBackClicked'");
        homeActivity.mTbtnToolbarBack = (TextView) C1153c.m5850a(a, R.id.tbtnToolbarBack, "field 'mTbtnToolbarBack'", TextView.class);
        this.f4433b = a;
        a.setOnClickListener(new C1237g(this, homeActivity));
        View a2 = C1153c.m5849a(view, R.id.tbtnToolbarRight, "field 'mTbtnToolbarRight' and method 'onRightButtonClicked'");
        homeActivity.mTbtnToolbarRight = (TextView) C1153c.m5850a(a2, R.id.tbtnToolbarRight, "field 'mTbtnToolbarRight'", TextView.class);
        this.f4434c = a2;
        a2.setOnClickListener(new C1238h(this, homeActivity));
        homeActivity.mSearchView = (SearchView) C1153c.m5853c(view, R.id.viewSearch, "field 'mSearchView'", SearchView.class);
        homeActivity.mEtxtSearch = (EditText) C1153c.m5853c(view, R.id.etxtSearch, "field 'mEtxtSearch'", EditText.class);
        homeActivity.mDLayMain = (DrawerLayout) C1153c.m5853c(view, R.id.dlayMain, "field 'mDLayMain'", DrawerLayout.class);
        homeActivity.mNavView = (NavigationView) C1153c.m5853c(view, R.id.navView, "field 'mNavView'", NavigationView.class);
        View a3 = C1153c.m5849a(view, R.id.ibtnDrawer, "method 'onDrawerClicked'");
        this.f4435d = a3;
        a3.setOnClickListener(new C1239i(this, homeActivity));
        View a4 = C1153c.m5849a(view, R.id.ibtnSos, "method 'onSosClicked'");
        this.f4436e = a4;
        a4.setOnClickListener(new C1240j(this, homeActivity));
        View a5 = C1153c.m5849a(view, R.id.ibtnSearch, "method 'onSearchClicked'");
        this.f4437f = a5;
        a5.setOnClickListener(new C1241k(this, homeActivity));
    }

    /* renamed from: a */
    public void mo5375a() {
        HomeActivity homeActivity = this.f4432a;
        if (homeActivity != null) {
            this.f4432a = null;
            homeActivity.mToolbarHome = null;
            homeActivity.mToolbarNormal = null;
            homeActivity.mTxtToolbarTitle = null;
            homeActivity.mTbtnToolbarBack = null;
            homeActivity.mTbtnToolbarRight = null;
            homeActivity.mSearchView = null;
            homeActivity.mEtxtSearch = null;
            homeActivity.mDLayMain = null;
            homeActivity.mNavView = null;
            this.f4433b.setOnClickListener((View.OnClickListener) null);
            this.f4433b = null;
            this.f4434c.setOnClickListener((View.OnClickListener) null);
            this.f4434c = null;
            this.f4435d.setOnClickListener((View.OnClickListener) null);
            this.f4435d = null;
            this.f4436e.setOnClickListener((View.OnClickListener) null);
            this.f4436e = null;
            this.f4437f.setOnClickListener((View.OnClickListener) null);
            this.f4437f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
