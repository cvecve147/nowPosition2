package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C1628a;
import com.google.android.gms.ads.C1634b;
import com.google.android.gms.ads.C1637c;
import com.google.android.gms.ads.C1642d;
import com.google.android.gms.ads.C1645e;
import com.google.android.gms.ads.C1669h;
import com.google.android.gms.ads.C1813j;
import com.google.android.gms.ads.formats.C1649c;
import com.google.android.gms.ads.formats.C1652d;
import com.google.android.gms.ads.formats.C1654e;
import com.google.android.gms.ads.formats.C1655f;
import com.google.android.gms.ads.formats.C1656g;
import com.google.android.gms.ads.formats.C1658h;
import com.google.android.gms.ads.formats.C1660i;
import com.google.android.gms.ads.formats.C1663j;
import com.google.android.gms.ads.formats.C1665k;
import com.google.android.gms.ads.mediation.C1818a;
import com.google.android.gms.ads.mediation.C1819b;
import com.google.android.gms.ads.mediation.C1821c;
import com.google.android.gms.ads.mediation.C1831d;
import com.google.android.gms.ads.mediation.C1832e;
import com.google.android.gms.ads.mediation.C1833f;
import com.google.android.gms.ads.mediation.C1834g;
import com.google.android.gms.ads.mediation.C1835h;
import com.google.android.gms.ads.mediation.C1836i;
import com.google.android.gms.ads.mediation.C1839l;
import com.google.android.gms.ads.mediation.C1840m;
import com.google.android.gms.ads.mediation.C1841n;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.p065a.C1629a;
import com.google.android.gms.ads.p067c.C1640b;
import com.google.android.gms.ads.p067c.C1641c;
import com.google.android.gms.ads.reward.mediation.C1842a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2845Xs;
import com.google.android.gms.internal.ads.C2987bu;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3432rf;
import com.google.android.gms.internal.ads.zzatm;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C2478La
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, C1839l, C1841n, MediationRewardedVideoAdAdapter, zzatm {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C1645e zzgw;
    private C1669h zzgx;
    private C1634b zzgy;
    private Context zzgz;
    /* access modifiers changed from: private */
    public C1669h zzha;
    /* access modifiers changed from: private */
    public C1842a zzhb;
    private final C1640b zzhc = new C1626g(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C1605a extends C1834g {

        /* renamed from: p */
        private final C1656g f5415p;

        public C1605a(C1656g gVar) {
            this.f5415p = gVar;
            mo7119c(gVar.mo6641d().toString());
            mo7117a(gVar.mo6643f());
            mo7116a(gVar.mo6639b().toString());
            mo7115a(gVar.mo6642e());
            mo7118b(gVar.mo6640c().toString());
            if (gVar.mo6645h() != null) {
                mo7114a(gVar.mo6645h().doubleValue());
            }
            if (gVar.mo6646i() != null) {
                mo7121e(gVar.mo6646i().toString());
            }
            if (gVar.mo6644g() != null) {
                mo7120d(gVar.mo6644g().toString());
            }
            mo7106b(true);
            mo7104a(true);
            mo7103a(gVar.mo6647j());
        }

        /* renamed from: b */
        public final void mo6482b(View view) {
            if (view instanceof C1654e) {
                ((C1654e) view).setNativeAd(this.f5415p);
            }
            C1655f fVar = C1655f.f5487a.get(view);
            if (fVar != null) {
                fVar.mo6637a((C1649c) this.f5415p);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C1606b extends C1835h {

        /* renamed from: n */
        private final C1658h f5416n;

        public C1606b(C1658h hVar) {
            this.f5416n = hVar;
            mo7135d(hVar.mo6651e().toString());
            mo7132a(hVar.mo6652f());
            mo7133b(hVar.mo6649c().toString());
            if (hVar.mo6653g() != null) {
                mo7130a(hVar.mo6653g());
            }
            mo7134c(hVar.mo6650d().toString());
            mo7131a(hVar.mo6648b().toString());
            mo7106b(true);
            mo7104a(true);
            mo7103a(hVar.mo6654h());
        }

        /* renamed from: b */
        public final void mo6482b(View view) {
            if (view instanceof C1654e) {
                ((C1654e) view).setNativeAd(this.f5416n);
            }
            C1655f fVar = C1655f.f5487a.get(view);
            if (fVar != null) {
                fVar.mo6637a((C1649c) this.f5416n);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C1607c extends C1840m {

        /* renamed from: r */
        private final C1663j f5417r;

        public C1607c(C1663j jVar) {
            this.f5417r = jVar;
            mo7165d(jVar.mo6659d());
            mo7156a(jVar.mo6661f());
            mo7160b(jVar.mo6657b());
            mo7151a(jVar.mo6660e());
            mo7163c(jVar.mo6658c());
            mo7155a(jVar.mo6656a());
            mo7153a(jVar.mo6663h());
            mo7169f(jVar.mo6664i());
            mo7167e(jVar.mo6662g());
            mo7154a(jVar.mo6667l());
            mo7161b(true);
            mo7157a(true);
            mo7152a(jVar.mo6665j());
        }

        /* renamed from: a */
        public final void mo6483a(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof C1665k) {
                ((C1665k) view).setNativeAd(this.f5417r);
                return;
            }
            C1655f fVar = C1655f.f5487a.get(view);
            if (fVar != null) {
                fVar.mo6638a(this.f5417r);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C1608d extends C1628a implements C1629a, C2845Xs {

        /* renamed from: a */
        private final AbstractAdViewAdapter f5418a;

        /* renamed from: b */
        private final C1821c f5419b;

        public C1608d(AbstractAdViewAdapter abstractAdViewAdapter, C1821c cVar) {
            this.f5418a = abstractAdViewAdapter;
            this.f5419b = cVar;
        }

        /* renamed from: a */
        public final void mo6484a() {
            this.f5419b.mo7069a(this.f5418a);
        }

        /* renamed from: a */
        public final void mo6485a(int i) {
            this.f5419b.mo7070a(this.f5418a, i);
        }

        /* renamed from: a */
        public final void mo6486a(String str, String str2) {
            this.f5419b.mo7071a(this.f5418a, str, str2);
        }

        /* renamed from: c */
        public final void mo6487c() {
            this.f5419b.mo7074d(this.f5418a);
        }

        /* renamed from: d */
        public final void mo6488d() {
            this.f5419b.mo7073c(this.f5418a);
        }

        /* renamed from: e */
        public final void mo6489e() {
            this.f5419b.mo7075e(this.f5418a);
        }

        /* renamed from: f */
        public final void mo6490f() {
            this.f5419b.mo7072b(this.f5418a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C1609e extends C1628a implements C2845Xs {

        /* renamed from: a */
        private final AbstractAdViewAdapter f5420a;

        /* renamed from: b */
        private final C1831d f5421b;

        public C1609e(AbstractAdViewAdapter abstractAdViewAdapter, C1831d dVar) {
            this.f5420a = abstractAdViewAdapter;
            this.f5421b = dVar;
        }

        /* renamed from: a */
        public final void mo6484a() {
            this.f5421b.mo7088d(this.f5420a);
        }

        /* renamed from: a */
        public final void mo6485a(int i) {
            this.f5421b.mo7085a(this.f5420a, i);
        }

        /* renamed from: c */
        public final void mo6487c() {
            this.f5421b.mo7084a(this.f5420a);
        }

        /* renamed from: d */
        public final void mo6488d() {
            this.f5421b.mo7087c(this.f5420a);
        }

        /* renamed from: e */
        public final void mo6489e() {
            this.f5421b.mo7089e(this.f5420a);
        }

        /* renamed from: f */
        public final void mo6490f() {
            this.f5421b.mo7086b(this.f5420a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C1610f extends C1628a implements C1656g.C1657a, C1658h.C1659a, C1660i.C1661a, C1660i.C1662b, C1663j.C1664a {

        /* renamed from: a */
        private final AbstractAdViewAdapter f5422a;

        /* renamed from: b */
        private final C1832e f5423b;

        public C1610f(AbstractAdViewAdapter abstractAdViewAdapter, C1832e eVar) {
            this.f5422a = abstractAdViewAdapter;
            this.f5423b = eVar;
        }

        /* renamed from: a */
        public final void mo6484a() {
            this.f5423b.mo7096b(this.f5422a);
        }

        /* renamed from: a */
        public final void mo6485a(int i) {
            this.f5423b.mo7091a((MediationNativeAdapter) this.f5422a, i);
        }

        /* renamed from: a */
        public final void mo6491a(C1656g gVar) {
            this.f5423b.mo7094a((MediationNativeAdapter) this.f5422a, (C1833f) new C1605a(gVar));
        }

        /* renamed from: a */
        public final void mo6492a(C1658h hVar) {
            this.f5423b.mo7094a((MediationNativeAdapter) this.f5422a, (C1833f) new C1606b(hVar));
        }

        /* renamed from: a */
        public final void mo6493a(C1660i iVar) {
            this.f5423b.mo7092a((MediationNativeAdapter) this.f5422a, iVar);
        }

        /* renamed from: a */
        public final void mo6494a(C1660i iVar, String str) {
            this.f5423b.mo7093a(this.f5422a, iVar, str);
        }

        /* renamed from: a */
        public final void mo6495a(C1663j jVar) {
            this.f5423b.mo7095a((MediationNativeAdapter) this.f5422a, (C1840m) new C1607c(jVar));
        }

        /* renamed from: b */
        public final void mo6496b() {
            this.f5423b.mo7099e(this.f5422a);
        }

        /* renamed from: c */
        public final void mo6487c() {
            this.f5423b.mo7098d(this.f5422a);
        }

        /* renamed from: d */
        public final void mo6488d() {
        }

        /* renamed from: e */
        public final void mo6489e() {
            this.f5423b.mo7090a(this.f5422a);
        }

        /* renamed from: f */
        public final void mo6490f() {
            this.f5423b.mo7097c(this.f5422a);
        }
    }

    private final C1637c zza(Context context, C1818a aVar, Bundle bundle, Bundle bundle2) {
        C1637c.C1638a aVar2 = new C1637c.C1638a();
        Date f = aVar.mo7062f();
        if (f != null) {
            aVar2.mo6571a(f);
        }
        int l = aVar.mo7066l();
        if (l != 0) {
            aVar2.mo6567a(l);
        }
        Set<String> h = aVar.mo7065h();
        if (h != null) {
            for (String a : h) {
                aVar2.mo6570a(a);
            }
        }
        Location location = aVar.getLocation();
        if (location != null) {
            aVar2.mo6568a(location);
        }
        if (aVar.mo7063g()) {
            C3390pt.m13453a();
            aVar2.mo6574b(C3432rf.m13597a(context));
        }
        if (aVar.mo7060a() != -1) {
            boolean z = true;
            if (aVar.mo7060a() != 1) {
                z = false;
            }
            aVar2.mo6575b(z);
        }
        aVar2.mo6572a(aVar.mo7061c());
        aVar2.mo6569a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar2.mo6573a();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzgw;
    }

    public Bundle getInterstitialAdapterInfo() {
        C1819b.C1820a aVar = new C1819b.C1820a();
        aVar.mo7068a(1);
        return aVar.mo7067a();
    }

    public C2987bu getVideoController() {
        C1813j videoController;
        C1645e eVar = this.zzgw;
        if (eVar == null || (videoController = eVar.getVideoController()) == null) {
            return null;
        }
        return videoController.mo7049a();
    }

    public void initialize(Context context, C1818a aVar, String str, C1842a aVar2, Bundle bundle, Bundle bundle2) {
        this.zzgz = context.getApplicationContext();
        this.zzhb = aVar2;
        this.zzhb.mo7191f(this);
    }

    public boolean isInitialized() {
        return this.zzhb != null;
    }

    public void loadAd(C1818a aVar, Bundle bundle, Bundle bundle2) {
        Context context = this.zzgz;
        if (context == null || this.zzhb == null) {
            C2227Cf.m9529a("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzha = new C1669h(context);
        this.zzha.mo6708b(true);
        this.zzha.mo6705a(getAdUnitId(bundle));
        this.zzha.mo6702a(this.zzhc);
        this.zzha.mo6703a((C1641c) new C1627h(this));
        this.zzha.mo6704a(zza(this.zzgz, aVar, bundle2, bundle));
    }

    public void onDestroy() {
        C1645e eVar = this.zzgw;
        if (eVar != null) {
            eVar.mo6595a();
            this.zzgw = null;
        }
        if (this.zzgx != null) {
            this.zzgx = null;
        }
        if (this.zzgy != null) {
            this.zzgy = null;
        }
        if (this.zzha != null) {
            this.zzha = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        C1669h hVar = this.zzgx;
        if (hVar != null) {
            hVar.mo6706a(z);
        }
        C1669h hVar2 = this.zzha;
        if (hVar2 != null) {
            hVar2.mo6706a(z);
        }
    }

    public void onPause() {
        C1645e eVar = this.zzgw;
        if (eVar != null) {
            eVar.mo6597b();
        }
    }

    public void onResume() {
        C1645e eVar = this.zzgw;
        if (eVar != null) {
            eVar.mo6598c();
        }
    }

    public void requestBannerAd(Context context, C1821c cVar, Bundle bundle, C1642d dVar, C1818a aVar, Bundle bundle2) {
        this.zzgw = new C1645e(context);
        this.zzgw.setAdSize(new C1642d(dVar.mo6580b(), dVar.mo6578a()));
        this.zzgw.setAdUnitId(getAdUnitId(bundle));
        this.zzgw.setAdListener(new C1608d(this, cVar));
        this.zzgw.mo6596a(zza(context, aVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, C1831d dVar, Bundle bundle, C1818a aVar, Bundle bundle2) {
        this.zzgx = new C1669h(context);
        this.zzgx.mo6705a(getAdUnitId(bundle));
        this.zzgx.mo6701a((C1628a) new C1609e(this, dVar));
        this.zzgx.mo6704a(zza(context, aVar, bundle2, bundle));
    }

    public void requestNativeAd(Context context, C1832e eVar, Bundle bundle, C1836i iVar, Bundle bundle2) {
        C1610f fVar = new C1610f(this, eVar);
        C1634b.C1635a aVar = new C1634b.C1635a(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        aVar.mo6559a((C1628a) fVar);
        C1652d j = iVar.mo7146j();
        if (j != null) {
            aVar.mo6560a(j);
        }
        if (iVar.mo7142b()) {
            aVar.mo6563a((C1663j.C1664a) fVar);
        }
        if (iVar.mo7144e()) {
            aVar.mo6561a((C1656g.C1657a) fVar);
        }
        if (iVar.mo7147k()) {
            aVar.mo6562a((C1658h.C1659a) fVar);
        }
        if (iVar.mo7145i()) {
            for (String next : iVar.mo7143d().keySet()) {
                aVar.mo6564a(next, fVar, iVar.mo7143d().get(next).booleanValue() ? fVar : null);
            }
        }
        this.zzgy = aVar.mo6565a();
        this.zzgy.mo6558a(zza(context, iVar, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzgx.mo6700a();
    }

    public void showVideo() {
        this.zzha.mo6700a();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
