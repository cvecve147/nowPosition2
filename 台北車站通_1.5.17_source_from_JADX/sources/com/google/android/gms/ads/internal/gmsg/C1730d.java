package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.C1806va;
import com.google.android.gms.common.util.C2084f;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2507MA;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3021d;
import com.google.android.gms.internal.ads.C3079f;
import com.google.android.gms.internal.ads.C3108g;
import com.google.android.gms.internal.ads.C3340o;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.d */
public final class C1730d implements C1718E<C3520uh> {

    /* renamed from: a */
    private static final Map<String, Integer> f5693a = C2084f.m9123a((K[]) new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, (V[]) new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: b */
    private final C1806va f5694b;

    /* renamed from: c */
    private final C3021d f5695c;

    /* renamed from: d */
    private final C3340o f5696d;

    public C1730d(C1806va vaVar, C3021d dVar, C3340o oVar) {
        this.f5694b = vaVar;
        this.f5695c = dVar;
        this.f5696d = oVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C1806va vaVar;
        C3520uh uhVar = (C3520uh) obj;
        int intValue = f5693a.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (vaVar = this.f5694b) != null && !vaVar.mo7033b()) {
            this.f5694b.mo7032a((String) null);
        } else if (intValue == 1) {
            this.f5695c.mo9302a((Map<String, String>) map);
        } else if (intValue == 3) {
            new C3108g(uhVar, map).mo9444a();
        } else if (intValue == 4) {
            new C2507MA(uhVar, map).mo8523b();
        } else if (intValue == 5) {
            new C3079f(uhVar, map).mo9417a();
        } else if (intValue == 6) {
            this.f5695c.mo9303a(true);
        } else if (intValue != 7) {
            C2227Cf.m9534c("Unknown MRAID command called.");
        } else {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7894ga)).booleanValue()) {
                this.f5696d.mo6971Tb();
            }
        }
    }
}
