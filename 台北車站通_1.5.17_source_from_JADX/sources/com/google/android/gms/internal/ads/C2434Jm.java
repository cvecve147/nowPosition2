package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.ads.Jm */
public enum C2434Jm {
    DOUBLE(0, C2492Lm.SCALAR, C2811Wm.DOUBLE),
    FLOAT(1, C2492Lm.SCALAR, C2811Wm.FLOAT),
    INT64(2, C2492Lm.SCALAR, C2811Wm.LONG),
    UINT64(3, C2492Lm.SCALAR, C2811Wm.LONG),
    INT32(4, C2492Lm.SCALAR, C2811Wm.INT),
    FIXED64(5, C2492Lm.SCALAR, C2811Wm.LONG),
    FIXED32(6, C2492Lm.SCALAR, C2811Wm.INT),
    BOOL(7, C2492Lm.SCALAR, C2811Wm.BOOLEAN),
    STRING(8, C2492Lm.SCALAR, C2811Wm.STRING),
    MESSAGE(9, C2492Lm.SCALAR, C2811Wm.MESSAGE),
    BYTES(10, C2492Lm.SCALAR, C2811Wm.BYTE_STRING),
    UINT32(11, C2492Lm.SCALAR, C2811Wm.INT),
    ENUM(12, C2492Lm.SCALAR, C2811Wm.ENUM),
    SFIXED32(13, C2492Lm.SCALAR, C2811Wm.INT),
    SFIXED64(14, C2492Lm.SCALAR, C2811Wm.LONG),
    SINT32(15, C2492Lm.SCALAR, C2811Wm.INT),
    SINT64(16, C2492Lm.SCALAR, C2811Wm.LONG),
    GROUP(17, C2492Lm.SCALAR, C2811Wm.MESSAGE),
    DOUBLE_LIST(18, C2492Lm.VECTOR, C2811Wm.DOUBLE),
    FLOAT_LIST(19, C2492Lm.VECTOR, C2811Wm.FLOAT),
    INT64_LIST(20, C2492Lm.VECTOR, C2811Wm.LONG),
    UINT64_LIST(21, C2492Lm.VECTOR, C2811Wm.LONG),
    INT32_LIST(22, C2492Lm.VECTOR, C2811Wm.INT),
    FIXED64_LIST(23, C2492Lm.VECTOR, C2811Wm.LONG),
    FIXED32_LIST(24, C2492Lm.VECTOR, C2811Wm.INT),
    BOOL_LIST(25, C2492Lm.VECTOR, C2811Wm.BOOLEAN),
    STRING_LIST(26, C2492Lm.VECTOR, C2811Wm.STRING),
    MESSAGE_LIST(27, C2492Lm.VECTOR, C2811Wm.MESSAGE),
    BYTES_LIST(28, C2492Lm.VECTOR, C2811Wm.BYTE_STRING),
    UINT32_LIST(29, C2492Lm.VECTOR, C2811Wm.INT),
    ENUM_LIST(30, C2492Lm.VECTOR, C2811Wm.ENUM),
    SFIXED32_LIST(31, C2492Lm.VECTOR, C2811Wm.INT),
    SFIXED64_LIST(32, C2492Lm.VECTOR, C2811Wm.LONG),
    SINT32_LIST(33, C2492Lm.VECTOR, C2811Wm.INT),
    SINT64_LIST(34, C2492Lm.VECTOR, C2811Wm.LONG),
    DOUBLE_LIST_PACKED(35, C2492Lm.PACKED_VECTOR, C2811Wm.DOUBLE),
    FLOAT_LIST_PACKED(36, C2492Lm.PACKED_VECTOR, C2811Wm.FLOAT),
    INT64_LIST_PACKED(37, C2492Lm.PACKED_VECTOR, C2811Wm.LONG),
    UINT64_LIST_PACKED(38, C2492Lm.PACKED_VECTOR, C2811Wm.LONG),
    INT32_LIST_PACKED(39, C2492Lm.PACKED_VECTOR, C2811Wm.INT),
    FIXED64_LIST_PACKED(40, C2492Lm.PACKED_VECTOR, C2811Wm.LONG),
    FIXED32_LIST_PACKED(41, C2492Lm.PACKED_VECTOR, C2811Wm.INT),
    BOOL_LIST_PACKED(42, C2492Lm.PACKED_VECTOR, C2811Wm.BOOLEAN),
    UINT32_LIST_PACKED(43, C2492Lm.PACKED_VECTOR, C2811Wm.INT),
    ENUM_LIST_PACKED(44, C2492Lm.PACKED_VECTOR, C2811Wm.ENUM),
    SFIXED32_LIST_PACKED(45, C2492Lm.PACKED_VECTOR, C2811Wm.INT),
    SFIXED64_LIST_PACKED(46, C2492Lm.PACKED_VECTOR, C2811Wm.LONG),
    SINT32_LIST_PACKED(47, C2492Lm.PACKED_VECTOR, C2811Wm.INT),
    SINT64_LIST_PACKED(48, C2492Lm.PACKED_VECTOR, C2811Wm.LONG),
    GROUP_LIST(49, C2492Lm.VECTOR, C2811Wm.MESSAGE),
    MAP(50, C2492Lm.MAP, C2811Wm.VOID);
    

    /* renamed from: Z */
    private static final C2434Jm[] f7345Z = null;

    /* renamed from: aa */
    private static final Type[] f7347aa = null;

    /* renamed from: ca */
    private final C2811Wm f7374ca;

    /* renamed from: da */
    private final int f7375da;

    /* renamed from: ea */
    private final C2492Lm f7376ea;

    /* renamed from: fa */
    private final Class<?> f7377fa;

    /* renamed from: ga */
    private final boolean f7378ga;

    static {
        int i;
        f7347aa = new Type[0];
        C2434Jm[] values = values();
        f7345Z = new C2434Jm[values.length];
        for (C2434Jm jm : values) {
            f7345Z[jm.f7375da] = jm;
        }
    }

    private C2434Jm(int i, C2492Lm lm, C2811Wm wm) {
        int i2;
        this.f7375da = i;
        this.f7376ea = lm;
        this.f7374ca = wm;
        int i3 = C2462Km.f7465a[lm.ordinal()];
        this.f7377fa = (i3 == 1 || i3 == 2) ? wm.mo9002a() : null;
        boolean z = false;
        if (!(lm != C2492Lm.SCALAR || (i2 = C2462Km.f7466b[wm.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
            z = true;
        }
        this.f7378ga = z;
    }

    /* renamed from: a */
    public final int mo8377a() {
        return this.f7375da;
    }
}
