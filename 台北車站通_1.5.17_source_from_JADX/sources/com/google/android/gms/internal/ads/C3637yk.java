package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yk */
public enum C3637yk implements C2671Rm {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final C2698Sm<C3637yk> f10567g = null;

    /* renamed from: i */
    private final int f10569i;

    static {
        f10567g = new C3666zk();
    }

    private C3637yk(int i) {
        this.f10569i = i;
    }

    /* renamed from: a */
    public static C3637yk m14591a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA224;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    /* renamed from: d */
    public final int mo8218d() {
        if (this != UNRECOGNIZED) {
            return this.f10569i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
