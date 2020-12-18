package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.facebook.internal.X */
public enum C1473X {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: d */
    public static final EnumSet<C1473X> f5110d = null;

    /* renamed from: f */
    private final long f5112f;

    static {
        f5110d = EnumSet.allOf(C1473X.class);
    }

    private C1473X(long j) {
        this.f5112f = j;
    }

    /* renamed from: a */
    public static EnumSet<C1473X> m6909a(long j) {
        EnumSet<C1473X> noneOf = EnumSet.noneOf(C1473X.class);
        Iterator it = f5110d.iterator();
        while (it.hasNext()) {
            C1473X x = (C1473X) it.next();
            if ((x.mo6174a() & j) != 0) {
                noneOf.add(x);
            }
        }
        return noneOf;
    }

    /* renamed from: a */
    public long mo6174a() {
        return this.f5112f;
    }
}
