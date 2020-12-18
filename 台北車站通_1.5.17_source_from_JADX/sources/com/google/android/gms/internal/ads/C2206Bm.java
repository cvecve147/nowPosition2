package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bm */
public final class C2206Bm {

    /* renamed from: a */
    private static final Class<?> f6742a = m9446b();

    /* renamed from: b */
    static final C2206Bm f6743b = new C2206Bm(true);

    /* renamed from: c */
    private final Map<C2235Cm, C2577Om.C2581d<?, ?>> f6744c;

    C2206Bm() {
        this.f6744c = new HashMap();
    }

    private C2206Bm(boolean z) {
        this.f6744c = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C2206Bm m9445a() {
        return C2178Am.m9362a();
    }

    /* renamed from: b */
    private static Class<?> m9446b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends C3498tn> C2577Om.C2581d<ContainingType, ?> mo7865a(ContainingType containingtype, int i) {
        return this.f6744c.get(new C2235Cm(containingtype, i));
    }
}
