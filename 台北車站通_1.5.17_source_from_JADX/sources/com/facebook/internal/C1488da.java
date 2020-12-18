package com.facebook.internal;

import android.content.DialogInterface;

/* renamed from: com.facebook.internal.da */
class C1488da implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ C1496ha f5142a;

    C1488da(C1496ha haVar) {
        this.f5142a = haVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5142a.cancel();
    }
}
