package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.bm */
abstract class C2979bm<E> extends AbstractList<E> implements C2728Tm<E> {

    /* renamed from: a */
    private boolean f8951a = true;

    C2979bm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9247a() {
        if (!this.f8951a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo9247a();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo9247a();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo9247a();
        return super.addAll(collection);
    }

    public void clear() {
        mo9247a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final void mo8903k() {
        this.f8951a = false;
    }

    /* renamed from: l */
    public boolean mo8904l() {
        return this.f8951a;
    }

    public boolean remove(Object obj) {
        mo9247a();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo9247a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo9247a();
        return super.retainAll(collection);
    }
}
