package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.im */
final class C3178im implements Iterator {

    /* renamed from: a */
    private int f9496a = 0;

    /* renamed from: b */
    private final int f9497b = this.f9498c.size();

    /* renamed from: c */
    private final /* synthetic */ C3150hm f9498c;

    C3178im(C3150hm hmVar) {
        this.f9498c = hmVar;
    }

    /* renamed from: a */
    private final byte m12632a() {
        try {
            C3150hm hmVar = this.f9498c;
            int i = this.f9496a;
            this.f9496a = i + 1;
            return hmVar.mo9507c(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f9496a < this.f9497b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m12632a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
