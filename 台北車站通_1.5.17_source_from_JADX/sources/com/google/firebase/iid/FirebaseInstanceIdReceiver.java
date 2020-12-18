package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C2092n;
import p013b.p018b.p028h.p029a.C1024f;

public final class FirebaseInstanceIdReceiver extends C1024f {

    /* renamed from: c */
    private static C4094y f12051c;

    /* renamed from: d */
    private static C4094y f12052d;

    /* renamed from: a */
    private static synchronized C4094y m16269a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f12052d == null) {
                    f12052d = new C4094y(context, str);
                }
                C4094y yVar = f12052d;
                return yVar;
            }
            if (f12051c == null) {
                f12051c = new C4094y(context, str);
            }
            C4094y yVar2 = f12051c;
            return yVar2;
        }
    }

    /* renamed from: a */
    private final void m16270a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        int i = -1;
        if (str2 != null) {
            if (C2092n.m9171l() && context.getApplicationInfo().targetSdkVersion >= 26) {
                z = true;
            }
            if (z) {
                if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
                m16269a(context, str2).mo11534a(intent, goAsync());
            } else {
                i = C4083n.m16330a().mo11512a(context, str2, intent);
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                m16270a(context, (Intent) parcelableExtra, intent.getAction());
            } else {
                m16270a(context, intent, intent.getAction());
            }
        }
    }
}
