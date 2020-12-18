package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6497c;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6570h;

/* renamed from: g.b.a.c.d */
public abstract class C6501d extends C6499b {

    /* renamed from: b */
    private final C6497c f18048b;

    protected C6501d(C6497c cVar, C6517d dVar) {
        super(dVar);
        if (cVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (cVar.mo16793h()) {
            this.f18048b = cVar;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    /* renamed from: a */
    public int mo16740a(long j) {
        return this.f18048b.mo16740a(j);
    }

    /* renamed from: a */
    public C6570h mo16757a() {
        return this.f18048b.mo16757a();
    }

    /* renamed from: b */
    public long mo16749b(long j, int i) {
        return this.f18048b.mo16749b(j, i);
    }

    /* renamed from: f */
    public C6570h mo16745f() {
        return this.f18048b.mo16745f();
    }

    /* renamed from: i */
    public final C6497c mo16815i() {
        return this.f18048b;
    }
}
