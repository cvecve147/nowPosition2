package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.za */
final class C3655za implements C1718E<C3520uh> {

    /* renamed from: a */
    private final /* synthetic */ C3520uh f10636a;

    /* renamed from: b */
    private final /* synthetic */ C3116gg f10637b;

    /* renamed from: c */
    private final /* synthetic */ C3484ta f10638c;

    C3655za(C3484ta taVar, C3520uh uhVar, C3116gg ggVar) {
        this.f10638c = taVar;
        this.f10636a = uhVar;
        this.f10637b = ggVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        boolean z;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str2)) {
                z = false;
                jSONObject = new JSONObject(str2);
            } else {
                jSONObject = new JSONObject(str);
                z = true;
            }
            if (this.f10638c.f10244h.equals(jSONObject.optString("ads_id", ""))) {
                this.f10636a.mo8147a("/nativeAdPreProcess", (C1718E<? super C3520uh>) this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                this.f10637b.mo9464b(jSONObject2);
            }
        } catch (Throwable th) {
            C2227Cf.m9533b("Error while preprocessing json.", th);
            this.f10637b.mo9463a(th);
        }
    }
}
