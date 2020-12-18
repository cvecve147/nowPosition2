package com.facebook.p060a.p061a;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C1355K;
import com.facebook.internal.C1459P;
import com.facebook.p060a.C1406q;
import java.util.Locale;

/* renamed from: com.facebook.a.a.l */
class C1383l {

    /* renamed from: a */
    private static final String f4894a = "com.facebook.a.a.l";

    /* renamed from: b */
    private static final long[] f4895b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: a */
    private static int m6660a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = f4895b;
            if (i >= jArr.length || jArr[i] >= j) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static void m6661a() {
        C1459P.m6841a(C1355K.APP_EVENTS, f4894a, "Clock skew detected");
    }

    /* renamed from: a */
    public static void m6662a(Context context, String str, C1382k kVar, String str2) {
        Long valueOf = Long.valueOf(kVar.mo6035b() - kVar.mo6038e().longValue());
        if (valueOf.longValue() < 0) {
            m6661a();
            valueOf = 0L;
        }
        Long valueOf2 = Long.valueOf(kVar.mo6039f());
        if (valueOf2.longValue() < 0) {
            m6661a();
            valueOf2 = 0L;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", kVar.mo6036c());
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m6660a(valueOf.longValue()))}));
        C1385n g = kVar.mo6040g();
        bundle.putString("fb_mobile_launch_source", g != null ? g.toString() : "Unclassified");
        bundle.putLong("_logTime", kVar.mo6038e().longValue() / 1000);
        new C1381j(str, str2, (AccessToken) null).mo6068a("fb_mobile_deactivate_app", (double) (valueOf2.longValue() / 1000), bundle);
    }

    /* renamed from: a */
    public static void m6663a(Context context, String str, C1385n nVar, String str2) {
        String nVar2 = nVar != null ? nVar.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", nVar2);
        C1381j jVar = new C1381j(str, str2, (AccessToken) null);
        jVar.mo6069a("fb_mobile_activate_app", bundle);
        if (C1406q.m6716c() != C1406q.C1407a.EXPLICIT_ONLY) {
            jVar.mo6067a();
        }
    }
}
