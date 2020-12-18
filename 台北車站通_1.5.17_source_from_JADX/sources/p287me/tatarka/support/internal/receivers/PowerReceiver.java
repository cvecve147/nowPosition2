package p287me.tatarka.support.internal.receivers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import p013b.p018b.p028h.p029a.C1024f;
import p245f.p246a.p247a.p248a.p249a.C6448b;
import p287me.tatarka.support.internal.job.C6797d;
import p287me.tatarka.support.internal.job.JobServiceCompat;
import p287me.tatarka.support.internal.receivers.C6801b;

/* renamed from: me.tatarka.support.internal.receivers.PowerReceiver */
public class PowerReceiver extends C1024f {
    /* renamed from: a */
    private void m25812a(Context context) {
        Intent intent = new Intent(context, PowerReceiver.class);
        intent.setAction("me.tatarka.support.server.job.controllers.PowerReceiver.ACTION_CHARGING_STABLE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 536870912);
        if (broadcast != null) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(broadcast);
        }
    }

    /* renamed from: a */
    public static void m25813a(Context context, C6803c cVar) {
        if (cVar.mo17406h()) {
            cVar.f18888d.set(m25816c(context) && !m25815b(context));
        }
    }

    /* renamed from: a */
    private static void m25814a(Context context, boolean z) {
        boolean z2;
        C6797d a = C6797d.m25778a(context);
        synchronized (a) {
            C6448b<C6803c> b = a.mo17377b();
            z2 = false;
            for (int i = 0; i < b.size(); i++) {
                if (b.mo16567e(i).f18888d.getAndSet(z) != z) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            C1024f.m5440b(context, JobServiceCompat.m25770c(context));
        }
    }

    /* renamed from: b */
    private static boolean m25815b(Context context) {
        return C6801b.m25830a(context).mo17391e();
    }

    /* renamed from: c */
    private static boolean m25816c(Context context) {
        int intExtra = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
        return intExtra == 1 || intExtra == 2;
    }

    /* renamed from: d */
    private void m25817d(Context context) {
        Intent intent = new Intent(context, PowerReceiver.class);
        intent.setAction("me.tatarka.support.server.job.controllers.PowerReceiver.ACTION_CHARGING_STABLE");
        ((AlarmManager) context.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + 120000, PendingIntent.getBroadcast(context, 0, intent, 0));
    }

    public void onReceive(Context context, Intent intent) {
        boolean z;
        String action = intent.getAction();
        if ("android.intent.action.BATTERY_LOW".equals(action)) {
            C6801b.C6802a b = C6801b.m25830a(context).mo17388b();
            b.mo17394a(true);
            b.mo17395a();
            return;
        }
        if ("android.intent.action.BATTERY_OKAY".equals(action)) {
            C6801b.C6802a b2 = C6801b.m25830a(context).mo17388b();
            b2.mo17394a(false);
            b2.mo17395a();
            z = m25816c(context);
        } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            m25817d(context);
            return;
        } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            m25812a(context);
            m25814a(context, false);
            return;
        } else if ("me.tatarka.support.server.job.controllers.PowerReceiver.ACTION_CHARGING_STABLE".equals(action)) {
            z = !m25815b(context);
        } else {
            return;
        }
        m25814a(context, z);
    }
}
