package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C1813j;
import com.google.android.gms.ads.formats.C1660i;
import com.google.android.gms.ads.mediation.C1821c;
import com.google.android.gms.ads.mediation.C1831d;
import com.google.android.gms.ads.mediation.C1832e;
import com.google.android.gms.ads.mediation.C1833f;
import com.google.android.gms.ads.mediation.C1840m;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.C2061y;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.kA */
public final class C3227kA implements C1821c, C1831d, C1832e {

    /* renamed from: a */
    private final C2712Sz f9679a;

    /* renamed from: b */
    private C1833f f9680b;

    /* renamed from: c */
    private C1840m f9681c;

    /* renamed from: d */
    private C1660i f9682d;

    public C3227kA(C2712Sz sz) {
        this.f9679a = sz;
    }

    /* renamed from: a */
    private static void m12847a(MediationNativeAdapter mediationNativeAdapter, C1840m mVar, C1833f fVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C1813j jVar = new C1813j();
            jVar.mo7051a((C2987bu) new C3137hA());
            if (mVar != null && mVar.mo7178o()) {
                mVar.mo7152a(jVar);
            }
            if (fVar != null && fVar.mo7111f()) {
                fVar.mo7103a(jVar);
            }
        }
    }

    /* renamed from: a */
    public final C1833f mo9633a() {
        return this.f9680b;
    }

    /* renamed from: a */
    public final void mo7069a(MediationBannerAdapter mediationBannerAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdClosed.");
        try {
            this.f9679a.mo8885U();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7070a(MediationBannerAdapter mediationBannerAdapter, int i) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        C2227Cf.m9532b(sb.toString());
        try {
            this.f9679a.mo8889c(i);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7071a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAppEvent.");
        try {
            this.f9679a.mo8888a(str, str2);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7084a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLeftApplication.");
        try {
            this.f9679a.mo8881N();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7085a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C2227Cf.m9532b(sb.toString());
        try {
            this.f9679a.mo8889c(i);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7090a(MediationNativeAdapter mediationNativeAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdOpened.");
        try {
            this.f9679a.mo8880M();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7091a(MediationNativeAdapter mediationNativeAdapter, int i) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C2227Cf.m9532b(sb.toString());
        try {
            this.f9679a.mo8889c(i);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7092a(MediationNativeAdapter mediationNativeAdapter, C1660i iVar) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(iVar.mo6655l());
        C2227Cf.m9532b(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f9682d = iVar;
        try {
            this.f9679a.mo8882P();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7093a(MediationNativeAdapter mediationNativeAdapter, C1660i iVar, String str) {
        if (iVar instanceof C3593ww) {
            try {
                this.f9679a.mo8887a(((C3593ww) iVar).mo10206a(), str);
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        } else {
            C2227Cf.m9536d("Unexpected native custom template ad type.");
        }
    }

    /* renamed from: a */
    public final void mo7094a(MediationNativeAdapter mediationNativeAdapter, C1833f fVar) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLoaded.");
        this.f9680b = fVar;
        this.f9681c = null;
        m12847a(mediationNativeAdapter, this.f9681c, this.f9680b);
        try {
            this.f9679a.mo8882P();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7095a(MediationNativeAdapter mediationNativeAdapter, C1840m mVar) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLoaded.");
        this.f9681c = mVar;
        this.f9680b = null;
        m12847a(mediationNativeAdapter, this.f9681c, this.f9680b);
        try {
            this.f9679a.mo8882P();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final C1840m mo9634b() {
        return this.f9681c;
    }

    /* renamed from: b */
    public final void mo7072b(MediationBannerAdapter mediationBannerAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdClicked.");
        try {
            this.f9679a.mo8890f();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo7086b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdClicked.");
        try {
            this.f9679a.mo8890f();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo7096b(MediationNativeAdapter mediationNativeAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdClosed.");
        try {
            this.f9679a.mo8885U();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final C1660i mo9635c() {
        return this.f9682d;
    }

    /* renamed from: c */
    public final void mo7073c(MediationBannerAdapter mediationBannerAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLoaded.");
        try {
            this.f9679a.mo8882P();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo7087c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLoaded.");
        try {
            this.f9679a.mo8882P();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo7097c(MediationNativeAdapter mediationNativeAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C1833f fVar = this.f9680b;
        C1840m mVar = this.f9681c;
        if (this.f9682d == null) {
            if (fVar == null && mVar == null) {
                C2227Cf.m9537d("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (mVar != null && !mVar.mo7172i()) {
                C2227Cf.m9532b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (fVar != null && !fVar.mo7108c()) {
                C2227Cf.m9532b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        C2227Cf.m9532b("Adapter called onAdClicked.");
        try {
            this.f9679a.mo8890f();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo7074d(MediationBannerAdapter mediationBannerAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLeftApplication.");
        try {
            this.f9679a.mo8881N();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo7088d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdClosed.");
        try {
            this.f9679a.mo8885U();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo7098d(MediationNativeAdapter mediationNativeAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLeftApplication.");
        try {
            this.f9679a.mo8881N();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo7075e(MediationBannerAdapter mediationBannerAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdOpened.");
        try {
            this.f9679a.mo8880M();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo7089e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdOpened.");
        try {
            this.f9679a.mo8880M();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo7099e(MediationNativeAdapter mediationNativeAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C1833f fVar = this.f9680b;
        C1840m mVar = this.f9681c;
        if (this.f9682d == null) {
            if (fVar == null && mVar == null) {
                C2227Cf.m9537d("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (mVar != null && !mVar.mo7173j()) {
                C2227Cf.m9532b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (fVar != null && !fVar.mo7109d()) {
                C2227Cf.m9532b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        C2227Cf.m9532b("Adapter called onAdImpression.");
        try {
            this.f9679a.mo8884S();
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
