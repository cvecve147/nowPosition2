package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C1613c;
import com.google.ads.mediation.C1621d;
import com.google.ads.mediation.C1622e;
import com.google.ads.mediation.C1625f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import p101d.p129g.p130a.C5457a;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.pA */
public final class C3369pA<NETWORK_EXTRAS extends C1625f, SERVER_PARAMETERS extends C1622e> implements C1613c, C1621d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2712Sz f9988a;

    public C3369pA(C2712Sz sz) {
        this.f9988a = sz;
    }

    /* renamed from: a */
    public final void mo6504a(MediationBannerAdapter<?, ?> mediationBannerAdapter, C5457a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        C2227Cf.m9532b(sb.toString());
        C3390pt.m13453a();
        if (!C3432rf.m13608b()) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", (Throwable) null);
            C3432rf.f10110a.post(new C3398qA(this, aVar));
            return;
        }
        try {
            this.f9988a.mo8889c(C3483tA.m13826a(aVar));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo6511a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C5457a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        C2227Cf.m9532b(sb.toString());
        C3390pt.m13453a();
        if (!C3432rf.m13608b()) {
            C2227Cf.m9537d("#008 Must be called on the main UI thread.", (Throwable) null);
            C3432rf.f10110a.post(new C3455sA(this, aVar));
            return;
        }
        try {
            this.f9988a.mo8889c(C3483tA.m13826a(aVar));
        } catch (RemoteException e) {
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }
}
