package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1678D;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1806va;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.ads.internal.gmsg.C1726I;
import com.google.android.gms.ads.internal.gmsg.C1729c;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ta */
public final class C3484ta implements C3370pa<C3520uh> {

    /* renamed from: a */
    private C2804Wf<C3520uh> f10237a;

    /* renamed from: b */
    private final C1729c f10238b = new C1729c(this.f10240d);

    /* renamed from: c */
    private final C2415Iv f10239c;

    /* renamed from: d */
    private final Context f10240d;

    /* renamed from: e */
    private final zzang f10241e;

    /* renamed from: f */
    private final C1678D f10242f;

    /* renamed from: g */
    private final C2209Bp f10243g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f10244h;

    public C3484ta(Context context, C1678D d, String str, C2209Bp bp, zzang zzang) {
        C2227Cf.m9534c("Webview loading for native ads.");
        this.f10240d = context;
        this.f10242f = d;
        this.f10243g = bp;
        this.f10241e = zzang;
        this.f10244h = str;
        C1697X.m7699f();
        C2804Wf<C3520uh> a = C2201Bh.m9440a(this.f10240d, this.f10241e, (String) C3390pt.m13458f().mo8515a(C2558Nu.f7785Nc), this.f10243g, this.f10242f.mo6879kb());
        this.f10239c = new C2415Iv(d, str);
        this.f10237a = C2483Lf.m10497a(a, new C3513ua(this), C2972bg.f8939b);
        C2427Jf.m10346a(this.f10237a, "WebViewNativeAdsUtil.constructor");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C2804Wf mo10026a(C3520uh uhVar) {
        C2227Cf.m9534c("Javascript has loaded for native ads.");
        C2974bi mb = uhVar.mo8182mb();
        C1678D d = this.f10242f;
        mb.mo9229a(d, d, d, d, d, false, (C1726I) null, new C1806va(this.f10240d, (C3345od) null, (zzael) null), (C3340o) null, (C3345od) null);
        uhVar.mo8157b("/logScionEvent", this.f10238b);
        uhVar.mo8157b("/logScionEvent", this.f10239c);
        return C2483Lf.m10495a(uhVar);
    }

    /* renamed from: a */
    public final C2804Wf<JSONObject> mo9852a(JSONObject jSONObject) {
        return C2483Lf.m10497a(this.f10237a, new C3571wa(this, jSONObject), C2972bg.f8938a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C2804Wf mo10027a(JSONObject jSONObject, C3520uh uhVar) {
        jSONObject.put("ads_id", this.f10244h);
        uhVar.mo7967b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return C2483Lf.m10495a(new JSONObject());
    }

    /* renamed from: a */
    public final void mo9853a() {
        C2483Lf.m10502a(this.f10237a, new C2279Ea(this), C2972bg.f8938a);
    }

    /* renamed from: a */
    public final void mo9854a(String str, C1718E<? super C3520uh> e) {
        C2483Lf.m10502a(this.f10237a, new C2194Ba(this, str, e), C2972bg.f8938a);
    }

    /* renamed from: a */
    public final void mo9855a(String str, JSONObject jSONObject) {
        C2483Lf.m10502a(this.f10237a, new C2222Ca(this, str, jSONObject), C2972bg.f8938a);
    }

    /* renamed from: b */
    public final C2804Wf<JSONObject> mo9856b(JSONObject jSONObject) {
        return C2483Lf.m10497a(this.f10237a, new C3543va(this, jSONObject), C2972bg.f8938a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C2804Wf mo10028b(JSONObject jSONObject, C3520uh uhVar) {
        jSONObject.put("ads_id", this.f10244h);
        uhVar.mo7967b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return C2483Lf.m10495a(new JSONObject());
    }

    /* renamed from: b */
    public final void mo9857b(String str, C1718E<? super C3520uh> e) {
        C2483Lf.m10502a(this.f10237a, new C2165Aa(this, str, e), C2972bg.f8938a);
    }

    /* renamed from: c */
    public final C2804Wf<JSONObject> mo9858c(JSONObject jSONObject) {
        return C2483Lf.m10497a(this.f10237a, new C3627ya(this, jSONObject), C2972bg.f8938a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C2804Wf mo10029c(JSONObject jSONObject, C3520uh uhVar) {
        jSONObject.put("ads_id", this.f10244h);
        uhVar.mo7967b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return C2483Lf.m10495a(new JSONObject());
    }

    /* renamed from: d */
    public final C2804Wf<JSONObject> mo9859d(JSONObject jSONObject) {
        return C2483Lf.m10497a(this.f10237a, new C3599xa(this, jSONObject), C2972bg.f8938a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C2804Wf mo10030d(JSONObject jSONObject, C3520uh uhVar) {
        jSONObject.put("ads_id", this.f10244h);
        C3116gg ggVar = new C3116gg();
        uhVar.mo8157b("/nativeAdPreProcess", new C3655za(this, uhVar, ggVar));
        uhVar.mo7967b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return ggVar;
    }
}
