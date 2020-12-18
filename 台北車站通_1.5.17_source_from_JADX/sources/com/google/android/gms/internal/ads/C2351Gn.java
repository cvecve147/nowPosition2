package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Gn */
final class C2351Gn<E> extends C2979bm<E> {

    /* renamed from: b */
    private static final C2351Gn<Object> f7085b;

    /* renamed from: c */
    private final List<E> f7086c;

    static {
        C2351Gn<Object> gn = new C2351Gn<>();
        f7085b = gn;
        gn.mo8903k();
    }

    C2351Gn() {
        this(new ArrayList(10));
    }

    private C2351Gn(List<E> list) {
        this.f7086c = list;
    }

    /* renamed from: b */
    public static <E> C2351Gn<E> m9993b() {
        return f7085b;
    }

    /* renamed from: a */
    public final /* synthetic */ C2728Tm mo8232a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f7086c);
            return new C2351Gn(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        mo9247a();
        this.f7086c.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f7086c.get(i);
    }

    public final E remove(int i) {
        mo9247a();
        E remove = this.f7086c.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo9247a();
        E e2 = this.f7086c.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f7086c.size();
    }
}
