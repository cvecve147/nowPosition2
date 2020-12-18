package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.y */
public final class C1525y {

    /* renamed from: a */
    private boolean f5217a;

    /* renamed from: b */
    private String f5218b;

    /* renamed from: c */
    private boolean f5219c;

    /* renamed from: d */
    private boolean f5220d;

    /* renamed from: e */
    private int f5221e;

    /* renamed from: f */
    private EnumSet<C1473X> f5222f;

    /* renamed from: g */
    private Map<String, Map<String, C1526a>> f5223g;

    /* renamed from: h */
    private boolean f5224h;

    /* renamed from: i */
    private C1522v f5225i;

    /* renamed from: j */
    private String f5226j;

    /* renamed from: k */
    private String f5227k;

    /* renamed from: com.facebook.internal.y$a */
    public static class C1526a {

        /* renamed from: a */
        private String f5228a;

        /* renamed from: b */
        private String f5229b;

        /* renamed from: c */
        private Uri f5230c;

        /* renamed from: d */
        private int[] f5231d;

        private C1526a(String str, String str2, Uri uri, int[] iArr) {
            this.f5228a = str;
            this.f5229b = str2;
            this.f5230c = uri;
            this.f5231d = iArr;
        }

        /* renamed from: a */
        public static C1526a m7094a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (C1480ba.m6958b(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (C1480ba.m6958b(str) || C1480ba.m6958b(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            if (!C1480ba.m6958b(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new C1526a(str, str2, uri, m7095a(jSONObject.optJSONArray("versions")));
        }

        /* renamed from: a */
        private static int[] m7095a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C1480ba.m6958b(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            C1480ba.m6942a("FacebookSDK", (Exception) e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        /* renamed from: a */
        public String mo6254a() {
            return this.f5228a;
        }

        /* renamed from: b */
        public String mo6255b() {
            return this.f5229b;
        }
    }

    public C1525y(boolean z, String str, boolean z2, boolean z3, int i, EnumSet<C1473X> enumSet, Map<String, Map<String, C1526a>> map, boolean z4, C1522v vVar, String str2, String str3) {
        this.f5217a = z;
        this.f5218b = str;
        this.f5219c = z2;
        this.f5220d = z3;
        this.f5223g = map;
        this.f5225i = vVar;
        this.f5221e = i;
        this.f5224h = z4;
        this.f5222f = enumSet;
        this.f5226j = str2;
        this.f5227k = str3;
    }

    /* renamed from: a */
    public boolean mo6246a() {
        return this.f5224h;
    }

    /* renamed from: b */
    public boolean mo6247b() {
        return this.f5220d;
    }

    /* renamed from: c */
    public C1522v mo6248c() {
        return this.f5225i;
    }

    /* renamed from: d */
    public int mo6249d() {
        return this.f5221e;
    }

    /* renamed from: e */
    public String mo6250e() {
        return this.f5226j;
    }

    /* renamed from: f */
    public String mo6251f() {
        return this.f5227k;
    }

    /* renamed from: g */
    public EnumSet<C1473X> mo6252g() {
        return this.f5222f;
    }

    /* renamed from: h */
    public boolean mo6253h() {
        return this.f5217a;
    }
}
