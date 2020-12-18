package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.C1612b;
import com.google.ads.mediation.C1622e;
import com.google.ads.mediation.C1625f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.C1817m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p101d.p129g.p130a.C5459c;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.oA */
public final class C3341oA<NETWORK_EXTRAS extends C1625f, SERVER_PARAMETERS extends C1622e> extends C2654Qz {

    /* renamed from: a */
    private final C1612b<NETWORK_EXTRAS, SERVER_PARAMETERS> f9940a;

    /* renamed from: b */
    private final NETWORK_EXTRAS f9941b;

    public C3341oA(C1612b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f9940a = bVar;
        this.f9941b = network_extras;
    }

    /* renamed from: b */
    private final SERVER_PARAMETERS m13207b(String str, int i, String str2) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                C2227Cf.m9533b("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f9940a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (C1622e) serverParametersType.newInstance();
        server_parameters.mo6512a(hashMap);
        return server_parameters;
    }

    /* renamed from: c */
    private static boolean m13208c(zzjj zzjj) {
        if (zzjj.f10880f) {
            return true;
        }
        C3390pt.m13453a();
        return C3432rf.m13604a();
    }

    /* renamed from: B */
    public final void mo8705B() {
        throw new RemoteException();
    }

    /* renamed from: Ba */
    public final C2880Yz mo8706Ba() {
        return null;
    }

    /* renamed from: Ja */
    public final C2965bA mo8707Ja() {
        return null;
    }

    /* renamed from: Ta */
    public final C3052eA mo8708Ta() {
        return null;
    }

    /* renamed from: Z */
    public final boolean mo8709Z() {
        return false;
    }

    /* renamed from: a */
    public final void mo8710a(zzjj zzjj, String str) {
    }

    /* renamed from: a */
    public final void mo8711a(zzjj zzjj, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo8712a(C5464b bVar, C2910_c _cVar, List<String> list) {
    }

    /* renamed from: a */
    public final void mo8713a(C5464b bVar, zzjj zzjj, String str, C2712Sz sz) {
        mo8715a(bVar, zzjj, str, (String) null, sz);
    }

    /* renamed from: a */
    public final void mo8714a(C5464b bVar, zzjj zzjj, String str, C2910_c _cVar, String str2) {
    }

    /* renamed from: a */
    public final void mo8715a(C5464b bVar, zzjj zzjj, String str, String str2, C2712Sz sz) {
        C1612b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar2 = this.f9940a;
        if (!(bVar2 instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f9940a).requestInterstitialAd(new C3369pA(sz), (Activity) C5468d.m20962z(bVar), m13207b(str, zzjj.f10881g, str2), C3483tA.m13827a(zzjj, m13208c(zzjj)), this.f9941b);
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo8716a(C5464b bVar, zzjj zzjj, String str, String str2, C2712Sz sz, zzpl zzpl, List<String> list) {
    }

    /* renamed from: a */
    public final void mo8717a(C5464b bVar, zzjn zzjn, zzjj zzjj, String str, C2712Sz sz) {
        mo8718a(bVar, zzjn, zzjj, str, (String) null, sz);
    }

    /* renamed from: a */
    public final void mo8718a(C5464b bVar, zzjn zzjn, zzjj zzjj, String str, String str2, C2712Sz sz) {
        C5459c cVar;
        C1612b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar2 = this.f9940a;
        if (!(bVar2 instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f9940a;
            C3369pA pAVar = new C3369pA(sz);
            Activity activity = (Activity) C5468d.m20962z(bVar);
            C1622e b = m13207b(str, zzjj.f10881g, str2);
            int i = 0;
            C5459c[] cVarArr = {C5459c.f15367a, C5459c.f15368b, C5459c.f15369c, C5459c.f15370d, C5459c.f15371e, C5459c.f15372f};
            while (true) {
                if (i < 6) {
                    if (cVarArr[i].mo14915b() == zzjn.f10897e && cVarArr[i].mo14914a() == zzjn.f10894b) {
                        cVar = cVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    cVar = new C5459c(C1817m.m8088a(zzjn.f10897e, zzjn.f10894b, zzjn.f10893a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(pAVar, activity, b, cVar, C3483tA.m13827a(zzjj, m13208c(zzjj)), this.f9941b);
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo8719a(boolean z) {
    }

    public final void destroy() {
        try {
            this.f9940a.destroy();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final C2987bu getVideoController() {
        return null;
    }

    public final C5464b getView() {
        C1612b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f9940a;
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
        return true;
    }

    /* renamed from: ja */
    public final C3507tw mo8725ja() {
        return null;
    }

    public final void pause() {
        throw new RemoteException();
    }

    public final void showInterstitial() {
        C1612b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f9940a;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C2227Cf.m9532b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f9940a).showInterstitial();
        } catch (Throwable th) {
            C2227Cf.m9533b("", th);
            throw new RemoteException();
        }
    }

    public final void showVideo() {
    }

    /* renamed from: u */
    public final void mo8729u(C5464b bVar) {
    }

    /* renamed from: ua */
    public final Bundle mo8730ua() {
        return new Bundle();
    }

    public final Bundle zzmq() {
        return new Bundle();
    }
}
