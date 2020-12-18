package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ro */
public enum C3442ro {
    DOUBLE(C3585wo.DOUBLE, 1),
    FLOAT(C3585wo.FLOAT, 5),
    INT64(C3585wo.LONG, 0),
    UINT64(C3585wo.LONG, 0),
    INT32(C3585wo.INT, 0),
    FIXED64(C3585wo.LONG, 1),
    FIXED32(C3585wo.INT, 5),
    BOOL(C3585wo.BOOLEAN, 0),
    STRING(C3585wo.STRING, 2),
    GROUP(C3585wo.MESSAGE, 3),
    MESSAGE(C3585wo.MESSAGE, 2),
    BYTES(C3585wo.BYTE_STRING, 2),
    UINT32(C3585wo.INT, 0),
    ENUM(C3585wo.ENUM, 0),
    SFIXED32(C3585wo.INT, 5),
    SFIXED64(C3585wo.LONG, 1),
    SINT32(C3585wo.INT, 0),
    SINT64(C3585wo.LONG, 0);
    

    /* renamed from: t */
    private final C3585wo f10144t;

    /* renamed from: u */
    private final int f10145u;

    private C3442ro(C3585wo woVar, int i) {
        this.f10144t = woVar;
        this.f10145u = i;
    }

    /* renamed from: a */
    public final C3585wo mo9987a() {
        return this.f10144t;
    }
}
