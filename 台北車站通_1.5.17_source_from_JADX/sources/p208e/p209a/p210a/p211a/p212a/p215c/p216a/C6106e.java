package p208e.p209a.p210a.p211a.p212a.p215c.p216a;

/* renamed from: e.a.a.a.a.c.a.e */
public class C6106e {

    /* renamed from: a */
    private final int f17074a;

    /* renamed from: b */
    private final C6102a f17075b;

    /* renamed from: c */
    private final C6105d f17076c;

    public C6106e(int i, C6102a aVar, C6105d dVar) {
        this.f17074a = i;
        this.f17075b = aVar;
        this.f17076c = dVar;
    }

    public C6106e(C6102a aVar, C6105d dVar) {
        this(0, aVar, dVar);
    }

    /* renamed from: a */
    public long mo16097a() {
        return this.f17075b.mo14719a(this.f17074a);
    }

    /* renamed from: b */
    public C6106e mo16098b() {
        return new C6106e(this.f17075b, this.f17076c);
    }

    /* renamed from: c */
    public C6106e mo16099c() {
        return new C6106e(this.f17074a + 1, this.f17075b, this.f17076c);
    }
}
