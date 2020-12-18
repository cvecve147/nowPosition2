package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Em */
final class C2292Em extends C2263Dm<Object> {
    C2292Em() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo7994a(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2350Gm<Object> mo7995a(Object obj) {
        return ((C2577Om.C2580c) obj).zzdtz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo7996a(C2206Bm bm, C3498tn tnVar, int i) {
        return bm.mo7865a(tnVar, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <UT, UB> UB mo7997a(C2463Kn kn, Object obj, C2206Bm bm, C2350Gm<Object> gm, UB ub, C3039do<UT, UB> doVar) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7998a(C2463Kn kn, Object obj, C2206Bm bm, C2350Gm<Object> gm) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7999a(C3150hm hmVar, Object obj, C2206Bm bm, C2350Gm<Object> gm) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8000a(C3613xo xoVar, Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8043a(Object obj, C2350Gm<Object> gm) {
        ((C2577Om.C2580c) obj).zzdtz = gm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo8001a(C3498tn tnVar) {
        return tnVar instanceof C2577Om.C2580c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2350Gm<Object> mo8002b(Object obj) {
        C2350Gm<Object> a = mo7995a(obj);
        if (!a.mo8223c()) {
            return a;
        }
        C2350Gm<Object> gm = (C2350Gm) a.clone();
        mo8043a(obj, gm);
        return gm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8003c(Object obj) {
        mo7995a(obj).mo8228f();
    }
}
