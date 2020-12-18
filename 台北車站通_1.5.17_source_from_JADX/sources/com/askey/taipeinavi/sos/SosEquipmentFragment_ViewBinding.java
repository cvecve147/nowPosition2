package com.askey.taipeinavi.sos;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class SosEquipmentFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SosEquipmentFragment f4571a;

    public SosEquipmentFragment_ViewBinding(SosEquipmentFragment sosEquipmentFragment, View view) {
        this.f4571a = sosEquipmentFragment;
        sosEquipmentFragment.mRootLayout = (LinearLayout) C1153c.m5853c(view, R.id.rootLayout, "field 'mRootLayout'", LinearLayout.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        SosEquipmentFragment sosEquipmentFragment = this.f4571a;
        if (sosEquipmentFragment != null) {
            this.f4571a = null;
            sosEquipmentFragment.mRootLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
