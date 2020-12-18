package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hk */
public enum C3148hk implements C2671Rm {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private static final C2698Sm<C3148hk> f9430e = null;

    /* renamed from: g */
    private final int f9432g;

    static {
        f9430e = new C3176ik();
    }

    private C3148hk(int i) {
        this.f9432g = i;
    }

    /* renamed from: a */
    public static C3148hk m12533a(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i != 2) {
            return null;
        }
        return COMPRESSED;
    }

    /* renamed from: d */
    public final int mo8218d() {
        if (this != UNRECOGNIZED) {
            return this.f9432g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
