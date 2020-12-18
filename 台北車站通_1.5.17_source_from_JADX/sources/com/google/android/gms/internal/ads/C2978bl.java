package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bl */
public enum C2978bl implements C2671Rm {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final C2698Sm<C2978bl> f8948g = null;

    /* renamed from: i */
    private final int f8950i;

    static {
        f8948g = new C3006cl();
    }

    private C2978bl(int i) {
        this.f8950i = i;
    }

    /* renamed from: a */
    public static C2978bl m12016a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    /* renamed from: d */
    public final int mo8218d() {
        if (this != UNRECOGNIZED) {
            return this.f8950i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
