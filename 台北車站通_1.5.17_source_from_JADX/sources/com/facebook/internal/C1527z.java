package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.p060a.p061a.C1379h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.z */
class C1527z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f5232a;

    /* renamed from: b */
    final /* synthetic */ String f5233b;

    /* renamed from: c */
    final /* synthetic */ String f5234c;

    C1527z(Context context, String str, String str2) {
        this.f5232a = context;
        this.f5233b = str;
        this.f5234c = str2;
    }

    public void run() {
        SharedPreferences sharedPreferences = this.f5232a.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        JSONObject jSONObject = null;
        String string = sharedPreferences.getString(this.f5233b, (String) null);
        if (!C1480ba.m6958b(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                C1480ba.m6942a("FacebookSDK", (Exception) e);
            }
            if (jSONObject != null) {
                C1525y unused = C1430A.m6779b(this.f5234c, jSONObject);
            }
        }
        JSONObject a = C1430A.m6781c(this.f5234c);
        if (a != null) {
            C1525y unused2 = C1430A.m6779b(this.f5234c, a);
            sharedPreferences.edit().putString(this.f5233b, a.toString()).apply();
        }
        C1379h.m6645a();
        C1430A.f5013c.set(false);
    }
}
