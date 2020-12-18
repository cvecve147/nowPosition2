package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C1787s;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.C1818a;
import com.google.android.gms.ads.mediation.C1831d;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.util.C2092n;
import p013b.p018b.p021c.C0944j;

@C2478La
public final class zzzv implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f10928a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1831d f10929b;

    /* renamed from: c */
    private Uri f10930c;

    public final void onDestroy() {
        C2227Cf.m9532b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        C2227Cf.m9532b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        C2227Cf.m9532b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, C1831d dVar, Bundle bundle, C1818a aVar, Bundle bundle2) {
        this.f10929b = dVar;
        if (this.f10929b == null) {
            C2227Cf.m9536d("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            C2227Cf.m9536d("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f10929b.mo7085a(this, 0);
        } else {
            if (!(C2092n.m9162c() && C3249kv.m12930a(context))) {
                C2227Cf.m9536d("Default browser does not support custom tabs. Bailing out.");
                this.f10929b.mo7085a(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                C2227Cf.m9536d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f10929b.mo7085a(this, 0);
                return;
            }
            this.f10928a = (Activity) context;
            this.f10930c = Uri.parse(string);
            this.f10929b.mo7087c(this);
        }
    }

    public final void showInterstitial() {
        C0944j a = new C0944j.C0945a().mo4839a();
        a.f3765a.setData(this.f10930c);
        C3114ge.f9351a.post(new C2477LA(this, new AdOverlayInfoParcel(new zzc(a.f3765a), (C2845Xs) null, new C2449KA(this), (C1787s) null, new zzang(0, 0, false))));
        C1697X.m7702i().mo8328h();
    }
}
