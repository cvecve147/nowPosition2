package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.ra */
public final class C3889ra {

    /* renamed from: a */
    private final C3901ua f11630a;

    public C3889ra(C3901ua uaVar) {
        C2061y.m9067a(uaVar);
        this.f11630a = uaVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r4 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15667a(android.content.Context r4) {
        /*
            com.google.android.gms.common.internal.C2061y.m9067a(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            boolean r4 = r4.enabled     // Catch:{ NameNotFoundException -> 0x001e }
            if (r4 == 0) goto L_0x001e
            r4 = 1
            return r4
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3889ra.m15667a(android.content.Context):boolean");
    }

    /* renamed from: a */
    public final void mo10948a(Context context, Intent intent) {
        C3715Aa a = C3715Aa.m14845a(context);
        C3801W b = a.mo10385b();
        if (intent == null) {
            b.mo10576B().mo10592a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        b.mo10580F().mo10593a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b.mo10580F().mo10592a("Starting wakeful intent.");
            this.f11630a.mo10977a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.mo10386c().mo11020a((Runnable) new C3893sa(this, a, b));
            } catch (Exception e) {
                b.mo10576B().mo10593a("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult a2 = this.f11630a.mo10976a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                b.mo10580F().mo10592a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                    return;
                }
                return;
            }
            b.mo10578D().mo10593a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            Bundle a3 = a.mo10392h().mo10777a(Uri.parse(stringExtra));
            if (a3 == null) {
                b.mo10580F().mo10592a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                b.mo10576B().mo10592a("Install referrer is missing timestamp");
            }
            a.mo10386c().mo11020a((Runnable) new C3897ta(this, a, longExtra, a3, context, b, a2));
        }
    }
}
