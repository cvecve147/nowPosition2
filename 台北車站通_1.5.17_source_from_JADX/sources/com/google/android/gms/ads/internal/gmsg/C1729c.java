package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.internal.ads.C2478La;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.c */
public final class C1729c implements C1718E<Object> {

    /* renamed from: a */
    private final Context f5692a;

    public C1729c(Context context) {
        this.f5692a = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (C1697X.m7689B().mo10040d(this.f5692a)) {
            C1697X.m7689B().mo10033a(this.f5692a, map.get("eventName"), map.get("eventId"));
        }
    }
}
