package p101d.p111d.p112a;

/* renamed from: d.d.a.e */
public class C5244e {

    /* renamed from: a */
    private int f14820a;

    /* renamed from: b */
    private int f14821b;

    /* renamed from: c */
    private int f14822c;

    /* renamed from: d */
    private int f14823d;

    /* renamed from: e */
    private boolean f14824e;

    /* renamed from: f */
    private int f14825f;

    /* renamed from: g */
    private int f14826g;

    /* renamed from: h */
    private float f14827h = 2.0f;

    /* renamed from: i */
    private float f14828i = -1.0f;

    /* renamed from: j */
    private float f14829j = 2.0f;

    /* renamed from: k */
    private float f14830k;

    /* renamed from: l */
    private float f14831l;

    /* renamed from: m */
    private boolean f14832m = false;

    /* renamed from: n */
    private int f14833n = 17;

    /* renamed from: o */
    private C5245a f14834o = C5245a.INSIDE;

    /* renamed from: p */
    private boolean f14835p = true;

    /* renamed from: q */
    private boolean f14836q = true;

    /* renamed from: r */
    private boolean f14837r = false;

    /* renamed from: s */
    private boolean f14838s = false;

    /* renamed from: t */
    private boolean f14839t = true;

    /* renamed from: u */
    private boolean f14840u = true;

    /* renamed from: v */
    private int f14841v;

    /* renamed from: w */
    private int f14842w;

    /* renamed from: x */
    private long f14843x = 300;

    /* renamed from: d.d.a.e$a */
    public enum C5245a {
        HORIZONTAL,
        VERTICAL,
        INSIDE,
        OUTSIDE
    }

    C5244e() {
    }

    /* renamed from: A */
    public boolean mo14511A() {
        return mo14542w() && this.f14837r;
    }

    /* renamed from: B */
    public boolean mo14512B() {
        return mo14542w() && this.f14836q;
    }

    /* renamed from: a */
    public C5244e mo14513a() {
        this.f14842w++;
        return this;
    }

    /* renamed from: a */
    public C5244e mo14514a(float f) {
        this.f14827h = f;
        return this;
    }

    /* renamed from: a */
    public C5244e mo14515a(int i, int i2) {
        this.f14825f = i;
        this.f14826g = i2;
        return this;
    }

    /* renamed from: a */
    public C5244e mo14516a(C5245a aVar) {
        this.f14834o = aVar;
        return this;
    }

    /* renamed from: a */
    public C5244e mo14517a(boolean z) {
        this.f14839t = z;
        return this;
    }

    /* renamed from: b */
    public C5244e mo14518b() {
        this.f14842w--;
        return this;
    }

    /* renamed from: b */
    public C5244e mo14519b(int i, int i2) {
        this.f14820a = i;
        this.f14821b = i2;
        return this;
    }

    /* renamed from: b */
    public C5244e mo14520b(boolean z) {
        this.f14837r = z;
        return this;
    }

    /* renamed from: c */
    public long mo14521c() {
        return this.f14843x;
    }

    /* renamed from: c */
    public C5244e mo14522c(boolean z) {
        this.f14836q = z;
        return this;
    }

    /* renamed from: d */
    public float mo14523d() {
        return this.f14828i;
    }

    /* renamed from: e */
    public C5245a mo14524e() {
        return this.f14834o;
    }

    /* renamed from: f */
    public int mo14525f() {
        return this.f14833n;
    }

    /* renamed from: g */
    public int mo14526g() {
        return this.f14826g;
    }

    /* renamed from: h */
    public int mo14527h() {
        return this.f14825f;
    }

    /* renamed from: i */
    public float mo14528i() {
        return this.f14827h;
    }

    /* renamed from: j */
    public int mo14529j() {
        return this.f14824e ? this.f14823d : this.f14821b;
    }

    /* renamed from: k */
    public int mo14530k() {
        return this.f14824e ? this.f14822c : this.f14820a;
    }

    /* renamed from: l */
    public float mo14531l() {
        return this.f14830k;
    }

    /* renamed from: m */
    public float mo14532m() {
        return this.f14831l;
    }

    /* renamed from: n */
    public float mo14533n() {
        return this.f14829j;
    }

    /* renamed from: o */
    public int mo14534o() {
        return this.f14821b;
    }

    /* renamed from: p */
    public int mo14535p() {
        return this.f14820a;
    }

    /* renamed from: q */
    public boolean mo14536q() {
        return (this.f14825f == 0 || this.f14826g == 0) ? false : true;
    }

    /* renamed from: r */
    public boolean mo14537r() {
        return (this.f14820a == 0 || this.f14821b == 0) ? false : true;
    }

    /* renamed from: s */
    public boolean mo14538s() {
        return mo14542w() && this.f14839t;
    }

    /* renamed from: t */
    public boolean mo14539t() {
        return mo14542w() && (this.f14835p || this.f14836q || this.f14837r || this.f14839t);
    }

    /* renamed from: u */
    public boolean mo14540u() {
        return mo14542w() && this.f14840u;
    }

    /* renamed from: v */
    public boolean mo14541v() {
        return this.f14832m;
    }

    /* renamed from: w */
    public boolean mo14542w() {
        return this.f14841v <= 0;
    }

    /* renamed from: x */
    public boolean mo14543x() {
        return mo14542w() && this.f14835p;
    }

    /* renamed from: y */
    public boolean mo14544y() {
        return this.f14842w <= 0;
    }

    /* renamed from: z */
    public boolean mo14545z() {
        return this.f14838s;
    }
}
