package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.p */
final class C4085p {

    /* renamed from: a */
    private static final long f12110a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: b */
    final String f12111b;

    /* renamed from: c */
    private final String f12112c;

    /* renamed from: d */
    private final long f12113d;

    private C4085p(String str, String str2, long j) {
        this.f12111b = str;
        this.f12112c = str2;
        this.f12113d = j;
    }

    /* renamed from: a */
    static C4085p m16342a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C4085p(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C4085p(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m16343a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo11520b(String str) {
        return System.currentTimeMillis() > this.f12113d + f12110a || !str.equals(this.f12112c);
    }
}
