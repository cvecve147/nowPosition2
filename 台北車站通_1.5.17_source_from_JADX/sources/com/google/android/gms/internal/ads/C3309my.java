package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.my */
public final /* synthetic */ class C3309my {
    /* renamed from: a */
    public static void m13109a(C3281ly lyVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        lyVar.mo7966a(sb.toString());
    }

    /* renamed from: a */
    public static void m13110a(C3281ly lyVar, String str, Map map) {
        try {
            lyVar.mo8150a(str, C1697X.m7698e().mo9447a((Map<String, ?>) map));
        } catch (JSONException unused) {
            C2227Cf.m9536d("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public static void m13111a(C3281ly lyVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        lyVar.mo9270a(str, jSONObject.toString());
    }

    /* renamed from: b */
    public static void m13112b(C3281ly lyVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C2227Cf.m9532b(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        lyVar.mo7966a(sb.toString());
    }
}
