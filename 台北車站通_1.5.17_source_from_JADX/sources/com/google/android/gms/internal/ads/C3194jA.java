package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C1817m;
import com.google.android.gms.ads.formats.C1660i;
import com.google.android.gms.ads.mediation.C1819b;
import com.google.android.gms.ads.mediation.C1833f;
import com.google.android.gms.ads.mediation.C1834g;
import com.google.android.gms.ads.mediation.C1835h;
import com.google.android.gms.ads.mediation.C1838k;
import com.google.android.gms.ads.mediation.C1839l;
import com.google.android.gms.ads.mediation.C1840m;
import com.google.android.gms.ads.mediation.C1841n;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.jA */
public final class C3194jA extends C2654Qz {

    /* renamed from: a */
    private final C1819b f9545a;

    /* renamed from: b */
    private C3227kA f9546b;

    public C3194jA(C1819b bVar) {
        this.f9545a = bVar;
    }

    /* renamed from: a */
    private final Bundle m12688a(String str, zzjj zzjj, String str2) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        C2227Cf.m9536d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f9545a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzjj != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzjj.f10881g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    private static boolean m12689c(zzjj zzjj) {
        if (zzjj.f10880f) {
            return true;
        }
        C3390pt.m13453a();
        return C3432rf.m13604a();
    }

