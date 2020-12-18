package p267i.p274b.p283d;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: i.b.d.k */
public class C6775k {
    /* renamed from: a */
    public static AlertDialog m25600a(Context context, int i, int i2, int i3, int i4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        int i5 = i2;
        String str = null;
        String string = i != -1 ? context.getResources().getString(i) : null;
        if (i5 != -1) {
            str = context.getResources().getString(i2);
        }
        return m25607a(context, (View) null, string, str, i3, i4, onClickListener, onClickListener2);
    }

    /* renamed from: a */
    public static AlertDialog m25601a(Context context, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener) {
        return m25603a(context, (View) null, i, i2, i3, onClickListener);
    }

    /* renamed from: a */
    public static AlertDialog m25602a(Context context, int i, int i2, boolean z, DialogInterface.OnClickListener onClickListener) {
        return m25608a(context, i != -1 ? context.getString(i) : null, context.getString(i2), z, onClickListener);
    }

    /* renamed from: a */
    public static AlertDialog m25603a(Context context, View view, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener) {
        return m25605a(context, view, i != -1 ? context.getResources().getString(i) : null, i2, i3, onClickListener);
    }

    /* renamed from: a */
    public static AlertDialog m25604a(Context context, View view, int i, int i2, int i3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return m25606a(context, view, i != -1 ? context.getResources().getString(i) : null, i2, i3, onClickListener2, onClickListener);
    }

    /* renamed from: a */
    public static AlertDialog m25605a(Context context, View view, String str, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        return m25606a(context, view, str, i, i2, (DialogInterface.OnClickListener) null, onClickListener);
    }

    /* renamed from: a */
    public static AlertDialog m25606a(Context context, View view, String str, int i, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return m25607a(context, view, (String) null, str, i, i2, onClickListener, onClickListener2);
    }

    /* renamed from: a */
    public static AlertDialog m25607a(Context context, View view, String str, String str2, int i, int i2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(true);
        if (str != null) {
            builder.setTitle(str);
        }
        if (str2 != null) {
            builder.setMessage(str2);
        }
        if (view != null) {
            builder.setView(view);
        }
        if (i != -1) {
            if (onClickListener == null) {
                builder.setNegativeButton(i, new C6773i());
            } else {
                builder.setNegativeButton(i, onClickListener);
            }
        }
        if (onClickListener2 != null) {
            if (i2 != -1) {
                builder.setPositiveButton(i2, onClickListener2);
            } else {
                builder.setPositiveButton(C6764c.dialog_btn_ok, onClickListener2);
            }
        } else if (i2 != -1) {
            builder.setPositiveButton(i2, new C6774j());
        }
        AlertDialog create = builder.create();
        create.show();
        return create;
    }

    /* renamed from: a */
    public static AlertDialog m25608a(Context context, String str, String str2, boolean z, DialogInterface.OnClickListener onClickListener) {
        return m25609a(context, str, str2, z, (String) null, onClickListener);
    }

    /* renamed from: a */
    public static AlertDialog m25609a(Context context, String str, String str2, boolean z, String str3, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setMessage(str2);
        if (str != null) {
            builder.setTitle(str);
        }
        if (z) {
            builder.setNegativeButton(C6764c.dialog_btn_cancel, new C6771g());
        }
        if (onClickListener == null) {
            builder.setPositiveButton(C6764c.dialog_btn_ok, new C6772h());
        } else if (str3 != null) {
            builder.setPositiveButton(str3, onClickListener);
        } else {
            builder.setPositiveButton(C6764c.dialog_btn_ok, onClickListener);
        }
        AlertDialog create = builder.create();
        create.show();
        return create;
    }

    /* renamed from: a */
    public static void m25610a(Activity activity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
        intent.addFlags(1207959552);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
        }
    }

    /* renamed from: a */
    public static void m25611a(Activity activity, boolean z, String str) {
        m25612a(activity, z, (String) null, str);
    }

    /* renamed from: a */
    public static void m25612a(Activity activity, boolean z, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setCancelable(false);
        builder.setMessage(str2);
        if (str != null) {
            builder.setTitle(str);
        }
        builder.setPositiveButton(C6764c.dialog_btn_ok, new C6770f(z, activity));
        builder.create().show();
    }

    /* renamed from: a */
    public static void m25613a(Context context) {
        Activity activity = (Activity) context;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static void m25614a(Context context, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setMessage(str2);
        if (str != null) {
            builder.setTitle(str);
        }
        builder.setPositiveButton(C6764c.dialog_btn_ok, (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    /* renamed from: b */
    public static boolean m25615b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
    }

    /* renamed from: c */
    public static void m25616c(Context context) {
        Activity activity = (Activity) context;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(currentFocus, 0);
        }
    }
}
