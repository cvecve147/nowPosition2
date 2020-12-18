package com.askey.taipeinavi.sos;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class SosContactFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SosContactFragment f4567a;

    public SosContactFragment_ViewBinding(SosContactFragment sosContactFragment, View view) {
        this.f4567a = sosContactFragment;
        sosContactFragment.mLLaySos = (LinearLayout) C1153c.m5853c(view, R.id.llaySosContact, "field 'mLLaySos'", LinearLayout.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        SosContactFragment sosContactFragment = this.f4567a;
        if (sosContactFragment != null) {
            this.f4567a = null;
            sosContactFragment.mLLaySos = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
