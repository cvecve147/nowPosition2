package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.C2188Aw;
import com.google.android.gms.internal.ads.C2242Ct;
import com.google.android.gms.internal.ads.C2302Ew;
import com.google.android.gms.internal.ads.C2388Hw;
import com.google.android.gms.internal.ads.C2472Kw;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2560Nw;
import com.google.android.gms.internal.ads.C2791Vt;
import com.google.android.gms.internal.ads.C3562vt;
import com.google.android.gms.internal.ads.C3621xw;
import com.google.android.gms.internal.ads.C3646yt;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;
import p013b.p018b.p028h.p039h.C1101r;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.l */
public final class C1761l extends C2242Ct {

    /* renamed from: a */
    private C3562vt f5776a;

    /* renamed from: b */
    private C3621xw f5777b;

    /* renamed from: c */
    private C2560Nw f5778c;

    /* renamed from: d */
    private C2188Aw f5779d;

    /* renamed from: e */
    private C1101r<String, C2302Ew> f5780e = new C1101r<>();

    /* renamed from: f */
    private C1101r<String, C2388Hw> f5781f = new C1101r<>();

    /* renamed from: g */
    private C2472Kw f5782g;

    /* renamed from: h */
    private zzjn f5783h;

    /* renamed from: i */
    private PublisherAdViewOptions f5784i;

    /* renamed from: j */
    private zzpl f5785j;

    /* renamed from: k */
    private C2791Vt f5786k;

    /* renamed from: l */
    private final Context f5787l;

    /* renamed from: m */
    private final C2533Mz f5788m;

    /* renamed from: n */
    private final String f5789n;

    /* renamed from: o */
    private final zzang f5790o;

    /* renamed from: p */
    private final C1804ua f5791p;

    public C1761l(Context context, String str, C2533Mz mz, zzang zzang, C1804ua uaVar) {
        this.f5787l = context;
        this.f5789n = str;
        this.f5788m = mz;
        this.f5790o = zzang;
        this.f5791p = uaVar;
    }

    /* renamed from: a */
    public final void mo6960a(PublisherAdViewOptions publisherAdViewOptions) {
        this.f5784i = publisherAdViewOptions;
    }

    /* renamed from: a */
    public final void mo6961a(C2188Aw aw) {
        this.f5779d = aw;
    }

    /* renamed from: a */
    public final void mo6962a(C2472Kw kw, zzjn zzjn) {
        this.f5782g = kw;
        this.f5783h = zzjn;
    }

    /* renamed from: a */
    public final void mo6963a(C2560Nw nw) {
        this.f5778c = nw;
    }

    /* renamed from: a */
    public final void mo6964a(C2791Vt vt) {
        this.f5786k = vt;
    }

    /* renamed from: a */
    public final void mo6965a(C3562vt vtVar) {
        this.f5776a = vtVar;
    }

    /* renamed from: a */
    public final void mo6966a(C3621xw xwVar) {
        this.f5777b = xwVar;
    }

    /* renamed from: a */
    public final void mo6967a(zzpl zzpl) {
        this.f5785j = zzpl;
    }

    /* renamed from: a */
    public final void mo6968a(String str, C2388Hw hw, C2302Ew ew) {
        if (!TextUtils.isEmpty(str)) {
            this.f5781f.put(str, hw);
            this.f5780e.put(str, ew);
            return;
        }
        throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }

    /* renamed from: da */
    public final C3646yt mo6969da() {
        return new C1755i(this.f5787l, this.f5789n, this.f5788m, this.f5790o, this.f5776a, this.f5777b, this.f5778c, this.f5779d, this.f5781f, this.f5780e, this.f5785j, this.f5786k, this.f5791p, this.f5782g, this.f5783h, this.f5784i);
    }
}
