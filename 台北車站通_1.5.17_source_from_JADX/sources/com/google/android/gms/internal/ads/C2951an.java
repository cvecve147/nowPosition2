package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.an */
final class C2951an<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Map.Entry<K, Object>> f8915a;

    public C2951an(Iterator<Map.Entry<K, Object>> it) {
        this.f8915a = it;
    }

    public final boolean hasNext() {
        return this.f8915a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f8915a.next();
        return next.getValue() instanceof C2839Xm ? new C2894Zm(next) : next;
    }

    public final void remove() {
        this.f8915a.remove();
    }
}
