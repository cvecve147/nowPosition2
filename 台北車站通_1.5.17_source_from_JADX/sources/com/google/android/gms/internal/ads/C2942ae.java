package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ae */
final class C2942ae extends C2999ce {

    /* renamed from: d */
    private final /* synthetic */ Context f8908d;

    /* renamed from: e */
    private final /* synthetic */ C2911_d f8909e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2942ae(C2911_d _dVar, Context context) {
        super((C2942ae) null);
        this.f8909e = _dVar;
        this.f8908d = context;
    }

    /* renamed from: d */
    public final void mo7016d() {
        SharedPreferences sharedPreferences = this.f8908d.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f8909e.f8758a) {
            SharedPreferences unused = this.f8909e.f8761d = sharedPreferences;
            this.f8909e.f8762e = edit;
            boolean unused2 = this.f8909e.f8763f = C2911_d.m11806n();
            boolean unused3 = this.f8909e.f8764g = this.f8909e.f8761d.getBoolean("use_https", this.f8909e.f8764g);
            boolean unused4 = this.f8909e.f8776s = this.f8909e.f8761d.getBoolean("content_url_opted_out", this.f8909e.f8776s);
            String unused5 = this.f8909e.f8765h = this.f8909e.f8761d.getString("content_url_hashes", this.f8909e.f8765h);
            boolean unused6 = this.f8909e.f8767j = this.f8909e.f8761d.getBoolean("auto_collect_location", this.f8909e.f8767j);
            boolean unused7 = this.f8909e.f8777t = this.f8909e.f8761d.getBoolean("content_vertical_opted_out", this.f8909e.f8777t);
            String unused8 = this.f8909e.f8766i = this.f8909e.f8761d.getString("content_vertical_hashes", this.f8909e.f8766i);
            int unused9 = this.f8909e.f8773p = this.f8909e.f8761d.getInt("version_code", this.f8909e.f8773p);
            String unused10 = this.f8909e.f8768k = this.f8909e.f8761d.getString("app_settings_json", this.f8909e.f8768k);
            long unused11 = this.f8909e.f8769l = this.f8909e.f8761d.getLong("app_settings_last_update_ms", this.f8909e.f8769l);
            long unused12 = this.f8909e.f8770m = this.f8909e.f8761d.getLong("app_last_background_time_ms", this.f8909e.f8770m);
            int unused13 = this.f8909e.f8772o = this.f8909e.f8761d.getInt("request_in_session_count", this.f8909e.f8772o);
            long unused14 = this.f8909e.f8771n = this.f8909e.f8761d.getLong("first_ad_req_time_ms", this.f8909e.f8771n);
            Set unused15 = this.f8909e.f8774q = this.f8909e.f8761d.getStringSet("never_pool_slots", this.f8909e.f8774q);
            try {
                JSONObject unused16 = this.f8909e.f8775r = new JSONObject(this.f8909e.f8761d.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                C2227Cf.m9535c("Could not convert native advanced settings to json object", e);
            }
            this.f8909e.m11781a(this.f8909e.m11809p());
        }
    }
}
