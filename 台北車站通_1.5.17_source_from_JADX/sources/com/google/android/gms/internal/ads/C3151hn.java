package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hn */
final class C3151hn extends C3066en {
    private C3151hn() {
        super();
    }

    /* renamed from: c */
    private static <E> C2728Tm<E> m12553c(Object obj, long j) {
        return (C2728Tm) C3210jo.m12757f(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo9395a(Object obj, long j) {
        C2728Tm c = m12553c(obj, j);
        if (c.mo8904l()) {
            return c;
        }
        int size = c.size();
        C2728Tm a = c.mo8232a(size == 0 ? 10 : size << 1);
        C3210jo.m12735a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo9396a(Object obj, Object obj2, long j) {
        C2728Tm c = m12553c(obj, j);
        C2728Tm c2 = m12553c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo8904l()) {
                c = c.mo8232a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C3210jo.m12735a(obj, j, (Object) c2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9397b(Object obj, long j) {
        m12553c(obj, j).mo8903k();
    }
}
