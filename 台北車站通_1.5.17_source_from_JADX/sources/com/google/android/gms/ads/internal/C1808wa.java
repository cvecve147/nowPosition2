package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.google.android.gms.ads.C1642d;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2880Yz;
import com.google.android.gms.internal.ads.C2965bA;
import com.google.android.gms.internal.ads.C2987bu;
import com.google.android.gms.internal.ads.C3089fi;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3146hi;
import com.google.android.gms.internal.ads.C3217jr;
import com.google.android.gms.internal.ads.C3331nr;
import com.google.android.gms.internal.ads.C3345od;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3432rf;
import com.google.android.gms.internal.ads.C3459sd;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.wa */
public final class C1808wa extends C1713ga implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: p */
    private boolean f5907p;

    /* renamed from: q */
    private boolean f5908q;

    /* renamed from: r */
    private WeakReference<Object> f5909r = new WeakReference<>((Object) null);

    public C1808wa(Context context, zzjn zzjn, String str, C2533Mz mz, zzang zzang, C1804ua uaVar) {
        super(context, zzjn, str, mz, zzang, uaVar);
    }

    /* renamed from: b */
    private final boolean m8055b(C2254Dd dd, C2254Dd dd2) {
        C3520uh uhVar;
        if (dd2.f6876o) {
            View a = C1799s.m8035a(dd2);
            if (a == null) {
                C2227Cf.m9536d("Could not get mediation view");
                return false;
            }
            View nextView = this.f5648f.f5619f.getNextView();
            if (nextView != null) {
                if (nextView instanceof C3520uh) {
                    ((C3520uh) nextView).destroy();
                }
                this.f5648f.f5619f.removeView(nextView);
            }
            if (!C1799s.m8047b(dd2)) {
                try {
                    if (C1697X.m7689B().mo10042e(this.f5648f.f5616c)) {
                        new C3217jr(this.f5648f.f5616c, a).mo9611a((C3331nr) new C3459sd(this.f5648f.f5616c, this.f5648f.f5615b));
                    }
                    if (dd2.f6884w != null) {
                        this.f5648f.f5619f.setMinimumWidth(dd2.f6884w.f10898f);
                        this.f5648f.f5619f.setMinimumHeight(dd2.f6884w.f10895c);
                    }
                    mo6869c(a);
                } catch (Exception e) {
                    C1697X.m7702i().mo8319a((Throwable) e, "BannerAdManager.swapViews");
                    C2227Cf.m9535c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else {
            zzjn zzjn = dd2.f6884w;
            if (!(zzjn == null || (uhVar = dd2.f6863b) == null)) {
                uhVar.mo8145a(C3146hi.m12525a(zzjn));
                this.f5648f.f5619f.removeAllViews();
                this.f5648f.f5619f.setMinimumWidth(dd2.f6884w.f10898f);
                this.f5648f.f5619f.setMinimumHeight(dd2.f6884w.f10895c);
                mo6869c(dd2.f6863b.getView());
            }
        }
        if (this.f5648f.f5619f.getChildCount() > 1) {
            this.f5648f.f5619f.showNext();
        }
        if (dd != null) {
            View nextView2 = this.f5648f.f5619f.getNextView();
            if (nextView2 instanceof C3520uh) {
                ((C3520uh) nextView2).destroy();
            } else if (nextView2 != null) {
                this.f5648f.f5619f.removeView(nextView2);
            }
            this.f5648f.mo6841c();
        }
        this.f5648f.f5619f.setVisibility(0);
        return true;
    }

    /* renamed from: c */
    private final void m8056c(C3520uh uhVar) {
        WebView webView;
        View view;
        if (mo6914kc() && (webView = uhVar.getWebView()) != null && (view = uhVar.getView()) != null && C1697X.m7714u().mo9851b(this.f5648f.f5616c)) {
            zzang zzang = this.f5648f.f5618e;
            int i = zzang.f10856b;
            int i2 = zzang.f10857c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.f5653k = C1697X.m7714u().mo9846a(sb.toString(), webView, "", "javascript", mo6878ic());
            if (this.f5653k != null) {
                C1697X.m7714u().mo9849a(this.f5653k, view);
                C1697X.m7714u().mo9848a(this.f5653k);
                this.f5908q = true;
            }
        }
    }

    /* renamed from: Tb */
    public final void mo6971Tb() {
        this.f5647e.mo6787d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3520uh mo6910a(C2282Ed ed, C1806va vaVar, C3345od odVar) {
        C1642d dVar;
        C1698Y y = this.f5648f;
        zzjn zzjn = y.f5622i;
        if (zzjn.f10899g == null && zzjn.f10901i) {
            zzaej zzaej = ed.f6943b;
            if (!zzaej.f10779B) {
                String str = zzaej.f10815n;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    dVar = new C1642d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    dVar = zzjn.mo10314c();
                }
                zzjn = new zzjn(this.f5648f.f5616c, dVar);
            }
            y.f5622i = zzjn;
        }
        return super.mo6910a(ed, vaVar, odVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6886a(C2254Dd dd, boolean z) {
        if (mo6914kc()) {
            C3520uh uhVar = dd != null ? dd.f6863b : null;
            if (uhVar != null) {
                if (!this.f5908q) {
                    m8056c(uhVar);
                }
                if (this.f5653k != null) {
                    uhVar.mo8149a("onSdkImpression", (Map<String, ?>) new C1080b());
                }
            }
        }
        super.mo6886a(dd, z);
        if (C1799s.m8047b(dd)) {
            C1706d dVar = new C1706d(this);
            if (dd != null && C1799s.m8047b(dd)) {
                C3520uh uhVar2 = dd.f6863b;
                View view = uhVar2 != null ? uhVar2.getView() : null;
                if (view == null) {
                    C2227Cf.m9536d("AdWebView is null");
                    return;
                }
                try {
                    List<String> list = dd.f6877p != null ? dd.f6877p.f10422r : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            C2880Yz Ba = dd.f6878q != null ? dd.f6878q.mo8706Ba() : null;
                            C2965bA Ja = dd.f6878q != null ? dd.f6878q.mo8707Ja() : null;
                            if (list.contains("2") && Ba != null) {
                                Ba.mo9102c(C5468d.m20961a(view));
                                if (!Ba.mo9092C()) {
                                    Ba.mo9104e();
                                }
                                uhVar2.mo8157b("/nativeExpressViewClicked", C1799s.m8036a(Ba, (C2965bA) null, dVar));
                                return;
                            } else if (!list.contains("1") || Ja == null) {
                                C2227Cf.m9536d("No matching template id and mapper");
                                return;
                            } else {
                                Ja.mo9217c(C5468d.m20961a(view));
                                if (!Ja.mo9206C()) {
                                    Ja.mo9219e();
                                }
                                uhVar2.mo8157b("/nativeExpressViewClicked", C1799s.m8036a((C2880Yz) null, Ja, dVar));
                                return;
                            }
                        }
                    }
                    C2227Cf.m9536d("No template ids present in mediation response");
                } catch (RemoteException e) {
                    C2227Cf.m9535c("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f7779Mc)).booleanValue() != false) goto L_0x007a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6748a(com.google.android.gms.internal.ads.C2254Dd r5, com.google.android.gms.internal.ads.C2254Dd r6) {
        /*
            r4 = this;
            boolean r0 = super.mo6748a((com.google.android.gms.internal.ads.C2254Dd) r5, (com.google.android.gms.internal.ads.C2254Dd) r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.gms.ads.internal.Y r0 = r4.f5648f
            boolean r0 = r0.mo6842d()
            if (r0 == 0) goto L_0x0023
            boolean r5 = r4.m8055b(r5, r6)
            if (r5 != 0) goto L_0x0023
            com.google.android.gms.internal.ads.ls r5 = r6.f6856N
            if (r5 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.ns r6 = com.google.android.gms.internal.ads.C3332ns.AD_FAILED_TO_LOAD
            r5.mo9686a((com.google.android.gms.internal.ads.C3332ns) r6)
        L_0x001f:
            r4.mo6758i(r1)
            return r1
        L_0x0023:
            r4.mo6889b((com.google.android.gms.internal.ads.C2254Dd) r6, (boolean) r1)
            boolean r5 = r6.f6873l
            r0 = 0
            if (r5 == 0) goto L_0x0060
            r4.mo7034d(r6)
            com.google.android.gms.ads.internal.C1697X.m7688A()
            com.google.android.gms.ads.internal.Y r5 = r4.f5648f
            com.google.android.gms.ads.internal.Z r5 = r5.f5619f
            com.google.android.gms.internal.ads.C3348og.m13242a((android.view.View) r5, (android.view.ViewTreeObserver.OnGlobalLayoutListener) r4)
            com.google.android.gms.ads.internal.C1697X.m7688A()
            com.google.android.gms.ads.internal.Y r5 = r4.f5648f
            com.google.android.gms.ads.internal.Z r5 = r5.f5619f
            com.google.android.gms.internal.ads.C3348og.m13243a((android.view.View) r5, (android.view.ViewTreeObserver.OnScrollChangedListener) r4)
            boolean r5 = r6.f6875n
            if (r5 != 0) goto L_0x007d
            com.google.android.gms.ads.internal.c r5 = new com.google.android.gms.ads.internal.c
            r5.<init>(r4)
            com.google.android.gms.internal.ads.uh r1 = r6.f6863b
            if (r1 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.bi r1 = r1.mo8182mb()
            goto L_0x0055
        L_0x0054:
            r1 = r0
        L_0x0055:
            if (r1 == 0) goto L_0x007d
            com.google.android.gms.ads.internal.xa r2 = new com.google.android.gms.ads.internal.xa
            r2.<init>(r6, r5)
            r1.mo9233a((com.google.android.gms.internal.ads.C3089fi) r2)
            goto L_0x007d
        L_0x0060:
            com.google.android.gms.ads.internal.Y r5 = r4.f5648f
            boolean r5 = r5.mo6843e()
            if (r5 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.C2558Nu.f7779Mc
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r5 = r2.mo8515a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x007d
        L_0x007a:
            r4.mo6886a((com.google.android.gms.internal.ads.C2254Dd) r6, (boolean) r1)
        L_0x007d:
            com.google.android.gms.internal.ads.uh r5 = r6.f6863b
            if (r5 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.Kh r5 = r5.mo8174jb()
            com.google.android.gms.internal.ads.uh r1 = r6.f6863b
            com.google.android.gms.internal.ads.bi r1 = r1.mo8182mb()
            if (r1 == 0) goto L_0x0090
            r1.mo9235c()
        L_0x0090:
            com.google.android.gms.ads.internal.Y r1 = r4.f5648f
            com.google.android.gms.internal.ads.zzmu r1 = r1.f5637x
            if (r1 == 0) goto L_0x009b
            if (r5 == 0) goto L_0x009b
            r5.mo8408b(r1)
        L_0x009b:
            boolean r5 = com.google.android.gms.common.util.C2092n.m9161b()
            if (r5 == 0) goto L_0x0130
            com.google.android.gms.ads.internal.Y r5 = r4.f5648f
            boolean r5 = r5.mo6842d()
            if (r5 == 0) goto L_0x0112
            com.google.android.gms.internal.ads.uh r5 = r6.f6863b
            if (r5 == 0) goto L_0x0127
            org.json.JSONObject r5 = r6.f6872k
            if (r5 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.Mq r5 = r4.f5650h
            com.google.android.gms.ads.internal.Y r0 = r4.f5648f
            com.google.android.gms.internal.ads.zzjn r0 = r0.f5622i
            r5.mo8550a(r0, r6)
        L_0x00ba:
            com.google.android.gms.internal.ads.uh r5 = r6.f6863b
            android.view.View r0 = r5.getView()
            com.google.android.gms.internal.ads.jr r5 = new com.google.android.gms.internal.ads.jr
            com.google.android.gms.ads.internal.Y r1 = r4.f5648f
            android.content.Context r1 = r1.f5616c
            r5.<init>(r1, r0)
            com.google.android.gms.internal.ads.td r1 = com.google.android.gms.ads.internal.C1697X.m7689B()
            com.google.android.gms.ads.internal.Y r2 = r4.f5648f
            android.content.Context r2 = r2.f5616c
            boolean r1 = r1.mo10042e(r2)
            if (r1 == 0) goto L_0x00f7
            com.google.android.gms.internal.ads.zzjj r1 = r6.f6862a
            boolean r1 = com.google.android.gms.ads.internal.C1700a.m7734c((com.google.android.gms.internal.ads.zzjj) r1)
            if (r1 == 0) goto L_0x00f7
            com.google.android.gms.ads.internal.Y r1 = r4.f5648f
            java.lang.String r1 = r1.f5615b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00f7
            com.google.android.gms.internal.ads.sd r1 = new com.google.android.gms.internal.ads.sd
            com.google.android.gms.ads.internal.Y r2 = r4.f5648f
            android.content.Context r3 = r2.f5616c
            java.lang.String r2 = r2.f5615b
            r1.<init>(r3, r2)
            r5.mo9611a((com.google.android.gms.internal.ads.C3331nr) r1)
        L_0x00f7:
            boolean r1 = r6.mo7978a()
            if (r1 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.uh r1 = r6.f6863b
            r5.mo9611a((com.google.android.gms.internal.ads.C3331nr) r1)
            goto L_0x0127
        L_0x0103:
            com.google.android.gms.internal.ads.uh r1 = r6.f6863b
            com.google.android.gms.internal.ads.bi r1 = r1.mo8182mb()
            com.google.android.gms.ads.internal.b r2 = new com.google.android.gms.ads.internal.b
            r2.<init>(r5, r6)
            r1.mo9232a((com.google.android.gms.internal.ads.C3061ei) r2)
            goto L_0x0127
        L_0x0112:
            com.google.android.gms.ads.internal.Y r5 = r4.f5648f
            android.view.View r1 = r5.f5604H
            if (r1 == 0) goto L_0x0127
            org.json.JSONObject r2 = r6.f6872k
            if (r2 == 0) goto L_0x0127
            com.google.android.gms.internal.ads.Mq r0 = r4.f5650h
            com.google.android.gms.internal.ads.zzjn r5 = r5.f5622i
            r0.mo8551a(r5, r6, r1)
            com.google.android.gms.ads.internal.Y r5 = r4.f5648f
            android.view.View r0 = r5.f5604H
        L_0x0127:
            boolean r5 = r6.f6876o
            if (r5 != 0) goto L_0x0130
            com.google.android.gms.ads.internal.Y r5 = r4.f5648f
            r5.mo6837a((android.view.View) r0)
        L_0x0130:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1808wa.mo6748a(com.google.android.gms.internal.ads.Dd, com.google.android.gms.internal.ads.Dd):boolean");
    }

    /* renamed from: b */
    public final boolean mo6812b(zzjj zzjj) {
        zzjj zzjj2 = zzjj;
        boolean z = zzjj2.f10882h;
        boolean z2 = this.f5907p;
        if (z != z2) {
            zzjj2 = new zzjj(zzjj2.f10875a, zzjj2.f10876b, zzjj2.f10877c, zzjj2.f10878d, zzjj2.f10879e, zzjj2.f10880f, zzjj2.f10881g, z || z2, zzjj2.f10883i, zzjj2.f10884j, zzjj2.f10885k, zzjj2.f10886l, zzjj2.f10887m, zzjj2.f10888n, zzjj2.f10889o, zzjj2.f10890p, zzjj2.f10891q, zzjj2.f10892r);
        }
        return super.mo6812b(zzjj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo7034d(C2254Dd dd) {
        C3520uh uhVar;
        if (dd != null && !dd.f6875n && this.f5648f.f5619f != null) {
            C3114ge e = C1697X.m7698e();
            C1698Y y = this.f5648f;
            if (e.mo9452a((View) y.f5619f, y.f5616c) && this.f5648f.f5619f.getGlobalVisibleRect(new Rect(), (Point) null)) {
                if (!(dd == null || (uhVar = dd.f6863b) == null || uhVar.mo8182mb() == null)) {
                    dd.f6863b.mo8182mb().mo9233a((C3089fi) null);
                }
                mo6886a(dd, false);
                dd.f6875n = true;
            }
        }
    }

    /* renamed from: e */
    public final void mo6817e(boolean z) {
        C2061y.m9072a("setManualImpressionsEnabled must be called from the main thread.");
        this.f5907p = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ec */
    public final void mo6756ec() {
        C2254Dd dd = this.f5648f.f5623j;
        C3520uh uhVar = dd != null ? dd.f6863b : null;
        if (!this.f5908q && uhVar != null) {
            m8056c(uhVar);
        }
        super.mo6756ec();
    }

    public final C2987bu getVideoController() {
        C3520uh uhVar;
        C2061y.m9072a("getVideoController must be called from the main thread.");
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null || (uhVar = dd.f6863b) == null) {
            return null;
        }
        return uhVar.mo8174jb();
    }

    /* access modifiers changed from: protected */
    /* renamed from: jc */
    public final boolean mo6893jc() {
        boolean z;
        C1699Z z2;
        C1697X.m7698e();
        if (!C3114ge.m12418a(this.f5648f.f5616c, "android.permission.INTERNET")) {
            C3432rf a = C3390pt.m13453a();
            C1698Y y = this.f5648f;
            a.mo9967a(y.f5619f, y.f5622i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        C1697X.m7698e();
        if (!C3114ge.m12417a(this.f5648f.f5616c)) {
            C3432rf a2 = C3390pt.m13453a();
            C1698Y y2 = this.f5648f;
            a2.mo9967a(y2.f5619f, y2.f5622i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && (z2 = this.f5648f.f5619f) != null) {
            z2.setVisibility(0);
        }
        return z;
    }

    public final void onGlobalLayout() {
        mo7034d(this.f5648f.f5623j);
    }

    public final void onScrollChanged() {
        mo7034d(this.f5648f.f5623j);
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }
}
