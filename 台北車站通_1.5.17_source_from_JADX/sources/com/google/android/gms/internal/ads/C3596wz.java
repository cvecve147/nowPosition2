package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.wz */
public final class C3596wz {

    /* renamed from: a */
    public final List<C3568vz> f10479a;

    /* renamed from: b */
    public final long f10480b;

    /* renamed from: c */
    public final List<String> f10481c;

    /* renamed from: d */
    public final List<String> f10482d;

    /* renamed from: e */
    public final List<String> f10483e;

    /* renamed from: f */
    public final List<String> f10484f;

    /* renamed from: g */
    public final List<String> f10485g;

    /* renamed from: h */
    public final boolean f10486h;

    /* renamed from: i */
    public final String f10487i;

    /* renamed from: j */
    public final long f10488j;

    /* renamed from: k */
    public final String f10489k;

    /* renamed from: l */
    public final int f10490l;

    /* renamed from: m */
    public final int f10491m;

    /* renamed from: n */
    public final long f10492n;

    /* renamed from: o */
    public final boolean f10493o;

    /* renamed from: p */
    public final boolean f10494p;

    /* renamed from: q */
    public final boolean f10495q;

    /* renamed from: r */
    public int f10496r;

    /* renamed from: s */
    public int f10497s;

    /* renamed from: t */
    public boolean f10498t;

    public C3596wz(String str) {
        this(new JSONObject(str));
    }

    public C3596wz(List<C3568vz> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f10479a = list;
        this.f10480b = j;
        this.f10481c = list2;
        this.f10482d = list3;
        this.f10483e = list4;
        this.f10484f = list5;
        this.f10485g = list6;
        this.f10486h = z;
        this.f10487i = str;
        this.f10488j = -1;
        this.f10496r = 0;
        this.f10497s = 1;
        this.f10489k = null;
        this.f10490l = 0;
        this.f10491m = -1;
        this.f10492n = -1;
        this.f10493o = false;
        this.f10494p = false;
        this.f10495q = false;
        this.f10498t = false;
    }

    public C3596wz(JSONObject jSONObject) {
        if (C2227Cf.m9531a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            C2857Yd.m11615f(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            C3568vz vzVar = new C3568vz(jSONArray.getJSONObject(i2));
            boolean z = true;
            if (vzVar.mo10154a()) {
                this.f10498t = true;
            }
            arrayList.add(vzVar);
            if (i < 0) {
                Iterator<String> it = vzVar.f10407c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    i = i2;
                }
            }
        }
        this.f10496r = i;
        this.f10497s = jSONArray.length();
        this.f10479a = Collections.unmodifiableList(arrayList);
        this.f10487i = jSONObject.optString("qdata");
        this.f10491m = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.f10492n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f10480b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            C1697X.m7717x();
            this.f10481c = C2333Fz.m9841a(optJSONObject, "click_urls");
            C1697X.m7717x();
            this.f10482d = C2333Fz.m9841a(optJSONObject, "imp_urls");
            C1697X.m7717x();
            this.f10483e = C2333Fz.m9841a(optJSONObject, "downloaded_imp_urls");
            C1697X.m7717x();
            this.f10484f = C2333Fz.m9841a(optJSONObject, "nofill_urls");
            C1697X.m7717x();
            this.f10485g = C2333Fz.m9841a(optJSONObject, "remote_ping_urls");
            this.f10486h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f10488j = optLong > 0 ? 1000 * optLong : j;
            zzaig a = zzaig.m14764a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f10489k = null;
                this.f10490l = 0;
            } else {
                this.f10489k = a.f10845a;
                this.f10490l = a.f10846b;
            }
            this.f10493o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.f10494p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.f10495q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            return;
        }
        this.f10480b = -1;
        this.f10481c = null;
        this.f10482d = null;
        this.f10483e = null;
        this.f10484f = null;
        this.f10485g = null;
        this.f10488j = -1;
        this.f10489k = null;
        this.f10490l = 0;
        this.f10493o = false;
        this.f10486h = false;
        this.f10494p = false;
        this.f10495q = false;
    }
}
