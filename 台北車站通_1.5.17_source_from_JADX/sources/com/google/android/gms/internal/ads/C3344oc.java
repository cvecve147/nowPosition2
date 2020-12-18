package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C2059x;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.oc */
public final class C3344oc extends C3515uc {

    /* renamed from: a */
    private final String f9944a;

    /* renamed from: b */
    private final int f9945b;

    public C3344oc(String str, int i) {
        this.f9944a = str;
        this.f9945b = i;
    }

    /* renamed from: D */
    public final int mo9820D() {
        return this.f9945b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3344oc)) {
            C3344oc ocVar = (C3344oc) obj;
            return C2059x.m9064a(this.f9944a, ocVar.f9944a) && C2059x.m9064a(Integer.valueOf(this.f9945b), Integer.valueOf(ocVar.f9945b));
        }
    }

    public final String getType() {
        return this.f9944a;
    }
}
