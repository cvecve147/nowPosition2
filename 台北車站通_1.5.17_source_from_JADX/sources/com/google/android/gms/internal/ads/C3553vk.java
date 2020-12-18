package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vk */
public enum C3553vk implements C2671Rm {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final C2698Sm<C3553vk> f10380g = null;

    /* renamed from: i */
    private final int f10382i;

    static {
        f10380g = new C3581wk();
    }

    private C3553vk(int i) {
        this.f10382i = i;
    }

    /* renamed from: a */
    public static C3553vk m14283a(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 1) {
            return NIST_P224;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i != 4) {
            return null;
        }
        return NIST_P521;
    }

    /* renamed from: d */
    public final int mo8218d() {
        if (this != UNRECOGNIZED) {
            return this.f10382i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
