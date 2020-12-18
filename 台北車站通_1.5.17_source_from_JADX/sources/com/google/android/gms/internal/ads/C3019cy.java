package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.cy */
public final class C3019cy extends C3395py<C2934_y> implements C3281ly, C3452ry {

    /* renamed from: b */
    private final C3521ui f9028b;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.cy, com.google.android.gms.internal.ads.oy] */
    public C3019cy(Context context, zzang zzang) {
        try {
            this.f9028b = new C3521ui(new C3118gi(context));
            this.f9028b.setWillNotDraw(true);
            this.f9028b.mo9974a((C3579wi) new C3049dy(this));
            this.f9028b.mo9975a((C3635yi) new C3077ey(this));
            this.f9028b.addJavascriptInterface(new C3252ky(this), "GoogleJsInterface");
            C1697X.m7698e().mo9448a(context, zzang.f10855a, this.f9028b.getSettings());
        } catch (Throwable th) {
            throw new C2315Fh("Init failed.", th);
        }
    }

    /* renamed from: a */
    public final C2963az mo9290a() {
        return new C2992bz(this);
    }

    /* renamed from: a */
    public final void mo9291a(C3480sy syVar) {
        this.f9028b.mo9972a((C2173Ai) new C3162hy(syVar));
    }

    /* renamed from: a */
    public final void mo7966a(String str) {
        C2972bg.f8938a.execute(new C3191iy(this, str));
    }

    /* renamed from: a */
    public final void mo9270a(String str, String str2) {
        C3309my.m13109a((C3281ly) this, str, str2);
    }

    /* renamed from: a */
    public final void mo8149a(String str, Map map) {
        C3309my.m13110a((C3281ly) this, str, map);
    }

    /* renamed from: a */
    public final void mo8150a(String str, JSONObject jSONObject) {
        C3309my.m13112b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo9292b(String str) {
        C2972bg.f8938a.execute(new C3106fy(this, str));
    }

    /* renamed from: b */
    public final void mo7967b(String str, JSONObject jSONObject) {
        C3309my.m13111a((C3281ly) this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo9293c(String str) {
        C2972bg.f8938a.execute(new C3134gy(this, str));
    }

    /* renamed from: d */
    public final void mo9294d(String str) {
        mo9292b(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    public final void destroy() {
        this.f9028b.destroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo9296e(String str) {
        this.f9028b.mo7966a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo9297f(String str) {
        this.f9028b.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo9298g(String str) {
        this.f9028b.loadData(str, "text/html", HTTP.UTF_8);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo9299k() {
        return this;
    }
}
