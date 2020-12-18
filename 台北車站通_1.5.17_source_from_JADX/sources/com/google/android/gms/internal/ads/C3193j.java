package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.j */
public final class C3193j {

    /* renamed from: a */
    private final boolean f9540a;

    /* renamed from: b */
    private final boolean f9541b;

    /* renamed from: c */
    private final boolean f9542c;

    /* renamed from: d */
    private final boolean f9543d;

    /* renamed from: e */
    private final boolean f9544e;

    private C3193j(C3254l lVar) {
        this.f9540a = lVar.f9732a;
        this.f9541b = lVar.f9733b;
        this.f9542c = lVar.f9734c;
        this.f9543d = lVar.f9735d;
        this.f9544e = lVar.f9736e;
    }

    /* renamed from: a */
    public final JSONObject mo9590a() {
        try {
            return new JSONObject().put("sms", this.f9540a).put("tel", this.f9541b).put("calendar", this.f9542c).put("storePicture", this.f9543d).put("inlineVideo", this.f9544e);
        } catch (JSONException e) {
            C2227Cf.m9533b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
