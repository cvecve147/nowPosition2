package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xn */
class C2840Xn extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C2583On f8624a;

    private C2840Xn(C2583On on) {
        this.f8624a = on;
    }

    /* synthetic */ C2840Xn(C2583On on, C2614Pn pn) {
        this(on);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f8624a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f8624a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f8624a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C2812Wn(this.f8624a, (C2614Pn) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f8624a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f8624a.size();
    }
}
