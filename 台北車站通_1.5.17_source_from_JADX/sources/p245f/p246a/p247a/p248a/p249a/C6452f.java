package p245f.p246a.p247a.p248a.p249a;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: f.a.a.a.a.f */
abstract class C6452f<K, V> {

    /* renamed from: a */
    C6452f<K, V>.b f17868a;

    /* renamed from: f.a.a.a.a.f$a */
    final class C6453a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f17869a;

        /* renamed from: b */
        int f17870b;

        /* renamed from: c */
        int f17871c;

        /* renamed from: d */
        boolean f17872d = false;

        C6453a(int i) {
            this.f17869a = i;
            this.f17870b = C6452f.this.mo16559c();
        }

        public boolean hasNext() {
            return this.f17871c < this.f17870b;
        }

        public T next() {
            T a = C6452f.this.mo16555a(this.f17871c, this.f17869a);
            this.f17871c++;
            this.f17872d = true;
            return a;
        }

        public void remove() {
            if (this.f17872d) {
                this.f17871c--;
                this.f17870b--;
                this.f17872d = false;
                C6452f.this.mo16557a(this.f17871c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: f.a.a.a.a.f$b */
    final class C6454b implements Set<K> {
        C6454b() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C6452f.this.mo16556a();
        }

        public boolean contains(Object obj) {
            return C6452f.this.mo16554a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            C6452f.this.mo16558b();
            throw null;
        }

        public boolean equals(Object obj) {
            return C6452f.m24095a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C6452f.this.mo16559c() - 1; c >= 0; c--) {
                Object a = C6452f.this.mo16555a(c, 0);
                i += a == null ? 0 : a.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C6452f.this.mo16559c() == 0;
        }

        public Iterator<K> iterator() {
            return new C6453a(0);
        }

        public boolean remove(Object obj) {
            int a = C6452f.this.mo16554a(obj);
            if (a < 0) {
                return false;
            }
            C6452f.this.mo16557a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            C6452f.this.mo16558b();
            throw null;
        }

        public boolean retainAll(Collection<?> collection) {
            C6452f.this.mo16558b();
            throw null;
        }

        public int size() {
            return C6452f.this.mo16559c();
        }

        public Object[] toArray() {
            return C6452f.this.mo16606b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C6452f.this.mo16605a(tArr, 0);
        }
    }

    C6452f() {
    }

    /* renamed from: a */
    public static <T> boolean m24095a(Set<T> set, Object obj) {
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo16554a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo16555a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16556a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16557a(int i);

    /* renamed from: a */
    public <T> T[] mo16605a(T[] tArr, int i) {
        int c = mo16559c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo16555a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo16558b();

    /* renamed from: b */
    public Object[] mo16606b(int i) {
        int c = mo16559c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo16555a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo16559c();

    /* renamed from: d */
    public Set<K> mo16607d() {
        if (this.f17868a == null) {
            this.f17868a = new C6454b();
        }
        return this.f17868a;
    }
}
