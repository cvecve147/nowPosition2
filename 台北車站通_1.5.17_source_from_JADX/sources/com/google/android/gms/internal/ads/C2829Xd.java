package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C1997i;
import com.google.android.gms.common.C2063j;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Xd */
final class C2829Xd extends C2717Td {

    /* renamed from: d */
    private Context f8601d;

    C2829Xd(Context context) {
        this.f8601d = context;
    }

    /* renamed from: c */
    public final void mo7015c() {
    }

    /* renamed from: d */
    public final void mo7016d() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f8601d);
        } catch (C1997i | C2063j | IOException | IllegalStateException e) {
            C2227Cf.m9533b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        C3548vf.m14221a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        C2227Cf.m9536d(sb.toString());
    }
}
