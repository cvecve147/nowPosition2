package com.askey.taipeinavi.setting;

import android.content.Context;
import android.widget.CompoundButton;
import com.askey.taipeinavi.p058d.C1213g;

/* renamed from: com.askey.taipeinavi.setting.e */
class C1288e implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SettingFragment f4546a;

    C1288e(SettingFragment settingFragment) {
        this.f4546a = settingFragment;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f4546a.f4380a.mo17243q();
            this.f4546a.m6343fa();
            return;
        }
        C1213g.m6059e((Context) this.f4546a.f4380a, false);
    }
}
