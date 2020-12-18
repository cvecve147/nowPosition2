package p101d.p129g.p152e.p154b.p155a;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p101d.p129g.p152e.C5585A;
import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.C5737u;
import p101d.p129g.p152e.p154b.C5603B;
import p101d.p129g.p152e.p154b.C5680b;
import p101d.p129g.p152e.p154b.C5698q;
import p101d.p129g.p152e.p154b.C5701t;
import p101d.p129g.p152e.p154b.C5711z;
import p101d.p129g.p152e.p157c.C5713a;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.k */
public final class C5660k implements C5594J {

    /* renamed from: a */
    private final C5698q f15678a;

    /* renamed from: b */
    final boolean f15679b;

    /* renamed from: d.g.e.b.a.k$a */
    private final class C5661a<K, V> extends C5593I<Map<K, V>> {

        /* renamed from: a */
        private final C5593I<K> f15680a;

        /* renamed from: b */
        private final C5593I<V> f15681b;

        /* renamed from: c */
        private final C5711z<? extends Map<K, V>> f15682c;

        public C5661a(C5731p pVar, Type type, C5593I<K> i, Type type2, C5593I<V> i2, C5711z<? extends Map<K, V>> zVar) {
            this.f15680a = new C5676w(pVar, i, type);
            this.f15681b = new C5676w(pVar, i2, type2);
            this.f15682c = zVar;
        }

        /* renamed from: a */
        private String m21444a(C5737u uVar) {
            if (uVar.mo15316h()) {
                C5585A c = uVar.mo15312c();
                if (c.mo15093t()) {
                    return String.valueOf(c.mo15091r());
                }
                if (c.mo15092s()) {
                    return Boolean.toString(c.mo15086i());
                }
                if (c.mo15094u()) {
                    return c.mo15083d();
                }
                throw new AssertionError();
            } else if (uVar.mo15314f()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public Map<K, V> m21446a(C5716b bVar) {
            C5717c p = bVar.mo15165p();
            if (p == C5717c.NULL) {
                bVar.mo15163n();
                return null;
            }
            Map<K, V> map = (Map) this.f15682c.mo15214a();
            if (p == C5717c.BEGIN_ARRAY) {
                bVar.mo15151a();
                while (bVar.mo15157g()) {
                    bVar.mo15151a();
                    K a = this.f15680a.mo15096a(bVar);
                    if (map.put(a, this.f15681b.mo15096a(bVar)) == null) {
                        bVar.mo15154d();
                    } else {
                        throw new C5588D("duplicate key: " + a);
                    }
                }
                bVar.mo15154d();
            } else {
                bVar.mo15152b();
                while (bVar.mo15157g()) {
                    C5701t.f15762a.mo15220a(bVar);
                    K a2 = this.f15680a.mo15096a(bVar);
                    if (map.put(a2, this.f15681b.mo15096a(bVar)) != null) {
                        throw new C5588D("duplicate key: " + a2);
                    }
                }
                bVar.mo15155e();
            }
            return map;
        }

        /* renamed from: a */
        public void mo15097a(C5718d dVar, Map<K, V> map) {
            if (map == null) {
                dVar.mo15186h();
            } else if (!C5660k.this.f15679b) {
                dVar.mo15179b();
                for (Map.Entry next : map.entrySet()) {
                    dVar.mo15178a(String.valueOf(next.getKey()));
                    this.f15681b.mo15097a(dVar, next.getValue());
                }
                dVar.mo15183d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C5737u a = this.f15680a.mo15099a(next2.getKey());
                    arrayList.add(a);
                    arrayList2.add(next2.getValue());
                    z |= a.mo15313e() || a.mo15315g();
                }
                if (z) {
                    dVar.mo15174a();
                    while (i < arrayList.size()) {
                        dVar.mo15174a();
                        C5603B.m21256a((C5737u) arrayList.get(i), dVar);
                        this.f15681b.mo15097a(dVar, arrayList2.get(i));
                        dVar.mo15180c();
                        i++;
                    }
                    dVar.mo15180c();
                    return;
                }
                dVar.mo15179b();
                while (i < arrayList.size()) {
                    dVar.mo15178a(m21444a((C5737u) arrayList.get(i)));
                    this.f15681b.mo15097a(dVar, arrayList2.get(i));
                    i++;
                }
                dVar.mo15183d();
            }
        }
    }

    public C5660k(C5698q qVar, boolean z) {
        this.f15678a = qVar;
        this.f15679b = z;
    }

    /* renamed from: a */
    private C5593I<?> m21442a(C5731p pVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C5658ja.f15655f : pVar.mo15288a(C5713a.m21562a(type));
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        Type b = aVar.mo15268b();
        if (!Map.class.isAssignableFrom(aVar.mo15267a())) {
            return null;
        }
        Type[] b2 = C5680b.m21507b(b, C5680b.m21510e(b));
        return new C5661a(pVar, b2[0], m21442a(pVar, b2[0]), b2[1], pVar.mo15288a(C5713a.m21562a(b2[1])), this.f15678a.mo15215a(aVar));
    }
}
