package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.go */
public final class C3124go extends AbstractList<String> implements C3038dn, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3038dn f9383a;

    public C3124go(C3038dn dnVar) {
        this.f9383a = dnVar;
    }

    /* renamed from: a */
    public final void mo9277a(C3150hm hmVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final Object mo9279b(int i) {
        return this.f9383a.mo9279b(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f9383a.get(i);
    }

    public final Iterator<String> iterator() {
        return new C3180io(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C3152ho(this, i);
    }

    /* renamed from: m */
    public final List<?> mo9281m() {
        return this.f9383a.mo9281m();
    }

    /* renamed from: n */
    public final C3038dn mo9282n() {
        return this;
    }

    public final int size() {
        return this.f9383a.size();
    }
}
