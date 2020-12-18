package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.util.C2092n;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3289me;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3454s;
import com.google.android.gms.internal.ads.C3520uh;
import java.util.Collections;
import java.util.Map;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
public class C1771c extends C3454s implements C1790v {

    /* renamed from: a */
    private static final int f5827a = Color.argb(0, 0, 0, 0);

    /* renamed from: b */
    protected final Activity f5828b;

    /* renamed from: c */
    AdOverlayInfoParcel f5829c;

    /* renamed from: d */
    C3520uh f5830d;

    /* renamed from: e */
    private C1776h f5831e;

    /* renamed from: f */
    private C1782n f5832f;

    /* renamed from: g */
    private boolean f5833g = false;

    /* renamed from: h */
    private FrameLayout f5834h;

    /* renamed from: i */
    private WebChromeClient.CustomViewCallback f5835i;

    /* renamed from: j */
    private boolean f5836j = false;

    /* renamed from: k */
    private boolean f5837k = false;

    /* renamed from: l */
    private C1775g f5838l;

    /* renamed from: m */
    private boolean f5839m = false;

    /* renamed from: n */
    int f5840n = 0;

    /* renamed from: o */
    private final Object f5841o = new Object();

    /* renamed from: p */
    private Runnable f5842p;

    /* renamed from: q */
    private boolean f5843q;

    /* renamed from: r */
    private boolean f5844r;

    /* renamed from: s */
    private boolean f5845s = false;

    /* renamed from: t */
    private boolean f5846t = false;

    /* renamed from: u */
    private boolean f5847u = true;

    public C1771c(Activity activity) {
        this.f5828b = activity;
    }

    /* renamed from: bb */
    private final void m7990bb() {
        this.f5830d.mo8159bb();
    }

