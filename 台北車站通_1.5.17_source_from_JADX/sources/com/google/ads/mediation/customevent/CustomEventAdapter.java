package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.C1611a;
import com.google.ads.mediation.C1613c;
import com.google.ads.mediation.C1621d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.C1827c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C2227Cf;
import p101d.p129g.p130a.C5457a;
import p101d.p129g.p130a.C5459c;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<C1827c, C1620e>, MediationInterstitialAdapter<C1827c, C1620e> {

    /* renamed from: a */
    private View f5429a;

    /* renamed from: b */
    private CustomEventBanner f5430b;

    /* renamed from: c */
    private CustomEventInterstitial f5431c;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C1614a implements C1617b {

        /* renamed from: a */
        private final CustomEventAdapter f5432a;

        /* renamed from: b */
        private final C1613c f5433b;

        public C1614a(CustomEventAdapter customEventAdapter, C1613c cVar) {
            this.f5432a = customEventAdapter;
            this.f5433b = cVar;
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C1615b implements C1618c {

        /* renamed from: a */
        private final CustomEventAdapter f5434a;

        /* renamed from: b */
        private final C1621d f5435b;

        public C1615b(CustomEventAdapter customEventAdapter, C1621d dVar) {
            this.f5434a = customEventAdapter;
            this.f5435b = dVar;
        }
    }

    /* renamed from: a */
    private static <T> T m7435a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C2227Cf.m9536d(sb.toString());
            return null;
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.f5430b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f5431c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<C1827c> getAdditionalParametersType() {
        return C1827c.class;
    }

    public final View getBannerView() {
        return this.f5429a;
    }

    public final Class<C1620e> getServerParametersType() {
        return C1620e.class;
    }

    public final void requestBannerAd(C1613c cVar, Activity activity, C1620e eVar, C5459c cVar2, C1611a aVar, C1827c cVar3) {
        this.f5430b = (CustomEventBanner) m7435a(eVar.f5438b);
        if (this.f5430b == null) {
            cVar.mo6504a(this, C5457a.INTERNAL_ERROR);
            return;
        }
        this.f5430b.requestBannerAd(new C1614a(this, cVar), activity, eVar.f5437a, eVar.f5439c, cVar2, aVar, cVar3 == null ? null : cVar3.mo7083a(eVar.f5437a));
    }

    public final void requestInterstitialAd(C1621d dVar, Activity activity, C1620e eVar, C1611a aVar, C1827c cVar) {
        this.f5431c = (CustomEventInterstitial) m7435a(eVar.f5438b);
        if (this.f5431c == null) {
            dVar.mo6511a(this, C5457a.INTERNAL_ERROR);
            return;
        }
        this.f5431c.requestInterstitialAd(new C1615b(this, dVar), activity, eVar.f5437a, eVar.f5439c, aVar, cVar == null ? null : cVar.mo7083a(eVar.f5437a));
    }

    public final void showInterstitial() {
        this.f5431c.showInterstitial();
    }
}
