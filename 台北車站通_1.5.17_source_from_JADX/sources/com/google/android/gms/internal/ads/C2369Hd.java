package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Hd */
public final class C2369Hd {

    /* renamed from: a */
    private final long f7121a;

    /* renamed from: b */
    private final List<String> f7122b = new ArrayList();

    /* renamed from: c */
    private final List<String> f7123c = new ArrayList();

    /* renamed from: d */
    private final Map<String, C3596wz> f7124d = new HashMap();

    /* renamed from: e */
    private String f7125e;

    /* renamed from: f */
    private String f7126f;

    /* renamed from: g */
    private boolean f7127g;

    public C2369Hd(String str, long j) {
        JSONObject optJSONObject;
        this.f7127g = false;
        this.f7126f = str;
        this.f7121a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f7127g = false;
                    C2227Cf.m9536d("App settings could not be fetched successfully.");
                    return;
                }
                this.f7127g = true;
                this.f7125e = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f7123c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f7124d.put(optString2, new C3596wz(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f7122b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e) {
                C2227Cf.m9535c("Exception occurred while processing app setting json", e);
                C1697X.m7702i().mo8319a((Throwable) e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo8254a() {
        return this.f7121a;
    }

    /* renamed from: b */
    public final boolean mo8255b() {
        return this.f7127g;
    }

    /* renamed from: c */
    public final String mo8256c() {
        return this.f7126f;
    }

    /* renamed from: d */
    public final String mo8257d() {
        return this.f7125e;
    }

    /* renamed from: e */
    public final Map<String, C3596wz> mo8258e() {
        return this.f7124d;
    }
}
