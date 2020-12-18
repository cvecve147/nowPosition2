package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.iz */
public final class C3192iz {

    /* renamed from: a */
    private static final Charset f9537a = Charset.forName(HTTP.UTF_8);

    /* renamed from: b */
    public static final C3163hz<JSONObject> f9538b = new C3253kz();

    /* renamed from: c */
    private static final C3107fz<InputStream> f9539c = C3225jz.f9678a;

    /* renamed from: a */
    static final /* synthetic */ InputStream m12686a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f9537a));
    }
}
