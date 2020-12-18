package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;

/* renamed from: g.b.a.c.k */
public class C6509k extends C6510l {

    /* renamed from: d */
    private final int f18062d;

    /* renamed from: e */
    private final C6570h f18063e;

    public C6509k(C6517d dVar, C6570h hVar, C6570h hVar2) {
        super(dVar, hVar);
        if (hVar2.mo16788c()) {
            this.f18062d = (int) (hVar2.mo16787b() / mo16822i());
            if (this.f18062d >= 2) {
                this.f18063e = hVar2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        return j >= 0 ? (int) ((j / mo16822i()) % ((long) this.f18062d)) : (this.f18062d - 1) + ((int) (((j + 1) / mo16822i()) % ((long) this.f18062d)));
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, i, mo16743d(), mo16742c());
        return j + (((long) (i - mo16740a(j))) * this.f18064b);
    }

    /* renamed from: c */
    public int mo16742c() {
        return this.f18062d - 1;
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        return this.f18063e;
    }
}
