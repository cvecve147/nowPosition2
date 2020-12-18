package com.facebook.login;

import android.content.DialogInterface;
import com.facebook.internal.C1480ba;

/* renamed from: com.facebook.login.i */
class C1553i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f5321a;

    /* renamed from: b */
    final /* synthetic */ C1480ba.C1482b f5322b;

    /* renamed from: c */
    final /* synthetic */ String f5323c;

    /* renamed from: d */
    final /* synthetic */ DeviceAuthDialog f5324d;

    C1553i(DeviceAuthDialog deviceAuthDialog, String str, C1480ba.C1482b bVar, String str2) {
        this.f5324d = deviceAuthDialog;
        this.f5321a = str;
        this.f5322b = bVar;
        this.f5323c = str2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5324d.m7141a(this.f5321a, this.f5322b, this.f5323c);
    }
}
