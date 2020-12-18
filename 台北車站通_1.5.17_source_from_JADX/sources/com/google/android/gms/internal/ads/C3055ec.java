package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.apache.http.client.methods.HttpHead;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ec */
public final class C3055ec extends C3112gc {

    /* renamed from: a */
    private final Object f9077a = new Object();

    /* renamed from: b */
    private final Context f9078b;

    /* renamed from: c */
    private SharedPreferences f9079c;

    /* renamed from: d */
    private final C3050dz<JSONObject, JSONObject> f9080d;

    public C3055ec(Context context, C3050dz<JSONObject, JSONObject> dzVar) {
        this.f9078b = context.getApplicationContext();
        this.f9080d = dzVar;
    }

    /* renamed from: a */
    public final C2804Wf<Void> mo9367a() {
        synchronized (this.f9077a) {
            if (this.f9079c == null) {
                this.f9079c = this.f9078b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (C1697X.m7705l().mo7725a() - this.f9079c.getLong("js_last_update", 0) < ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7761Jc)).longValue()) {
            return C2483Lf.m10495a(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzang.m14766b().f10855a);
            jSONObject.put("mf", C3390pt.m13458f().mo8515a(C2558Nu.f7767Kc));
            jSONObject.put("cl", "193400285");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", HttpHead.METHOD_NAME);
            jSONObject.put("dynamite_version", ModuleDescriptor.MODULE_VERSION);
            return C2483Lf.m10498a(this.f9080d.mo9344a(jSONObject), new C3083fc(this), C2972bg.f8939b);
        } catch (JSONException e) {
            C2227Cf.m9533b("Unable to populate SDK Core Constants parameters.", e);
            return C2483Lf.m10495a(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo9368a(JSONObject jSONObject) {
        C2558Nu.m10774a(this.f9078b, 1, jSONObject);
        this.f9079c.edit().putLong("js_last_update", C1697X.m7705l().mo7725a()).apply();
        return null;
    }
}
