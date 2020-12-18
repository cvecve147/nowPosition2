package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;

/* renamed from: g.b.a.c.l */
public abstract class C6510l extends C6499b {

    /* renamed from: b */
    final long f18064b;

    /* renamed from: c */
    private final C6570h f18065c;

    public C6510l(C6517d dVar, C6570h hVar) {
        super(dVar);
        if (hVar.mo16788c()) {
            this.f18064b = hVar.mo16787b();
            if (this.f18064b >= 1) {
                this.f18065c = hVar;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    /* renamed from: a */
    public C6570h mo16757a() {
        return this.f18065c;
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        C6504g.m24589a(this, i, mo16743d(), mo16744d(j, i));
        return j + (((long) (i - mo16740a(j))) * this.f18064b);
    }

    /* renamed from: c */
    public long mo16751c(long j) {
        if (j >= 0) {
            return j % this.f18064b;
        }
        long j2 = this.f18064b;
        return (((j + 1) % j2) + j2) - 1;
    }

    /* renamed from: d */
    public int mo16743d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo16744d(long j, int i) {
        return mo16746i(j);
    }

    /* renamed from: d */
    public long mo16753d(long j) {
        if (j <= 0) {
            return j - (j % this.f18064b);
        }
        long j2 = j - 1;
        long j3 = this.f18064b;
        return (j2 - (j2 % j3)) + j3;
    }

    /* renamed from: e */
    public long mo16752e(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.f18064b;
        } else {
            long j3 = j + 1;
            j2 = this.f18064b;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    /* renamed from: i */
    public final long mo16822i() {
        return this.f18064b;
    }
}
