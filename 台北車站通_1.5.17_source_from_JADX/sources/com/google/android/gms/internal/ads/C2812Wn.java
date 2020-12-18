package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Wn */
final class C2812Wn implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private int f8554a;

    /* renamed from: b */
    private boolean f8555b;

    /* renamed from: c */
    private Iterator<Map.Entry<K, V>> f8556c;

    /* renamed from: d */
    private final /* synthetic */ C2583On f8557d;

    private C2812Wn(C2583On on) {
        this.f8557d = on;
        this.f8554a = -1;
    }

    /* synthetic */ C2812Wn(C2583On on, C2614Pn pn) {
        this(on);
    }

    /* renamed from: a */
    private final Iterator<Map.Entry<K, V>> m11505a() {
        if (this.f8556c == null) {
            this.f8556c = this.f8557d.f8063c.entrySet().iterator();
        }
        return this.f8556c;
    }

    public final boolean hasNext() {
        return this.f8554a + 1 < this.f8557d.f8062b.size() || (!this.f8557d.f8063c.isEmpty() && m11505a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f8555b = true;
        int i = this.f8554a + 1;
        this.f8554a = i;
        return (Map.Entry) (i < this.f8557d.f8062b.size() ? this.f8557d.f8062b.get(this.f8554a) : m11505a().next());
    }

    public final void remove() {
        if (this.f8555b) {
            this.f8555b = false;
            this.f8557d.m10831f();
            if (this.f8554a < this.f8557d.f8062b.size()) {
                C2583On on = this.f8557d;
                int i = this.f8554a;
                this.f8554a = i - 1;
                Object unused = on.m10828c(i);
                return;
            }
            m11505a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
