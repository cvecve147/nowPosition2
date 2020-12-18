package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.io */
final class C3180io implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f9502a = this.f9503b.f9383a.iterator();

    /* renamed from: b */
    private final /* synthetic */ C3124go f9503b;

    C3180io(C3124go goVar) {
        this.f9503b = goVar;
    }

    public final boolean hasNext() {
        return this.f9502a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f9502a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
