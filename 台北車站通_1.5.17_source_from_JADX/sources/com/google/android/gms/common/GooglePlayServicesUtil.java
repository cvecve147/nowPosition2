package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.p007v4.app.C0339l;
import com.google.android.gms.common.internal.C2030i;

public final class GooglePlayServicesUtil extends C2064k {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (C2064k.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return C1991e.m8751a().mo7527a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C2064k.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return C2064k.getErrorString(i);
    }

    public static Context getRemoteContext(Context context) {
        return C2064k.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return C2064k.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return C2064k.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return C2064k.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, (C0339l) null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, C0339l lVar, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (C2064k.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        C1991e a = C1991e.m8751a();
        if (lVar == null) {
            return a.mo7538b(activity, i, i2, onCancelListener);
        }
        Dialog a2 = C1991e.m8750a((Context) activity, i, C2030i.m8954a(lVar, C1991e.m8751a().mo7532a((Context) activity, i, "d"), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        C1991e.m8753a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        C1991e a = C1991e.m8751a();
        if (C2064k.isPlayServicesPossiblyUpdating(context, i) || C2064k.isPlayStorePossiblyUpdating(context, i)) {
            a.mo7543d(context);
        } else {
            a.mo7541c(context, i);
        }
    }
}
