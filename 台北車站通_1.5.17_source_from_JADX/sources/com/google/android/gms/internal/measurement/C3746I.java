package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.I */
final class C3746I implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f11142a = this.f11143b.f11780a.keySet().iterator();

    /* renamed from: b */
    private final /* synthetic */ zzer f11143b;

    C3746I(zzer zzer) {
        this.f11143b = zzer;
    }

    public final boolean hasNext() {
        return this.f11142a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f11142a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
