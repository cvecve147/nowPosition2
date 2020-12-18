package com.askey.taipeinavi.navigation;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.p059ui.SearchResultView;

public class NavigationFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private NavigationFragment f4504a;

    public NavigationFragment_ViewBinding(NavigationFragment navigationFragment, View view) {
        this.f4504a = navigationFragment;
        navigationFragment.mSearchResultView = (SearchResultView) C1153c.m5853c(view, R.id.viewSearchResult, "field 'mSearchResultView'", SearchResultView.class);
        navigationFragment.mRootLayout = (RelativeLayout) C1153c.m5853c(view, R.id.rootLayout, "field 'mRootLayout'", RelativeLayout.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        NavigationFragment navigationFragment = this.f4504a;
        if (navigationFragment != null) {
            this.f4504a = null;
            navigationFragment.mSearchResultView = null;
            navigationFragment.mRootLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
