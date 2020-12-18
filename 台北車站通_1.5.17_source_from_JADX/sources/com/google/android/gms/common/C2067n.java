package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p007v4.app.C0336i;
import android.support.p007v4.app.C0350r;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.common.n */
public class C2067n extends C0336i {

    /* renamed from: fa */
    private Dialog f6526fa = null;

    /* renamed from: ga */
    private DialogInterface.OnCancelListener f6527ga = null;

    /* renamed from: a */
    public static C2067n m9089a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C2067n nVar = new C2067n();
        C2061y.m9068a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        nVar.f6526fa = dialog2;
        if (onCancelListener != null) {
            nVar.f6527ga = onCancelListener;
        }
        return nVar;
    }

    /* renamed from: a */
    public void mo1299a(C0350r rVar, String str) {
        super.mo1299a(rVar, str);
    }

    /* renamed from: n */
    public Dialog mo1307n(Bundle bundle) {
        if (this.f6526fa == null) {
            mo1306i(false);
        }
        return this.f6526fa;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6527ga;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
