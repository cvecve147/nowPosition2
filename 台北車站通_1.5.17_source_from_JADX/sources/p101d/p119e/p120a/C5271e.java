package p101d.p119e.p120a;

/* renamed from: d.e.a.e */
public class C5271e implements C5292u {

    /* renamed from: a */
    private int f14913a;

    /* renamed from: b */
    private int f14914b;

    /* renamed from: c */
    private final int f14915c;

    /* renamed from: d */
    private final float f14916d;

    public C5271e() {
        this(2500, 0, 1.0f);
    }

    public C5271e(int i, int i2, float f) {
        this.f14913a = i;
        this.f14915c = i2;
        this.f14916d = f;
    }

    /* renamed from: a */
    public int mo14607a() {
        return this.f14913a;
    }

    /* renamed from: a */
    public void mo14608a(C5295x xVar) {
        this.f14914b++;
        int i = this.f14913a;
        this.f14913a = (int) (((float) i) + (((float) i) * this.f14916d));
        if (!mo14610c()) {
            throw xVar;
        }
    }

    /* renamed from: b */
    public int mo14609b() {
        return this.f14914b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo14610c() {
        return this.f14914b <= this.f14915c;
    }
}
