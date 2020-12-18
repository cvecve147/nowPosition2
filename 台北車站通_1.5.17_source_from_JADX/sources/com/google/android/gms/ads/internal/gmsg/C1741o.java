package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2209Bp;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2238Cp;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2635Qh;
import com.google.android.gms.internal.ads.C2749Ug;
import com.google.android.gms.internal.ads.C2861Yh;
import com.google.android.gms.internal.ads.C2915_h;
import com.google.android.gms.internal.ads.C2945ah;
import com.google.android.gms.internal.ads.C2946ai;
import com.google.android.gms.internal.ads.C2973bh;
import com.google.android.gms.internal.ads.C2991by;
import com.google.android.gms.internal.ads.C3086ff;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3602xd;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.o */
public final class C1741o {

    /* renamed from: a */
    private static final C1718E<Object> f5715a = new C1747u();

    /* renamed from: b */
    public static final C1718E<C3520uh> f5716b = C1742p.f5734a;

    /* renamed from: c */
    public static final C1718E<C3520uh> f5717c = C1743q.f5735a;

    /* renamed from: d */
    public static final C1718E<C3520uh> f5718d = C1744r.f5736a;

    /* renamed from: e */
    public static final C1718E<C3520uh> f5719e = new C1749w();

    /* renamed from: f */
    public static final C1718E<C3520uh> f5720f = new C1750x();

    /* renamed from: g */
    public static final C1718E<C3520uh> f5721g = C1745s.f5737a;

    /* renamed from: h */
    public static final C1718E<Object> f5722h = new C1751y();

    /* renamed from: i */
    public static final C1718E<C3520uh> f5723i = new C1752z();

    /* renamed from: j */
    public static final C1718E<C3520uh> f5724j = C1746t.f5738a;

    /* renamed from: k */
    public static final C1718E<C3520uh> f5725k = new C1714A();

    /* renamed from: l */
    public static final C1718E<C3520uh> f5726l = new C1715B();

    /* renamed from: m */
    public static final C1718E<C2749Ug> f5727m = new C2945ah();

    /* renamed from: n */
    public static final C1718E<C2749Ug> f5728n = new C2973bh();

    /* renamed from: o */
    public static final C1718E<C3520uh> f5729o = new C1740n();

    /* renamed from: p */
    public static final C1733g f5730p = new C1733g();

    /* renamed from: q */
    public static final C1718E<C3520uh> f5731q = new C1716C();

    /* renamed from: r */
    public static final C1718E<C3520uh> f5732r = new C1717D();

    /* renamed from: s */
    public static final C1718E<C3520uh> f5733s = new C1748v();

    /* renamed from: a */
    static final /* synthetic */ void m7884a(C2635Qh qh, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C2227Cf.m9536d("URL missing from httpTrack GMSG.");
        } else {
            new C3086ff(qh.getContext(), ((C2915_h) qh).mo8201ub().f10855a, str).mo8892e();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m7885a(C2861Yh yh, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            C2209Bp hb = yh.mo8171hb();
            if (hb != null) {
                hb.mo7869a().mo6946a(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            C2227Cf.m9536d("Could not parse touch parameters from gmsg.");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m7886a(C2991by byVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            C2227Cf.m9536d("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            C2209Bp hb = ((C2861Yh) byVar).mo8171hb();
            if (hb != null && hb.mo7871a(parse)) {
                parse = hb.mo7868a(parse, ((C2635Qh) byVar).getContext(), ((C2946ai) byVar).getView(), ((C2635Qh) byVar).mo8163eb());
            }
        } catch (C2238Cp unused) {
            String valueOf = String.valueOf(str);
            C2227Cf.m9536d(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        C2635Qh qh = (C2635Qh) byVar;
        new C3086ff(qh.getContext(), ((C2915_h) byVar).mo8201ub().f10855a, C3602xd.m14407a(parse, qh.getContext()).toString()).mo8892e();
    }

    /* renamed from: b */
    static final /* synthetic */ void m7887b(C2635Qh qh, Map map) {
        JSONException jSONException;
        String str;
        PackageManager packageManager = qh.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String valueOf = String.valueOf(optString7);
                                C2227Cf.m9533b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            jSONException = e2;
                            str = "Error constructing openable urls response.";
                        }
                    } catch (JSONException e3) {
                        jSONException = e3;
                        str = "Error parsing the intent data.";
                        C2227Cf.m9533b(str, jSONException);
                    }
                }
                ((C2991by) qh).mo8150a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((C2991by) qh).mo8150a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((C2991by) qh).mo8150a("openableIntents", new JSONObject());
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m7888c(C2635Qh qh, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C2227Cf.m9536d("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = qh.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((C2991by) qh).mo8149a("openableURLs", (Map<String, ?>) hashMap);
    }
}
