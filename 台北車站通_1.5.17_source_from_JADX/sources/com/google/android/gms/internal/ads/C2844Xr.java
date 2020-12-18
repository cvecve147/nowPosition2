package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Xr */
public final class C2844Xr implements Comparator<C2467Kr> {
    public C2844Xr(C2816Wr wr) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C2467Kr kr = (C2467Kr) obj;
        C2467Kr kr2 = (C2467Kr) obj2;
        if (kr.mo8461b() < kr2.mo8461b()) {
            return -1;
        }
        if (kr.mo8461b() > kr2.mo8461b()) {
            return 1;
        }
        if (kr.mo8460a() < kr2.mo8460a()) {
            return -1;
        }
        if (kr.mo8460a() > kr2.mo8460a()) {
            return 1;
        }
        float d = (kr.mo8463d() - kr.mo8461b()) * (kr.mo8462c() - kr.mo8460a());
        float d2 = (kr2.mo8463d() - kr2.mo8461b()) * (kr2.mo8462c() - kr2.mo8460a());
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }
}
