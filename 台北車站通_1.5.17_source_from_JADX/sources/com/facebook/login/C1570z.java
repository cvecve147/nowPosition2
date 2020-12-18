package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.LoginClient;
import com.facebook.p060a.C1406q;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.z */
class C1570z {

    /* renamed from: a */
    private final C1406q f5351a;

    /* renamed from: b */
    private String f5352b;

    /* renamed from: c */
    private String f5353c;

    C1570z(Context context, String str) {
        PackageInfo packageInfo;
        this.f5352b = str;
        this.f5351a = C1406q.m6709a(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f5353c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    static Bundle m7309a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* renamed from: a */
    public String mo6390a() {
        return this.f5352b;
    }

    /* renamed from: a */
    public void mo6391a(LoginClient.Request request) {
        Bundle a = m7309a(request.mo6332b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.mo6336e().toString());
            jSONObject.put("request_code", LoginClient.m7200h());
            jSONObject.put("permissions", TextUtils.join(",", request.mo6337f()));
            jSONObject.put("default_audience", request.mo6333c().toString());
            jSONObject.put("isReauthorize", request.mo6339h());
            if (this.f5353c != null) {
                jSONObject.put("facebookVersion", this.f5353c);
            }
            a.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f5351a.mo6070a("fb_mobile_login_start", (Double) null, a);
    }

    /* renamed from: a */
    public void mo6392a(String str, String str2) {
        Bundle a = m7309a(str);
        a.putString("3_method", str2);
        this.f5351a.mo6070a("fb_mobile_login_method_not_tried", (Double) null, a);
    }

    /* renamed from: a */
    public void mo6393a(String str, String str2, String str3) {
        Bundle a = m7309a("");
        a.putString("2_result", LoginClient.Result.C1541a.ERROR.mo6343a());
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f5351a.mo6070a(str, (Double) null, a);
    }

    /* renamed from: a */
    public void mo6394a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle a = m7309a(str);
        if (str3 != null) {
            a.putString("2_result", str3);
        }
        if (str4 != null) {
            a.putString("5_error_message", str4);
        }
        if (str5 != null) {
            a.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            a.putString("6_extras", new JSONObject(map).toString());
        }
        a.putString("3_method", str2);
        this.f5351a.mo6070a("fb_mobile_login_method_complete", (Double) null, a);
    }

    /* renamed from: a */
    public void mo6395a(String str, Map<String, String> map, LoginClient.Result.C1541a aVar, Map<String, String> map2, Exception exc) {
        Bundle a = m7309a(str);
        if (aVar != null) {
            a.putString("2_result", aVar.mo6343a());
        }
        if (!(exc == null || exc.getMessage() == null)) {
            a.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = !map.isEmpty() ? new JSONObject(map) : null;
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry next : map2.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            a.putString("6_extras", jSONObject.toString());
        }
        this.f5351a.mo6070a("fb_mobile_login_complete", (Double) null, a);
    }

    /* renamed from: b */
    public void mo6396b(String str, String str2) {
        Bundle a = m7309a(str);
        a.putString("3_method", str2);
        this.f5351a.mo6070a("fb_mobile_login_method_start", (Double) null, a);
    }

    /* renamed from: c */
    public void mo6397c(String str, String str2) {
        mo6393a(str, str2, "");
    }
}
