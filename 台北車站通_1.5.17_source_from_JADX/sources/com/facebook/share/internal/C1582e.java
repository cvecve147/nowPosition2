package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.e */
public final class C1582e {

    /* renamed from: com.facebook.share.internal.e$a */
    public interface C1583a {
        /* renamed from: a */
        JSONObject mo6417a(SharePhoto sharePhoto);
    }

    /* renamed from: a */
    public static Object m7341a(Object obj, C1583a aVar) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (aVar != null) {
                return aVar.mo6417a((SharePhoto) obj);
            }
            return null;
        } else if (obj instanceof ShareOpenGraphObject) {
            return m7344a((ShareOpenGraphObject) obj, aVar);
        } else {
            if (obj instanceof List) {
                return m7342a((List) obj, aVar);
            }
            throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
        }
    }

    /* renamed from: a */
    private static JSONArray m7342a(List list, C1583a aVar) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : list) {
            jSONArray.put(m7341a(a, aVar));
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m7343a(ShareOpenGraphAction shareOpenGraphAction, C1583a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String next : shareOpenGraphAction.mo6440b()) {
            jSONObject.put(next, m7341a(shareOpenGraphAction.mo6438a(next), aVar));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m7344a(ShareOpenGraphObject shareOpenGraphObject, C1583a aVar) {
        JSONObject jSONObject = new JSONObject();
        for (String next : shareOpenGraphObject.mo6440b()) {
            jSONObject.put(next, m7341a(shareOpenGraphObject.mo6438a(next), aVar));
        }
        return jSONObject;
    }
}
