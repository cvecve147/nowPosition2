package com.askey.taipeinavi.home;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class HomeFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HomeFragment f4443a;

    public HomeFragment_ViewBinding(HomeFragment homeFragment, View view) {
        this.f4443a = homeFragment;
        homeFragment.mLLayMain = (LinearLayout) C1153c.m5853c(view, R.id.prLayMain, "field 'mLLayMain'", LinearLayout.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        HomeFragment homeFragment = this.f4443a;
        if (homeFragment != null) {
            this.f4443a = null;
            homeFragment.mLLayMain = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
