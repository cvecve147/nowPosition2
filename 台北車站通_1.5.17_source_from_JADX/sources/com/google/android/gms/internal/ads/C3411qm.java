package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qm */
public abstract class C3411qm {

    /* renamed from: a */
    int f10083a;

    /* renamed from: b */
    int f10084b;

    /* renamed from: c */
    private int f10085c;

    /* renamed from: d */
    C3497tm f10086d;

    /* renamed from: e */
    private boolean f10087e;

    private C3411qm() {
        this.f10084b = 100;
        this.f10085c = Integer.MAX_VALUE;
        this.f10087e = false;
    }

    /* renamed from: a */
    public static long m13538a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    static C3411qm m13539a(byte[] bArr, int i, int i2, boolean z) {
        C3468sm smVar = new C3468sm(bArr, i, i2, z);
        try {
            smVar.mo9942c(i2);
            return smVar;
        } catch (C2755Um e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public static int m13540e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract double mo9938a();

    /* renamed from: a */
    public abstract void mo9939a(int i);

    /* renamed from: b */
    public abstract float mo9940b();

    /* renamed from: b */
    public abstract boolean mo9941b(int i);

    /* renamed from: c */
    public abstract int mo9942c(int i);

    /* renamed from: c */
    public abstract String mo9943c();

    /* renamed from: d */
    public abstract int mo9944d();

    /* renamed from: d */
    public abstract void mo9945d(int i);

    /* renamed from: e */
    public abstract long mo9946e();

    /* renamed from: f */
    public abstract long mo9947f();

    /* renamed from: g */
    public abstract int mo9948g();

    /* renamed from: h */
    public abstract long mo9949h();

    /* renamed from: i */
    public abstract int mo9950i();

    /* renamed from: j */
    public abstract boolean mo9951j();

    /* renamed from: k */
    public abstract String mo9952k();

    /* renamed from: l */
    public abstract C3150hm mo9953l();

    /* renamed from: m */
    public abstract int mo9954m();

    /* renamed from: n */
    public abstract int mo9955n();

    /* renamed from: o */
    public abstract int mo9956o();

    /* renamed from: p */
    public abstract long mo9957p();

    /* renamed from: q */
    public abstract int mo9958q();

    /* renamed from: r */
    public abstract long mo9959r();

    /* renamed from: s */
    public abstract boolean mo9960s();

    /* renamed from: t */
    public abstract int mo9961t();
}
