package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.V */
class C1471V {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f5104a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONObject m6903a(String str) {
        return f5104a.get(str);
    }

    /* renamed from: a */
    public static void m6904a(String str, JSONObject jSONObject) {
        f5104a.put(str, jSONObject);
    }
}
