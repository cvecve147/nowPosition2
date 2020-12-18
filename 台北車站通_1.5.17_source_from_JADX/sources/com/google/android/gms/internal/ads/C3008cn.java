package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.cn */
public final class C3008cn extends C2979bm<String> implements C3038dn, RandomAccess {

    /* renamed from: b */
    private static final C3008cn f8999b;

    /* renamed from: c */
    private static final C3038dn f9000c = f8999b;

    /* renamed from: d */
    private final List<Object> f9001d;

    static {
        C3008cn cnVar = new C3008cn();
        f8999b = cnVar;
        cnVar.mo8903k();
    }

    public C3008cn() {
        this(10);
    }

    public C3008cn(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private C3008cn(ArrayList<Object> arrayList) {
        this.f9001d = arrayList;
    }

    /* renamed from: a */
    private static String m12092a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C3150hm ? ((C3150hm) obj).mo9506b() : C2641Qm.m10992c((byte[]) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C2728Tm mo8232a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f9001d);
            return new C3008cn((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo9277a(C3150hm hmVar) {
        mo9247a();
        this.f9001d.add(hmVar);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        mo9247a();
        this.f9001d.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo9247a();
        if (collection instanceof C3038dn) {
            collection = ((C3038dn) collection).mo9281m();
        }
        boolean addAll = this.f9001d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final Object mo9279b(int i) {
        return this.f9001d.get(i);
    }

    public final void clear() {
        mo9247a();
        this.f9001d.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f9001d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C3150hm) {
            C3150hm hmVar = (C3150hm) obj;
            String b = hmVar.mo9506b();
            if (hmVar.mo9508c()) {
                this.f9001d.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        String c = C2641Qm.m10992c(bArr);
        if (C2641Qm.m10991b(bArr)) {
            this.f9001d.set(i, c);
        }
        return c;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ boolean mo8904l() {
        return super.mo8904l();
    }

    /* renamed from: m */
    public final List<?> mo9281m() {
        return Collections.unmodifiableList(this.f9001d);
    }

    /* renamed from: n */
    public final C3038dn mo9282n() {
        return mo8904l() ? new C3124go(this) : this;
    }

    public final /* synthetic */ Object remove(int i) {
        mo9247a();
        Object remove = this.f9001d.remove(i);
        this.modCount++;
        return m12092a(remove);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        mo9247a();
        return m12092a(this.f9001d.set(i, (String) obj));
    }

    public final int size() {
        return this.f9001d.size();
    }
}
