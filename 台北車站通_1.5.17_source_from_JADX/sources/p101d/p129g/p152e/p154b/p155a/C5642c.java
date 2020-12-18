package p101d.p129g.p152e.p154b.p155a;

import java.lang.reflect.Type;
import java.util.Collection;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p154b.C5680b;
import p101d.p129g.p152e.p154b.C5698q;
import p101d.p129g.p152e.p154b.C5711z;
import p101d.p129g.p152e.p157c.C5713a;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.c */
public final class C5642c implements C5594J {

    /* renamed from: a */
    private final C5698q f15606a;

    /* renamed from: d.g.e.b.a.c$a */
    private static final class C5643a<E> extends C5593I<Collection<E>> {

        /* renamed from: a */
        private final C5593I<E> f15607a;

        /* renamed from: b */
        private final C5711z<? extends Collection<E>> f15608b;

        public C5643a(C5731p pVar, Type type, C5593I<E> i, C5711z<? extends Collection<E>> zVar) {
            this.f15607a = new C5676w(pVar, i, type);
            this.f15608b = zVar;
        }

        /* renamed from: a */
        public Collection<E> m21360a(C5716b bVar) {
            if (bVar.mo15165p() == C5717c.NULL) {
                bVar.mo15163n();
                return null;
            }
            Collection<E> collection = (Collection) this.f15608b.mo15214a();
            bVar.mo15151a();
            while (bVar.mo15157g()) {
                collection.add(this.f15607a.mo15096a(bVar));
            }
            bVar.mo15154d();
            return collection;
        }

        /* renamed from: a */
        public void mo15097a(C5718d dVar, Collection<E> collection) {
            if (collection == null) {
                dVar.mo15186h();
                return;
            }
            dVar.mo15174a();
            for (E a : collection) {
                this.f15607a.mo15097a(dVar, a);
            }
            dVar.mo15180c();
        }
    }

    public C5642c(C5698q qVar) {
        this.f15606a = qVar;
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        Type b = aVar.mo15268b();
        Class<? super T> a = aVar.mo15267a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type a2 = C5680b.m21499a(b, (Class<?>) a);
        return new C5643a(pVar, a2, pVar.mo15288a(C5713a.m21562a(a2)), this.f15606a.mo15215a(aVar));
    }
}