    /* renamed from: ic */
    private final void m7991ic() {
        if (this.f5828b.isFinishing() && !this.f5845s) {
            this.f5845s = true;
            C3520uh uhVar = this.f5830d;
            if (uhVar != null) {
                uhVar.mo8164f(this.f5840n);
                synchronized (this.f5841o) {
                    if (!this.f5843q && this.f5830d.mo8191qb()) {
                        this.f5842p = new C1773e(this);
                        C3114ge.f9351a.postDelayed(this.f5842p, ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7949pb)).longValue());
                        return;
                    }
                }
            }
            mo6998ec();
        }
    }

    /* renamed from: q */
    private final void m7992q(boolean z) {
        int intValue = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7916je)).intValue();
        C1783o oVar = new C1783o();
        oVar.f5865e = 50;
        oVar.f5861a = z ? intValue : 0;
        oVar.f5862b = z ? 0 : intValue;
        oVar.f5863c = 0;
        oVar.f5864d = intValue;
        this.f5832f = new C1782n(this.f5828b, oVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        mo6993a(z, this.f5829c.f5817g);
        this.f5838l.addView(this.f5832f, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (r1.f5828b.getResources().getConfiguration().orientation == 1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        if (r1.f5828b.getResources().getConfiguration().orientation == 2) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0125 A[SYNTHETIC, Splitter:B:58:0x0125] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020b  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7993r(boolean r18) {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.f5844r
            r2 = 1
            if (r0 != 0) goto L_0x000c
            android.app.Activity r0 = r1.f5828b
            r0.requestWindowFeature(r2)
        L_0x000c:
            android.app.Activity r0 = r1.f5828b
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0234
            boolean r3 = com.google.android.gms.common.util.C2092n.m9170k()
            if (r3 == 0) goto L_0x003e
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C2558Nu.f7904he
            com.google.android.gms.internal.ads.Lu r4 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r3 = r4.mo8515a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x003e
            com.google.android.gms.ads.internal.C1697X.m7698e()
            android.app.Activity r3 = r1.f5828b
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            boolean r3 = com.google.android.gms.internal.ads.C3114ge.m12416a((android.app.Activity) r3, (android.content.res.Configuration) r4)
            goto L_0x003f
        L_0x003e:
            r3 = r2
        L_0x003f:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.f5829c
            com.google.android.gms.ads.internal.zzaq r4 = r4.f5825o
            r5 = 0
            if (r4 == 0) goto L_0x004c
            boolean r4 = r4.f5924b
            if (r4 == 0) goto L_0x004c
            r4 = r2
            goto L_0x004d
        L_0x004c:
            r4 = r5
        L_0x004d:
            boolean r6 = r1.f5837k
            if (r6 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x0085
        L_0x0053:
            if (r3 == 0) goto L_0x0085
            r3 = 1024(0x400, float:1.435E-42)
            r0.setFlags(r3, r3)
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C2558Nu.f7955qb
            com.google.android.gms.internal.ads.Lu r4 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r3 = r4.mo8515a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0085
            boolean r3 = com.google.android.gms.common.util.C2092n.m9166g()
            if (r3 == 0) goto L_0x0085
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f5829c
            com.google.android.gms.ads.internal.zzaq r3 = r3.f5825o
            if (r3 == 0) goto L_0x0085
            boolean r3 = r3.f5929g
            if (r3 == 0) goto L_0x0085
            android.view.View r3 = r0.getDecorView()
            r4 = 4098(0x1002, float:5.743E-42)
            r3.setSystemUiVisibility(r4)
        L_0x0085:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f5829c
            com.google.android.gms.internal.ads.uh r3 = r3.f5814d
            r4 = 0
            if (r3 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.bi r3 = r3.mo8182mb()
            goto L_0x0092
        L_0x0091:
            r3 = r4
        L_0x0092:
            if (r3 == 0) goto L_0x0099
            boolean r3 = r3.mo9242j()
            goto L_0x009a
        L_0x0099:
            r3 = r5
        L_0x009a:
            r1.f5839m = r5
            if (r3 == 0) goto L_0x00dc
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f5829c
            int r6 = r6.f5820j
            com.google.android.gms.internal.ads.me r7 = com.google.android.gms.ads.internal.C1697X.m7700g()
            int r7 = r7.mo9712a()
            if (r6 != r7) goto L_0x00be
            android.app.Activity r6 = r1.f5828b
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            if (r6 != r2) goto L_0x00bb
        L_0x00ba:
            r5 = r2
        L_0x00bb:
            r1.f5839m = r5
            goto L_0x00dc
        L_0x00be:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f5829c
            int r6 = r6.f5820j
            com.google.android.gms.internal.ads.me r7 = com.google.android.gms.ads.internal.C1697X.m7700g()
            int r7 = r7.mo9725b()
            if (r6 != r7) goto L_0x00dc
            android.app.Activity r6 = r1.f5828b
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 != r7) goto L_0x00bb
            goto L_0x00ba
        L_0x00dc:
            boolean r5 = r1.f5839m
            r6 = 46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Delay onShow to next orientation change: "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r5)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f5829c
            int r5 = r5.f5820j
            r1.setRequestedOrientation(r5)
            com.google.android.gms.internal.ads.me r5 = com.google.android.gms.ads.internal.C1697X.m7700g()
            boolean r0 = r5.mo9724a((android.view.Window) r0)
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r0)
        L_0x010a:
            boolean r0 = r1.f5837k
            if (r0 != 0) goto L_0x0113
            com.google.android.gms.ads.internal.overlay.g r0 = r1.f5838l
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0117
        L_0x0113:
            com.google.android.gms.ads.internal.overlay.g r0 = r1.f5838l
            int r5 = f5827a
        L_0x0117:
            r0.setBackgroundColor(r5)
            android.app.Activity r0 = r1.f5828b
            com.google.android.gms.ads.internal.overlay.g r5 = r1.f5838l
            r0.setContentView(r5)
            r1.f5844r = r2
            if (r18 == 0) goto L_0x01de
            com.google.android.gms.ads.internal.C1697X.m7699f()     // Catch:{ Exception -> 0x01d0 }
            android.app.Activity r6 = r1.f5828b     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d     // Catch:{ Exception -> 0x01d0 }
            if (r0 == 0) goto L_0x013a
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.hi r0 = r0.mo8192rb()     // Catch:{ Exception -> 0x01d0 }
            r7 = r0
            goto L_0x013b
        L_0x013a:
            r7 = r4
        L_0x013b:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d     // Catch:{ Exception -> 0x01d0 }
            if (r0 == 0) goto L_0x014b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r0 = r0.mo8190pb()     // Catch:{ Exception -> 0x01d0 }
            r8 = r0
            goto L_0x014c
        L_0x014b:
            r8 = r4
        L_0x014c:
            r9 = 1
            r11 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.zzang r12 = r0.f5823m     // Catch:{ Exception -> 0x01d0 }
            r13 = 0
            r14 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d     // Catch:{ Exception -> 0x01d0 }
            if (r0 == 0) goto L_0x0164
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.ads.internal.ua r0 = r0.mo8175kb()     // Catch:{ Exception -> 0x01d0 }
            r15 = r0
            goto L_0x0165
        L_0x0164:
            r15 = r4
        L_0x0165:
            com.google.android.gms.internal.ads.ls r16 = com.google.android.gms.internal.ads.C3275ls.m13004a()     // Catch:{ Exception -> 0x01d0 }
            r10 = r3
            com.google.android.gms.internal.ads.uh r0 = com.google.android.gms.internal.ads.C2201Bh.m9441a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01d0 }
            r1.f5830d = r0     // Catch:{ Exception -> 0x01d0 }
            com.google.android.gms.internal.ads.uh r0 = r1.f5830d
            com.google.android.gms.internal.ads.bi r5 = r0.mo8182mb()
            r6 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c
            com.google.android.gms.ads.internal.gmsg.k r7 = r0.f5826p
            r8 = 0
            com.google.android.gms.ads.internal.gmsg.m r9 = r0.f5815e
            com.google.android.gms.ads.internal.overlay.s r10 = r0.f5819i
            r11 = 1
            r12 = 0
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d
            if (r0 == 0) goto L_0x018e
            com.google.android.gms.internal.ads.bi r0 = r0.mo8182mb()
            com.google.android.gms.ads.internal.va r4 = r0.mo9241i()
        L_0x018e:
            r13 = r4
            r14 = 0
            r15 = 0
            r5.mo9229a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.google.android.gms.internal.ads.uh r0 = r1.f5830d
            com.google.android.gms.internal.ads.bi r0 = r0.mo8182mb()
            com.google.android.gms.ads.internal.overlay.d r4 = new com.google.android.gms.ads.internal.overlay.d
            r4.<init>(r1)
            r0.mo9230a((com.google.android.gms.internal.ads.C3003ci) r4)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c
            java.lang.String r4 = r0.f5822l
            if (r4 == 0) goto L_0x01ae
            com.google.android.gms.internal.ads.uh r0 = r1.f5830d
            r0.loadUrl(r4)
            goto L_0x01be
        L_0x01ae:
            java.lang.String r7 = r0.f5818h
            if (r7 == 0) goto L_0x01c8
            com.google.android.gms.internal.ads.uh r5 = r1.f5830d
            java.lang.String r6 = r0.f5816f
            r10 = 0
            java.lang.String r8 = "text/html"
            java.lang.String r9 = "UTF-8"
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)
        L_0x01be:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d
            if (r0 == 0) goto L_0x01eb
            r0.mo8141a((com.google.android.gms.ads.internal.overlay.C1771c) r1)
            goto L_0x01eb
        L_0x01c8:
            com.google.android.gms.ads.internal.overlay.f r0 = new com.google.android.gms.ads.internal.overlay.f
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L_0x01d0:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r2, r0)
            com.google.android.gms.ads.internal.overlay.f r0 = new com.google.android.gms.ads.internal.overlay.f
            java.lang.String r2 = "Could not obtain webview for the overlay."
            r0.<init>(r2)
            throw r0
        L_0x01de:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r1.f5829c
            com.google.android.gms.internal.ads.uh r0 = r0.f5814d
            r1.f5830d = r0
            com.google.android.gms.internal.ads.uh r0 = r1.f5830d
            android.app.Activity r4 = r1.f5828b
            r0.mo8140a((android.content.Context) r4)
        L_0x01eb:
            com.google.android.gms.internal.ads.uh r0 = r1.f5830d
            r0.mo8156b(r1)
            com.google.android.gms.internal.ads.uh r0 = r1.f5830d
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0207
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0207
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.gms.internal.ads.uh r4 = r1.f5830d
            android.view.View r4 = r4.getView()
            r0.removeView(r4)
        L_0x0207:
            boolean r0 = r1.f5837k
            if (r0 == 0) goto L_0x0210
            com.google.android.gms.internal.ads.uh r0 = r1.f5830d
            r0.mo8160cb()
        L_0x0210:
            com.google.android.gms.ads.internal.overlay.g r0 = r1.f5838l
            com.google.android.gms.internal.ads.uh r4 = r1.f5830d
            android.view.View r4 = r4.getView()
            r5 = -1
            r0.addView(r4, r5, r5)
            if (r18 != 0) goto L_0x0225
            boolean r0 = r1.f5839m
            if (r0 != 0) goto L_0x0225
            r17.m7990bb()
        L_0x0225:
            r1.m7992q(r3)
            com.google.android.gms.internal.ads.uh r0 = r1.f5830d
            boolean r0 = r0.mo8177lb()
            if (r0 == 0) goto L_0x0233
            r1.mo6993a((boolean) r3, (boolean) r2)
        L_0x0233:
            return
        L_0x0234:
            com.google.android.gms.ads.internal.overlay.f r0 = new com.google.android.gms.ads.internal.overlay.f
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.C1771c.m7993r(boolean):void");
    }

    /* renamed from: Aa */
    public final boolean mo6988Aa() {
        this.f5840n = 0;
        C3520uh uhVar = this.f5830d;
        if (uhVar == null) {
            return true;
        }
        boolean vb = uhVar.mo8202vb();
        if (!vb) {
            this.f5830d.mo8149a("onbackblocked", (Map<String, ?>) Collections.emptyMap());
        }
        return vb;
    }

    /* renamed from: Ma */
    public final void mo6989Ma() {
    }

    /* renamed from: Ua */
    public final void mo6990Ua() {
        this.f5840n = 0;
    }

    /* renamed from: Vb */
    public final void mo6991Vb() {
        this.f5840n = 1;
        this.f5828b.finish();
    }

    /* renamed from: a */
    public final void mo6992a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f5834h = new FrameLayout(this.f5828b);
        this.f5834h.setBackgroundColor(-16777216);
        this.f5834h.addView(view, -1, -1);
        this.f5828b.setContentView(this.f5834h);
        this.f5844r = true;
        this.f5835i = customViewCallback;
        this.f5833g = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f5829c).f5825o;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6993a(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C2558Nu.f7961rb
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r1.mo8515a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f5829c
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.zzaq r0 = r0.f5825o
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.f5930h
            if (r0 == 0) goto L_0x0022
            r0 = r1
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C2558Nu.f7967sb
            com.google.android.gms.internal.ads.Lu r4 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r3 = r4.mo8515a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f5829c
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.zzaq r3 = r3.f5825o
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.f5931i
            if (r3 == 0) goto L_0x0043
            r3 = r1
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.n r7 = new com.google.android.gms.internal.ads.n
            com.google.android.gms.internal.ads.uh r4 = r6.f5830d
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.mo9766a(r4)
        L_0x005a:
            com.google.android.gms.ads.internal.overlay.n r7 = r6.f5832f
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            r7.mo7020a(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.C1771c.mo6993a(boolean, boolean):void");
    }

    /* renamed from: bc */
    public final void mo6994bc() {
        this.f5840n = 2;
        this.f5828b.finish();
    }

    /* renamed from: cc */
    public final void mo6995cc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5829c;
        if (adOverlayInfoParcel != null && this.f5833g) {
            setRequestedOrientation(adOverlayInfoParcel.f5820j);
        }
        if (this.f5834h != null) {
            this.f5828b.setContentView(this.f5838l);
            this.f5844r = true;
            this.f5834h.removeAllViews();
            this.f5834h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f5835i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f5835i = null;
        }
        this.f5833g = false;
    }

    /* renamed from: dc */
    public final void mo6996dc() {
        this.f5838l.removeView(this.f5832f);
        m7992q(true);
    }

    /* renamed from: e */
    public void mo6997e(Bundle bundle) {
        this.f5828b.requestWindowFeature(1);
        this.f5836j = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f5829c = AdOverlayInfoParcel.m7986a(this.f5828b.getIntent());
            if (this.f5829c != null) {
                if (this.f5829c.f5823m.f10857c > 7500000) {
                    this.f5840n = 3;
                }
                if (this.f5828b.getIntent() != null) {
                    this.f5847u = this.f5828b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.f5829c.f5825o != null) {
                    this.f5837k = this.f5829c.f5825o.f5923a;
                } else {
                    this.f5837k = false;
                }
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7731Ec)).booleanValue() && this.f5837k && this.f5829c.f5825o.f5928f != -1) {
                    new C1777i(this, (C1773e) null).mo8892e();
                }
                if (bundle == null) {
                    if (this.f5829c.f5813c != null && this.f5847u) {
                        this.f5829c.f5813c.mo6896xb();
                    }
                    if (!(this.f5829c.f5821k == 1 || this.f5829c.f5812b == null)) {
                        this.f5829c.f5812b.mo6490f();
                    }
                }
                this.f5838l = new C1775g(this.f5828b, this.f5829c.f5824n, this.f5829c.f5823m.f10855a);
                this.f5838l.setId(1000);
                int i = this.f5829c.f5821k;
                if (i == 1) {
                    m7993r(false);
                } else if (i == 2) {
                    this.f5831e = new C1776h(this.f5829c.f5814d);
                    m7993r(false);
                } else if (i == 3) {
                    m7993r(true);
                } else {
                    throw new C1774f("Could not determine ad overlay type.");
                }
            } else {
                throw new C1774f("Could not get info for ad overlay.");
            }
        } catch (C1774f e) {
            C2227Cf.m9536d(e.getMessage());
            this.f5840n = 3;
            this.f5828b.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ec */
    public final void mo6998ec() {
        C1781m mVar;
        if (!this.f5846t) {
            this.f5846t = true;
            C3520uh uhVar = this.f5830d;
            if (uhVar != null) {
                this.f5838l.removeView(uhVar.getView());
                C1776h hVar = this.f5831e;
                if (hVar != null) {
                    this.f5830d.mo8140a(hVar.f5855d);
                    this.f5830d.mo8186o(false);
                    ViewGroup viewGroup = this.f5831e.f5854c;
                    View view = this.f5830d.getView();
                    C1776h hVar2 = this.f5831e;
                    viewGroup.addView(view, hVar2.f5852a, hVar2.f5853b);
                    this.f5831e = null;
                } else if (this.f5828b.getApplicationContext() != null) {
                    this.f5830d.mo8140a(this.f5828b.getApplicationContext());
                }
                this.f5830d = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f5829c;
            if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.f5813c) != null) {
                mVar.mo6897yb();
            }
        }
    }

    /* renamed from: fa */
    public final void mo6999fa() {
        this.f5844r = true;
    }

    /* renamed from: fc */
    public final void mo7000fc() {
        if (this.f5839m) {
            this.f5839m = false;
            m7990bb();
        }
    }

    /* renamed from: gc */
    public final void mo7001gc() {
        this.f5838l.f5851b = true;
    }

    /* renamed from: h */
    public final void mo7002h(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f5836j);
    }

    /* renamed from: h */
    public final void mo7003h(C5464b bVar) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7904he)).booleanValue() && C2092n.m9170k()) {
            C1697X.m7698e();
            if (C3114ge.m12416a(this.f5828b, (Configuration) C5468d.m20962z(bVar))) {
                this.f5828b.getWindow().addFlags(1024);
                this.f5828b.getWindow().clearFlags(2048);
                return;
            }
            this.f5828b.getWindow().addFlags(2048);
            this.f5828b.getWindow().clearFlags(1024);
        }
    }

    /* renamed from: hc */
    public final void mo7004hc() {
        synchronized (this.f5841o) {
            this.f5843q = true;
            if (this.f5842p != null) {
                C3114ge.f9351a.removeCallbacks(this.f5842p);
                C3114ge.f9351a.post(this.f5842p);
            }
        }
    }

    /* renamed from: k */
    public final void mo7005k() {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7910ie)).booleanValue()) {
            C3520uh uhVar = this.f5830d;
            if (uhVar == null || uhVar.isDestroyed()) {
                C2227Cf.m9536d("The webview does not exist. Ignoring action.");
                return;
            }
            C1697X.m7700g();
            C3289me.m13058b(this.f5830d);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onDestroy() {
        C3520uh uhVar = this.f5830d;
        if (uhVar != null) {
            this.f5838l.removeView(uhVar.getView());
        }
        m7991ic();
    }

    public final void onPause() {
        mo6995cc();
        C1781m mVar = this.f5829c.f5813c;
        if (mVar != null) {
            mVar.onPause();
        }
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7910ie)).booleanValue() && this.f5830d != null && (!this.f5828b.isFinishing() || this.f5831e == null)) {
            C1697X.m7700g();
            C3289me.m13057a(this.f5830d);
        }
        m7991ic();
    }

    public final void onResume() {
        C1781m mVar = this.f5829c.f5813c;
        if (mVar != null) {
            mVar.onResume();
        }
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7910ie)).booleanValue()) {
            C3520uh uhVar = this.f5830d;
            if (uhVar == null || uhVar.isDestroyed()) {
                C2227Cf.m9536d("The webview does not exist. Ignoring action.");
                return;
            }
            C1697X.m7700g();
            C3289me.m13058b(this.f5830d);
        }
    }

    /* renamed from: p */
    public final void mo7010p() {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7910ie)).booleanValue() && this.f5830d != null && (!this.f5828b.isFinishing() || this.f5831e == null)) {
            C1697X.m7700g();
            C3289me.m13057a(this.f5830d);
        }
        m7991ic();
    }

    public final void setRequestedOrientation(int i) {
        if (this.f5828b.getApplicationInfo().targetSdkVersion >= ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7793Oe)).intValue()) {
            if (this.f5828b.getApplicationInfo().targetSdkVersion <= ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7799Pe)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7805Qe)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7811Re)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.f5828b.setRequestedOrientation(i);
    }
}
