package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pn */
final class C3384pn implements C3355on {
    C3384pn() {
    }

    /* renamed from: a */
    public final int mo9827a(int i, Object obj, Object obj2) {
        C3327nn nnVar = (C3327nn) obj;
        if (nnVar.isEmpty()) {
            return 0;
        }
        Iterator it = nnVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final Object mo9828a(Object obj) {
        return C3327nn.m13162f().mo9798g();
    }

    /* renamed from: a */
    public final Object mo9829a(Object obj, Object obj2) {
        C3327nn nnVar = (C3327nn) obj;
        C3327nn nnVar2 = (C3327nn) obj2;
        if (!nnVar2.isEmpty()) {
            if (!nnVar.mo9794d()) {
                nnVar = nnVar.mo9798g();
            }
            nnVar.mo9792a(nnVar2);
        }
        return nnVar;
    }

    /* renamed from: b */
    public final Object mo9830b(Object obj) {
        ((C3327nn) obj).mo9795e();
        return obj;
    }

    /* renamed from: c */
    public final boolean mo9831c(Object obj) {
        return !((C3327nn) obj).mo9794d();
    }

    /* renamed from: d */
    public final Map<?, ?> mo9832d(Object obj) {
        return (C3327nn) obj;
    }

    /* renamed from: e */
    public final Map<?, ?> mo9833e(Object obj) {
        return (C3327nn) obj;
    }

    /* renamed from: f */
    public final C3298mn<?, ?> mo9834f(Object obj) {
        throw new NoSuchMethodError();
    }
}
