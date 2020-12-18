package p101d.p129g.p159f.p170d.p171a;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import org.apache.http.message.TokenParser;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p167c.C5780c;

/* renamed from: d.g.f.d.a.d */
final class C5795d {

    /* renamed from: a */
    private static final char[] f16040a = {'*', '*', '*', TokenParser.f19315SP, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    private static final char[] f16041b = {'!', TokenParser.DQUOTE, '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', TokenParser.ESCAPE, ']', '^', '_'};

    /* renamed from: c */
    private static final char[] f16042c = {'*', '*', '*', TokenParser.f19315SP, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d */
    private static final char[] f16043d = f16041b;

    /* renamed from: e */
    private static final char[] f16044e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: d.g.f.d.a.d$a */
    private enum C5796a {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    /* renamed from: a */
    private static int m21895a(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p101d.p129g.p159f.p167c.C5782e m21896a(byte[] r7) {
        /*
            d.g.f.c.c r0 = new d.g.f.c.c
            r0.<init>(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            d.g.f.d.a.d$a r5 = p101d.p129g.p159f.p170d.p171a.C5795d.C5796a.ASCII_ENCODE
        L_0x001a:
            d.g.f.d.a.d$a r6 = p101d.p129g.p159f.p170d.p171a.C5795d.C5796a.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            d.g.f.d.a.d$a r5 = m21897a((p101d.p129g.p159f.p167c.C5780c) r0, (java.lang.StringBuilder) r1, (java.lang.StringBuilder) r2)
            goto L_0x0053
        L_0x0023:
            int[] r6 = p101d.p129g.p159f.p170d.p171a.C5794c.f16039a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r4) goto L_0x004e
            r6 = 2
            if (r5 == r6) goto L_0x004a
            r6 = 3
            if (r5 == r6) goto L_0x0046
            r6 = 4
            if (r5 == r6) goto L_0x0042
            r6 = 5
            if (r5 != r6) goto L_0x003d
            m21900a((p101d.p129g.p159f.p167c.C5780c) r0, (java.lang.StringBuilder) r1, (java.util.Collection<byte[]>) r3)
            goto L_0x0051
        L_0x003d:
            d.g.f.f r7 = p101d.p129g.p159f.C5811f.m21947a()
            throw r7
        L_0x0042:
            m21902c(r0, r1)
            goto L_0x0051
        L_0x0046:
            m21899a((p101d.p129g.p159f.p167c.C5780c) r0, (java.lang.StringBuilder) r1)
            goto L_0x0051
        L_0x004a:
            m21903d(r0, r1)
            goto L_0x0051
        L_0x004e:
            m21901b(r0, r1)
        L_0x0051:
            d.g.f.d.a.d$a r5 = p101d.p129g.p159f.p170d.p171a.C5795d.C5796a.ASCII_ENCODE
        L_0x0053:
            d.g.f.d.a.d$a r6 = p101d.p129g.p159f.p170d.p171a.C5795d.C5796a.PAD_ENCODE
            if (r5 == r6) goto L_0x005d
            int r6 = r0.mo15421a()
            if (r6 > 0) goto L_0x001a
        L_0x005d:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0066
            r1.append(r2)
        L_0x0066:
            d.g.f.c.e r0 = new d.g.f.c.e
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0074
            r3 = r4
        L_0x0074:
            r0.<init>(r7, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p170d.p171a.C5795d.m21896a(byte[]):d.g.f.c.e");
    }

    /* renamed from: a */
    private static C5796a m21897a(C5780c cVar, StringBuilder sb, StringBuilder sb2) {
        String str;
        boolean z = false;
        do {
            int a = cVar.mo15422a(8);
            if (a == 0) {
                throw C5811f.m21947a();
            } else if (a <= 128) {
                if (z) {
                    a += 128;
                }
                sb.append((char) (a - 1));
                return C5796a.ASCII_ENCODE;
            } else if (a == 129) {
                return C5796a.PAD_ENCODE;
            } else {
                if (a <= 229) {
                    int i = a - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else if (a == 230) {
                    return C5796a.C40_ENCODE;
                } else {
                    if (a == 231) {
                        return C5796a.BASE256_ENCODE;
                    }
                    if (a == 232) {
                        sb.append(29);
                    } else if (!(a == 233 || a == 234)) {
                        if (a == 235) {
                            z = true;
                        } else {
                            if (a == 236) {
                                str = "[)>\u001e05\u001d";
                            } else if (a == 237) {
                                str = "[)>\u001e06\u001d";
                            } else if (a == 238) {
                                return C5796a.ANSIX12_ENCODE;
                            } else {
                                if (a == 239) {
                                    return C5796a.TEXT_ENCODE;
                                }
                                if (a == 240) {
                                    return C5796a.EDIFACT_ENCODE;
                                }
                                if (!(a == 241 || a < 242 || (a == 254 && cVar.mo15421a() == 0))) {
                                    throw C5811f.m21947a();
                                }
                            }
                            sb.append(str);
                            sb2.insert(0, "\u001e\u0004");
                        }
                    }
                }
            }
        } while (cVar.mo15421a() > 0);
        return C5796a.ASCII_ENCODE;
    }

    /* renamed from: a */
    private static void m21898a(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: a */
    private static void m21899a(C5780c cVar, StringBuilder sb) {
        int a;
        int i;
        char c;
        int[] iArr = new int[3];
        while (cVar.mo15421a() != 8 && (a = cVar.mo15422a(8)) != 254) {
            m21898a(a, cVar.mo15422a(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    c = TokenParser.f19312CR;
                } else if (i3 == 1) {
                    c = '*';
                } else if (i3 == 2) {
                    c = '>';
                } else if (i3 == 3) {
                    c = TokenParser.f19315SP;
                } else {
                    if (i3 < 14) {
                        i = i3 + 44;
                    } else if (i3 < 40) {
                        i = i3 + 51;
                    } else {
                        throw C5811f.m21947a();
                    }
                    c = (char) i;
                }
                sb.append(c);
            }
            if (cVar.mo15421a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m21900a(C5780c cVar, StringBuilder sb, Collection<byte[]> collection) {
        int c = cVar.mo15424c() + 1;
        int i = c + 1;
        int a = m21895a(cVar.mo15422a(8), c);
        if (a == 0) {
            a = cVar.mo15421a() / 8;
        } else if (a >= 250) {
            a = ((a - 249) * 250) + m21895a(cVar.mo15422a(8), i);
            i++;
        }
        if (a >= 0) {
            byte[] bArr = new byte[a];
            int i2 = 0;
            while (i2 < a) {
                if (cVar.mo15421a() >= 8) {
                    bArr[i2] = (byte) m21895a(cVar.mo15422a(8), i);
                    i2++;
                    i++;
                } else {
                    throw C5811f.m21947a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: " + e);
            }
        } else {
            throw C5811f.m21947a();
        }
    }

    /* renamed from: b */
    private static void m21901b(C5780c cVar, StringBuilder sb) {
        int a;
        char c;
        char c2;
        int i;
        int[] iArr = new int[3];
        boolean z = false;
        int i2 = 0;
        while (cVar.mo15421a() != 8 && (a = cVar.mo15422a(8)) != 254) {
            m21898a(a, cVar.mo15422a(8), iArr);
            boolean z2 = z;
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (z2) {
                            i = i4 + 128;
                        }
                        c = (char) i4;
                        sb.append(c);
                        i2 = 0;
                    } else if (i2 == 2) {
                        char[] cArr = f16041b;
                        if (i4 < cArr.length) {
                            c = cArr[i4];
                            if (z2) {
                                c2 = (char) (c + 128);
                                sb.append(c2);
                                z2 = false;
                                i2 = 0;
                            }
                        } else if (i4 == 27) {
                            c = 29;
                        } else if (i4 == 30) {
                            z2 = true;
                            i2 = 0;
                        } else {
                            throw C5811f.m21947a();
                        }
                        sb.append(c);
                        i2 = 0;
                    } else if (i2 != 3) {
                        throw C5811f.m21947a();
                    } else if (z2) {
                        i = i4 + 224;
                    } else {
                        i4 += 96;
                        c = (char) i4;
                        sb.append(c);
                        i2 = 0;
                    }
                    c2 = (char) i;
                    sb.append(c2);
                    z2 = false;
                    i2 = 0;
                } else if (i4 < 3) {
                    i2 = i4 + 1;
                } else {
                    char[] cArr2 = f16040a;
                    if (i4 < cArr2.length) {
                        char c3 = cArr2[i4];
                        if (z2) {
                            sb.append((char) (c3 + 128));
                            z2 = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw C5811f.m21947a();
                    }
                }
            }
            if (cVar.mo15421a() > 0) {
                z = z2;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private static void m21902c(C5780c cVar, StringBuilder sb) {
        while (cVar.mo15421a() > 16) {
            for (int i = 0; i < 4; i++) {
                int a = cVar.mo15422a(6);
                if (a == 31) {
                    int b = 8 - cVar.mo15423b();
                    if (b != 8) {
                        cVar.mo15422a(b);
                        return;
                    }
                    return;
                }
                if ((a & 32) == 0) {
                    a |= 64;
                }
                sb.append((char) a);
            }
            if (cVar.mo15421a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r5 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        if (r5 != false) goto L_0x0038;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21903d(p101d.p129g.p159f.p167c.C5780c r9, java.lang.StringBuilder r10) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0006:
            int r5 = r9.mo15421a()
            r6 = 8
            if (r5 != r6) goto L_0x000f
            return
        L_0x000f:
            int r5 = r9.mo15422a(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L_0x0018
            return
        L_0x0018:
            int r6 = r9.mo15422a(r6)
            m21898a((int) r5, (int) r6, (int[]) r1)
            r5 = r3
            r3 = r2
        L_0x0021:
            if (r3 >= r0) goto L_0x0093
            r6 = r1[r3]
            if (r4 == 0) goto L_0x0072
            r7 = 1
            if (r4 == r7) goto L_0x0062
            r8 = 2
            if (r4 == r8) goto L_0x0046
            if (r4 != r0) goto L_0x0041
            char[] r4 = f16044e
            int r7 = r4.length
            if (r6 >= r7) goto L_0x003c
            char r4 = r4[r6]
            if (r5 == 0) goto L_0x006d
        L_0x0038:
            int r4 = r4 + 128
            char r4 = (char) r4
            goto L_0x0067
        L_0x003c:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x0041:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x0046:
            char[] r4 = f16043d
            int r8 = r4.length
            if (r6 >= r8) goto L_0x0050
            char r4 = r4[r6]
            if (r5 == 0) goto L_0x006d
            goto L_0x0038
        L_0x0050:
            r4 = 27
            if (r6 != r4) goto L_0x0057
            r4 = 29
            goto L_0x006d
        L_0x0057:
            r4 = 30
            if (r6 != r4) goto L_0x005d
            r5 = r7
            goto L_0x0070
        L_0x005d:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x0062:
            if (r5 == 0) goto L_0x006c
            int r6 = r6 + 128
            char r4 = (char) r6
        L_0x0067:
            r10.append(r4)
            r5 = r2
            goto L_0x0070
        L_0x006c:
            char r4 = (char) r6
        L_0x006d:
            r10.append(r4)
        L_0x0070:
            r4 = r2
            goto L_0x008b
        L_0x0072:
            if (r6 >= r0) goto L_0x0077
            int r4 = r6 + 1
            goto L_0x008b
        L_0x0077:
            char[] r7 = f16042c
            int r8 = r7.length
            if (r6 >= r8) goto L_0x008e
            char r6 = r7[r6]
            if (r5 == 0) goto L_0x0088
            int r6 = r6 + 128
            char r5 = (char) r6
            r10.append(r5)
            r5 = r2
            goto L_0x008b
        L_0x0088:
            r10.append(r6)
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x008e:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x0093:
            int r3 = r9.mo15421a()
            if (r3 > 0) goto L_0x009a
            return
        L_0x009a:
            r3 = r5
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p170d.p171a.C5795d.m21903d(d.g.f.c.c, java.lang.StringBuilder):void");
    }
}
