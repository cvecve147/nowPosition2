package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5586B;
import p101d.p129g.p152e.C5587C;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.C5735s;
import p101d.p129g.p152e.C5736t;
import p101d.p129g.p152e.C5737u;
import p101d.p129g.p152e.p154b.C5603B;
import p101d.p129g.p152e.p157c.C5713a;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.v */
public final class C5674v<T> extends C5593I<T> {

    /* renamed from: a */
    private final C5587C<T> f15707a;

    /* renamed from: b */
    private final C5736t<T> f15708b;

    /* renamed from: c */
    private final C5731p f15709c;

    /* renamed from: d */
    private final C5713a<T> f15710d;

    /* renamed from: e */
    private final C5594J f15711e;

    /* renamed from: f */
    private final C5674v<T>.a f15712f = new C5675a();

    /* renamed from: g */
    private C5593I<T> f15713g;

    /* renamed from: d.g.e.b.a.v$a */
    private final class C5675a implements C5586B, C5735s {
        private C5675a() {
        }
    }

    public C5674v(C5587C<T> c, C5736t<T> tVar, C5731p pVar, C5713a<T> aVar, C5594J j) {
        this.f15707a = c;
        this.f15708b = tVar;
        this.f15709c = pVar;
        this.f15710d = aVar;
        this.f15711e = j;
    }

    /* renamed from: b */
    private C5593I<T> m21476b() {
        C5593I<T> i = this.f15713g;
        if (i != null) {
            return i;
        }
        C5593I<T> a = this.f15709c.mo15287a(this.f15711e, this.f15710d);
        this.f15713g = a;
        return a;
    }

    /* renamed from: a */
    public T mo15096a(C5716b bVar) {
        if (this.f15708b == null) {
            return m21476b().mo15096a(bVar);
        }
        C5737u a = C5603B.m21254a(bVar);
        if (a.mo15314f()) {
            return null;
        }
        return this.f15708b.mo15309a(a, this.f15710d.mo15268b(), this.f15712f);
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, T t) {
        C5587C<T> c = this.f15707a;
        if (c == null) {
            m21476b().mo15097a(dVar, t);
        } else if (t == null) {
            dVar.mo15186h();
        } else {
            C5603B.m21256a(c.mo15095a(t, this.f15710d.mo15268b(), this.f15712f), dVar);
        }
    }
}
