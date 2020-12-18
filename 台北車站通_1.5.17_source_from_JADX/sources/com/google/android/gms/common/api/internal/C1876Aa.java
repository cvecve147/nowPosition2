package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1867c;
import com.google.android.gms.common.api.C1869e;
import java.util.Map;
import java.util.Set;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p131b.p132a.p144g.C5536g;
import p101d.p129g.p131b.p132a.p144g.C5537h;

/* renamed from: com.google.android.gms.common.api.internal.Aa */
public final class C1876Aa {

    /* renamed from: a */
    private final C1080b<C1973ya<?>, ConnectionResult> f6072a = new C1080b<>();

    /* renamed from: b */
    private final C1080b<C1973ya<?>, String> f6073b = new C1080b<>();

    /* renamed from: c */
    private final C5537h<Map<C1973ya<?>, String>> f6074c = new C5537h<>();

    /* renamed from: d */
    private int f6075d;

    /* renamed from: e */
    private boolean f6076e = false;

    public C1876Aa(Iterable<? extends C1869e<?>> iterable) {
        for (C1869e e : iterable) {
            this.f6072a.put(e.mo7317e(), null);
        }
        this.f6075d = this.f6072a.keySet().size();
    }

    /* renamed from: a */
    public final C5536g<Map<C1973ya<?>, String>> mo7321a() {
        return this.f6074c.mo14996a();
    }

    /* renamed from: a */
    public final void mo7322a(C1973ya<?> yaVar, ConnectionResult connectionResult, String str) {
        this.f6072a.put(yaVar, connectionResult);
        this.f6073b.put(yaVar, str);
        this.f6075d--;
        if (!connectionResult.mo7218f()) {
            this.f6076e = true;
        }
        if (this.f6075d != 0) {
            return;
        }
        if (this.f6076e) {
            this.f6074c.mo14997a((Exception) new C1867c(this.f6072a));
            return;
        }
        this.f6074c.mo14998a(this.f6073b);
    }

    /* renamed from: b */
    public final Set<C1973ya<?>> mo7323b() {
        return this.f6072a.keySet();
    }
}
