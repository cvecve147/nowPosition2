package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.mc */
public final class C3287mc implements C2629Qb {

    /* renamed from: a */
    private C3050dz<JSONObject, JSONObject> f9784a;

    /* renamed from: b */
    private C3050dz<JSONObject, JSONObject> f9785b;

    public C3287mc(Context context) {
        C3282lz a = C1697X.m7712s().mo9416a(context, zzang.m14766b());
        C3163hz<JSONObject> hzVar = C3192iz.f9538b;
        this.f9784a = a.mo9706a("google.afma.request.getAdDictionary", hzVar, hzVar);
        C3282lz a2 = C1697X.m7712s().mo9416a(context, zzang.m14766b());
        C3163hz<JSONObject> hzVar2 = C3192iz.f9538b;
        this.f9785b = a2.mo9706a("google.afma.sdkConstants.getSdkConstants", hzVar2, hzVar2);
    }

    /* renamed from: a */
    public final C3050dz<JSONObject, JSONObject> mo8733a() {
        return this.f9785b;
    }

    /* renamed from: b */
    public final C3050dz<JSONObject, JSONObject> mo8734b() {
        return this.f9784a;
    }
}
