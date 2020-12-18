package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.p007v4.app.C0339l;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.i */
public abstract class C2030i implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static C2030i m8953a(Activity activity, Intent intent, int i) {
        return new C2001D(intent, activity, i);
    }

    /* renamed from: a */
    public static C2030i m8954a(C0339l lVar, Intent intent, int i) {
        return new C2002E(intent, lVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7569a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo7569a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
