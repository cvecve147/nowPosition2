package p250g.p255b.p256a.p258b;

import p250g.p255b.p256a.C6467a;

/* renamed from: g.b.a.b.f */
abstract class C6480f extends C6475c {

    /* renamed from: ga */
    private static final int[] f18002ga = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: ha */
    private static final int[] f18003ha = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: ia */
    private static final long[] f18004ia = new long[12];

    /* renamed from: ja */
    private static final long[] f18005ja = new long[12];

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            j += ((long) f18002ga[i]) * 86400000;
            int i2 = i + 1;
            f18004ia[i2] = j;
            j2 += ((long) f18003ha[i]) * 86400000;
            f18005ja[i2] = j2;
            i = i2;
        }
    }

    C6480f(C6467a aVar, Object obj, int i) {
        super(aVar, obj, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16707a(int i, int i2) {
        return mo16730f(i) ? f18003ha[i2 - 1] : f18002ga[i2 - 1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo16716b(int i, int i2) {
        return mo16730f(i) ? f18005ja[i2 - 1] : f18004ia[i2 - 1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo16718c(long j, int i) {
        if (i > 28 || i < 1) {
            return mo16722d(j);
        }
        return 28;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r13 < 12825000) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r13 < 20587500) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r13 < 28265625) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        if (r13 < 12740625) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        if (r13 < 20503125) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a3, code lost:
        if (r13 < 28181250) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return 11;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo16723d(long r13, int r15) {
        /*
            r12 = this;
            long r0 = r12.mo16726e((int) r15)
            long r13 = r13 - r0
            r0 = 10
            long r13 = r13 >> r0
            int r13 = (int) r13
            boolean r14 = r12.mo16730f((int) r15)
            r15 = 2
            r1 = 3
            r2 = 5
            r3 = 6
            r4 = 8
            r5 = 9
            r6 = 11
            r7 = 12
            r8 = 1
            r9 = 4
            r10 = 7
            r11 = 2615625(0x27e949, float:3.665271E-39)
            if (r14 == 0) goto L_0x005e
            r14 = 15356250(0xea515a, float:2.151869E-38)
            if (r13 >= r14) goto L_0x0041
            r14 = 7678125(0x7528ad, float:1.0759345E-38)
            if (r13 >= r14) goto L_0x0035
            if (r13 >= r11) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            r14 = 5062500(0x4d3f64, float:7.094073E-39)
            if (r13 >= r14) goto L_0x0072
            goto L_0x00a8
        L_0x0035:
            r14 = 10209375(0x9bc85f, float:1.4306382E-38)
            if (r13 >= r14) goto L_0x003b
            goto L_0x0079
        L_0x003b:
            r14 = 12825000(0xc3b1a8, float:1.7971653E-38)
            if (r13 >= r14) goto L_0x0082
            goto L_0x0080
        L_0x0041:
            r14 = 23118750(0x160c39e, float:4.128265E-38)
            if (r13 >= r14) goto L_0x0052
            r14 = 17971875(0x1123aa3, float:2.6858035E-38)
            if (r13 >= r14) goto L_0x004c
            goto L_0x008e
        L_0x004c:
            r14 = 20587500(0x13a23ec, float:3.4188577E-38)
            if (r13 >= r14) goto L_0x0097
            goto L_0x0095
        L_0x0052:
            r14 = 25734375(0x188ace7, float:5.020661E-38)
            if (r13 >= r14) goto L_0x0058
            goto L_0x009e
        L_0x0058:
            r14 = 28265625(0x1af4c99, float:6.439476E-38)
            if (r13 >= r14) goto L_0x00a7
            goto L_0x00a5
        L_0x005e:
            r14 = 15271875(0xe907c3, float:2.1400455E-38)
            if (r13 >= r14) goto L_0x0084
            r14 = 7593750(0x73df16, float:1.064111E-38)
            if (r13 >= r14) goto L_0x0074
            if (r13 >= r11) goto L_0x006c
        L_0x006a:
            r15 = r8
            goto L_0x00a8
        L_0x006c:
            r14 = 4978125(0x4bf5cd, float:6.975839E-39)
            if (r13 >= r14) goto L_0x0072
            goto L_0x00a8
        L_0x0072:
            r15 = r1
            goto L_0x00a8
        L_0x0074:
            r14 = 10125000(0x9a7ec8, float:1.4188147E-38)
            if (r13 >= r14) goto L_0x007b
        L_0x0079:
            r15 = r9
            goto L_0x00a8
        L_0x007b:
            r14 = 12740625(0xc26811, float:1.7853418E-38)
            if (r13 >= r14) goto L_0x0082
        L_0x0080:
            r15 = r2
            goto L_0x00a8
        L_0x0082:
            r15 = r3
            goto L_0x00a8
        L_0x0084:
            r14 = 23034375(0x15f7a07, float:4.1046182E-38)
            if (r13 >= r14) goto L_0x0099
            r14 = 17887500(0x110f10c, float:2.6621566E-38)
            if (r13 >= r14) goto L_0x0090
        L_0x008e:
            r15 = r10
            goto L_0x00a8
        L_0x0090:
            r14 = 20503125(0x138da55, float:3.3952108E-38)
            if (r13 >= r14) goto L_0x0097
        L_0x0095:
            r15 = r4
            goto L_0x00a8
        L_0x0097:
            r15 = r5
            goto L_0x00a8
        L_0x0099:
            r14 = 25650000(0x1876350, float:4.9733674E-38)
            if (r13 >= r14) goto L_0x00a0
        L_0x009e:
            r15 = r0
            goto L_0x00a8
        L_0x00a0:
            r14 = 28181250(0x1ae0302, float:6.392182E-38)
            if (r13 >= r14) goto L_0x00a7
        L_0x00a5:
            r15 = r6
            goto L_0x00a8
        L_0x00a7:
            r15 = r7
        L_0x00a8:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p258b.C6480f.mo16723d(long, int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo16729f(long j, int i) {
        int i2 = mo16734i(j);
        int b = mo16715b(j, i2);
        int e = mo16724e(j);
        if (b > 59) {
            if (mo16730f(i2)) {
                if (!mo16730f(i)) {
                    b--;
                }
            } else if (mo16730f(i)) {
                b++;
            }
        }
        return mo16712a(i, 1, b) + ((long) e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo16735j(long j) {
        return mo16656e().mo16740a(j) == 29 && mo16674w().mo16741b(j);
    }
}
