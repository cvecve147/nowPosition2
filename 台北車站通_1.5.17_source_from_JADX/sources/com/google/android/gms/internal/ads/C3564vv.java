package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1101r;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.vv */
public final class C3564vv extends C3537uw implements C2329Fv {

    /* renamed from: a */
    private final C3306mv f10396a;

    /* renamed from: b */
    private final String f10397b;

    /* renamed from: c */
    private final C1101r<String, C3420qv> f10398c;

    /* renamed from: d */
    private final C1101r<String, String> f10399d;

    /* renamed from: e */
    private C2987bu f10400e;

    /* renamed from: f */
    private View f10401f;

    /* renamed from: g */
    private final Object f10402g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2244Cv f10403h;

    public C3564vv(String str, C1101r<String, C3420qv> rVar, C1101r<String, String> rVar2, C3306mv mvVar, C2987bu buVar, View view) {
        this.f10397b = str;
        this.f10398c = rVar;
        this.f10399d = rVar2;
        this.f10396a = mvVar;
        this.f10400e = buVar;
        this.f10401f = view;
    }

    /* renamed from: Bb */
    public final View mo8101Bb() {
        return this.f10401f;
    }

    /* renamed from: Cb */
    public final String mo8102Cb() {
        return "3";
    }

    /* renamed from: Fb */
    public final C3306mv mo8103Fb() {
        return this.f10396a;
    }

    /* renamed from: Ha */
    public final C5464b mo10056Ha() {
        return C5468d.m20961a(this.f10403h.getContext().getApplicationContext());
    }

    /* renamed from: a */
    public final void mo8104a(C2244Cv cv) {
        synchronized (this.f10402g) {
            this.f10403h = cv;
        }
    }

    public final void destroy() {
        C3114ge.f9351a.post(new C3620xv(this));
        this.f10400e = null;
        this.f10401f = null;
    }

    /* renamed from: e */
    public final void mo10058e() {
        synchronized (this.f10402g) {
            if (this.f10403h == null) {
                C2227Cf.m9529a("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.f10403h.mo7893b((View) null, (Map<String, WeakReference<View>>) null);
            }
        }
    }

    public final C2987bu getVideoController() {
        return this.f10400e;
    }

    /* renamed from: j */
    public final void mo10060j(String str) {
        synchronized (this.f10402g) {
            if (this.f10403h == null) {
                C2227Cf.m9529a("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f10403h.mo7959a((View) null, str, (Bundle) null, (Map<String, WeakReference<View>>) null, (View) null);
            }
        }
    }

    /* renamed from: l */
    public final String mo10061l() {
        return this.f10397b;
    }

    /* renamed from: l */
    public final String mo10062l(String str) {
        return this.f10399d.get(str);
    }

    /* renamed from: l */
    public final boolean mo10063l(C5464b bVar) {
        if (this.f10403h == null) {
            C2227Cf.m9529a("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f10401f == null) {
            return false;
        } else {
            C3592wv wvVar = new C3592wv(this);
            this.f10403h.mo7958a((View) (FrameLayout) C5468d.m20962z(bVar), (C2187Av) wvVar);
            return true;
        }
    }

    /* renamed from: n */
    public final C2903Zv mo10064n(String str) {
        return this.f10398c.get(str);
    }

    /* renamed from: x */
    public final C5464b mo10065x() {
        return C5468d.m20961a(this.f10403h);
    }

    /* renamed from: xa */
    public final List<String> mo10066xa() {
        String[] strArr = new String[(this.f10398c.size() + this.f10399d.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f10398c.size()) {
            strArr[i3] = this.f10398c.mo5236b(i2);
            i2++;
            i3++;
        }
        while (i < this.f10399d.size()) {
            strArr[i3] = this.f10399d.mo5236b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }
}
