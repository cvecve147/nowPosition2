package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.C1601x;
import com.facebook.GraphRequest;
import com.facebook.internal.C1525y;
import com.facebook.p060a.p061a.C1380i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.A */
public final class C1430A {

    /* renamed from: a */
    private static final String[] f5011a = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"};

    /* renamed from: b */
    private static Map<String, C1525y> f5012b = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static AtomicBoolean f5013c = new AtomicBoolean(false);

    /* renamed from: a */
    public static C1525y m6774a(String str, boolean z) {
        if (!z && f5012b.containsKey(str)) {
            return f5012b.get(str);
        }
        JSONObject c = m6781c(str);
        if (c == null) {
            return null;
        }
        return m6779b(str, c);
    }

    /* renamed from: a */
    private static Map<String, Map<String, C1525y.C1526a>> m6775a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C1525y.C1526a a = C1525y.C1526a.m7094a(optJSONArray.optJSONObject(i));
                if (a != null) {
                    String a2 = a.mo6254a();
                    Map map = (Map) hashMap.get(a2);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a2, map);
                    }
                    map.put(a.mo6255b(), a);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static C1525y m6778b(String str) {
        if (str != null) {
            return f5012b.get(str);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1525y m6779b(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        C1525y yVar = new C1525y(jSONObject.optBoolean("supports_implicit_sdk_logging", false), jSONObject.optString("gdpv4_nux_content", ""), jSONObject.optBoolean("gdpv4_nux_enabled", false), jSONObject.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jSONObject.optInt("app_events_session_timeout", C1380i.m6647a()), C1473X.m6909a(jSONObject.optLong("seamless_login")), m6775a(jSONObject.optJSONObject("android_dialog_configs")), (jSONObject.optInt("app_events_feature_bitmask", 0) & 8) != 0, optJSONArray == null ? C1522v.m7078a() : C1522v.m7079a(optJSONArray), jSONObject.optString("smart_login_bookmark_icon_url"), jSONObject.optString("smart_login_menu_icon_url"));
        f5012b.put(str, yVar);
        return yVar;
    }

    /* renamed from: b */
    public static void m6780b() {
        Context b = C1601x.m7386b();
        String c = C1601x.m7389c();
        boolean compareAndSet = f5013c.compareAndSet(false, true);
        if (!C1480ba.m6958b(c) && !f5012b.containsKey(c) && compareAndSet) {
            C1601x.m7395h().execute(new C1527z(b, String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{c}), c));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static JSONObject m6781c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", f5011a));
        GraphRequest a = GraphRequest.m6509a((AccessToken) null, str, (GraphRequest.C1347b) null);
        a.mo5955a(true);
        a.mo5951a(bundle);
        return a.mo5950a().mo5988b();
    }
}
