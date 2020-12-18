package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Tg */
public final class C2720Tg {

    /* renamed from: a */
    private final boolean f8338a;

    /* renamed from: b */
    private final int f8339b;

    /* renamed from: c */
    private final int f8340c;

    /* renamed from: d */
    private final int f8341d;

    /* renamed from: e */
    private final String f8342e;

    /* renamed from: f */
    private final int f8343f;

    /* renamed from: g */
    private final int f8344g;

    /* renamed from: h */
    private final int f8345h;

    /* renamed from: i */
    private final boolean f8346i;

    public C2720Tg(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f8338a = m11270a(jSONObject, "aggressive_media_codec_release", C2558Nu.f7770L);
        this.f8339b = m11271b(jSONObject, "byte_buffer_precache_limit", C2558Nu.f7983v);
        this.f8340c = m11271b(jSONObject, "exo_cache_buffer_size", C2558Nu.f8007z);
        this.f8341d = m11271b(jSONObject, "exo_connect_timeout_millis", C2558Nu.f7959r);
        this.f8342e = m11272c(jSONObject, "exo_player_version", C2558Nu.f7953q);
        this.f8343f = m11271b(jSONObject, "exo_read_timeout_millis", C2558Nu.f7965s);
        this.f8344g = m11271b(jSONObject, "load_check_interval_bytes", C2558Nu.f7971t);
        this.f8345h = m11271b(jSONObject, "player_precache_limit", C2558Nu.f7977u);
        this.f8346i = m11270a(jSONObject, "use_cache_data_source", C2558Nu.f7792Od);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.Du, com.google.android.gms.internal.ads.Du<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m11270a(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.C2271Du<java.lang.Boolean> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            boolean r0 = r0.getBoolean(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.Lu r0 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r0.mo8515a(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2720Tg.m11270a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.Du):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.Du, com.google.android.gms.internal.ads.Du<java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m11271b(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.C2271Du<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.Lu r0 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r0.mo8515a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2720Tg.m11271b(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.Du):int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.Du<java.lang.String>, com.google.android.gms.internal.ads.Du] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11272c(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.C2271Du<java.lang.String> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.Lu r0 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r0.mo8515a(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2720Tg.m11272c(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.Du):java.lang.String");
    }
}
