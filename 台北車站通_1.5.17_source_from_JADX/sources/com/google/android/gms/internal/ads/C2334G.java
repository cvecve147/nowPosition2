package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.internal.C2061y;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.G */
public abstract class C2334G implements C3660ze<Void>, C3003ci {

    /* renamed from: a */
    private final C2534N f7032a;

    /* renamed from: b */
    protected final Context f7033b;

    /* renamed from: c */
    protected final C3520uh f7034c;

    /* renamed from: d */
    private final C2282Ed f7035d;

    /* renamed from: e */
    protected zzaej f7036e;

    /* renamed from: f */
    private Runnable f7037f;

    /* renamed from: g */
    private final Object f7038g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AtomicBoolean f7039h = new AtomicBoolean(true);

    protected C2334G(Context context, C2282Ed ed, C3520uh uhVar, C2534N n) {
        this.f7033b = context;
        this.f7035d = ed;
        this.f7036e = this.f7035d.f6943b;
        this.f7034c = uhVar;
        this.f7032a = n;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8107a() {
        C2061y.m9072a("Webview render task needs to be called on UI thread.");
        this.f7037f = new C2364H(this);
        C3114ge.f9351a.postDelayed(this.f7037f, ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7932mc)).longValue());
        mo8109b();
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8108a(int i) {
        int i2 = i;
        if (i2 != -2) {
            this.f7036e = new zzaej(i2, this.f7036e.f10813l);
        }
        this.f7034c.mo8203wb();
        C2534N n = this.f7032a;
        C2282Ed ed = this.f7035d;
        zzaef zzaef = ed.f6942a;
        zzjj zzjj = zzaef.f10753c;
        C3520uh uhVar = this.f7034c;
        zzaej zzaej = this.f7036e;
        List<String> list = zzaej.f10806e;
        List<String> list2 = zzaej.f10808g;
        List<String> list3 = zzaej.f10812k;
        int i3 = zzaej.f10814m;
        long j = zzaej.f10813l;
        String str = zzaef.f10760i;
        zzaej zzaej2 = zzaej;
        boolean z = zzaej.f10810i;
        C2254Dd dd = r1;
        C2282Ed ed2 = ed;
        zzaej zzaej3 = zzaej2;
        long j2 = zzaej3.f10811j;
        zzjn zzjn = ed2.f6945d;
        long j3 = zzaej3.f10809h;
        long j4 = ed2.f6947f;
        long j5 = zzaej3.f10816o;
        String str2 = zzaej3.f10817p;
        JSONObject jSONObject = ed2.f6949h;
        zzaig zzaig = zzaej3.f10781D;
        List<String> list4 = zzaej3.f10782E;
        List<String> list5 = zzaej3.f10783F;
        boolean z2 = zzaej3.f10784G;
        zzael zzael = zzaej3.f10785H;
        List<String> list6 = zzaej3.f10788K;
        String str3 = zzaej3.f10792O;
        C3275ls lsVar = ed2.f6950i;
        zzaej zzaej4 = ed2.f6943b;
        C2254Dd dd2 = new C2254Dd(zzjj, uhVar, list, i, list2, list3, i3, j, str, z, (C3568vz) null, (C2626Pz) null, (String) null, (C3596wz) null, (C3681zz) null, j2, zzjn, j3, j4, j5, str2, jSONObject, (C2329Fv) null, zzaig, list4, list5, z2, zzael, (String) null, list6, str3, lsVar, zzaej4.f10796S, ed2.f6951j, zzaej4.f10798U, zzaej3.f10799V, zzaej4.f10800W, zzaej4.f10801X);
        n.mo6859a(dd);
    }

    /* renamed from: a */
    public final void mo7012a(boolean z) {
        C2227Cf.m9532b("WebView finished loading.");
        int i = 0;
        if (this.f7039h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo8108a(i);
            C3114ge.f9351a.removeCallbacks(this.f7037f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8109b();

    public void cancel() {
        if (this.f7039h.getAndSet(false)) {
            this.f7034c.stopLoading();
            C1697X.m7700g();
            C3289me.m13057a(this.f7034c);
            mo8108a(-1);
            C3114ge.f9351a.removeCallbacks(this.f7037f);
        }
    }
}
