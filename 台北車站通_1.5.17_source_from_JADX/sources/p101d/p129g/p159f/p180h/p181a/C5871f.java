package p101d.p129g.p159f.p180h.p181a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.apache.http.message.TokenParser;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p180h.C5881c;

/* renamed from: d.g.f.h.a.f */
final class C5871f {

    /* renamed from: a */
    private static final char[] f16246a = {';', '<', '>', '@', '[', TokenParser.ESCAPE, ']', '_', '`', '~', '!', TokenParser.f19312CR, 9, ',', ':', 10, '-', '.', '$', '/', TokenParser.DQUOTE, '|', '*', '(', ')', '?', '{', '}', '\''};

    /* renamed from: b */
    private static final char[] f16247b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '&', TokenParser.f19312CR, 9, ',', ':', '#', '-', '.', '$', '/', '+', '%', '*', '=', '^'};

    /* renamed from: c */
    private static final Charset f16248c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final BigInteger[] f16249d = new BigInteger[16];

    /* renamed from: d.g.f.h.a.f$a */
    private enum C5872a {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        f16249d[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        f16249d[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr = f16249d;
            if (i < bigIntegerArr.length) {
                bigIntegerArr[i] = bigIntegerArr[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m22218a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        int i5 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = 922;
        int i7 = 923;
        int i8 = 928;
        long j = 900;
        if (i5 == 901) {
            int[] iArr2 = new int[6];
            boolean z = false;
            i3 = i2 + 1;
            int i9 = iArr[i2];
            long j2 = 0;
            int i10 = 0;
            while (i3 < iArr[0] && !z) {
                int i11 = i10 + 1;
                iArr2[i10] = i9;
                j2 = (j2 * j) + ((long) i9);
                int i12 = i3 + 1;
                i9 = iArr[i3];
                if (i9 == 900 || i9 == 901 || i9 == 902 || i9 == 924 || i9 == 928 || i9 == i7 || i9 == i6) {
                    i3 = i12 - 1;
                    i10 = i11;
                    i6 = 922;
                    i7 = 923;
                    j = 900;
                    z = true;
                } else if (i11 % 5 != 0 || i11 <= 0) {
                    i3 = i12;
                    i10 = i11;
                    i6 = 922;
                    i7 = 923;
                    j = 900;
                } else {
                    int i13 = 0;
                    while (i13 < 6) {
                        byteArrayOutputStream.write((byte) ((int) (j2 >> ((5 - i13) * 8))));
                        i13++;
                        i6 = 922;
                        i7 = 923;
                    }
                    i3 = i12;
                    i10 = 0;
                    j = 900;
                    j2 = 0;
                }
            }
            if (i3 != iArr[0] || i9 >= 900) {
                i4 = i10;
            } else {
                i4 = i10 + 1;
                iArr2[i10] = i9;
            }
            for (int i14 = 0; i14 < i4; i14++) {
                byteArrayOutputStream.write((byte) iArr2[i14]);
            }
        } else if (i5 == 924) {
            int i15 = i2;
            int i16 = 0;
            boolean z2 = false;
            long j3 = 0;
            while (i15 < iArr[0] && !z2) {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                if (i18 < 900) {
                    i16++;
                    j3 = (j3 * 900) + ((long) i18);
                    i15 = i17;
                } else {
                    if (i18 != 900 && i18 != 901 && i18 != 902 && i18 != 924 && i18 != i8) {
                        if (i18 != 923) {
                            if (i18 != 922) {
                                i15 = i17;
                            }
                            i15 = i17 - 1;
                            z2 = true;
                        }
                    }
                    i15 = i17 - 1;
                    z2 = true;
                }
                if (i16 % 5 == 0 && i16 > 0) {
                    int i19 = 0;
                    for (int i20 = 6; i19 < i20; i20 = 6) {
                        byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i19) * 8))));
                        i19++;
                    }
                    i16 = 0;
                    j3 = 0;
                }
                i8 = 928;
            }
            i3 = i15;
        } else {
            i3 = i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* renamed from: a */
    private static int m22219a(int[] iArr, int i, C5881c cVar) {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = i;
            int i3 = 0;
            while (i3 < 2) {
                iArr2[i3] = iArr[i2];
                i3++;
                i2++;
            }
            cVar.mo15640a(Integer.parseInt(m22222a(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int b = m22224b(iArr, i2, sb);
            cVar.mo15641a(sb.toString());
            if (iArr[b] == 923) {
                int i4 = b + 1;
                int[] iArr3 = new int[(iArr[0] - i4)];
                boolean z = false;
                int i5 = 0;
                while (i4 < iArr[0] && !z) {
                    int i6 = i4 + 1;
                    int i7 = iArr[i4];
                    if (i7 < 900) {
                        iArr3[i5] = i7;
                        i4 = i6;
                        i5++;
                    } else if (i7 == 922) {
                        cVar.mo15642a(true);
                        z = true;
                        i4 = i6 + 1;
                    } else {
                        throw C5811f.m21947a();
                    }
                }
                cVar.mo15643a(Arrays.copyOf(iArr3, i5));
                return i4;
            } else if (iArr[b] != 922) {
                return b;
            } else {
                cVar.mo15642a(true);
                return b + 1;
            }
        } else {
            throw C5811f.m21947a();
        }
    }

    /* renamed from: a */
    private static int m22220a(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else if (i4 == 900 || i4 == 901 || i4 == 924 || i4 == 928 || i4 == 923 || i4 == 922) {
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(m22222a(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r2 = m22218a(r3, r7, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = m22224b(r7, r2, r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p101d.p129g.p159f.p167c.C5782e m22221a(int[] r7, java.lang.String r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length
            r2 = 2
            int r1 = r1 * r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = f16248c
            r3 = 1
            r3 = r7[r3]
            d.g.f.h.c r4 = new d.g.f.h.c
            r4.<init>()
        L_0x0012:
            r5 = 0
            r5 = r7[r5]
            if (r2 >= r5) goto L_0x006f
            r5 = 913(0x391, float:1.28E-42)
            if (r3 == r5) goto L_0x0056
            switch(r3) {
                case 900: goto L_0x0023;
                case 901: goto L_0x0051;
                case 902: goto L_0x004c;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r3) {
                case 922: goto L_0x0047;
                case 923: goto L_0x0047;
                case 924: goto L_0x0051;
                case 925: goto L_0x0044;
                case 926: goto L_0x0041;
                case 927: goto L_0x002d;
                case 928: goto L_0x0028;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r2 = r2 + -1
        L_0x0023:
            int r2 = m22224b(r7, r2, r0)
            goto L_0x005f
        L_0x0028:
            int r2 = m22219a((int[]) r7, (int) r2, (p101d.p129g.p159f.p180h.C5881c) r4)
            goto L_0x005f
        L_0x002d:
            int r1 = r2 + 1
            r2 = r7[r2]
            d.g.f.c.d r2 = p101d.p129g.p159f.p167c.C5781d.m21841a(r2)
            java.lang.String r2 = r2.name()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x005f
        L_0x0041:
            int r2 = r2 + 2
            goto L_0x005f
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0047:
            d.g.f.f r7 = p101d.p129g.p159f.C5811f.m21947a()
            throw r7
        L_0x004c:
            int r2 = m22220a((int[]) r7, (int) r2, (java.lang.StringBuilder) r0)
            goto L_0x005f
        L_0x0051:
            int r2 = m22218a(r3, r7, r1, r2, r0)
            goto L_0x005f
        L_0x0056:
            int r3 = r2 + 1
            r2 = r7[r2]
            char r2 = (char) r2
            r0.append(r2)
            r2 = r3
        L_0x005f:
            int r3 = r7.length
            if (r2 >= r3) goto L_0x006a
            int r3 = r2 + 1
            r2 = r7[r2]
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0012
        L_0x006a:
            d.g.f.f r7 = p101d.p129g.p159f.C5811f.m21947a()
            throw r7
        L_0x006f:
            int r7 = r0.length()
            if (r7 == 0) goto L_0x0083
            d.g.f.c.e r7 = new d.g.f.c.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r7.<init>(r1, r0, r1, r8)
            r7.mo15427a((java.lang.Object) r4)
            return r7
        L_0x0083:
            d.g.f.f r7 = p101d.p129g.p159f.C5811f.m21947a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p180h.p181a.C5871f.m22221a(int[], java.lang.String):d.g.f.c.e");
    }

    /* renamed from: a */
    private static String m22222a(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f16249d[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C5811f.m21947a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r6 == 900) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r4 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.f16250a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r0.append((char) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r6 == 900) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r6 == 900) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        r6 = 0;
        r15 = r5;
        r5 = r4;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
        if (r6 == 900) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b4, code lost:
        r6 = (char) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
        r6 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        r4 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.f16251b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        r4 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.f16252c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c6, code lost:
        r5 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.f16255f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ce, code lost:
        if (r6 == 900) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d1, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d2, code lost:
        if (r6 == 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d4, code lost:
        r0.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d7, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r6 == 900) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m22223a(int[] r16, int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
            r0 = r19
            d.g.f.h.a.f$a r1 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.ALPHA
            r2 = 0
            r4 = r1
            r5 = r4
            r3 = r2
            r1 = r18
        L_0x000a:
            if (r3 >= r1) goto L_0x00db
            r6 = r16[r3]
            int[] r7 = p101d.p129g.p159f.p180h.p181a.C5870e.f16245a
            int r8 = r4.ordinal()
            r7 = r7[r8]
            r8 = 28
            r9 = 27
            r10 = 32
            r11 = 913(0x391, float:1.28E-42)
            r12 = 900(0x384, float:1.261E-42)
            r13 = 29
            r14 = 26
            switch(r7) {
                case 1: goto L_0x00b0;
                case 2: goto L_0x0091;
                case 3: goto L_0x006d;
                case 4: goto L_0x0052;
                case 5: goto L_0x003f;
                case 6: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x00d1
        L_0x0029:
            if (r6 >= r13) goto L_0x0030
            char[] r4 = f16246a
            char r4 = r4[r6]
            goto L_0x0044
        L_0x0030:
            if (r6 != r13) goto L_0x0033
            goto L_0x005c
        L_0x0033:
            if (r6 != r11) goto L_0x003c
            r4 = r17[r3]
            char r4 = (char) r4
            r0.append(r4)
            goto L_0x0050
        L_0x003c:
            if (r6 != r12) goto L_0x0050
            goto L_0x005c
        L_0x003f:
            if (r6 >= r14) goto L_0x0048
            int r6 = r6 + 65
            char r4 = (char) r6
        L_0x0044:
            r6 = r4
        L_0x0045:
            r4 = r5
            goto L_0x00d2
        L_0x0048:
            if (r6 != r14) goto L_0x004d
            r4 = r5
            goto L_0x00b8
        L_0x004d:
            if (r6 != r12) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r6 = r2
            goto L_0x0045
        L_0x0052:
            if (r6 >= r13) goto L_0x005a
            char[] r7 = f16246a
            char r6 = r7[r6]
            goto L_0x00d2
        L_0x005a:
            if (r6 != r13) goto L_0x0060
        L_0x005c:
            d.g.f.h.a.f$a r4 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.ALPHA
            goto L_0x00d1
        L_0x0060:
            if (r6 != r11) goto L_0x006a
            r6 = r17[r3]
        L_0x0064:
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00d1
        L_0x006a:
            if (r6 != r12) goto L_0x00d1
            goto L_0x005c
        L_0x006d:
            r7 = 25
            if (r6 >= r7) goto L_0x0077
            char[] r7 = f16247b
            char r6 = r7[r6]
            goto L_0x00d2
        L_0x0077:
            if (r6 != r7) goto L_0x007d
            d.g.f.h.a.f$a r4 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.PUNCT
            goto L_0x00d1
        L_0x007d:
            if (r6 != r14) goto L_0x0080
            goto L_0x00b8
        L_0x0080:
            if (r6 != r9) goto L_0x0083
            goto L_0x00bc
        L_0x0083:
            if (r6 != r8) goto L_0x0086
            goto L_0x005c
        L_0x0086:
            if (r6 != r13) goto L_0x0089
            goto L_0x00c6
        L_0x0089:
            if (r6 != r11) goto L_0x008e
            r6 = r17[r3]
            goto L_0x0064
        L_0x008e:
            if (r6 != r12) goto L_0x00d1
            goto L_0x005c
        L_0x0091:
            if (r6 >= r14) goto L_0x0096
            int r6 = r6 + 97
            goto L_0x00b4
        L_0x0096:
            if (r6 != r14) goto L_0x0099
            goto L_0x00b8
        L_0x0099:
            if (r6 != r9) goto L_0x00a2
            d.g.f.h.a.f$a r5 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.ALPHA_SHIFT
        L_0x009d:
            r6 = r2
            r15 = r5
            r5 = r4
            r4 = r15
            goto L_0x00d2
        L_0x00a2:
            if (r6 != r8) goto L_0x00a5
            goto L_0x00c1
        L_0x00a5:
            if (r6 != r13) goto L_0x00a8
            goto L_0x00c6
        L_0x00a8:
            if (r6 != r11) goto L_0x00ad
            r6 = r17[r3]
            goto L_0x0064
        L_0x00ad:
            if (r6 != r12) goto L_0x00d1
            goto L_0x005c
        L_0x00b0:
            if (r6 >= r14) goto L_0x00b6
            int r6 = r6 + 65
        L_0x00b4:
            char r6 = (char) r6
            goto L_0x00d2
        L_0x00b6:
            if (r6 != r14) goto L_0x00ba
        L_0x00b8:
            r6 = r10
            goto L_0x00d2
        L_0x00ba:
            if (r6 != r9) goto L_0x00bf
        L_0x00bc:
            d.g.f.h.a.f$a r4 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.LOWER
            goto L_0x00d1
        L_0x00bf:
            if (r6 != r8) goto L_0x00c4
        L_0x00c1:
            d.g.f.h.a.f$a r4 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.MIXED
            goto L_0x00d1
        L_0x00c4:
            if (r6 != r13) goto L_0x00c9
        L_0x00c6:
            d.g.f.h.a.f$a r5 = p101d.p129g.p159f.p180h.p181a.C5871f.C5872a.PUNCT_SHIFT
            goto L_0x009d
        L_0x00c9:
            if (r6 != r11) goto L_0x00ce
            r6 = r17[r3]
            goto L_0x0064
        L_0x00ce:
            if (r6 != r12) goto L_0x00d1
            goto L_0x005c
        L_0x00d1:
            r6 = r2
        L_0x00d2:
            if (r6 == 0) goto L_0x00d7
            r0.append(r6)
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p180h.p181a.C5871f.m22223a(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: b */
    private static int m22224b(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) * 2)];
        int[] iArr3 = new int[((iArr[0] - i) * 2)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i4) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i3--;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
            continue;
        }
        m22223a(iArr2, iArr3, i2, sb);
        return i;
    }
}
