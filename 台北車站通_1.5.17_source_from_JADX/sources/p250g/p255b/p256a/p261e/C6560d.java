package p250g.p255b.p256a.p261e;

import p250g.p255b.p256a.C6567g;

/* renamed from: g.b.a.e.d */
public final class C6560d extends C6567g {

    /* renamed from: f */
    private final String f18266f;

    /* renamed from: g */
    private final int f18267g;

    /* renamed from: h */
    private final int f18268h;

    public C6560d(String str, String str2, int i, int i2) {
        super(str);
        this.f18266f = str2;
        this.f18267g = i;
        this.f18268h = i2;
    }

    /* renamed from: b */
    public String mo16932b(long j) {
        return this.f18266f;
    }

    /* renamed from: c */
    public int mo16933c(long j) {
        return this.f18267g;
    }

    /* renamed from: d */
    public int mo16957d(long j) {
        return this.f18267g;
    }

    /* renamed from: e */
    public int mo16934e(long j) {
        return this.f18268h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6560d)) {
            return false;
        }
        C6560d dVar = (C6560d) obj;
        return mo16968c().equals(dVar.mo16968c()) && this.f18268h == dVar.f18268h && this.f18267g == dVar.f18267g;
    }

    /* renamed from: f */
    public boolean mo16936f() {
        return true;
    }

    /* renamed from: g */
    public long mo16937g(long j) {
        return j;
    }

    /* renamed from: h */
    public long mo16938h(long j) {
        return j;
    }

    public int hashCode() {
        return mo16968c().hashCode() + (this.f18268h * 37) + (this.f18267g * 31);
    }
}
