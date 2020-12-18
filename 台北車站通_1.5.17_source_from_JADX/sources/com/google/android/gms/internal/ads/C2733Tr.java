package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tr */
public final class C2733Tr {

    /* renamed from: a */
    final long f8360a;

    /* renamed from: b */
    final String f8361b;

    /* renamed from: c */
    final int f8362c;

    C2733Tr(long j, String str, int i) {
        this.f8360a = j;
        this.f8361b = str;
        this.f8362c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2733Tr)) {
            C2733Tr tr = (C2733Tr) obj;
            return tr.f8360a == this.f8360a && tr.f8362c == this.f8362c;
        }
    }

    public final int hashCode() {
        return (int) this.f8360a;
    }
}
