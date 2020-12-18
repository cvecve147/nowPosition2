package p250g.p255b.p256a.p258b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import p250g.p255b.p256a.C6467a;
import p250g.p255b.p256a.C6517d;
import p250g.p255b.p256a.C6567g;
import p250g.p255b.p256a.p258b.C6472a;
import p250g.p255b.p256a.p259c.C6503f;
import p250g.p255b.p256a.p259c.C6512n;

/* renamed from: g.b.a.b.q */
public final class C6491q extends C6472a {

    /* renamed from: M */
    private static final C6491q f18033M = new C6491q(C6490p.m24447Z());

    /* renamed from: N */
    private static final ConcurrentHashMap<C6567g, C6491q> f18034N = new ConcurrentHashMap<>();

    /* renamed from: g.b.a.b.q$a */
    private static final class C6492a implements Serializable {

        /* renamed from: a */
        private transient C6567g f18035a;

        C6492a(C6567g gVar) {
            this.f18035a = gVar;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.f18035a = (C6567g) objectInputStream.readObject();
        }

        private Object readResolve() {
            return C6491q.m24463b(this.f18035a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.f18035a);
        }
    }

    static {
        f18034N.put(C6567g.f18277a, f18033M);
    }

    private C6491q(C6467a aVar) {
        super(aVar, (Object) null);
    }

    /* renamed from: N */
    public static C6491q m24461N() {
        return m24463b(C6567g.m25096b());
    }

    /* renamed from: O */
    public static C6491q m24462O() {
        return f18033M;
    }

    /* renamed from: b */
    public static C6491q m24463b(C6567g gVar) {
        if (gVar == null) {
            gVar = C6567g.m25096b();
        }
        C6491q qVar = f18034N.get(gVar);
        if (qVar != null) {
            return qVar;
        }
        C6491q qVar2 = new C6491q(C6494s.m24476a((C6467a) f18033M, gVar));
        C6491q putIfAbsent = f18034N.putIfAbsent(gVar, qVar2);
        return putIfAbsent != null ? putIfAbsent : qVar2;
    }

    private Object writeReplace() {
        return new C6492a(mo16662k());
    }

    /* renamed from: G */
    public C6467a mo16646G() {
        return f18033M;
    }

    /* renamed from: a */
    public C6467a mo16651a(C6567g gVar) {
        if (gVar == null) {
            gVar = C6567g.m25096b();
        }
        return gVar == mo16662k() ? this : m24463b(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16695a(C6472a.C6473a aVar) {
        if (mo16693L().mo16662k() == C6567g.f18277a) {
            aVar.f17950H = new C6503f(C6493r.f18036c, C6517d.m24742x(), 100);
            aVar.f17962k = aVar.f17950H.mo16757a();
            aVar.f17949G = new C6512n((C6503f) aVar.f17950H, C6517d.m24717U());
            aVar.f17945C = new C6512n((C6503f) aVar.f17950H, aVar.f17959h, C6517d.m24715S());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6491q) {
            return mo16662k().equals(((C6491q) obj).mo16662k());
        }
        return false;
    }

    public int hashCode() {
        return ("ISO".hashCode() * 11) + mo16662k().hashCode();
    }

    public String toString() {
        C6567g k = mo16662k();
        if (k == null) {
            return "ISOChronology";
        }
        return "ISOChronology" + '[' + k.mo16968c() + ']';
    }
}