    /* renamed from: B */
    public final void mo8705B() {
        try {
            this.f9545a.onResume();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: Ba */
    public final C2880Yz mo8706Ba() {
        C1833f a = this.f9546b.mo9633a();
        if (a instanceof C1834g) {
            return new C3255lA((C1834g) a);
        }
        return null;
    }

    /* renamed from: Ja */
    public final C2965bA mo8707Ja() {
        C1833f a = this.f9546b.mo9633a();
        if (a instanceof C1835h) {
            return new C3284mA((C1835h) a);
        }
        return null;
    }

    /* renamed from: Ta */
    public final C3052eA mo8708Ta() {
        C1840m b = this.f9546b.mo9634b();
        if (b != null) {
            return new C3542vA(b);
        }
        return null;
    }

    /* renamed from: Z */
    public final boolean mo8709Z() {
        return this.f9545a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    /* renamed from: a */
    public final void mo8710a(zzjj zzjj, String str) {
        mo8711a(zzjj, str, (String) null);
    }

    /* renamed from: a */
    public final void mo8711a(zzjj zzjj, String str, String str2) {
        C1819b bVar = this.f9545a;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f9545a;
            Bundle bundle = null;
            C3165iA iAVar = new C3165iA(zzjj.f10876b == -1 ? null : new Date(zzjj.f10876b), zzjj.f10878d, zzjj.f10879e != null ? new HashSet(zzjj.f10879e) : null, zzjj.f10885k, m12689c(zzjj), zzjj.f10881g, zzjj.f10892r);
            if (zzjj.f10887m != null) {
                bundle = zzjj.f10887m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
            }
            mediationRewardedVideoAdAdapter.loadAd(iAVar, m12688a(str, zzjj, str2), bundle);
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo8712a(C5464b bVar, C2910_c _cVar, List<String> list) {
        C1819b bVar2 = this.f9545a;
        if (!(bVar2 instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not an InitializableMediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f9545a;
            ArrayList arrayList = new ArrayList();
            for (String a : list) {
                arrayList.add(m12688a(a, (zzjj) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) C5468d.m20962z(bVar), new C2998cd(_cVar), arrayList);
        } catch (Throwable th) {
            C2227Cf.m9535c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo8713a(C5464b bVar, zzjj zzjj, String str, C2712Sz sz) {
        mo8715a(bVar, zzjj, str, (String) null, sz);
    }

    /* renamed from: a */
    public final void mo8714a(C5464b bVar, zzjj zzjj, String str, C2910_c _cVar, String str2) {
        Bundle bundle;
        C3165iA iAVar;
        zzjj zzjj2 = zzjj;
        C1819b bVar2 = this.f9545a;
        if (!(bVar2 instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f9545a;
            Bundle a = m12688a(str2, zzjj2, (String) null);
            if (zzjj2 != null) {
                C3165iA iAVar2 = new C3165iA(zzjj2.f10876b == -1 ? null : new Date(zzjj2.f10876b), zzjj2.f10878d, zzjj2.f10879e != null ? new HashSet(zzjj2.f10879e) : null, zzjj2.f10885k, m12689c(zzjj), zzjj2.f10881g, zzjj2.f10892r);
                bundle = zzjj2.f10887m != null ? zzjj2.f10887m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                iAVar = iAVar2;
            } else {
                iAVar = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) C5468d.m20962z(bVar), iAVar, str, new C2998cd(_cVar), a, bundle);
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo8715a(C5464b bVar, zzjj zzjj, String str, String str2, C2712Sz sz) {
        zzjj zzjj2 = zzjj;
        C1819b bVar2 = this.f9545a;
        if (!(bVar2 instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f9545a;
            Bundle bundle = null;
            C3165iA iAVar = new C3165iA(zzjj2.f10876b == -1 ? null : new Date(zzjj2.f10876b), zzjj2.f10878d, zzjj2.f10879e != null ? new HashSet(zzjj2.f10879e) : null, zzjj2.f10885k, m12689c(zzjj), zzjj2.f10881g, zzjj2.f10892r);
            if (zzjj2.f10887m != null) {
                bundle = zzjj2.f10887m.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) C5468d.m20962z(bVar), new C3227kA(sz), m12688a(str, zzjj2, str2), iAVar, bundle);
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo8716a(C5464b bVar, zzjj zzjj, String str, String str2, C2712Sz sz, zzpl zzpl, List<String> list) {
        zzjj zzjj2 = zzjj;
        C1819b bVar2 = this.f9545a;
        if (!(bVar2 instanceof MediationNativeAdapter)) {
            String valueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationNativeAdapter: ".concat(valueOf) : new String("Not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) bVar2;
            Bundle bundle = null;
            C3312nA nAVar = new C3312nA(zzjj2.f10876b == -1 ? null : new Date(zzjj2.f10876b), zzjj2.f10878d, zzjj2.f10879e != null ? new HashSet(zzjj2.f10879e) : null, zzjj2.f10885k, m12689c(zzjj), zzjj2.f10881g, zzpl, list, zzjj2.f10892r);
            if (zzjj2.f10887m != null) {
                bundle = zzjj2.f10887m.getBundle(mediationNativeAdapter.getClass().getName());
            }
            this.f9546b = new C3227kA(sz);
            mediationNativeAdapter.requestNativeAd((Context) C5468d.m20962z(bVar), this.f9546b, m12688a(str, zzjj2, str2), nAVar, bundle);
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo8717a(C5464b bVar, zzjn zzjn, zzjj zzjj, String str, C2712Sz sz) {
        mo8718a(bVar, zzjn, zzjj, str, (String) null, sz);
    }

    /* renamed from: a */
    public final void mo8718a(C5464b bVar, zzjn zzjn, zzjj zzjj, String str, String str2, C2712Sz sz) {
        zzjn zzjn2 = zzjn;
        zzjj zzjj2 = zzjj;
        C1819b bVar2 = this.f9545a;
        if (!(bVar2 instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f9545a;
            Bundle bundle = null;
            C3165iA iAVar = new C3165iA(zzjj2.f10876b == -1 ? null : new Date(zzjj2.f10876b), zzjj2.f10878d, zzjj2.f10879e != null ? new HashSet(zzjj2.f10879e) : null, zzjj2.f10885k, m12689c(zzjj), zzjj2.f10881g, zzjj2.f10892r);
            if (zzjj2.f10887m != null) {
                bundle = zzjj2.f10887m.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) C5468d.m20962z(bVar), new C3227kA(sz), m12688a(str, zzjj2, str2), C1817m.m8088a(zzjn2.f10897e, zzjn2.f10894b, zzjn2.f10893a), iAVar, bundle);
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo8719a(boolean z) {
        C1819b bVar = this.f9545a;
        if (!(bVar instanceof C1839l)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C2227Cf.m9534c(valueOf.length() != 0 ? "Not an OnImmersiveModeUpdatedListener: ".concat(valueOf) : new String("Not an OnImmersiveModeUpdatedListener: "));
            return;
        }
        try {
            ((C1839l) bVar).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
        }
    }

    public final void destroy() {
        try {
            this.f9545a.onDestroy();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        C1819b bVar = this.f9545a;
        if (bVar instanceof zzatm) {
            return ((zzatm) bVar).getInterstitialAdapterInfo();
        }
        String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
        C2227Cf.m9536d(valueOf.length() != 0 ? "Not a v2 MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a v2 MediationInterstitialAdapter: "));
        return new Bundle();
    }

    public final C2987bu getVideoController() {
        C1819b bVar = this.f9545a;
        if (!(bVar instanceof C1841n)) {
            return null;
        }
        try {
            return ((C1841n) bVar).getVideoController();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            return null;
        }
    }

    public final C5464b getView() {
        C1819b bVar = this.f9545a;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return C5468d.m20961a(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() {
        C1819b bVar = this.f9545a;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.f9545a).isInitialized();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: ja */
    public final C3507tw mo8725ja() {
        C1660i c = this.f9546b.mo9635c();
        if (c instanceof C3593ww) {
            return ((C3593ww) c).mo10206a();
        }
        return null;
    }

    public final void pause() {
        try {
            this.f9545a.onPause();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    public final void showInterstitial() {
        C1819b bVar = this.f9545a;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f9545a).showInterstitial();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    public final void showVideo() {
        C1819b bVar = this.f9545a;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.f9545a).showVideo();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: u */
    public final void mo8729u(C5464b bVar) {
        try {
            ((C1838k) this.f9545a).mo7148a((Context) C5468d.m20962z(bVar));
        } catch (Throwable th) {
            C2227Cf.m9535c("Failed", th);
        }
    }

    /* renamed from: ua */
    public final Bundle mo8730ua() {
        return new Bundle();
    }

    public final Bundle zzmq() {
        C1819b bVar = this.f9545a;
        if (bVar instanceof zzatl) {
            return ((zzatl) bVar).zzmq();
        }
        String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
        C2227Cf.m9536d(valueOf.length() != 0 ? "Not a v2 MediationBannerAdapter: ".concat(valueOf) : new String("Not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }
}
