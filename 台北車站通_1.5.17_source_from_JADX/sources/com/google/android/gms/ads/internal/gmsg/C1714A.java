package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.A */
final class C1714A implements C1718E<C3520uh> {
    C1714A() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3520uh uhVar = (C3520uh) obj;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7866bc)).booleanValue()) {
            uhVar.mo8181m(!Boolean.parseBoolean((String) map.get("disabled")));
        }
    }
}
