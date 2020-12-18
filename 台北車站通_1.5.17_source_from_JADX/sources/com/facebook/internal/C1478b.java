package com.facebook.internal;

import android.content.Context;
import com.facebook.C1355K;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.b */
public class C1478b {

    /* renamed from: a */
    private static final Map<C1479a, String> f5118a = new C1476a();

    /* renamed from: com.facebook.internal.b$a */
    public enum C1479a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m6915a(C1479a aVar, C1485d dVar, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f5118a.get(aVar));
        C1480ba.m6947a(jSONObject, dVar, str, z);
        try {
            C1480ba.m6946a(jSONObject, context);
        } catch (Exception e) {
            C1459P.m6842a(C1355K.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
