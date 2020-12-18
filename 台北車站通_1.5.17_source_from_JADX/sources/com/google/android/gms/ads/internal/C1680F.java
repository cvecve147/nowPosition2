package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C2282Ed;
import com.google.android.gms.internal.ads.C2329Fv;
import com.google.android.gms.internal.ads.C2483Lf;
import com.google.android.gms.internal.ads.C2930_u;
import com.google.android.gms.internal.ads.C3196jb;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzjj;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.F */
final class C1680F implements Callable<C2329Fv> {

    /* renamed from: a */
    private final /* synthetic */ int f5515a;

    /* renamed from: b */
    private final /* synthetic */ JSONArray f5516b;

    /* renamed from: c */
    private final /* synthetic */ int f5517c;

    /* renamed from: d */
    private final /* synthetic */ C2282Ed f5518d;

    /* renamed from: e */
    private final /* synthetic */ C1678D f5519e;

    C1680F(C1678D d, int i, JSONArray jSONArray, int i2, C2282Ed ed) {
        this.f5519e = d;
        this.f5515a = i;
        this.f5516b = jSONArray;
        this.f5517c = i2;
        this.f5518d = ed;
    }

    public final /* synthetic */ Object call() {
        if (this.f5515a >= this.f5516b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f5516b.get(this.f5515a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        C1678D d = this.f5519e;
        C1698Y y = d.f5648f;
        C1678D d2 = new C1678D(y.f5616c, d.f5654l, y.f5622i, y.f5615b, d.f5658m, y.f5618e, true);
        C1678D d3 = this.f5519e;
        C1678D.m7580a(d3.f5648f, d2.f5648f);
        d2.mo6761lc();
        d2.mo6861a(this.f5519e.f5644b);
        C2930_u _uVar = d2.f5643a;
        int i = this.f5515a;
        _uVar.mo9178a("num_ads_requested", String.valueOf(this.f5517c));
        _uVar.mo9178a("ad_index", String.valueOf(i));
        zzaef zzaef = this.f5518d.f6942a;
        String jSONObject2 = jSONObject.toString();
        Bundle bundle = zzaef.f10753c.f10877c;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_ad", jSONObject2);
        zzjj zzjj = r6;
        zzjj zzjj2 = zzaef.f10753c;
        zzjj zzjj3 = new zzjj(zzjj2.f10875a, zzjj2.f10876b, bundle2, zzjj2.f10878d, zzjj2.f10879e, zzjj2.f10880f, zzjj2.f10881g, zzjj2.f10882h, zzjj2.f10883i, zzjj2.f10884j, zzjj2.f10885k, zzjj2.f10886l, zzjj2.f10887m, zzjj2.f10888n, zzjj2.f10889o, zzjj2.f10890p, zzjj2.f10891q, zzjj2.f10892r);
        d2.mo6887a(new C3196jb(zzaef.f10751b, zzjj, zzaef.f10755d, zzaef.f10756e, zzaef.f10757f, zzaef.f10758g, zzaef.f10760i, zzaef.f10761j, zzaef.f10762k, zzaef.f10763l, zzaef.f10765n, zzaef.f10777z, zzaef.f10766o, zzaef.f10767p, zzaef.f10768q, zzaef.f10769r, zzaef.f10770s, zzaef.f10771t, zzaef.f10772u, zzaef.f10773v, zzaef.f10774w, zzaef.f10775x, zzaef.f10776y, zzaef.f10724B, zzaef.f10725C, zzaef.f10731I, zzaef.f10726D, zzaef.f10727E, zzaef.f10728F, zzaef.f10729G, C2483Lf.m10495a(zzaef.f10730H), zzaef.f10732J, zzaef.f10733K, zzaef.f10734L, zzaef.f10735M, zzaef.f10736N, zzaef.f10737O, zzaef.f10738P, zzaef.f10739Q, zzaef.f10743U, C2483Lf.m10495a(zzaef.f10759h), zzaef.f10744V, zzaef.f10745W, zzaef.f10746X, 1, zzaef.f10748Z, zzaef.f10750aa, zzaef.f10752ba, zzaef.f10754ca), d2.f5643a);
        return d2.mo6763nc().get();
    }
}
