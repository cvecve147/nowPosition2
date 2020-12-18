package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.common.c */
public class C1986c extends DialogFragment {

    /* renamed from: a */
    private Dialog f6358a = null;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f6359b = null;

    /* renamed from: a */
    public static C1986c m8738a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1986c cVar = new C1986c();
        C2061y.m9068a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f6358a = dialog2;
        if (onCancelListener != null) {
            cVar.f6359b = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6359b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f6358a == null) {
            setShowsDialog(false);
        }
        return this.f6358a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
