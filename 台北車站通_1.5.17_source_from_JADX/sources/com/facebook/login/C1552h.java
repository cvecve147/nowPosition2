package com.facebook.login;

import android.content.DialogInterface;

/* renamed from: com.facebook.login.h */
class C1552h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DeviceAuthDialog f5320a;

    C1552h(DeviceAuthDialog deviceAuthDialog) {
        this.f5320a = deviceAuthDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5320a.f5259ma.setContentView(this.f5320a.m7159j(false));
        DeviceAuthDialog deviceAuthDialog = this.f5320a;
        deviceAuthDialog.mo6279a(deviceAuthDialog.f5262pa);
    }
}
