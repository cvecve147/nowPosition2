package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C2059x;

/* renamed from: com.google.android.gms.internal.ads.Oe */
public final class C2569Oe {

    /* renamed from: a */
    public final String f8031a;

    /* renamed from: b */
    private final double f8032b;

    /* renamed from: c */
    private final double f8033c;

    /* renamed from: d */
    public final double f8034d;

    /* renamed from: e */
    public final int f8035e;

    public C2569Oe(String str, double d, double d2, double d3, int i) {
        this.f8031a = str;
        this.f8033c = d;
        this.f8032b = d2;
        this.f8034d = d3;
        this.f8035e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2569Oe)) {
            return false;
        }
        C2569Oe oe = (C2569Oe) obj;
        return C2059x.m9064a(this.f8031a, oe.f8031a) && this.f8032b == oe.f8032b && this.f8033c == oe.f8033c && this.f8035e == oe.f8035e && Double.compare(this.f8034d, oe.f8034d) == 0;
    }

    public final int hashCode() {
        return C2059x.m9062a(this.f8031a, Double.valueOf(this.f8032b), Double.valueOf(this.f8033c), Double.valueOf(this.f8034d), Integer.valueOf(this.f8035e));
    }

    public final String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("name", this.f8031a);
        a.mo7711a("minBound", Double.valueOf(this.f8033c));
        a.mo7711a("maxBound", Double.valueOf(this.f8032b));
        a.mo7711a("percent", Double.valueOf(this.f8034d));
        a.mo7711a("count", Integer.valueOf(this.f8035e));
        return a.toString();
    }
}
