package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1804ua;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.common.util.C2093o;
import java.util.Map;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ty */
public final class C3509ty implements C3281ly, C3452ry {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3520uh f10288a;

    /* renamed from: b */
    private final Context f10289b;

    public C3509ty(Context context, zzang zzang, C2209Bp bp, C1804ua uaVar) {
        this.f10289b = context;
        C1697X.m7699f();
        this.f10288a = C2201Bh.m9441a(context, C3146hi.m12526b(), "", false, false, bp, zzang, (C2930_u) null, (C1690P) null, (C1804ua) null, C3275ls.m13004a());
        this.f10288a.getView().setWillNotDraw(true);
    }

    /* renamed from: a */
    private static void m14002a(Runnable runnable) {
        C3390pt.m13453a();
        if (C3432rf.m13608b()) {
            runnable.run();
        } else {
            C3114ge.f9351a.post(runnable);
        }
    }

    /* renamed from: a */
    public final C2963az mo9290a() {
        return new C2992bz(this);
    }

    /* renamed from: a */
    public final void mo9291a(C3480sy syVar) {
        C2974bi mb = this.f10288a.mo8182mb();
        syVar.getClass();
        mb.mo9231a(C3595wy.m14401a(syVar));
    }

    /* renamed from: a */
    public final void mo7966a(String str) {
        m14002a((Runnable) new C3539uy(this, str));
    }

    /* renamed from: a */
    public final void mo9185a(String str, C1718E<? super C2934_y> e) {
        this.f10288a.mo8148a(str, (C2093o<C1718E<? super C3520uh>>) new C3567vy(e));
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
        m14002a((Runnable) new C3680zy(this, str));
    }

    /* renamed from: b */
    public final void mo9186b(String str, C1718E<? super C2934_y> e) {
        this.f10288a.mo8157b(str, new C2218By(this, e));
    }

    /* renamed from: b */
    public final void mo7967b(String str, JSONObject jSONObject) {
        C3309my.m13111a((C3281ly) this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo9293c(String str) {
        m14002a((Runnable) new C2190Ay(this, str));
    }

    /* renamed from: d */
    public final void mo9294d(String str) {
        m14002a((Runnable) new C3651yy(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void destroy() {
        this.f10288a.destroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo10067e(String str) {
        this.f10288a.mo7966a(str);
    }
}
