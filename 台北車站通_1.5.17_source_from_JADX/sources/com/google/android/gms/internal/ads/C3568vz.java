package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.vz */
public final class C3568vz {

    /* renamed from: a */
    public final String f10405a;

    /* renamed from: b */
    public final String f10406b;

    /* renamed from: c */
    public final List<String> f10407c;

    /* renamed from: d */
    public final String f10408d;

    /* renamed from: e */
    public final String f10409e;

    /* renamed from: f */
    public final List<String> f10410f;

    /* renamed from: g */
    public final List<String> f10411g;

    /* renamed from: h */
    public final List<String> f10412h;

    /* renamed from: i */
    public final List<String> f10413i;

    /* renamed from: j */
    public final List<String> f10414j;

    /* renamed from: k */
    public final String f10415k;

    /* renamed from: l */
    public final List<String> f10416l;

    /* renamed from: m */
    public final List<String> f10417m;

    /* renamed from: n */
    public final List<String> f10418n;

    /* renamed from: o */
    public final String f10419o;

    /* renamed from: p */
    public final String f10420p;

    /* renamed from: q */
    public final String f10421q;

    /* renamed from: r */
    public final List<String> f10422r;

    /* renamed from: s */
    public final String f10423s;

    /* renamed from: t */
    private final String f10424t;

    /* renamed from: u */
    public final long f10425u;

    public C3568vz(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, List<String> list9, String str10, List<String> list10, String str11, long j) {
        this.f10405a = str;
        this.f10406b = null;
        this.f10407c = list;
        this.f10408d = null;
        this.f10409e = null;
        this.f10410f = list2;
        this.f10411g = list3;
        this.f10412h = list4;
        this.f10413i = list5;
        this.f10415k = str5;
        this.f10416l = list6;
        this.f10417m = list7;
        this.f10418n = list8;
        this.f10419o = null;
        this.f10420p = null;
        this.f10421q = null;
        this.f10422r = null;
        this.f10423s = null;
        this.f10414j = list10;
        this.f10424t = null;
        this.f10425u = -1;
    }

    public C3568vz(JSONObject jSONObject) {
        List<String> list;
        this.f10406b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f10407c = Collections.unmodifiableList(arrayList);
        this.f10408d = jSONObject.optString("allocation_id", (String) null);
        C1697X.m7717x();
        this.f10410f = C2333Fz.m9841a(jSONObject, "clickurl");
        C1697X.m7717x();
        this.f10411g = C2333Fz.m9841a(jSONObject, "imp_urls");
        C1697X.m7717x();
        this.f10412h = C2333Fz.m9841a(jSONObject, "downloaded_imp_urls");
        C1697X.m7717x();
        this.f10414j = C2333Fz.m9841a(jSONObject, "fill_urls");
        C1697X.m7717x();
        this.f10416l = C2333Fz.m9841a(jSONObject, "video_start_urls");
        C1697X.m7717x();
        this.f10418n = C2333Fz.m9841a(jSONObject, "video_complete_urls");
        C1697X.m7717x();
        this.f10417m = !((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7829Va)).booleanValue() ? this.f10418n : C2333Fz.m9841a(jSONObject, "video_reward_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C1697X.m7717x();
            list = C2333Fz.m9841a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f10413i = list;
        this.f10405a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f10415k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f10409e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f10419o = jSONObject.optString("html_template", (String) null);
        this.f10420p = jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f10421q = optJSONObject3 != null ? optJSONObject3.toString() : null;
        C1697X.m7717x();
        this.f10422r = C2333Fz.m9841a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f10423s = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f10424t = jSONObject.optString("response_type", (String) null);
        this.f10425u = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    /* renamed from: a */
    public final boolean mo10154a() {
        return "banner".equalsIgnoreCase(this.f10424t);
    }

    /* renamed from: b */
    public final boolean mo10155b() {
        return "native".equalsIgnoreCase(this.f10424t);
    }
}
