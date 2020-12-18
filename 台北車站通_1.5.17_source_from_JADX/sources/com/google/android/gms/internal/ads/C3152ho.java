package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.ho */
final class C3152ho implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f9437a = this.f9439c.f9383a.listIterator(this.f9438b);

    /* renamed from: b */
    private final /* synthetic */ int f9438b;

    /* renamed from: c */
    private final /* synthetic */ C3124go f9439c;

    C3152ho(C3124go goVar, int i) {
        this.f9439c = goVar;
        this.f9438b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f9437a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f9437a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f9437a.next();
    }

    public final int nextIndex() {
        return this.f9437a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f9437a.previous();
    }

    public final int previousIndex() {
        return this.f9437a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
