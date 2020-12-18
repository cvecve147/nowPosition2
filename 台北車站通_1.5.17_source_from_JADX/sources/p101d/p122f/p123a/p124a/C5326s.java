package p101d.p122f.p123a.p124a;

import java.util.Random;
import p208e.p209a.p210a.p211a.p212a.p215c.p216a.C6102a;

/* renamed from: d.f.a.a.s */
class C5326s implements C6102a {

    /* renamed from: a */
    final C6102a f15074a;

    /* renamed from: b */
    final Random f15075b;

    /* renamed from: c */
    final double f15076c;

    public C5326s(C6102a aVar, double d) {
        this(aVar, d, new Random());
    }

    public C5326s(C6102a aVar, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (aVar == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random != null) {
            this.f15074a = aVar;
            this.f15076c = d;
            this.f15075b = random;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo14718a() {
        double d = this.f15076c;
        double d2 = 1.0d - d;
        return d2 + (((d + 1.0d) - d2) * this.f15075b.nextDouble());
    }

    /* renamed from: a */
    public long mo14719a(int i) {
        return (long) (mo14718a() * ((double) this.f15074a.mo14719a(i)));
    }
}
