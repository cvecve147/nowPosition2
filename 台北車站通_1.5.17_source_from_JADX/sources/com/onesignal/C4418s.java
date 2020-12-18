package com.onesignal;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.onesignal.s */
class C4418s implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ Intent f13027a;

    /* renamed from: b */
    final /* synthetic */ C4424t f13028b;

    C4418s(C4424t tVar, Intent intent) {
        this.f13028b = tVar;
        this.f13027a = intent;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C4299V.m17082b(this.f13028b.f13044a, this.f13027a);
    }
}
