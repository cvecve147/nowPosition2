package p013b.p014a.p015a.p017b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: b.a.a.b.c */
public class C0923c<K, V> implements Iterable<Map.Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0926c<K, V> f3731a;

    /* renamed from: b */
    private C0926c<K, V> f3732b;

    /* renamed from: c */
    private WeakHashMap<C0929f<K, V>, Boolean> f3733c = new WeakHashMap<>();

    /* renamed from: d */
    private int f3734d = 0;

    /* renamed from: b.a.a.b.c$a */
    static class C0924a<K, V> extends C0928e<K, V> {
        C0924a(C0926c<K, V> cVar, C0926c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0926c<K, V> mo4809b(C0926c<K, V> cVar) {
            return cVar.f3738d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0926c<K, V> mo4810c(C0926c<K, V> cVar) {
            return cVar.f3737c;
        }
    }

    /* renamed from: b.a.a.b.c$b */
    private static class C0925b<K, V> extends C0928e<K, V> {
        C0925b(C0926c<K, V> cVar, C0926c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0926c<K, V> mo4809b(C0926c<K, V> cVar) {
            return cVar.f3737c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0926c<K, V> mo4810c(C0926c<K, V> cVar) {
            return cVar.f3738d;
        }
    }

    /* renamed from: b.a.a.b.c$c */
    static class C0926c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f3735a;

        /* renamed from: b */
        final V f3736b;

        /* renamed from: c */
        C0926c<K, V> f3737c;

        /* renamed from: d */
        C0926c<K, V> f3738d;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0926c)) {
                return false;
            }
            C0926c cVar = (C0926c) obj;
            return this.f3735a.equals(cVar.f3735a) && this.f3736b.equals(cVar.f3736b);
        }

        public K getKey() {
            return this.f3735a;
        }

        public V getValue() {
            return this.f3736b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f3735a + "=" + this.f3736b;
        }
    }

    /* renamed from: b.a.a.b.c$d */
    private class C0927d implements Iterator<Map.Entry<K, V>>, C0929f<K, V> {

        /* renamed from: a */
        private C0926c<K, V> f3739a;

        /* renamed from: b */
        private boolean f3740b;

        private C0927d() {
            this.f3740b = true;
        }

        /* renamed from: a */
        public void mo4816a(C0926c<K, V> cVar) {
            C0926c<K, V> cVar2 = this.f3739a;
            if (cVar == cVar2) {
                this.f3739a = cVar2.f3738d;
                this.f3740b = this.f3739a == null;
            }
        }

        public boolean hasNext() {
            if (this.f3740b) {
                return C0923c.this.f3731a != null;
            }
            C0926c<K, V> cVar = this.f3739a;
            return (cVar == null || cVar.f3737c == null) ? false : true;
        }

        public Map.Entry<K, V> next() {
            C0926c<K, V> cVar;
            if (this.f3740b) {
                this.f3740b = false;
                cVar = C0923c.this.f3731a;
            } else {
                C0926c<K, V> cVar2 = this.f3739a;
                cVar = cVar2 != null ? cVar2.f3737c : null;
            }
            this.f3739a = cVar;
            return this.f3739a;
        }
    }

    /* renamed from: b.a.a.b.c$e */
    private static abstract class C0928e<K, V> implements Iterator<Map.Entry<K, V>>, C0929f<K, V> {

        /* renamed from: a */
        C0926c<K, V> f3742a;

        /* renamed from: b */
        C0926c<K, V> f3743b;

        C0928e(C0926c<K, V> cVar, C0926c<K, V> cVar2) {
            this.f3742a = cVar2;
            this.f3743b = cVar;
        }

        /* renamed from: a */
        private C0926c<K, V> m5224a() {
            C0926c<K, V> cVar = this.f3743b;
            C0926c<K, V> cVar2 = this.f3742a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo4810c(cVar);
        }

        /* renamed from: a */
        public void mo4816a(C0926c<K, V> cVar) {
            if (this.f3742a == cVar && cVar == this.f3743b) {
                this.f3743b = null;
                this.f3742a = null;
            }
            C0926c<K, V> cVar2 = this.f3742a;
            if (cVar2 == cVar) {
                this.f3742a = mo4809b(cVar2);
            }
            if (this.f3743b == cVar) {
                this.f3743b = m5224a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C0926c<K, V> mo4809b(C0926c<K, V> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C0926c<K, V> mo4810c(C0926c<K, V> cVar);

        public boolean hasNext() {
            return this.f3743b != null;
        }

        public Map.Entry<K, V> next() {
            C0926c<K, V> cVar = this.f3743b;
            this.f3743b = m5224a();
            return cVar;
        }
    }

    /* renamed from: b.a.a.b.c$f */
    interface C0929f<K, V> {
        /* renamed from: a */
        void mo4816a(C0926c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0926c<K, V> mo4798a(K k) {
        C0926c<K, V> cVar = this.f3731a;
        while (cVar != null && !cVar.f3735a.equals(k)) {
            cVar = cVar.f3737c;
        }
        return cVar;
    }

    /* renamed from: a */
    public Map.Entry<K, V> mo4801a() {
        return this.f3731a;
    }

    /* renamed from: b */
    public C0923c<K, V>.d mo4802b() {
        C0923c<K, V>.d dVar = new C0927d();
        this.f3733c.put(dVar, false);
        return dVar;
    }

    /* renamed from: c */
    public Map.Entry<K, V> mo4803c() {
        return this.f3732b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0925b bVar = new C0925b(this.f3732b, this.f3731a);
        this.f3733c.put(bVar, false);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0923c)) {
            return false;
        }
        C0923c cVar = (C0923c) obj;
        if (size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C0924a aVar = new C0924a(this.f3731a, this.f3732b);
        this.f3733c.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        C0926c a = mo4798a(k);
        if (a == null) {
            return null;
        }
        this.f3734d--;
        if (!this.f3733c.isEmpty()) {
            for (C0929f<K, V> a2 : this.f3733c.keySet()) {
                a2.mo4816a(a);
            }
        }
        C0926c<K, V> cVar = a.f3738d;
        if (cVar != null) {
            cVar.f3737c = a.f3737c;
        } else {
            this.f3731a = a.f3737c;
        }
        C0926c<K, V> cVar2 = a.f3737c;
        if (cVar2 != null) {
            cVar2.f3738d = a.f3738d;
        } else {
            this.f3732b = a.f3738d;
        }
        a.f3737c = null;
        a.f3738d = null;
        return a.f3736b;
    }

    public int size() {
        return this.f3734d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
