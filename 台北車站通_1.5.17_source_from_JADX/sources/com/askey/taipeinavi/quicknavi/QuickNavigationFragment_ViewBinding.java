package com.askey.taipeinavi.quicknavi;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class QuickNavigationFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private QuickNavigationFragment f4528a;

    public QuickNavigationFragment_ViewBinding(QuickNavigationFragment quickNavigationFragment, View view) {
        this.f4528a = quickNavigationFragment;
        quickNavigationFragment.mLLayMain = (LinearLayout) C1153c.m5853c(view, R.id.prLayMain, "field 'mLLayMain'", LinearLayout.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        QuickNavigationFragment quickNavigationFragment = this.f4528a;
        if (quickNavigationFragment != null) {
            this.f4528a = null;
            quickNavigationFragment.mLLayMain = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
