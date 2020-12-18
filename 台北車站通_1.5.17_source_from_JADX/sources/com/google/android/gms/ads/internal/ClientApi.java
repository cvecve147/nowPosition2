package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C1784p;
import com.google.android.gms.ads.internal.overlay.C1785q;
import com.google.android.gms.ads.internal.overlay.C1786r;
import com.google.android.gms.ads.internal.overlay.C1791w;
import com.google.android.gms.ads.internal.overlay.C1792x;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.C2192B;
import com.google.android.gms.internal.ads.C2213Bt;
import com.google.android.gms.internal.ads.C2357Gt;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2650Qv;
import com.google.android.gms.internal.ads.C2708Sv;
import com.google.android.gms.internal.ads.C2735Tt;
import com.google.android.gms.internal.ads.C2874Yt;
import com.google.android.gms.internal.ads.C3047dw;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3160hw;
import com.google.android.gms.internal.ads.C3372pc;
import com.google.android.gms.internal.ads.C3425r;
import com.google.android.gms.internal.ads.C3629yc;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import java.util.HashMap;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@Keep
@DynamiteApi
@C2478La
public class ClientApi extends C2735Tt {
    public C2213Bt createAdLoaderBuilder(C5464b bVar, String str, C2533Mz mz, int i) {
        Context context = (Context) C5468d.m20962z(bVar);
        C1697X.m7698e();
        return new C1761l(context, str, mz, new zzang(C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3114ge.m12444k(context)), C1804ua.m8050a(context));
    }

    public C3425r createAdOverlay(C5464b bVar) {
        Activity activity = (Activity) C5468d.m20962z(bVar);
        AdOverlayInfoParcel a = AdOverlayInfoParcel.m7986a(activity.getIntent());
        if (a == null) {
            return new C1785q(activity);
        }
        int i = a.f5821k;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new C1785q(activity) : new C1786r(activity, a) : new C1792x(activity) : new C1791w(activity) : new C1784p(activity);
    }

    public C2357Gt createBannerAdManager(C5464b bVar, zzjn zzjn, String str, C2533Mz mz, int i) {
        Context context = (Context) C5468d.m20962z(bVar);
        C1697X.m7698e();
        return new C1808wa(context, zzjn, str, mz, new zzang(C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3114ge.m12444k(context)), C1804ua.m8050a(context));
    }

    public C2192B createInAppPurchaseManager(C5464b bVar) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f7997xb)).booleanValue() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f8003yb)).booleanValue() != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.C2357Gt createInterstitialAdManager(p101d.p129g.p131b.p132a.p134b.C5464b r8, com.google.android.gms.internal.ads.zzjn r9, java.lang.String r10, com.google.android.gms.internal.ads.C2533Mz r11, int r12) {
        /*
            r7 = this;
            java.lang.Object r8 = p101d.p129g.p131b.p132a.p134b.C5468d.m20962z(r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.C2558Nu.m10773a(r1)
            com.google.android.gms.internal.ads.zzang r5 = new com.google.android.gms.internal.ads.zzang
            com.google.android.gms.ads.internal.C1697X.m7698e()
            boolean r8 = com.google.android.gms.internal.ads.C3114ge.m12444k(r1)
            r0 = 1
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r5.<init>(r2, r12, r0, r8)
            java.lang.String r8 = r9.f10893a
            java.lang.String r12 = "reward_mb"
            boolean r8 = r12.equals(r8)
            if (r8 != 0) goto L_0x0036
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.C2558Nu.f7997xb
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r12 = r2.mo8515a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x004c
        L_0x0036:
            if (r8 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.C2558Nu.f8003yb
            com.google.android.gms.internal.ads.Lu r12 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r8 = r12.mo8515a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x005d
            com.google.android.gms.internal.ads.Zx r8 = new com.google.android.gms.internal.ads.Zx
            com.google.android.gms.ads.internal.ua r9 = com.google.android.gms.ads.internal.C1804ua.m8050a(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L_0x005d:
            com.google.android.gms.ads.internal.m r8 = new com.google.android.gms.ads.internal.m
            com.google.android.gms.ads.internal.ua r6 = com.google.android.gms.ads.internal.C1804ua.m8050a(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(d.g.b.a.b.b, com.google.android.gms.internal.ads.zzjn, java.lang.String, com.google.android.gms.internal.ads.Mz, int):com.google.android.gms.internal.ads.Gt");
    }

    public C3047dw createNativeAdViewDelegate(C5464b bVar, C5464b bVar2) {
        return new C2650Qv((FrameLayout) C5468d.m20962z(bVar), (FrameLayout) C5468d.m20962z(bVar2));
    }

    public C3160hw createNativeAdViewHolderDelegate(C5464b bVar, C5464b bVar2, C5464b bVar3) {
        return new C2708Sv((View) C5468d.m20962z(bVar), (HashMap) C5468d.m20962z(bVar2), (HashMap) C5468d.m20962z(bVar3));
    }

    public C3629yc createRewardedVideoAd(C5464b bVar, C2533Mz mz, int i) {
        Context context = (Context) C5468d.m20962z(bVar);
        C1697X.m7698e();
        return new C3372pc(context, C1804ua.m8050a(context), mz, new zzang(C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3114ge.m12444k(context)));
    }

    public C2357Gt createSearchAdManager(C5464b bVar, zzjn zzjn, String str, int i) {
        Context context = (Context) C5468d.m20962z(bVar);
        C1697X.m7698e();
        return new C1691Q(context, zzjn, str, new zzang(C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3114ge.m12444k(context)));
    }

    public C2874Yt getMobileAdsSettingsManager(C5464b bVar) {
        return null;
    }

    public C2874Yt getMobileAdsSettingsManagerWithClientJarVersion(C5464b bVar, int i) {
        Context context = (Context) C5468d.m20962z(bVar);
        C1697X.m7698e();
        return C1811y.m8067a(context, new zzang(C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, C3114ge.m12444k(context)));
    }
}
