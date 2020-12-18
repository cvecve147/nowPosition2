package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1763m;
import com.google.android.gms.ads.internal.C1804ua;
import p101d.p129g.p131b.p132a.p134b.C5464b;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Zx */
public final class C2905Zx extends C2385Ht {

    /* renamed from: a */
    private final String f8722a;

    /* renamed from: b */
    private boolean f8723b;

    /* renamed from: c */
    private final C3365ox f8724c;

    /* renamed from: d */
    private C1763m f8725d;

    /* renamed from: e */
    private final C2652Qx f8726e;

    public C2905Zx(Context context, String str, C2533Mz mz, zzang zzang, C1804ua uaVar) {
        this(str, new C3365ox(context, mz, zzang, uaVar));
    }

    private C2905Zx(String str, C3365ox oxVar) {
        this.f8722a = str;
        this.f8724c = oxVar;
        this.f8726e = new C2652Qx();
        C1697X.m7711r().mo8916a(oxVar);
    }

    /* renamed from: bc */
    private final void m11731bc() {
        if (this.f8725d == null) {
            this.f8725d = this.f8724c.mo9843a(this.f8722a);
            this.f8726e.mo8769a(this.f8725d);
        }
    }

    /* renamed from: B */
    public final void mo6735B() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.mo6735B();
        }
    }

    /* renamed from: Da */
    public final C2620Pt mo6794Da() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: Na */
    public final C3562vt mo6795Na() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: O */
    public final String mo6796O() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            return mVar.mo6796O();
        }
        return null;
    }

    /* renamed from: Q */
    public final Bundle mo6797Q() {
        C1763m mVar = this.f8725d;
        return mVar != null ? mVar.mo6797Q() : new Bundle();
    }

    /* renamed from: Ra */
    public final void mo6798Ra() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.mo6798Ra();
        } else {
            C2227Cf.m9536d("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    /* renamed from: T */
    public final boolean mo6799T() {
        C1763m mVar = this.f8725d;
        return mVar != null && mVar.mo6799T();
    }

    /* renamed from: V */
    public final String mo6741V() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: X */
    public final zzjn mo6800X() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            return mVar.mo6800X();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo6801a(C2249D d, String str) {
        C2227Cf.m9536d("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    /* renamed from: a */
    public final void mo6802a(C2253Dc dc) {
        C2652Qx qx = this.f8726e;
        qx.f8192f = dc;
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            qx.mo8769a(mVar);
        }
    }

    /* renamed from: a */
    public final void mo6803a(C2499Lt lt) {
        C2652Qx qx = this.f8726e;
        qx.f8188b = lt;
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            qx.mo8769a(mVar);
        }
    }

    /* renamed from: a */
    public final void mo6804a(C2620Pt pt) {
        C2652Qx qx = this.f8726e;
        qx.f8189c = pt;
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            qx.mo8769a(mVar);
        }
    }

    /* renamed from: a */
    public final void mo6745a(C3131gv gvVar) {
        C2652Qx qx = this.f8726e;
        qx.f8190d = gvVar;
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            qx.mo8769a(mVar);
        }
    }

    /* renamed from: a */
    public final void mo6805a(C3475st stVar) {
        C2652Qx qx = this.f8726e;
        qx.f8191e = stVar;
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            qx.mo8769a(mVar);
        }
    }

    /* renamed from: a */
    public final void mo6747a(C3625y yVar) {
        C2227Cf.m9536d("setInAppPurchaseListener is deprecated and should not be called.");
    }

    /* renamed from: a */
    public final void mo6806a(zzjn zzjn) {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.mo6806a(zzjn);
        }
    }

    /* renamed from: a */
    public final void mo6807a(zzlu zzlu) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6808a(zzmu zzmu) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: a */
    public final void mo6809a(boolean z) {
        this.f8723b = z;
    }

    /* renamed from: b */
    public final void mo6810b(C2791Vt vt) {
        m11731bc();
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.mo6810b(vt);
        }
    }

    /* renamed from: b */
    public final void mo6811b(C3562vt vtVar) {
        C2652Qx qx = this.f8726e;
        qx.f8187a = vtVar;
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            qx.mo8769a(mVar);
        }
    }

    /* renamed from: b */
    public final boolean mo6812b(zzjj zzjj) {
        if (!C2739Tx.m11307a(zzjj).contains("gw")) {
            m11731bc();
        }
        if (C2739Tx.m11307a(zzjj).contains("_skipMediation")) {
            m11731bc();
        }
        if (zzjj.f10884j != null) {
            m11731bc();
        }
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            return mVar.mo6812b(zzjj);
        }
        C2739Tx r = C1697X.m7711r();
        if (C2739Tx.m11307a(zzjj).contains("_ad")) {
            r.mo8917b(zzjj, this.f8722a);
        }
        C2822Wx a = r.mo8914a(zzjj, this.f8722a);
        if (a != null) {
            if (!a.f8580e) {
                a.mo9011a();
                C2878Yx.m11651a().mo9085e();
            } else {
                C2878Yx.m11651a().mo9084d();
            }
            this.f8725d = a.f8576a;
            a.f8578c.mo9916a(this.f8726e);
            this.f8726e.mo8769a(this.f8725d);
            return a.f8581f;
        }
        m11731bc();
        C2878Yx.m11651a().mo9085e();
        return this.f8725d.mo6812b(zzjj);
    }

    /* renamed from: c */
    public final void mo6814c(String str) {
    }

    public final void destroy() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.destroy();
        }
    }

    /* renamed from: e */
    public final void mo6817e(boolean z) {
        m11731bc();
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.mo6817e(z);
        }
    }

    /* renamed from: ga */
    public final C5464b mo6818ga() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            return mVar.mo6818ga();
        }
        return null;
    }

    public final C2987bu getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: i */
    public final String mo6820i() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            return mVar.mo6820i();
        }
        return null;
    }

    /* renamed from: pa */
    public final boolean mo6822pa() {
        C1763m mVar = this.f8725d;
        return mVar != null && mVar.mo6822pa();
    }

    public final void pause() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.pause();
        }
    }

    public final void showInterstitial() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.mo6809a(this.f8723b);
            this.f8725d.showInterstitial();
            return;
        }
        C2227Cf.m9536d("Interstitial ad must be loaded before showInterstitial().");
    }

    public final void stopLoading() {
        C1763m mVar = this.f8725d;
        if (mVar != null) {
            mVar.stopLoading();
        }
    }
}
