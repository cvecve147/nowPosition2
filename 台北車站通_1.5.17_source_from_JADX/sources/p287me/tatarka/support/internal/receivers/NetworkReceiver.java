package p287me.tatarka.support.internal.receivers;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import p013b.p018b.p028h.p029a.C1024f;
import p013b.p018b.p028h.p036e.C1053a;
import p245f.p246a.p247a.p248a.p249a.C6448b;
import p287me.tatarka.support.internal.job.C6797d;
import p287me.tatarka.support.internal.job.JobServiceCompat;

/* renamed from: me.tatarka.support.internal.receivers.NetworkReceiver */
public class NetworkReceiver extends C1024f {
    /* renamed from: a */
    public static void m25809a(Context context, C6803c cVar) {
        if (cVar.mo17407i() || cVar.mo17411m()) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            cVar.f18893i.set(activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting());
            cVar.f18892h.set(!C1053a.m5545a(connectivityManager));
        }
    }

    /* renamed from: a */
    private static void m25810a(Context context, boolean z, boolean z2) {
        C6797d a = C6797d.m25778a(context);
        synchronized (a) {
            C6448b<C6803c> b = a.mo17377b();
            boolean z3 = false;
            for (int i = 0; i < b.size(); i++) {
                C6803c e = b.mo16567e(i);
                boolean andSet = e.f18893i.getAndSet(z);
                boolean andSet2 = e.f18892h.getAndSet(z2);
                if (andSet != z || andSet2 != z2) {
                    z3 = true;
                }
            }
            if (z3) {
                C1024f.m5440b(context, JobServiceCompat.m25770c(context));
            }
        }
    }

    @TargetApi(17)
    /* renamed from: a */
    private static boolean m25811a(Intent intent, NetworkInfo networkInfo) {
        if (Build.VERSION.SDK_INT < 17) {
            return networkInfo != null;
        }
        return networkInfo != null && networkInfo.getType() == intent.getIntExtra("networkType", 0);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (m25811a(intent, connectivityManager.getActiveNetworkInfo())) {
                boolean z = false;
                boolean z2 = !intent.getBooleanExtra("noConnectivity", false);
                if (z2) {
                    z = !C1053a.m5545a(connectivityManager);
                }
                m25810a(context, z2, z);
            }
        }
    }
}
