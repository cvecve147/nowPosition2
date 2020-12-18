package p101d.p129g.p159f.p184i.p185a;

/* renamed from: d.g.f.i.a.i */
public enum C5900i {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: l */
    private final int[] f16310l;

    /* renamed from: m */
    private final int f16311m;

    private C5900i(int[] iArr, int i) {
        this.f16310l = iArr;
        this.f16311m = i;
    }

    /* renamed from: a */
    public static C5900i m22346a(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public int mo15659a(C5902k kVar) {
        int e = kVar.mo15666e();
        return this.f16310l[e <= 9 ? 0 : e <= 26 ? (char) 1 : 2];
    }
}
