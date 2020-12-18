package com.askey.taipeinavi.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.askey.taipeinavi.setting.a */
class C1284a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MoreLinkFragment f4541a;

    C1284a(MoreLinkFragment moreLinkFragment) {
        this.f4541a = moreLinkFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent launchIntentForPackage = this.f4541a.f4380a.getPackageManager().getLaunchIntentForPackage("tms.tw.governmentcase.taipeitranwell");
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setData(Uri.parse("market://details?id=" + "tms.tw.governmentcase.taipeitranwell"));
            }
            this.f4541a.mo1350a(launchIntentForPackage);
        }
    }
}
