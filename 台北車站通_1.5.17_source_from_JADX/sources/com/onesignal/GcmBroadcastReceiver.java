package com.onesignal;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.onesignal.C4277O;
import com.onesignal.C4284Q;
import java.security.SecureRandom;
import p013b.p018b.p028h.p029a.C1024f;

public class GcmBroadcastReceiver extends C1024f {
    /* renamed from: a */
    private static C4277O.C4278a m16803a(Context context, Intent intent, Bundle bundle) {
        if (!m16808b(intent)) {
            return null;
        }
        C4277O.C4278a a = C4277O.m16965a(context, bundle);
        if (a.mo12364a()) {
            return a;
        }
        m16805a(context, bundle);
        return a;
    }

    /* renamed from: a */
    private static C4388k m16804a(Bundle bundle, C4388k kVar) {
        kVar.putString("json_payload", C4277O.m16977b(bundle).toString());
        kVar.mo12510a("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        return kVar;
    }

    /* renamed from: a */
    private static void m16805a(Context context, Bundle bundle) {
        if (!C4277O.m16982c(bundle)) {
            C4388k a = C4396m.m17430a();
            m16804a(bundle, a);
            C4277O.m16969a(context, a, (C4284Q.C4285a) null);
            return;
        }
        if ((Integer.parseInt(bundle.getString("pri", "0")) > 9) || Build.VERSION.SDK_INT < 26) {
            try {
                m16810c(context, bundle);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 21) {
                    throw e;
                }
            }
        }
        m16807b(context, bundle);
    }

    /* renamed from: b */
    private void m16806b() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    private static void m16807b(Context context, Bundle bundle) {
        C4388k a = C4396m.m17430a();
        m16804a(bundle, a);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(new SecureRandom().nextInt(), new ComponentName(context.getPackageName(), GcmIntentJobService.class.getName())).setOverrideDeadline(0).setExtras((PersistableBundle) a.mo12509a()).build());
    }

    /* renamed from: b */
    private static boolean m16808b(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null || "gcm".equals(stringExtra);
    }

    /* renamed from: c */
    private void m16809c() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    /* renamed from: c */
    private static void m16810c(Context context, Bundle bundle) {
        ComponentName componentName = new ComponentName(context.getPackageName(), GcmIntentService.class.getName());
        C4393l lVar = new C4393l();
        m16804a(bundle, (C4388k) lVar);
        C1024f.m5440b(context, new Intent().replaceExtras((Bundle) lVar.mo12509a()).setComponent(componentName));
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null && !"google.com/iid".equals(extras.getString("from"))) {
            C4306Xa.m17176f(context);
            C4277O.C4278a a = m16803a(context, intent, extras);
            if (a == null) {
                m16809c();
            } else if (a.f12682c || a.f12681b) {
                m16806b();
            } else if (!a.f12680a || !C4306Xa.m17157b(context)) {
                m16809c();
            } else {
                m16806b();
            }
        }
    }
}
