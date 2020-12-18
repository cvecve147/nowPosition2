package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1850a.C1854d;
import com.google.android.gms.common.internal.C2059x;

/* renamed from: com.google.android.gms.common.api.internal.ya */
public final class C1973ya<O extends C1850a.C1854d> {

    /* renamed from: a */
    private final boolean f6323a = true;

    /* renamed from: b */
    private final int f6324b;

    /* renamed from: c */
    private final C1850a<O> f6325c;

    /* renamed from: d */
    private final O f6326d;

    private C1973ya(C1850a<O> aVar) {
        this.f6325c = aVar;
        this.f6326d = null;
        this.f6324b = System.identityHashCode(this);
    }

    /* renamed from: a */
    public static <O extends C1850a.C1854d> C1973ya<O> m8687a(C1850a<O> aVar) {
        return new C1973ya<>(aVar);
    }

    /* renamed from: a */
    public final String mo7492a() {
        return this.f6325c.mo7280b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1973ya)) {
            return false;
        }
        C1973ya yaVar = (C1973ya) obj;
        return !this.f6323a && !yaVar.f6323a && C2059x.m9064a(this.f6325c, yaVar.f6325c) && C2059x.m9064a(this.f6326d, yaVar.f6326d);
    }

    public final int hashCode() {
        return this.f6324b;
    }
}
