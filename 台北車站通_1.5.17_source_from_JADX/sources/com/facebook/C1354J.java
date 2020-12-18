package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C1459P;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.J */
final class C1354J {

    /* renamed from: a */
    private static final String f4826a = "J";

    /* renamed from: b */
    private String f4827b;

    /* renamed from: c */
    private SharedPreferences f4828c;

    public C1354J(Context context) {
        this(context, (String) null);
    }

    public C1354J(Context context, String str) {
        C1484ca.m6976a((Object) context, "context");
        this.f4827b = C1480ba.m6958b(str) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        Context applicationContext = context.getApplicationContext();
        this.f4828c = (applicationContext != null ? applicationContext : context).getSharedPreferences(this.f4827b, 0);
    }

    /* renamed from: a */
    public static String m6593a(Bundle bundle) {
        C1484ca.m6976a((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    /* renamed from: a */
    static Date m6594a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return new Date(j);
    }

    /* renamed from: a */
    private void m6595a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject(this.f4828c.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        if (string.equals("bool")) {
            bundle.putBoolean(str, jSONObject.getBoolean("value"));
            return;
        }
        int i = 0;
        if (string.equals("bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            boolean[] zArr = new boolean[jSONArray.length()];
            while (i < zArr.length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            bundle.putBooleanArray(str, zArr);
        } else if (string.equals("byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt("value"));
        } else if (string.equals("byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
            byte[] bArr = new byte[jSONArray2.length()];
            while (i < bArr.length) {
                bArr[i] = (byte) jSONArray2.getInt(i);
                i++;
            }
            bundle.putByteArray(str, bArr);
        } else if (string.equals("short")) {
            bundle.putShort(str, (short) jSONObject.getInt("value"));
        } else if (string.equals("short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
            short[] sArr = new short[jSONArray3.length()];
            while (i < sArr.length) {
                sArr[i] = (short) jSONArray3.getInt(i);
                i++;
            }
            bundle.putShortArray(str, sArr);
        } else if (string.equals("int")) {
            bundle.putInt(str, jSONObject.getInt("value"));
        } else if (string.equals("int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
            int[] iArr = new int[jSONArray4.length()];
            while (i < iArr.length) {
                iArr[i] = jSONArray4.getInt(i);
                i++;
            }
            bundle.putIntArray(str, iArr);
        } else if (string.equals("long")) {
            bundle.putLong(str, jSONObject.getLong("value"));
        } else if (string.equals("long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
            long[] jArr = new long[jSONArray5.length()];
            while (i < jArr.length) {
                jArr[i] = jSONArray5.getLong(i);
                i++;
            }
            bundle.putLongArray(str, jArr);
        } else if (string.equals("float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
        } else if (string.equals("float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
            float[] fArr = new float[jSONArray6.length()];
            while (i < fArr.length) {
                fArr[i] = (float) jSONArray6.getDouble(i);
                i++;
            }
            bundle.putFloatArray(str, fArr);
        } else if (string.equals("double")) {
            bundle.putDouble(str, jSONObject.getDouble("value"));
        } else if (string.equals("double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
            double[] dArr = new double[jSONArray7.length()];
            while (i < dArr.length) {
                dArr[i] = jSONArray7.getDouble(i);
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        } else if (string.equals("char")) {
            String string2 = jSONObject.getString("value");
            if (string2 != null && string2.length() == 1) {
                bundle.putChar(str, string2.charAt(0));
            }
        } else if (string.equals("char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
            char[] cArr = new char[jSONArray8.length()];
            for (int i2 = 0; i2 < cArr.length; i2++) {
                String string3 = jSONArray8.getString(i2);
                if (string3 != null && string3.length() == 1) {
                    cArr[i2] = string3.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
        } else if (string.equals("string")) {
            bundle.putString(str, jSONObject.getString("value"));
        } else if (string.equals("stringList")) {
            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
            int length = jSONArray9.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                Object obj = jSONArray9.get(i);
                arrayList.add(i, obj == JSONObject.NULL ? null : (String) obj);
                i++;
            }
            bundle.putStringArrayList(str, arrayList);
        } else if (string.equals("enum")) {
            try {
                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    public static C1427h m6596b(Bundle bundle) {
        C1484ca.m6976a((Object) bundle, "bundle");
        return bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource") ? (C1427h) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource") : bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? C1427h.FACEBOOK_APPLICATION_WEB : C1427h.WEB_VIEW;
    }

    /* renamed from: c */
    public static String m6597c(Bundle bundle) {
        C1484ca.m6976a((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = r5.getString("com.facebook.TokenCachingStrategy.Token");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6598d(android.os.Bundle r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "com.facebook.TokenCachingStrategy.Token"
            java.lang.String r1 = r5.getString(r1)
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0013
            goto L_0x0022
        L_0x0013:
            r1 = 0
            java.lang.String r3 = "com.facebook.TokenCachingStrategy.ExpirationDate"
            long r3 = r5.getLong(r3, r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0020
            return r0
        L_0x0020:
            r5 = 1
            return r5
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1354J.m6598d(android.os.Bundle):boolean");
    }

    /* renamed from: a */
    public void mo5990a() {
        this.f4828c.edit().clear().apply();
    }

    /* renamed from: b */
    public Bundle mo5991b() {
        Bundle bundle = new Bundle();
        for (String next : this.f4828c.getAll().keySet()) {
            try {
                m6595a(next, bundle);
            } catch (JSONException e) {
                C1355K k = C1355K.CACHE;
                String str = f4826a;
                C1459P.m6839a(k, 5, str, "Error reading cached value for key: '" + next + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }
}
