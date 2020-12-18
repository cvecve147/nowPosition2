package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qn */
final class C2642Qn implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f8150a;

    /* renamed from: b */
    private Iterator<Map.Entry<K, V>> f8151b;

    /* renamed from: c */
    private final /* synthetic */ C2583On f8152c;

    private C2642Qn(C2583On on) {
        this.f8152c = on;
        this.f8150a = this.f8152c.f8062b.size();
    }

    /* synthetic */ C2642Qn(C2583On on, C2614Pn pn) {
        this(on);
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m10993a() {
        if (this.f8151b == null) {
            this.f8151b = this.f8152c.f8066f.entrySet().iterator();
        }
        return this.f8151b;
    }

    public final boolean hasNext() {
        int i = this.f8150a;
        return (i > 0 && i <= this.f8152c.f8062b.size()) || m10993a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m10993a().hasNext()) {
            obj = m10993a().next();
        } else {
            List b = this.f8152c.f8062b;
            int i = this.f8150a - 1;
            this.f8150a = i;
            obj = b.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
