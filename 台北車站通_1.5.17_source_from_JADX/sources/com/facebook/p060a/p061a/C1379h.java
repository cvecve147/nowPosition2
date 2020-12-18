package com.facebook.p060a.p061a;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C1601x;
import com.facebook.internal.C1430A;
import com.facebook.internal.C1484ca;
import com.facebook.internal.C1525y;
import com.facebook.p060a.C1406q;

/* renamed from: com.facebook.a.a.h */
public class C1379h {

    /* renamed from: a */
    private static final String f4887a = "com.facebook.a.a.h";

    /* renamed from: a */
    public static void m6645a() {
        Context b = C1601x.m7386b();
        String c = C1601x.m7389c();
        boolean d = C1601x.m7391d();
        C1484ca.m6976a((Object) b, "context");
        if (!d) {
            return;
        }
        if (b instanceof Application) {
            C1406q.m6711a((Application) b, c);
        } else {
            Log.w(f4887a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    /* renamed from: a */
    public static void m6646a(String str, long j) {
        Context b = C1601x.m7386b();
        String c = C1601x.m7389c();
        C1484ca.m6976a((Object) b, "context");
        C1525y a = C1430A.m6774a(c, false);
        if (a != null && a.mo6246a() && j > 0) {
            C1406q b2 = C1406q.m6714b(b);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            b2.mo6068a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }
}
