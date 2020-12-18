package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C1642d;
import com.google.android.gms.ads.mediation.C1818a;
import com.google.android.gms.ads.mediation.C1821c;
import com.google.android.gms.ads.mediation.C1831d;
import com.google.android.gms.ads.mediation.C1832e;
import com.google.android.gms.ads.mediation.C1836i;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.C2227Cf;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: a */
    private View f5939a;

    /* renamed from: b */
    private CustomEventBanner f5940b;

    /* renamed from: c */
    private CustomEventInterstitial f5941c;

    /* renamed from: d */
    private CustomEventNative f5942d;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C1822a implements C1826b {

        /* renamed from: a */
        private final CustomEventAdapter f5943a;

        /* renamed from: b */
        private final C1821c f5944b;

        public C1822a(CustomEventAdapter customEventAdapter, C1821c cVar) {
            this.f5943a = customEventAdapter;
            this.f5944b = cVar;
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    class C1823b implements C1828d {

        /* renamed from: a */
        private final CustomEventAdapter f5945a;

        /* renamed from: b */
        private final C1831d f5946b;

        public C1823b(CustomEventAdapter customEventAdapter, C1831d dVar) {
            this.f5945a = customEventAdapter;
            this.f5946b = dVar;
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    static class C1824c implements C1830f {

        /* renamed from: a */
        private final CustomEventAdapter f5948a;

        /* renamed from: b */
        private final C1832e f5949b;

        public C1824c(CustomEventAdapter customEventAdapter, C1832e eVar) {
            this.f5948a = customEventAdapter;
            this.f5949b = eVar;
        }
    }

    /* renamed from: a */
    private static <T> T m8104a(String str) {
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

    public final View getBannerView() {
        return this.f5939a;
    }

    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.f5940b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f5941c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f5942d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public final void onPause() {
        CustomEventBanner customEventBanner = this.f5940b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f5941c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f5942d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public final void onResume() {
        CustomEventBanner customEventBanner = this.f5940b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f5941c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f5942d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public final void requestBannerAd(Context context, C1821c cVar, Bundle bundle, C1642d dVar, C1818a aVar, Bundle bundle2) {
        this.f5940b = (CustomEventBanner) m8104a(bundle.getString("class_name"));
        if (this.f5940b == null) {
            cVar.mo7070a(this, 0);
            return;
        }
        this.f5940b.requestBannerAd(context, new C1822a(this, cVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), dVar, aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void requestInterstitialAd(Context context, C1831d dVar, Bundle bundle, C1818a aVar, Bundle bundle2) {
        this.f5941c = (CustomEventInterstitial) m8104a(bundle.getString("class_name"));
        if (this.f5941c == null) {
            dVar.mo7085a(this, 0);
            return;
        }
        this.f5941c.requestInterstitialAd(context, new C1823b(this, dVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), aVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void requestNativeAd(Context context, C1832e eVar, Bundle bundle, C1836i iVar, Bundle bundle2) {
        this.f5942d = (CustomEventNative) m8104a(bundle.getString("class_name"));
        if (this.f5942d == null) {
            eVar.mo7091a((MediationNativeAdapter) this, 0);
            return;
        }
        this.f5942d.requestNativeAd(context, new C1824c(this, eVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), iVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
    }

    public final void showInterstitial() {
        this.f5941c.showInterstitial();
    }
}
