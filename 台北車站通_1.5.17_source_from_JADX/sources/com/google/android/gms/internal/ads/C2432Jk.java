package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jk */
public enum C2432Jk implements C2671Rm {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private static final C2698Sm<C2432Jk> f7317f = null;

    /* renamed from: h */
    private final int f7319h;

    static {
        f7317f = new C2460Kk();
    }

    private C2432Jk(int i) {
        this.f7319h = i;
    }

    /* renamed from: a */
    public static C2432Jk m10348a(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    /* renamed from: d */
    public final int mo8218d() {
        if (this != UNRECOGNIZED) {
            return this.f7319h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
