package com.facebook.internal;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.m */
public class C1510m {

    /* renamed from: a */
    private static final Map<Class<?>, C1511a> f5188a = new HashMap();

    /* renamed from: com.facebook.internal.m$a */
    public interface C1511a {
        /* renamed from: a */
        void mo6192a(Bundle bundle, String str, Object obj);
    }

    static {
        f5188a.put(Boolean.class, new C1491f());
        f5188a.put(Integer.class, new C1493g());
        f5188a.put(Long.class, new C1495h());
        f5188a.put(Double.class, new C1501i());
        f5188a.put(String.class, new C1503j());
        f5188a.put(String[].class, new C1505k());
        f5188a.put(JSONArray.class, new C1509l());
    }

    /* renamed from: a */
    public static Bundle m7058a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m7058a((JSONObject) obj));
                } else {
                    C1511a aVar = f5188a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.mo6192a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }
}
