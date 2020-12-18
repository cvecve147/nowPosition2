package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2209Bp;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2238Cp;
import com.google.android.gms.internal.ads.C2249D;
import com.google.android.gms.internal.ads.C2253Dc;
import com.google.android.gms.internal.ads.C2385Ht;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2499Lt;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2620Pt;
import com.google.android.gms.internal.ads.C2791Vt;
import com.google.android.gms.internal.ads.C2987bu;
import com.google.android.gms.internal.ads.C3057ee;
import com.google.android.gms.internal.ads.C3131gv;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3432rf;
import com.google.android.gms.internal.ads.C3475st;
import com.google.android.gms.internal.ads.C3562vt;
import com.google.android.gms.internal.ads.C3625y;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import java.util.Map;
import java.util.concurrent.Future;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.Q */
public final class C1691Q extends C2385Ht {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzang f5544a;

    /* renamed from: b */
    private final zzjn f5545b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Future<C2209Bp> f5546c = C3057ee.m12270a(new C1694U(this));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f5547d;

    /* renamed from: e */
    private final C1696W f5548e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f5549f = new WebView(this.f5547d);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3562vt f5550g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2209Bp f5551h;

    /* renamed from: i */
    private AsyncTask<Void, Void, String> f5552i;

    public C1691Q(Context context, zzjn zzjn, String str, zzang zzang) {
        this.f5547d = context;
        this.f5544a = zzang;
        this.f5545b = zzjn;
        this.f5548e = new C1696W(str);
        mo6821i(0);
        this.f5549f.setVerticalScrollBarEnabled(false);
        this.f5549f.getSettings().setJavaScriptEnabled(true);
        this.f5549f.setWebViewClient(new C1692S(this));
        this.f5549f.setOnTouchListener(new C1693T(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final String m7648r(String str) {
        if (this.f5551h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f5551h.mo7868a(parse, this.f5547d, (View) null, (Activity) null);
        } catch (C2238Cp e) {
            C2227Cf.m9535c("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m7649s(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f5547d.startActivity(intent);
    }

    /* renamed from: B */
    public final void mo6735B() {
        C2061y.m9072a("resume must be called on the main UI thread.");
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
        return null;
    }

    /* renamed from: Q */
    public final Bundle mo6797Q() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: Ra */
    public final void mo6798Ra() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: T */
    public final boolean mo6799T() {
        return false;
    }

    /* renamed from: V */
    public final String mo6741V() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: X */
    public final zzjn mo6800X() {
        return this.f5545b;
    }

    /* renamed from: a */
    public final void mo6801a(C2249D d, String str) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6802a(C2253Dc dc) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6803a(C2499Lt lt) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6804a(C2620Pt pt) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6745a(C3131gv gvVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6805a(C3475st stVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6747a(C3625y yVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6806a(zzjn zzjn) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* renamed from: a */
    public final void mo6807a(zzlu zzlu) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6808a(zzmu zzmu) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo6809a(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b */
    public final void mo6810b(C2791Vt vt) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b */
    public final void mo6811b(C3562vt vtVar) {
        this.f5550g = vtVar;
    }

    /* renamed from: b */
    public final boolean mo6812b(zzjj zzjj) {
        C2061y.m9068a(this.f5549f, (Object) "This Search Ad has already been torn down");
        this.f5548e.mo6832a(zzjj, this.f5544a);
        this.f5552i = new C1695V(this, (C1692S) null).execute(new Void[0]);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bc */
    public final String mo6813bc() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) C3390pt.m13458f().mo8515a(C2558Nu.f7993wd));
        builder.appendQueryParameter("query", this.f5548e.mo6831a());
        builder.appendQueryParameter("pubId", this.f5548e.mo6834c());
        Map<String, String> d = this.f5548e.mo6835d();
        for (String next : d.keySet()) {
            builder.appendQueryParameter(next, d.get(next));
        }
        Uri build = builder.build();
        C2209Bp bp = this.f5551h;
        if (bp != null) {
            try {
                build = bp.mo7867a(build, this.f5547d);
            } catch (C2238Cp e) {
                C2227Cf.m9535c("Unable to process ad data", e);
            }
        }
        String cc = mo6815cc();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(cc).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(cc);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo6814c(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: cc */
    public final String mo6815cc() {
        String b = this.f5548e.mo6833b();
        if (TextUtils.isEmpty(b)) {
            b = "www.google.com";
        }
        String str = (String) C3390pt.m13458f().mo8515a(C2558Nu.f7993wd);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(b);
        sb.append(str);
        return sb.toString();
    }

    public final void destroy() {
        C2061y.m9072a("destroy must be called on the main UI thread.");
        this.f5552i.cancel(true);
        this.f5546c.cancel(true);
        this.f5549f.destroy();
        this.f5549f = null;
    }

    /* renamed from: e */
    public final void mo6817e(boolean z) {
    }

    /* renamed from: ga */
    public final C5464b mo6818ga() {
        C2061y.m9072a("getAdFrame must be called on the main UI thread.");
        return C5468d.m20961a(this.f5549f);
    }

    public final C2987bu getVideoController() {
        return null;
    }

    /* renamed from: i */
    public final String mo6820i() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo6821i(int i) {
        if (this.f5549f != null) {
            this.f5549f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    /* renamed from: pa */
    public final boolean mo6822pa() {
        return false;
    }

    public final void pause() {
        C2061y.m9072a("pause must be called on the main UI thread.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo6823q(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C3390pt.m13453a();
            return C3432rf.m13595a(this.f5547d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    public final void stopLoading() {
    }
}
