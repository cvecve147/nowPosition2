package com.askey.taipeinavi.sos;

import android.support.p007v4.app.FragmentTabHost;
import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;

public class SosFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SosFragment f4572a;

    public SosFragment_ViewBinding(SosFragment sosFragment, View view) {
        this.f4572a = sosFragment;
        sosFragment.tabHost = (FragmentTabHost) C1153c.m5853c(view, 16908306, "field 'tabHost'", FragmentTabHost.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        SosFragment sosFragment = this.f4572a;
        if (sosFragment != null) {
            this.f4572a = null;
            sosFragment.tabHost = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
