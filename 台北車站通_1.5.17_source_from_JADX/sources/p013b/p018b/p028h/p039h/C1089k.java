package p013b.p018b.p028h.p039h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: b.b.h.h.k */
abstract class C1089k<K, V> {

    /* renamed from: a */
    C1089k<K, V>.b f4063a;

    /* renamed from: b */
    C1089k<K, V>.c f4064b;

    /* renamed from: c */
    C1089k<K, V>.e f4065c;

    /* renamed from: b.b.h.h.k$a */
    final class C1090a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f4066a;

        /* renamed from: b */
        int f4067b;

        /* renamed from: c */
        int f4068c;

        /* renamed from: d */
        boolean f4069d = false;

        C1090a(int i) {
            this.f4066a = i;
            this.f4067b = C1089k.this.mo5112c();
        }

        public boolean hasNext() {
            return this.f4068c < this.f4067b;
        }

        public T next() {
            if (hasNext()) {
                T a = C1089k.this.mo5105a(this.f4068c, this.f4066a);
                this.f4068c++;
                this.f4069d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f4069d) {
                this.f4068c--;
                this.f4067b--;
                this.f4069d = false;
                C1089k.this.mo5108a(this.f4068c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b.b.h.h.k$b */
    final class C1091b implements Set<Map.Entry<K, V>> {
        C1091b() {
        }

        /* renamed from: a */
        public boolean mo5171a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo5171a((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int c = C1089k.this.mo5112c();
            for (Map.Entry entry : collection) {
                C1089k.this.mo5109a(entry.getKey(), entry.getValue());
            }
            return c != C1089k.this.mo5112c();
        }

        public void clear() {
            C1089k.this.mo5107a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C1089k.this.mo5104a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C1084f.m5636a(C1089k.this.mo5105a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C1089k.m5660a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C1089k.this.mo5112c() - 1; c >= 0; c--) {
                Object a = C1089k.this.mo5105a(c, 0);
                Object a2 = C1089k.this.mo5105a(c, 1);
                i += (a == null ? 0 : a.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C1089k.this.mo5112c() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C1093d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C1089k.this.mo5112c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b.b.h.h.k$c */
    final class C1092c implements Set<K> {
        C1092c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1089k.this.mo5107a();
        }

        public boolean contains(Object obj) {
            return C1089k.this.mo5104a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C1089k.m5659a(C1089k.this.mo5111b(), collection);
        }

        public boolean equals(Object obj) {
            return C1089k.m5660a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C1089k.this.mo5112c() - 1; c >= 0; c--) {
                Object a = C1089k.this.mo5105a(c, 0);
                i += a == null ? 0 : a.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C1089k.this.mo5112c() == 0;
        }

        public Iterator<K> iterator() {
            return new C1090a(0);
        }

        public boolean remove(Object obj) {
            int a = C1089k.this.mo5104a(obj);
            if (a < 0) {
                return false;
            }
            C1089k.this.mo5108a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C1089k.m5661b(C1089k.this.mo5111b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C1089k.m5662c(C1089k.this.mo5111b(), collection);
        }

        public int size() {
            return C1089k.this.mo5112c();
        }

        public Object[] toArray() {
            return C1089k.this.mo5164b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1089k.this.mo5163a(tArr, 0);
        }
    }

    /* renamed from: b.b.h.h.k$d */
    final class C1093d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f4073a;

        /* renamed from: b */
        int f4074b;

        /* renamed from: c */
        boolean f4075c = false;

        C1093d() {
            this.f4073a = C1089k.this.mo5112c() - 1;
            this.f4074b = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f4075c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C1084f.m5636a(entry.getKey(), C1089k.this.mo5105a(this.f4074b, 0)) && C1084f.m5636a(entry.getValue(), C1089k.this.mo5105a(this.f4074b, 1));
            }
        }

        public K getKey() {
            if (this.f4075c) {
                return C1089k.this.mo5105a(this.f4074b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f4075c) {
                return C1089k.this.mo5105a(this.f4074b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f4074b < this.f4073a;
        }

        public int hashCode() {
            if (this.f4075c) {
                int i = 0;
                Object a = C1089k.this.mo5105a(this.f4074b, 0);
                Object a2 = C1089k.this.mo5105a(this.f4074b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f4074b++;
                this.f4075c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f4075c) {
                C1089k.this.mo5108a(this.f4074b);
                this.f4074b--;
                this.f4073a--;
                this.f4075c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f4075c) {
                return C1089k.this.mo5106a(this.f4074b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: b.b.h.h.k$e */
    final class C1094e implements Collection<V> {
        C1094e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C1089k.this.mo5107a();
        }

        public boolean contains(Object obj) {
            return C1089k.this.mo5110b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C1089k.this.mo5112c() == 0;
        }

        public Iterator<V> iterator() {
            return new C1090a(1);
        }

        public boolean remove(Object obj) {
            int b = C1089k.this.mo5110b(obj);
            if (b < 0) {
                return false;
            }
            C1089k.this.mo5108a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C1089k.this.mo5112c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C1089k.this.mo5105a(i, 1))) {
                    C1089k.this.mo5108a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C1089k.this.mo5112c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C1089k.this.mo5105a(i, 1))) {
                    C1089k.this.mo5108a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C1089k.this.mo5112c();
        }

        public Object[] toArray() {
            return C1089k.this.mo5164b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C1089k.this.mo5163a(tArr, 1);
        }
    }

    C1089k() {
    }

    /* renamed from: a */
    public static <K, V> boolean m5659a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m5660a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m5661b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m5662c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo5104a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo5105a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo5106a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5107a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5108a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5109a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo5163a(T[] tArr, int i) {
        int c = mo5112c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo5105a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo5110b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo5111b();

    /* renamed from: b */
    public Object[] mo5164b(int i) {
        int c = mo5112c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo5105a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo5112c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo5165d() {
        if (this.f4063a == null) {
            this.f4063a = new C1091b();
        }
        return this.f4063a;
    }

    /* renamed from: e */
    public Set<K> mo5166e() {
        if (this.f4064b == null) {
            this.f4064b = new C1092c();
        }
        return this.f4064b;
    }

    /* renamed from: f */
    public Collection<V> mo5167f() {
        if (this.f4065c == null) {
            this.f4065c = new C1094e();
        }
        return this.f4065c;
    }
}
