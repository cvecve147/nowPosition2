package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.p060a.C1406q;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: com.facebook.internal.e */
public class C1489e extends BroadcastReceiver {

    /* renamed from: a */
    private static C1489e f5143a;

    /* renamed from: b */
    private Context f5144b;

    private C1489e(Context context) {
        this.f5144b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1489e m6998a(Context context) {
        C1489e eVar = f5143a;
        if (eVar != null) {
            return eVar;
        }
        f5143a = new C1489e(context);
        f5143a.m7000b();
        return f5143a;
    }

    /* renamed from: a */
    private void m6999a() {
        C1020d.m5430a(this.f5144b).mo5018a((BroadcastReceiver) this);
    }

    /* renamed from: b */
    private void m7000b() {
        C1020d.m5430a(this.f5144b).mo5019a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            m6999a();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C1406q b = C1406q.m6714b(context);
        String str = "bf_" + intent.getStringExtra("event_name");
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str2 : bundleExtra.keySet()) {
            bundle.putString(str2.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str2));
        }
        b.mo6069a(str, bundle);
    }
}
