package p101d.p129g.p159f.p173e.p174a;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import p101d.p129g.p159f.p167c.C5782e;

/* renamed from: d.g.f.e.a.b */
final class C5809b {

    /* renamed from: a */
    private static final NumberFormat f16088a = new DecimalFormat("000000000");

    /* renamed from: b */
    private static final NumberFormat f16089b = new DecimalFormat("000");

    /* renamed from: c */
    private static final String[] f16090c = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* renamed from: a */
    private static int m21936a(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: a */
    private static int m21937a(byte[] bArr) {
        return m21938a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* renamed from: a */
    private static int m21938a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m21936a((int) bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    static C5782e m21939a(byte[] bArr, int i) {
        String str;
        StringBuilder sb;
        int i2;
        StringBuilder sb2 = new StringBuilder(144);
        if (i == 2 || i == 3) {
            int i3 = 0;
            if (i == 2) {
                str = new DecimalFormat("0000000000".substring(0, m21942c(bArr))).format((long) m21941b(bArr));
            } else {
                str = m21943d(bArr);
            }
            String format = f16089b.format((long) m21937a(bArr));
            String format2 = f16089b.format((long) m21944e(bArr));
            sb2.append(m21940a(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                i3 = 9;
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
            }
            sb.append(str);
            sb.append(29);
            sb.append(format);
            sb.append(29);
            sb.append(format2);
            sb.append(29);
            sb2.insert(i3, sb.toString());
        } else {
            if (i == 4) {
                i2 = 93;
            } else if (i == 5) {
                i2 = 77;
            }
            sb2.append(m21940a(bArr, 1, i2));
        }
        return new C5782e(bArr, sb2.toString(), (List<byte[]>) null, String.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r6 = r4;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        r7 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r5 != 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r3 = r3 + 1;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        r5 = -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21940a(byte[] r12, int r13, int r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = -1
            r3 = r13
            r4 = r1
            r6 = r4
            r5 = r2
        L_0x000b:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L_0x0064
            java.lang.String[] r7 = f16090c
            r7 = r7[r4]
            byte r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L_0x0054;
                case 65521: goto L_0x0054;
                case 65522: goto L_0x0054;
                case 65523: goto L_0x0054;
                case 65524: goto L_0x0054;
                case 65525: goto L_0x0050;
                case 65526: goto L_0x004e;
                case 65527: goto L_0x004b;
                case 65528: goto L_0x0048;
                case 65529: goto L_0x004c;
                case 65530: goto L_0x001d;
                case 65531: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0.append(r7)
            goto L_0x005c
        L_0x0021:
            int r3 = r3 + 1
            byte r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r7 = r7 + r9
            java.text.NumberFormat r9 = f16088a
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L_0x005c
        L_0x0048:
            r5 = r2
            r4 = r8
            goto L_0x005c
        L_0x004b:
            r4 = r1
        L_0x004c:
            r5 = r2
            goto L_0x005c
        L_0x004e:
            r5 = 3
            goto L_0x0051
        L_0x0050:
            r5 = 2
        L_0x0051:
            r6 = r4
            r4 = r1
            goto L_0x005c
        L_0x0054:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r5 = r7 - r5
            r6 = r4
            r4 = r5
            r5 = r8
        L_0x005c:
            int r7 = r5 + -1
            if (r5 != 0) goto L_0x0061
            r4 = r6
        L_0x0061:
            int r3 = r3 + r8
            r5 = r7
            goto L_0x000b
        L_0x0064:
            int r12 = r0.length()
            if (r12 <= 0) goto L_0x0081
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L_0x0081
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L_0x0064
        L_0x0081:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p173e.p174a.C5809b.m21940a(byte[], int, int):java.lang.String");
    }

    /* renamed from: b */
    private static int m21941b(byte[] bArr) {
        return m21938a(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: c */
    private static int m21942c(byte[] bArr) {
        return m21938a(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: d */
    private static String m21943d(byte[] bArr) {
        return String.valueOf(new char[]{f16090c[0].charAt(m21938a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), f16090c[0].charAt(m21938a(bArr, new byte[]{33, 34, 35, 36, 25, 26})), f16090c[0].charAt(m21938a(bArr, new byte[]{27, 28, 29, 30, 19, 20})), f16090c[0].charAt(m21938a(bArr, new byte[]{21, 22, 23, 24, 13, 14})), f16090c[0].charAt(m21938a(bArr, new byte[]{15, 16, 17, 18, 7, 8})), f16090c[0].charAt(m21938a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: e */
    private static int m21944e(byte[] bArr) {
        return m21938a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
