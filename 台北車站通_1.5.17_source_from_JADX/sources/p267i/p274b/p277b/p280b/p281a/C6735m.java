package p267i.p274b.p277b.p280b.p281a;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: i.b.b.b.a.m */
public class C6735m {

    /* renamed from: a */
    private final int f18720a;

    /* renamed from: b */
    private final int f18721b;

    /* renamed from: c */
    private final int f18722c;

    /* renamed from: d */
    private final int f18723d;

    /* renamed from: e */
    private HashMap<String, C6736a> f18724e;

    /* renamed from: i.b.b.b.a.m$a */
    private class C6736a {

        /* renamed from: a */
        int f18725a;

        /* renamed from: b */
        int f18726b;

        /* renamed from: c */
        ArrayList<Integer> f18727c;

        /* renamed from: d */
        ArrayList<Double> f18728d;

        private C6736a() {
        }
    }

    public C6735m() {
        this.f18720a = 59;
        this.f18721b = 2;
        this.f18722c = 5;
        this.f18723d = 5;
        this.f18724e = null;
        this.f18724e = new HashMap<>();
    }

    /* renamed from: a */
    private double m25532a(int i) {
        int abs = Math.abs(i);
        if (abs != 0) {
            return Math.pow(10.0d, ((double) (abs - 59)) / 20.0d);
        }
        return -1.0d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r9 > 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r9 != 0) goto L_0x0074;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double mo17219a(java.lang.String r23, int r24, int r25, int r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r26
            java.util.Locale r2 = java.util.Locale.getDefault()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r23
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)
            r6 = 1
            r3[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r25)
            r6 = 2
            r3[r6] = r5
            java.lang.String r5 = "%s_%d_%d"
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)
            java.util.HashMap<java.lang.String, i.b.b.b.a.m$a> r3 = r0.f18724e
            java.lang.Object r2 = r3.get(r2)
            i.b.b.b.a.m$a r2 = (p267i.p274b.p277b.p280b.p281a.C6735m.C6736a) r2
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r2 == 0) goto L_0x014a
            java.util.ArrayList<java.lang.Integer> r3 = r2.f18727c
            java.util.ArrayList<java.lang.Double> r7 = r2.f18728d
            int r8 = r2.f18725a
            int r9 = r2.f18726b
            if (r1 == 0) goto L_0x0093
            r10 = r4
        L_0x0039:
            int r11 = r3.size()
            if (r10 >= r11) goto L_0x004f
            java.lang.Object r11 = r3.get(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 == 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            int r10 = r10 + 1
            goto L_0x0039
        L_0x004f:
            int r11 = r3.size()
            if (r10 != r11) goto L_0x005a
            double r1 = r0.m25532a(r1)
            return r1
        L_0x005a:
            java.lang.Object r10 = r3.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = 4
            if (r10 >= r1) goto L_0x0077
            int r1 = r1 - r10
            int r12 = r8 + 1
            int r1 = r1 * r12
            int r1 = r1 / 5
            int r1 = r1 + r10
            if (r8 >= r11) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r12 = r8
        L_0x0072:
            if (r9 <= 0) goto L_0x009d
        L_0x0074:
            int r9 = r9 + -1
            goto L_0x009d
        L_0x0077:
            if (r10 != r1) goto L_0x0081
            if (r8 == 0) goto L_0x007d
            int r8 = r8 + -1
        L_0x007d:
            r12 = r8
            if (r9 == 0) goto L_0x009d
            goto L_0x0074
        L_0x0081:
            int r1 = r10 - r1
            int r12 = r9 + 1
            int r1 = r1 * r12
            int r1 = r1 / 5
            int r1 = r10 - r1
            if (r8 <= 0) goto L_0x008e
            int r8 = r8 + -1
        L_0x008e:
            if (r9 >= r11) goto L_0x0091
            r9 = r12
        L_0x0091:
            r12 = r8
            goto L_0x009d
        L_0x0093:
            if (r8 == 0) goto L_0x0097
            int r8 = r8 + -1
        L_0x0097:
            r12 = r8
            if (r9 == 0) goto L_0x009c
            int r9 = r9 + -1
        L_0x009c:
            r1 = r4
        L_0x009d:
            int r8 = r3.size()
            r10 = 10
            if (r8 != r10) goto L_0x00ad
            r8 = 9
            r3.remove(r8)
            r7.remove(r8)
        L_0x00ad:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r3.add(r4, r8)
            r2.f18725a = r12
            r2.f18726b = r9
            double r2 = r0.m25532a(r1)
            if (r1 != 0) goto L_0x00c0
            goto L_0x0141
        L_0x00c0:
            r1 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r11 = r1
            r10 = r4
            r12 = r5
            r14 = r8
        L_0x00c8:
            int r4 = r7.size()
            if (r10 >= r4) goto L_0x0139
            java.lang.Object r4 = r7.get(r10)
            java.lang.Double r4 = (java.lang.Double) r4
            double r16 = r4.doubleValue()
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x012d
            float r11 = r11 + r1
            r4 = 1073741824(0x40000000, float:2.0)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r4 != 0) goto L_0x011c
            double r18 = r16 / r2
            r20 = 4608533498688228557(0x3ff4cccccccccccd, double:1.3)
            int r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r4 >= 0) goto L_0x0104
            r20 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r4 > 0) goto L_0x00fc
            goto L_0x0104
        L_0x00fc:
            double r4 = java.lang.Math.pow(r12, r5)
            double r4 = r2 / r4
            double r14 = r14 + r4
            goto L_0x011c
        L_0x0104:
            double r4 = java.lang.Math.pow(r12, r5)
            double r16 = r16 / r4
            double r14 = r14 + r16
            double r4 = (double) r11
            double r16 = java.lang.Math.pow(r12, r4)
            double r16 = r2 / r16
            double r14 = r14 + r16
            double r4 = java.lang.Math.pow(r12, r4)
            double r16 = r2 / r4
            goto L_0x012b
        L_0x011c:
            double r4 = (double) r11
            double r18 = java.lang.Math.pow(r12, r4)
            double r18 = r16 / r18
            double r14 = r14 + r18
            double r4 = java.lang.Math.pow(r12, r4)
            double r16 = r16 / r4
        L_0x012b:
            r12 = r16
        L_0x012d:
            r4 = 1092616192(0x41200000, float:10.0)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0134
            goto L_0x0139
        L_0x0134:
            int r10 = r10 + 1
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x00c8
        L_0x0139:
            int r1 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x013f
            r5 = r2
            goto L_0x0141
        L_0x013f:
            double r5 = r14 + r12
        L_0x0141:
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r2 = 0
            r7.add(r2, r1)
            goto L_0x017e
        L_0x014a:
            r2 = r4
            i.b.b.b.a.m$a r3 = new i.b.b.b.a.m$a
            r4 = 0
            r3.<init>()
            r3.f18725a = r2
            r3.f18726b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.f18727c = r2
            java.util.ArrayList<java.lang.Integer> r2 = r3.f18727c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r26)
            r2.add(r4)
            if (r1 != 0) goto L_0x016a
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x016e
        L_0x016a:
            double r5 = r0.m25532a(r1)
        L_0x016e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f18728d = r1
            java.util.ArrayList<java.lang.Double> r1 = r3.f18728d
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            r1.add(r2)
        L_0x017e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p274b.p277b.p280b.p281a.C6735m.mo17219a(java.lang.String, int, int, int):double");
    }
}
