package p208e.p209a.p210a.p211a.p212a.p214b;

/* renamed from: e.a.a.a.a.b.o */
public enum C6085o {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: f */
    private final int f17020f;

    private C6085o(int i) {
        this.f17020f = i;
    }

    /* renamed from: a */
    public static C6085o m23071a(String str) {
        return "io.crash.air".equals(str) ? TEST_DISTRIBUTION : str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f17020f;
    }

    public String toString() {
        return Integer.toString(this.f17020f);
    }
}
