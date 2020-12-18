package p101d.p187h.p188a.p189a.p190a;

import java.lang.reflect.Type;
import p208e.p221b.C6213a;
import p208e.p221b.C6433l;
import p208e.p221b.C6439r;
import p263h.C6596b;
import p263h.C6616c;

/* renamed from: d.h.a.a.a.f */
final class C5929f implements C6616c<Object> {

    /* renamed from: a */
    private final Type f16386a;

    /* renamed from: b */
    private final C6439r f16387b;

    /* renamed from: c */
    private final boolean f16388c;

    /* renamed from: d */
    private final boolean f16389d;

    /* renamed from: e */
    private final boolean f16390e;

    /* renamed from: f */
    private final boolean f16391f;

    /* renamed from: g */
    private final boolean f16392g;

    /* renamed from: h */
    private final boolean f16393h;

    C5929f(Type type, C6439r rVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f16386a = type;
        this.f16387b = rVar;
        this.f16388c = z;
        this.f16389d = z2;
        this.f16390e = z3;
        this.f16391f = z4;
        this.f16392g = z5;
        this.f16393h = z6;
    }

    /* renamed from: a */
    public <R> Object mo15711a(C6596b<R> bVar) {
        C5923b bVar2 = new C5923b(bVar);
        C6433l eVar = this.f16388c ? new C5927e(bVar2) : this.f16389d ? new C5921a(bVar2) : bVar2;
        C6439r rVar = this.f16387b;
        if (rVar != null) {
            eVar = eVar.mo16545b(rVar);
        }
        return this.f16390e ? eVar.mo16528a(C6213a.LATEST) : this.f16391f ? eVar.mo16548f() : this.f16392g ? eVar.mo16547e() : this.f16393h ? eVar.mo16546d() : eVar;
    }

    /* renamed from: a */
    public Type mo15712a() {
        return this.f16386a;
    }
}
