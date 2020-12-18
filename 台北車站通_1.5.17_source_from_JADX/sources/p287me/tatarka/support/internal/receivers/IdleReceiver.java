package p287me.tatarka.support.internal.receivers;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import p013b.p018b.p028h.p029a.C1024f;
import p245f.p246a.p247a.p248a.p249a.C6448b;
import p287me.tatarka.support.internal.job.C6797d;
import p287me.tatarka.support.internal.job.JobServiceCompat;
import p287me.tatarka.support.internal.receivers.C6801b;

/* renamed from: me.tatarka.support.internal.receivers.IdleReceiver */
public class IdleReceiver extends C1024f {

    /* renamed from: c */
    private static IdleReceiver f18881c;

    @TargetApi(19)
    /* renamed from: a */
    private static void m25801a(AlarmManager alarmManager, int i, long j, long j2, PendingIntent pendingIntent) {
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("samsung");
        if (Build.VERSION.SDK_INT < 19 || equalsIgnoreCase) {
            alarmManager.set(i, j, pendingIntent);
        } else {
            alarmManager.setWindow(i, j, j2, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m25802a(Context context) {
        IntentFilter b = m25804b();
        f18881c = new IdleReceiver();
        context.getApplicationContext().registerReceiver(f18881c, b);
    }

    /* renamed from: a */
    public static void m25803a(Context context, C6803c cVar) {
        cVar.f18891g.set(!((PowerManager) context.getSystemService("power")).isScreenOn() || C6801b.m25830a(context).mo17392f());
        m25807d(context);
        m25802a(context);
    }

    @TargetApi(17)
    /* renamed from: b */
    private static IntentFilter m25804b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        if (Build.VERSION.SDK_INT >= 17) {
            intentFilter.addAction("android.intent.action.DREAMING_STARTED");
            intentFilter.addAction("android.intent.action.DREAMING_STOPPED");
        }
        return intentFilter;
    }

    /* renamed from: b */
    public static void m25805b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, IdleReceiver.class);
        intent.setAction("me.tatarka.support.server.job.controllers.IdleReceiver.ACTION_TRIGGER_IDLE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 536870912);
        if (broadcast != null) {
            alarmManager.cancel(broadcast);
        }
        m25806c(context);
    }

    /* renamed from: c */
    private static void m25806c(Context context) {
        if (f18881c != null) {
            context.getApplicationContext().unregisterReceiver(f18881c);
        }
    }

    /* renamed from: d */
    private static void m25807d(Context context) {
        Intent intent = new Intent(context, IdleReceiver.class);
        intent.setAction("me.tatarka.support.server.job.controllers.IdleReceiver.ACTION_TRIGGER_IDLE");
        m25801a((AlarmManager) context.getSystemService("alarm"), 2, SystemClock.elapsedRealtime() + 5820000, 300000, PendingIntent.getBroadcast(context, 0, intent, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17382a(Context context, boolean z) {
        C6797d a = C6797d.m25778a(context);
        synchronized (a) {
            C6448b<C6803c> b = a.mo17377b();
            for (int i = 0; i < b.size(); i++) {
                b.mo16567e(i).f18891g.set(z);
            }
        }
        C1024f.m5440b(context, JobServiceCompat.m25770c(context));
    }

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        String action = intent.getAction();
        C6801b a = C6801b.m25830a(context);
        boolean f = a.mo17392f();
        if (action.equals("android.intent.action.DREAMING_STARTED")) {
            C6801b.C6802a b = a.mo17388b();
            b.mo17397b(true);
            b.mo17395a();
            f = true;
        } else if (action.equals("android.intent.action.DREAMING_STOPPED")) {
            C6801b.C6802a b2 = a.mo17388b();
            b2.mo17397b(false);
            b2.mo17395a();
            f = false;
        }
        boolean z = !((PowerManager) context2.getSystemService("power")).isScreenOn() || f;
        if (action.equals("android.intent.action.SCREEN_ON") || action.equals("android.intent.action.DREAMING_STOPPED")) {
            if (!z) {
                AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
                Intent intent2 = new Intent(context2, IdleReceiver.class);
                intent2.setAction("me.tatarka.support.server.job.controllers.IdleReceiver.ACTION_TRIGGER_IDLE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, intent2, 536870912);
                if (broadcast != null) {
                    alarmManager.cancel(broadcast);
                }
                mo17382a(context2, false);
            }
        } else if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.DREAMING_STARTED")) {
            long elapsedRealtime = SystemClock.elapsedRealtime() + 4260000;
            Intent intent3 = new Intent(context2, IdleReceiver.class);
            intent3.setAction("me.tatarka.support.server.job.controllers.IdleReceiver.ACTION_TRIGGER_IDLE");
            m25801a((AlarmManager) context2.getSystemService("alarm"), 2, elapsedRealtime, 300000, PendingIntent.getBroadcast(context2, 0, intent3, 0));
        } else if (!action.equals("me.tatarka.support.server.job.controllers.IdleReceiver.ACTION_TRIGGER_IDLE")) {
        } else {
            if (z) {
                mo17382a(context2, true);
                return;
            }
            m25807d(context);
            m25802a(context);
        }
    }
}
