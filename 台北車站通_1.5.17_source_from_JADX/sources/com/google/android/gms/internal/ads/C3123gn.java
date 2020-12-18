package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gn */
final class C3123gn extends C3066en {

    /* renamed from: c */
    private static final Class<?> f9382c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C3123gn() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.gms.internal.ads.cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.android.gms.internal.ads.cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.gms.internal.ads.cn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m12476a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m12477c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001d
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.C3038dn
            if (r0 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.cn r0 = new com.google.android.gms.internal.ads.cn
            r0.<init>((int) r6)
            goto L_0x0019
        L_0x0014:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0019:
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x004f
        L_0x001d:
            java.lang.Class<?> r1 = f9382c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x003b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0036:
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            r0 = r1
            goto L_0x004f
        L_0x003b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C3124go
            if (r1 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.cn r1 = new com.google.android.gms.internal.ads.cn
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads.go r0 = (com.google.android.gms.internal.ads.C3124go) r0
            r1.addAll(r0)
            goto L_0x0036
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3123gn.m12476a(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: c */
    private static <E> List<E> m12477c(Object obj, long j) {
        return (List) C3210jo.m12757f(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo9395a(Object obj, long j) {
        return m12476a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo9396a(Object obj, Object obj2, long j) {
        List c = m12477c(obj2, j);
        List a = m12476a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C3210jo.m12735a(obj, j, (Object) c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9397b(Object obj, long j) {
        Object obj2;
        List list = (List) C3210jo.m12757f(obj, j);
        if (list instanceof C3038dn) {
            obj2 = ((C3038dn) list).mo9282n();
        } else if (!f9382c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        C3210jo.m12735a(obj, j, obj2);
    }
}
