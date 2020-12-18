package android.support.p011v7.app;

/* renamed from: android.support.v7.app.J */
class C0599J {

    /* renamed from: a */
    private static C0599J f2260a;

    /* renamed from: b */
    public long f2261b;

    /* renamed from: c */
    public long f2262c;

    /* renamed from: d */
    public int f2263d;

    C0599J() {
    }

    /* renamed from: a */
    static C0599J m2941a() {
        if (f2260a == null) {
            f2260a = new C0599J();
        }
        return f2260a;
    }

    /* renamed from: a */
    public void mo2541a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f2263d = 1;
        } else if (sin2 <= -1.0d) {
            this.f2263d = 0;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.f2261b = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            this.f2262c = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            if (this.f2262c >= j || this.f2261b <= j) {
                this.f2263d = 1;
                return;
            } else {
                this.f2263d = 0;
                return;
            }
        }
        this.f2261b = -1;
        this.f2262c = -1;
    }
}
