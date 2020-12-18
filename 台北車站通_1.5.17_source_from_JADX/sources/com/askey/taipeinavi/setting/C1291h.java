package com.askey.taipeinavi.setting;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import p267i.p274b.p283d.C6766e;

/* renamed from: com.askey.taipeinavi.setting.h */
class C1291h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SettingFragment f4549a;

    C1291h(SettingFragment settingFragment) {
        this.f4549a = settingFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        AlertDialog unused = this.f4549a.f4532a = null;
        C6766e.m25594a((Activity) this.f4549a.f4380a);
    }
}
