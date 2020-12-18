package com.askey.taipeinavi.setting;

import android.content.Context;
import android.widget.CompoundButton;
import com.askey.taipeinavi.p058d.C1213g;

/* renamed from: com.askey.taipeinavi.setting.c */
class C1286c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ SettingFragment f4544a;

    C1286c(SettingFragment settingFragment) {
        this.f4544a = settingFragment;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1213g.m6057d((Context) this.f4544a.f4380a, z);
    }
}
