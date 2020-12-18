package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.On */
class C2583On<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f8061a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C2785Vn> f8062b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f8063c;

    /* renamed from: d */
    private boolean f8064d;

    /* renamed from: e */
    private volatile C2840Xn f8065e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f8066f;

    /* renamed from: g */
    private volatile C2672Rn f8067g;

    private C2583On(int i) {
        this.f8061a = i;
        this.f8062b = Collections.emptyList();
        this.f8063c = Collections.emptyMap();
        this.f8066f = Collections.emptyMap();
    }

    /* synthetic */ C2583On(int i, C2614Pn pn) {
        this(i);
    }

    /* renamed from: a */
    private final int m10823a(K k) {
        int size = this.f8062b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f8062b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f8062b.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    static <FieldDescriptorType extends C2406Im<FieldDescriptorType>> C2583On<FieldDescriptorType, Object> m10824a(int i) {
        return new C2614Pn(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m10828c(int i) {
        m10831f();
        V value = this.f8062b.remove(i).getValue();
        if (!this.f8063c.isEmpty()) {
            Iterator it = m10832g().entrySet().iterator();
            this.f8062b.add(new C2785Vn(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m10831f() {
        if (this.f8064d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m10832g() {
        m10831f();
        if (this.f8063c.isEmpty() && !(this.f8063c instanceof TreeMap)) {
            this.f8063c = new TreeMap();
            this.f8066f = ((TreeMap) this.f8063c).descendingMap();
        }
        return (SortedMap) this.f8063c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m10831f();
        int a = m10823a(k);
        if (a >= 0) {
            return this.f8062b.get(a).setValue(v);
        }
        m10831f();
        if (this.f8062b.isEmpty() && !(this.f8062b instanceof ArrayList)) {
            this.f8062b = new ArrayList(this.f8061a);
        }
        int i = -(a + 1);
        if (i >= this.f8061a) {
            return m10832g().put(k, v);
        }
        int size = this.f8062b.size();
        int i2 = this.f8061a;
        if (size == i2) {
            C2785Vn remove = this.f8062b.remove(i2 - 1);
            m10832g().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f8062b.add(i, new C2785Vn(this, k, v));
        return null;
    }

    /* renamed from: a */
    public final boolean mo8631a() {
        return this.f8064d;
    }

    /* renamed from: b */
    public final Map.Entry<K, V> mo8632b(int i) {
        return this.f8062b.get(i);
    }

    /* renamed from: b */
    public void mo8633b() {
        if (!this.f8064d) {
            this.f8063c = this.f8063c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8063c);
            this.f8066f = this.f8066f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8066f);
            this.f8064d = true;
        }
    }

    /* renamed from: c */
    public final int mo8634c() {
        return this.f8062b.size();
    }

    public void clear() {
        m10831f();
        if (!this.f8062b.isEmpty()) {
            this.f8062b.clear();
        }
        if (!this.f8063c.isEmpty()) {
            this.f8063c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m10823a(comparable) >= 0 || this.f8063c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Map.Entry<K, V>> mo8637d() {
        return this.f8063c.isEmpty() ? C2699Sn.m11169a() : this.f8063c.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Set<Map.Entry<K, V>> mo8638e() {
        if (this.f8067g == null) {
            this.f8067g = new C2672Rn(this, (C2614Pn) null);
        }
        return this.f8067g;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f8065e == null) {
            this.f8065e = new C2840Xn(this, (C2614Pn) null);
        }
        return this.f8065e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2583On)) {
            return super.equals(obj);
        }
        C2583On on = (C2583On) obj;
        int size = size();
        if (size != on.size()) {
            return false;
        }
        int c = mo8634c();
        if (c != on.mo8634c()) {
            return entrySet().equals(on.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo8632b(i).equals(on.mo8632b(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f8063c.equals(on.f8063c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m10823a(comparable);
        return a >= 0 ? this.f8062b.get(a).getValue() : this.f8063c.get(comparable);
    }

    public int hashCode() {
        int c = mo8634c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f8062b.get(i2).hashCode();
        }
        return this.f8063c.size() > 0 ? i + this.f8063c.hashCode() : i;
    }

    public V remove(Object obj) {
        m10831f();
        Comparable comparable = (Comparable) obj;
        int a = m10823a(comparable);
        if (a >= 0) {
            return m10828c(a);
        }
        if (this.f8063c.isEmpty()) {
            return null;
        }
        return this.f8063c.remove(comparable);
    }

    public int size() {
        return this.f8062b.size() + this.f8063c.size();
    }
}
