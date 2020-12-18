package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p007v4.app.C0297Y;
import android.support.p007v4.app.C0344n;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C1930f;
import com.google.android.gms.common.internal.C2028g;
import com.google.android.gms.common.internal.C2030i;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2087i;
import com.google.android.gms.common.util.C2092n;
import p101d.p129g.p131b.p132a.p133a.C5460a;
import p101d.p129g.p131b.p132a.p133a.C5461b;

/* renamed from: com.google.android.gms.common.e */
public class C1991e extends C1993f {

    /* renamed from: c */
    private static final Object f6365c = new Object();

    /* renamed from: d */
    private static final C1991e f6366d = new C1991e();

    /* renamed from: e */
    public static final int f6367e = C1993f.f6371a;

    /* renamed from: f */
    private String f6368f;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.e$a */
    private class C1992a extends Handler {

        /* renamed from: a */
        private final Context f6369a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1992a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f6369a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int c = C1991e.this.mo7540c(this.f6369a);
            if (C1991e.this.mo7542c(c)) {
                C1991e.this.mo7541c(this.f6369a, c);
            }
        }
    }

    C1991e() {
    }

    /* renamed from: a */
    static Dialog m8750a(Context context, int i, C2030i iVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C2028g.m8949b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a = C2028g.m8945a(context, i);
        if (a != null) {
            builder.setPositiveButton(a, iVar);
        }
        String e = C2028g.m8952e(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    /* renamed from: a */
    public static C1991e m8751a() {
        return f6366d;
    }

    @TargetApi(26)
    /* renamed from: a */
    private final String m8752a(Context context, NotificationManager notificationManager) {
        C2061y.m9077b(C2092n.m9171l());
        String b = m8755b();
        if (b == null) {
            b = "com.google.android.gms.availability";
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b);
            String b2 = C2028g.m8948b(context);
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel(b, b2, 4);
            } else if (!b2.equals(notificationChannel.getName())) {
                notificationChannel.setName(b2);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return b;
    }

    /* renamed from: a */
    static void m8753a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof C0344n) {
            C2067n.m9089a(dialog, onCancelListener).mo1299a(((C0344n) activity).mo1430d(), str);
            return;
        }
        C1986c.m8738a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m8754a(Context context, int i, String str, PendingIntent pendingIntent) {
        Notification notification;
        int i2;
        if (i == 18) {
            mo7543d(context);
        } else if (pendingIntent != null) {
            String d = C2028g.m8951d(context, i);
            String c = C2028g.m8950c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (C2087i.m9151c(context)) {
                C2061y.m9077b(C2092n.m9167h());
                Notification.Builder style = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(d).setStyle(new Notification.BigTextStyle().bigText(c));
                if (C2087i.m9152d(context)) {
                    style.addAction(C5460a.common_full_open_on_phone, resources.getString(C5461b.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
                if (C2092n.m9171l() && C2092n.m9171l()) {
                    style.setChannelId(m8752a(context, notificationManager));
                }
                notification = style.build();
            } else {
                C0297Y.C0301d dVar = new C0297Y.C0301d(context);
                dVar.mo1221f(17301642);
                dVar.mo1218d((CharSequence) resources.getString(C5461b.common_google_play_services_notification_ticker));
                dVar.mo1198a(System.currentTimeMillis());
                dVar.mo1206a(true);
                dVar.mo1199a(pendingIntent);
                dVar.mo1214c((CharSequence) d);
                dVar.mo1210b((CharSequence) c);
                dVar.mo1216c(true);
                C0297Y.C0300c cVar = new C0297Y.C0300c();
                cVar.mo1193a((CharSequence) c);
                dVar.mo1203a((C0297Y.C0304g) cVar);
                if (C2092n.m9171l() && C2092n.m9171l()) {
                    dVar.mo1211b(m8752a(context, notificationManager));
                }
                notification = dVar.mo1194a();
            }
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C2064k.zzbt.set(false);
            } else {
                i2 = 39789;
            }
            if (str == null) {
                notificationManager.notify(i2, notification);
            } else {
                notificationManager.notify(str, i2, notification);
            }
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: b */
    private final String m8755b() {
        String str;
        synchronized (f6365c) {
            str = this.f6368f;
        }
        return str;
    }

    /* renamed from: a */
    public int mo7526a(Context context, int i) {
        return super.mo7526a(context, i);
    }

    /* renamed from: a */
    public Dialog mo7527a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m8750a((Context) activity, i, C2030i.m8953a(activity, mo7532a((Context) activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: a */
    public PendingIntent mo7528a(Context context, int i, int i2) {
        return super.mo7528a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo7529a(Context context, int i, int i2, String str) {
        return super.mo7529a(context, i, i2, str);
    }

    /* renamed from: a */
    public PendingIntent mo7530a(Context context, ConnectionResult connectionResult) {
        return connectionResult.mo7216e() ? connectionResult.mo7215d() : mo7528a(context, connectionResult.mo7213b(), 0);
    }

    @Deprecated
    /* renamed from: a */
    public Intent mo7531a(int i) {
        return super.mo7531a(i);
    }

    /* renamed from: a */
    public Intent mo7532a(Context context, int i, String str) {
        return super.mo7532a(context, i, str);
    }

    /* renamed from: a */
    public C1930f mo7533a(Context context, C1930f.C1931a aVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C1930f fVar = new C1930f(aVar);
        context.registerReceiver(fVar, intentFilter);
        fVar.mo7448a(context);
        if (mo7546a(context, "com.google.android.gms")) {
            return fVar;
        }
        aVar.mo7380a();
        fVar.mo7447a();
        return null;
    }

    /* renamed from: a */
    public boolean mo7534a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = mo7530a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m8754a(context, connectionResult.mo7213b(), (String) null, GoogleApiActivity.m8251a(context, a, i));
        return true;
    }

    /* renamed from: b */
    public int mo7535b(Context context) {
        return super.mo7535b(context);
    }

    /* renamed from: b */
    public final String mo7536b(int i) {
        return super.mo7536b(i);
    }

    /* renamed from: b */
    public void mo7537b(Context context, int i, String str) {
        m8754a(context, i, str, mo7529a(context, i, 0, "n"));
    }

    /* renamed from: b */
    public boolean mo7538b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = mo7527a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m8753a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: b */
    public boolean mo7539b(Context context, int i) {
        return super.mo7539b(context, i);
    }

    /* renamed from: c */
    public int mo7540c(Context context) {
        return super.mo7540c(context);
    }

    /* renamed from: c */
    public void mo7541c(Context context, int i) {
        mo7537b(context, i, (String) null);
    }

    /* renamed from: c */
    public final boolean mo7542c(int i) {
        return super.mo7542c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo7543d(Context context) {
        new C1992a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
