package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Rn */
final class C2672Rn extends C2840Xn {

    /* renamed from: b */
    private final /* synthetic */ C2583On f8208b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C2672Rn(C2583On on) {
        super(on, (C2614Pn) null);
        this.f8208b = on;
    }

    /* synthetic */ C2672Rn(C2583On on, C2614Pn pn) {
        this(on);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C2642Qn(this.f8208b, (C2614Pn) null);
    }
}
