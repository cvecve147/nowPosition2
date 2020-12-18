package p101d.p129g.p159f.p184i.p185a;

/* renamed from: d.g.f.i.a.g */
public enum C5898g {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: e */
    private static final C5898g[] f16292e = null;

    /* renamed from: g */
    private final int f16294g;

    static {
        C5898g gVar;
        C5898g gVar2;
        C5898g gVar3;
        C5898g gVar4;
        f16292e = new C5898g[]{gVar2, gVar, gVar4, gVar3};
    }

    private C5898g(int i) {
        this.f16294g = i;
    }

    /* renamed from: a */
    public static C5898g m22340a(int i) {
        if (i >= 0) {
            C5898g[] gVarArr = f16292e;
            if (i < gVarArr.length) {
                return gVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
