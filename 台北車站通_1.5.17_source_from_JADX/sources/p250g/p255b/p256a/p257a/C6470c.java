package p250g.p255b.p256a.p257a;

import java.io.Serializable;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6549e;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.C6580p;
import p250g.p255b.p256a.p258b.C6491q;

/* renamed from: g.b.a.a.c */
public abstract class C6470c extends C6468a implements C6580p, Serializable {

    /* renamed from: a */
    private volatile long f17903a;

    /* renamed from: b */
    private volatile C6467a f17904b;

    public C6470c() {
        this(C6549e.m25007a(), (C6467a) C6491q.m24461N());
    }

    public C6470c(long j, C6467a aVar) {
        this.f17904b = mo16687a(aVar);
        mo16686a(j, this.f17904b);
        this.f17903a = j;
        m24195h();
    }

    public C6470c(long j, C6567g gVar) {
        this(j, (C6467a) C6491q.m24463b(gVar));
    }

    /* renamed from: h */
    private void m24195h() {
        if (this.f17903a == Long.MIN_VALUE || this.f17903a == Long.MAX_VALUE) {
            this.f17904b = this.f17904b.mo16646G();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo16686a(long j, C6467a aVar) {
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6467a mo16687a(C6467a aVar) {
        return C6549e.m25008a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16688a(long j) {
        mo16686a(j, this.f17904b);
        this.f17903a = j;
    }

    /* renamed from: e */
    public long mo16689e() {
        return this.f17903a;
    }

    public C6467a getChronology() {
        return this.f17904b;
    }
}
