package com.facebook.internal;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.v */
public final class C1522v {

    /* renamed from: a */
    private static C1522v f5207a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f5208b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f5209c;

    /* renamed from: d */
    private final Map<Integer, Set<Integer>> f5210d;

    /* renamed from: e */
    private final String f5211e;

    /* renamed from: f */
    private final String f5212f;

    /* renamed from: g */
    private final String f5213g;

    C1522v(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f5208b = map;
        this.f5209c = map2;
        this.f5210d = map3;
        this.f5211e = str;
        this.f5212f = str2;
        this.f5213g = str3;
    }

    /* renamed from: a */
    public static synchronized C1522v m7078a() {
        C1522v vVar;
        synchronized (C1522v.class) {
            if (f5207a == null) {
                f5207a = m7081b();
            }
            vVar = f5207a;
        }
        return vVar;
    }

    /* renamed from: a */
    public static C1522v m7079a(JSONArray jSONArray) {
        String optString;
        if (jSONArray == null) {
            return null;
        }
        Map<Integer, Set<Integer>> map = null;
        Map<Integer, Set<Integer>> map2 = null;
        Map<Integer, Set<Integer>> map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                if (optString.equalsIgnoreCase("other")) {
                    str = optJSONObject.optString("recovery_message", (String) null);
                    map = m7080a(optJSONObject);
                } else if (optString.equalsIgnoreCase("transient")) {
                    str2 = optJSONObject.optString("recovery_message", (String) null);
                    map2 = m7080a(optJSONObject);
                } else if (optString.equalsIgnoreCase("login_recoverable")) {
                    str3 = optJSONObject.optString("recovery_message", (String) null);
                    map3 = m7080a(optJSONObject);
                }
            }
        }
        return new C1522v(map, map2, map3, str, str2, str3);
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m7080a(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        int optInt2 = optJSONArray2.optInt(i2);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private static C1522v m7081b() {
        return new C1522v((Map<Integer, Set<Integer>>) null, new C1519s(), new C1520t(), (String) null, (String) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        r2 = r1.f5209c.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.FacebookRequestError.C1341a mo6243a(int r2, int r3, boolean r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x0005
            com.facebook.FacebookRequestError$a r2 = com.facebook.FacebookRequestError.C1341a.TRANSIENT
            return r2
        L_0x0005:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.f5208b
            if (r4 == 0) goto L_0x002e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x002e
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.f5208b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.get(r0)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x002b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x002e
        L_0x002b:
            com.facebook.FacebookRequestError$a r2 = com.facebook.FacebookRequestError.C1341a.OTHER
            return r2
        L_0x002e:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.f5210d
            if (r4 == 0) goto L_0x0057
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x0057
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.f5210d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r4.get(r0)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x0054
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x0057
        L_0x0054:
            com.facebook.FacebookRequestError$a r2 = com.facebook.FacebookRequestError.C1341a.LOGIN_RECOVERABLE
            return r2
        L_0x0057:
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.f5209c
            if (r4 == 0) goto L_0x0080
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x0080
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r4 = r1.f5209c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x007d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0080
        L_0x007d:
            com.facebook.FacebookRequestError$a r2 = com.facebook.FacebookRequestError.C1341a.TRANSIENT
            return r2
        L_0x0080:
            com.facebook.FacebookRequestError$a r2 = com.facebook.FacebookRequestError.C1341a.OTHER
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1522v.mo6243a(int, int, boolean):com.facebook.FacebookRequestError$a");
    }

    /* renamed from: a */
    public String mo6244a(FacebookRequestError.C1341a aVar) {
        int i = C1521u.f5206a[aVar.ordinal()];
        if (i == 1) {
            return this.f5211e;
        }
        if (i == 2) {
            return this.f5213g;
        }
        if (i != 3) {
            return null;
        }
        return this.f5212f;
    }
}
