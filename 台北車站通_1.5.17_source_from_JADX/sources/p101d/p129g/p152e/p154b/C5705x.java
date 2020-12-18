package p101d.p129g.p152e.p154b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: d.g.e.b.x */
public final class C5705x<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    private static final Comparator<Comparable> f15765a = new C5703v();

    /* renamed from: b */
    Comparator<? super K> f15766b;

    /* renamed from: c */
    C5709d<K, V> f15767c;

    /* renamed from: d */
    int f15768d;

    /* renamed from: e */
    int f15769e;

    /* renamed from: f */
    final C5709d<K, V> f15770f;

    /* renamed from: g */
    private C5705x<K, V>.a f15771g;

    /* renamed from: h */
    private C5705x<K, V>.b f15772h;

    /* renamed from: d.g.e.b.x$a */
    class C5706a extends AbstractSet<Map.Entry<K, V>> {
        C5706a() {
        }

        public void clear() {
            C5705x.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C5705x.this.mo15233a((Map.Entry<?, ?>) (Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5704w(this);
        }

        public boolean remove(Object obj) {
            C5709d a;
            if (!(obj instanceof Map.Entry) || (a = C5705x.this.mo15233a((Map.Entry<?, ?>) (Map.Entry) obj)) == null) {
                return false;
            }
            C5705x.this.mo15234a(a, true);
            return true;
        }

        public int size() {
            return C5705x.this.f15768d;
        }
    }

    /* renamed from: d.g.e.b.x$b */
    final class C5707b extends AbstractSet<K> {
        C5707b() {
        }

        public void clear() {
            C5705x.this.clear();
        }

        public boolean contains(Object obj) {
            return C5705x.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C5710y(this);
        }

        public boolean remove(Object obj) {
            return C5705x.this.mo15235b(obj) != null;
        }

        public int size() {
            return C5705x.this.f15768d;
        }
    }

    /* renamed from: d.g.e.b.x$c */
    private abstract class C5708c<T> implements Iterator<T> {

        /* renamed from: a */
        C5709d<K, V> f15775a;

        /* renamed from: b */
        C5709d<K, V> f15776b = null;

        /* renamed from: c */
        int f15777c;

        C5708c() {
            C5705x xVar = C5705x.this;
            this.f15775a = xVar.f15770f.f15782d;
            this.f15777c = xVar.f15769e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C5709d<K, V> mo15254a() {
            C5709d<K, V> dVar = this.f15775a;
            C5705x xVar = C5705x.this;
            if (dVar == xVar.f15770f) {
                throw new NoSuchElementException();
            } else if (xVar.f15769e == this.f15777c) {
                this.f15775a = dVar.f15782d;
                this.f15776b = dVar;
                return dVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f15775a != C5705x.this.f15770f;
        }

        public final void remove() {
            C5709d<K, V> dVar = this.f15776b;
            if (dVar != null) {
                C5705x.this.mo15234a(dVar, true);
                this.f15776b = null;
                this.f15777c = C5705x.this.f15769e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: d.g.e.b.x$d */
    static final class C5709d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C5709d<K, V> f15779a;

        /* renamed from: b */
        C5709d<K, V> f15780b;

        /* renamed from: c */
        C5709d<K, V> f15781c;

        /* renamed from: d */
        C5709d<K, V> f15782d;

        /* renamed from: e */
        C5709d<K, V> f15783e;

        /* renamed from: f */
        final K f15784f;

        /* renamed from: g */
        V f15785g;

        /* renamed from: h */
        int f15786h;

        C5709d() {
            this.f15784f = null;
            this.f15783e = this;
            this.f15782d = this;
        }

        C5709d(C5709d<K, V> dVar, K k, C5709d<K, V> dVar2, C5709d<K, V> dVar3) {
            this.f15779a = dVar;
            this.f15784f = k;
            this.f15786h = 1;
            this.f15782d = dVar2;
            this.f15783e = dVar3;
            dVar3.f15782d = this;
            dVar2.f15783e = this;
        }

        /* renamed from: a */
        public C5709d<K, V> mo15257a() {
            C5709d<K, V> dVar = this;
            for (C5709d<K, V> dVar2 = this.f15780b; dVar2 != null; dVar2 = dVar2.f15780b) {
                dVar = dVar2;
            }
            return dVar;
        }

        /* renamed from: b */
        public C5709d<K, V> mo15258b() {
            C5709d<K, V> dVar = this;
            for (C5709d<K, V> dVar2 = this.f15781c; dVar2 != null; dVar2 = dVar2.f15781c) {
                dVar = dVar2;
            }
            return dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f15784f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f15785g
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p154b.C5705x.C5709d.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f15784f;
        }

        public V getValue() {
            return this.f15785g;
        }

        public int hashCode() {
            K k = this.f15784f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f15785g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f15785g;
            this.f15785g = v;
            return v2;
        }

        public String toString() {
            return this.f15784f + "=" + this.f15785g;
        }
    }

    public C5705x() {
        this(f15765a);
    }

    public C5705x(Comparator<? super K> comparator) {
        this.f15768d = 0;
        this.f15769e = 0;
        this.f15770f = new C5709d<>();
        this.f15766b = comparator == null ? f15765a : comparator;
    }

    /* renamed from: a */
    private void m21546a(C5709d<K, V> dVar) {
        C5709d<K, V> dVar2 = dVar.f15780b;
        C5709d<K, V> dVar3 = dVar.f15781c;
        C5709d<K, V> dVar4 = dVar3.f15780b;
        C5709d<K, V> dVar5 = dVar3.f15781c;
        dVar.f15781c = dVar4;
        if (dVar4 != null) {
            dVar4.f15779a = dVar;
        }
        m21547a(dVar, dVar3);
        dVar3.f15780b = dVar;
        dVar.f15779a = dVar3;
        int i = 0;
        dVar.f15786h = Math.max(dVar2 != null ? dVar2.f15786h : 0, dVar4 != null ? dVar4.f15786h : 0) + 1;
        int i2 = dVar.f15786h;
        if (dVar5 != null) {
            i = dVar5.f15786h;
        }
        dVar3.f15786h = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m21547a(C5709d<K, V> dVar, C5709d<K, V> dVar2) {
        C5709d<K, V> dVar3 = dVar.f15779a;
        dVar.f15779a = null;
        if (dVar2 != null) {
            dVar2.f15779a = dVar3;
        }
        if (dVar3 == null) {
            this.f15767c = dVar2;
        } else if (dVar3.f15780b == dVar) {
            dVar3.f15780b = dVar2;
        } else {
            dVar3.f15781c = dVar2;
        }
    }

    /* renamed from: a */
    private boolean m21548a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m21549b(C5709d<K, V> dVar) {
        C5709d<K, V> dVar2 = dVar.f15780b;
        C5709d<K, V> dVar3 = dVar.f15781c;
        C5709d<K, V> dVar4 = dVar2.f15780b;
        C5709d<K, V> dVar5 = dVar2.f15781c;
        dVar.f15780b = dVar5;
        if (dVar5 != null) {
            dVar5.f15779a = dVar;
        }
        m21547a(dVar, dVar2);
        dVar2.f15781c = dVar;
        dVar.f15779a = dVar2;
        int i = 0;
        dVar.f15786h = Math.max(dVar3 != null ? dVar3.f15786h : 0, dVar5 != null ? dVar5.f15786h : 0) + 1;
        int i2 = dVar.f15786h;
        if (dVar4 != null) {
            i = dVar4.f15786h;
        }
        dVar2.f15786h = Math.max(i2, i) + 1;
    }

    /* renamed from: b */
    private void m21550b(C5709d<K, V> dVar, boolean z) {
        while (dVar != null) {
            C5709d<K, V> dVar2 = dVar.f15780b;
            C5709d<K, V> dVar3 = dVar.f15781c;
            int i = 0;
            int i2 = dVar2 != null ? dVar2.f15786h : 0;
            int i3 = dVar3 != null ? dVar3.f15786h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C5709d<K, V> dVar4 = dVar3.f15780b;
                C5709d<K, V> dVar5 = dVar3.f15781c;
                int i5 = dVar5 != null ? dVar5.f15786h : 0;
                if (dVar4 != null) {
                    i = dVar4.f15786h;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    m21549b(dVar3);
                }
                m21546a(dVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C5709d<K, V> dVar6 = dVar2.f15780b;
                C5709d<K, V> dVar7 = dVar2.f15781c;
                int i7 = dVar7 != null ? dVar7.f15786h : 0;
                if (dVar6 != null) {
                    i = dVar6.f15786h;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m21546a(dVar2);
                }
                m21549b(dVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                dVar.f15786h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                dVar.f15786h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            dVar = dVar.f15779a;
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5709d<K, V> mo15231a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo15232a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5709d<K, V> mo15232a(K k, boolean z) {
        int i;
        C5709d<K, V> dVar;
        Comparator<? super K> comparator = this.f15766b;
        C5709d<K, V> dVar2 = this.f15767c;
        if (dVar2 != null) {
            Comparable comparable = comparator == f15765a ? (Comparable) k : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(dVar2.f15784f) : comparator.compare(k, dVar2.f15784f);
                if (i == 0) {
                    return dVar2;
                }
                C5709d<K, V> dVar3 = i < 0 ? dVar2.f15780b : dVar2.f15781c;
                if (dVar3 == null) {
                    break;
                }
                dVar2 = dVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C5709d<K, V> dVar4 = this.f15770f;
        if (dVar2 != null) {
            dVar = new C5709d<>(dVar2, k, dVar4, dVar4.f15783e);
            if (i < 0) {
                dVar2.f15780b = dVar;
            } else {
                dVar2.f15781c = dVar;
            }
            m21550b(dVar2, true);
        } else if (comparator != f15765a || (k instanceof Comparable)) {
            dVar = new C5709d<>(dVar2, k, dVar4, dVar4.f15783e);
            this.f15767c = dVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f15768d++;
        this.f15769e++;
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5709d<K, V> mo15233a(Map.Entry<?, ?> entry) {
        C5709d<K, V> a = mo15231a((Object) entry.getKey());
        if (a != null && m21548a((Object) a.f15785g, (Object) entry.getValue())) {
            return a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15234a(C5709d<K, V> dVar, boolean z) {
        int i;
        if (z) {
            C5709d<K, V> dVar2 = dVar.f15783e;
            dVar2.f15782d = dVar.f15782d;
            dVar.f15782d.f15783e = dVar2;
        }
        C5709d<K, V> dVar3 = dVar.f15780b;
        C5709d<K, V> dVar4 = dVar.f15781c;
        C5709d<K, V> dVar5 = dVar.f15779a;
        int i2 = 0;
        if (dVar3 == null || dVar4 == null) {
            if (dVar3 != null) {
                m21547a(dVar, dVar3);
                dVar.f15780b = null;
            } else if (dVar4 != null) {
                m21547a(dVar, dVar4);
                dVar.f15781c = null;
            } else {
                m21547a(dVar, (C5709d<K, V>) null);
            }
            m21550b(dVar5, false);
            this.f15768d--;
            this.f15769e++;
            return;
        }
        C5709d<K, V> b = dVar3.f15786h > dVar4.f15786h ? dVar3.mo15258b() : dVar4.mo15257a();
        mo15234a(b, false);
        C5709d<K, V> dVar6 = dVar.f15780b;
        if (dVar6 != null) {
            i = dVar6.f15786h;
            b.f15780b = dVar6;
            dVar6.f15779a = b;
            dVar.f15780b = null;
        } else {
            i = 0;
        }
        C5709d<K, V> dVar7 = dVar.f15781c;
        if (dVar7 != null) {
            i2 = dVar7.f15786h;
            b.f15781c = dVar7;
            dVar7.f15779a = b;
            dVar.f15781c = null;
        }
        b.f15786h = Math.max(i, i2) + 1;
        m21547a(dVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5709d<K, V> mo15235b(Object obj) {
        C5709d<K, V> a = mo15231a(obj);
        if (a != null) {
            mo15234a(a, true);
        }
        return a;
    }

    public void clear() {
        this.f15767c = null;
        this.f15768d = 0;
        this.f15769e++;
        C5709d<K, V> dVar = this.f15770f;
        dVar.f15783e = dVar;
        dVar.f15782d = dVar;
    }

    public boolean containsKey(Object obj) {
        return mo15231a(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C5705x<K, V>.a aVar = this.f15771g;
        if (aVar != null) {
            return aVar;
        }
        C5705x<K, V>.a aVar2 = new C5706a();
        this.f15771g = aVar2;
        return aVar2;
    }

    public V get(Object obj) {
        C5709d a = mo15231a(obj);
        if (a != null) {
            return a.f15785g;
        }
        return null;
    }

    public Set<K> keySet() {
        C5705x<K, V>.b bVar = this.f15772h;
        if (bVar != null) {
            return bVar;
        }
        C5705x<K, V>.b bVar2 = new C5707b();
        this.f15772h = bVar2;
        return bVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C5709d a = mo15232a(k, true);
            V v2 = a.f15785g;
            a.f15785g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C5709d b = mo15235b(obj);
        if (b != null) {
            return b.f15785g;
        }
        return null;
    }

    public int size() {
        return this.f15768d;
    }
}
