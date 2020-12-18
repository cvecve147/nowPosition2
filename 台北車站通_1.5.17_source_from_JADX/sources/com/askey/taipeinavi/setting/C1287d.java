package com.askey.taipeinavi.setting;

import android.content.Context;
import android.widget.CompoundButton;
import com.askey.taipeinavi.p058d.C1213g;

/* renamed from: com.askey.taipeinavi.setting.d */
class C1287d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SettingFragment f4545a;

    C1287d(SettingFragment settingFragment) {
        this.f4545a = settingFragment;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1213g.m6050b((Context) this.f4545a.f4380a, z);
    }
}
