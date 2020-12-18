package com.onesignal;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.J */
class C4255J {
    /* renamed from: a */
    static String m16897a(JSONArray jSONArray) {
        int i = 0;
        String str = "[";
        while (i < jSONArray.length()) {
            try {
                str = str + "\"" + jSONArray.getString(i) + "\"";
                i++;
            } catch (Throwable unused) {
            }
        }
        return str + "]";
    }

    /* renamed from: a */
    static JSONObject m16898a(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = optJSONObject.get(next);
                if (!"".equals(obj)) {
                    jSONObject2.put(next, obj);
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    static JSONObject m16899a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> keys = jSONObject2.keys();
        JSONObject jSONObject5 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String jSONObject6 = m16899a(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), set).toString();
                        if (!jSONObject6.equals("{}")) {
                            jSONObject4 = new JSONObject(jSONObject6);
                        }
                    } else if (obj instanceof JSONArray) {
                        m16900a(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject5);
                    } else {
                        if (set == null || !set.contains(next)) {
                            Object obj2 = jSONObject.get(next);
                            if (!obj.equals(obj2)) {
                                if ((obj2 instanceof Integer) && !"".equals(obj)) {
                                    if (((Number) obj2).doubleValue() != ((Number) obj).doubleValue()) {
                                    }
                                }
                            }
                        }
                        jSONObject5.put(next, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4 = new JSONObject(obj.toString());
                } else {
                    if (obj instanceof JSONArray) {
                        m16900a(next, (JSONArray) obj, (JSONArray) null, jSONObject5);
                    }
                    jSONObject5.put(next, obj);
                }
                jSONObject5.put(next, jSONObject4);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject5;
    }

    /* renamed from: a */
    private static void m16900a(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) {
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String a = m16897a(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String a2 = jSONArray2 == null ? null : m16897a(jSONArray2);
        for (int i = 0; i < jSONArray.length(); i++) {
            String str2 = (String) jSONArray.get(i);
            if (jSONArray2 == null || !a2.contains(str2)) {
                jSONArray3.put(str2);
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string = jSONArray2.getString(i2);
                if (!a.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str + "_a", jSONArray3);
        }
        if (!jSONArray4.toString().equals("[]")) {
            jSONObject.put(str + "_d", jSONArray4);
        }
    }
}
