package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;

/* renamed from: g.b.a.c.h */
public abstract class C6505h extends C6499b {

    /* renamed from: b */
    final long f18055b;

    /* renamed from: c */
    private final C6570h f18056c;

    /* renamed from: g.b.a.c.h$a */
    private final class C6506a extends C6500c {
        C6506a(C6571i iVar) {
            super(iVar);
        }

        /* renamed from: a */
        public long mo16785a(long j, int i) {
            return C6505h.this.mo16747a(j, i);
        }

        /* renamed from: a */
        public long mo16786a(long j, long j2) {
            return C6505h.this.mo16748a(j, j2);
        }

        /* renamed from: b */
        public long mo16787b() {
            return C6505h.this.f18055b;
        }

        /* renamed from: c */
        public boolean mo16788c() {
            return false;
        }
    }

    public C6505h(C6517d dVar, long j) {
        super(dVar);
        this.f18055b = j;
        this.f18056c = new C6506a(dVar.mo16834E());
    }

    /* renamed from: a */
    public abstract long mo16748a(long j, long j2);

    /* renamed from: a */
    public final C6570h mo16757a() {
        return this.f18056c;
    }
}
