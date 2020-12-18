package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.p067c.C1639a;
import com.google.android.gms.ads.reward.mediation.C1842a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.internal.C2061y;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.cd */
public final class C2998cd implements C1842a {

    /* renamed from: a */
    private final C2910_c f8991a;

    public C2998cd(C2910_c _cVar) {
        this.f8991a = _cVar;
    }

    /* renamed from: a */
    public final void mo7183a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onVideoCompleted.");
        try {
            this.f8991a.mo8815p(C5468d.m20961a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7184a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdFailedToLoad.");
        try {
            this.f8991a.mo8811b(C5468d.m20961a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo7185a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, C1639a aVar) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onRewarded.");
        if (aVar != null) {
            try {
                this.f8991a.mo8809a(C5468d.m20961a(mediationRewardedVideoAdAdapter), new zzaig(aVar));
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        } else {
            this.f8991a.mo8809a(C5468d.m20961a(mediationRewardedVideoAdAdapter), new zzaig("", 1));
        }
    }

    /* renamed from: b */
    public final void mo7186b(Bundle bundle) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdMetadataChanged.");
        try {
            this.f8991a.mo8810b(bundle);
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo7187b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdOpened.");
        try {
            this.f8991a.mo8816s(C5468d.m20961a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo7188c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onVideoStarted.");
        try {
            this.f8991a.mo8819y(C5468d.m20961a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo7189d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLoaded.");
        try {
            this.f8991a.mo8817t(C5468d.m20961a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo7190e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdLeftApplication.");
        try {
            this.f8991a.mo8812g(C5468d.m20961a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo7191f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onInitializationSucceeded.");
        try {
            this.f8991a.mo8814o(C5468d.m20961a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo7192g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C2061y.m9072a("#008 Must be called on the main UI thread.");
        C2227Cf.m9532b("Adapter called onAdClosed.");
        try {
            this.f8991a.mo8818w(C5468d.m20961a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
