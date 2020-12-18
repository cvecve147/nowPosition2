package p101d.p129g.p159f.p184i.p185a;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import org.apache.http.message.TokenParser;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p167c.C5780c;
import p101d.p129g.p159f.p167c.C5781d;
import p101d.p129g.p159f.p167c.C5789l;

/* renamed from: d.g.f.i.a.e */
final class C5896e {

    /* renamed from: a */
    private static final char[] f16286a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', TokenParser.f19315SP, '$', '%', '*', '+', '-', '.', '/', ':'};

    /* renamed from: a */
    private static char m22329a(int i) {
        char[] cArr = f16286a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C5811f.m21947a();
    }

    /* renamed from: a */
    private static int m22330a(C5780c cVar) {
        int a = cVar.mo15422a(8);
        if ((a & 128) == 0) {
            return a & 127;
        }
        if ((a & 192) == 128) {
            return cVar.mo15422a(8) | ((a & 63) << 8);
        }
        if ((a & 224) == 192) {
            return cVar.mo15422a(16) | ((a & 31) << 16);
        }
        throw C5811f.m21947a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e8 A[LOOP:0: B:1:0x001e->B:60:0x00e8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p101d.p129g.p159f.p167c.C5782e m22331a(byte[] r17, p101d.p129g.p159f.p184i.p185a.C5902k r18, p101d.p129g.p159f.p184i.p185a.C5898g r19, java.util.Map<p101d.p129g.p159f.C5806e, ?> r20) {
        /*
            r0 = r18
            d.g.f.c.c r7 = new d.g.f.c.c
            r8 = r17
            r7.<init>(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r1 = 50
            r9.<init>(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            r10.<init>(r11)
            r1 = 0
            r2 = -1
            r12 = 0
            r13 = r1
            r15 = r2
            r16 = r15
            r14 = r12
        L_0x001e:
            int r1 = r7.mo15421a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            r2 = 4
            if (r1 >= r2) goto L_0x0029
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x0027:
            r6 = r1
            goto L_0x0032
        L_0x0029:
            int r1 = r7.mo15422a(r2)     // Catch:{ IllegalArgumentException -> 0x00eb }
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.m22346a((int) r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x0027
        L_0x0032:
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 == r1) goto L_0x0059
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 == r1) goto L_0x00c0
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x0040
            goto L_0x00c0
        L_0x0040:
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x0061
            int r1 = r7.mo15421a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            r2 = 16
            if (r1 < r2) goto L_0x005c
            r1 = 8
            int r2 = r7.mo15422a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            int r1 = r7.mo15422a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            r16 = r1
            r15 = r2
        L_0x0059:
            r11 = r6
            goto L_0x00c2
        L_0x005c:
            d.g.f.f r0 = p101d.p129g.p159f.C5811f.m21947a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x0061:
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.ECI     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x0075
            int r1 = m22330a((p101d.p129g.p159f.p167c.C5780c) r7)     // Catch:{ IllegalArgumentException -> 0x00eb }
            d.g.f.c.d r14 = p101d.p129g.p159f.p167c.C5781d.m21841a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r14 == 0) goto L_0x0070
            goto L_0x0059
        L_0x0070:
            d.g.f.f r0 = p101d.p129g.p159f.C5811f.m21947a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x0075:
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.HANZI     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x008b
            int r1 = r7.mo15422a(r2)     // Catch:{ IllegalArgumentException -> 0x00eb }
            int r2 = r6.mo15659a((p101d.p129g.p159f.p184i.p185a.C5902k) r0)     // Catch:{ IllegalArgumentException -> 0x00eb }
            int r2 = r7.mo15422a(r2)     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r1 != r11) goto L_0x0059
            m22332a(r7, r9, r2)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x0059
        L_0x008b:
            int r1 = r6.mo15659a((p101d.p129g.p159f.p184i.p185a.C5902k) r0)     // Catch:{ IllegalArgumentException -> 0x00eb }
            int r3 = r7.mo15422a(r1)     // Catch:{ IllegalArgumentException -> 0x00eb }
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.NUMERIC     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x009b
            m22336c(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x0059
        L_0x009b:
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x00a3
            m22334a((p101d.p129g.p159f.p167c.C5780c) r7, (java.lang.StringBuilder) r9, (int) r3, (boolean) r13)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x0059
        L_0x00a3:
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.BYTE     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r6 != r1) goto L_0x00b2
            r1 = r7
            r2 = r9
            r4 = r14
            r5 = r10
            r11 = r6
            r6 = r20
            m22333a(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x00c2
        L_0x00b2:
            r11 = r6
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.KANJI     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r11 != r1) goto L_0x00bb
            m22335b(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00eb }
            goto L_0x00c2
        L_0x00bb:
            d.g.f.f r0 = p101d.p129g.p159f.C5811f.m21947a()     // Catch:{ IllegalArgumentException -> 0x00eb }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x00c0:
            r11 = r6
            r13 = 1
        L_0x00c2:
            d.g.f.i.a.i r1 = p101d.p129g.p159f.p184i.p185a.C5900i.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00eb }
            if (r11 != r1) goto L_0x00e8
            d.g.f.c.e r7 = new d.g.f.c.e
            java.lang.String r2 = r9.toString()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00d4
            r3 = r12
            goto L_0x00d5
        L_0x00d4:
            r3 = r10
        L_0x00d5:
            if (r19 != 0) goto L_0x00d9
            r4 = r12
            goto L_0x00de
        L_0x00d9:
            java.lang.String r0 = r19.toString()
            r4 = r0
        L_0x00de:
            r0 = r7
            r1 = r17
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00e8:
            r11 = 1
            goto L_0x001e
        L_0x00eb:
            d.g.f.f r0 = p101d.p129g.p159f.C5811f.m21947a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p184i.p185a.C5896e.m22331a(byte[], d.g.f.i.a.k, d.g.f.i.a.g, java.util.Map):d.g.f.c.e");
    }

    /* renamed from: a */
    private static void m22332a(C5780c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo15421a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int a = cVar.mo15422a(13);
                int i3 = (a % 96) | ((a / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) ((i4 >> 8) & 255);
                bArr[i2 + 1] = (byte) (i4 & 255);
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw C5811f.m21947a();
            }
        } else {
            throw C5811f.m21947a();
        }
    }

    /* renamed from: a */
    private static void m22333a(C5780c cVar, StringBuilder sb, int i, C5781d dVar, Collection<byte[]> collection, Map<C5806e, ?> map) {
        if (i * 8 <= cVar.mo15421a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo15422a(8);
            }
            try {
                sb.append(new String(bArr, dVar == null ? C5789l.m21876a(bArr, map) : dVar.name()));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw C5811f.m21947a();
            }
        } else {
            throw C5811f.m21947a();
        }
    }

    /* renamed from: a */
    private static void m22334a(C5780c cVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (cVar.mo15421a() >= 11) {
                int a = cVar.mo15422a(11);
                sb.append(m22329a(a / 45));
                sb.append(m22329a(a % 45));
                i -= 2;
            } else {
                throw C5811f.m21947a();
            }
        }
        if (i == 1) {
            if (cVar.mo15421a() >= 6) {
                sb.append(m22329a(cVar.mo15422a(6)));
            } else {
                throw C5811f.m21947a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m22335b(C5780c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo15421a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int a = cVar.mo15422a(13);
                int i3 = (a % 192) | ((a / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw C5811f.m21947a();
            }
        } else {
            throw C5811f.m21947a();
        }
    }

    /* renamed from: c */
    private static void m22336c(C5780c cVar, StringBuilder sb, int i) {
        int a;
        while (i >= 3) {
            if (cVar.mo15421a() >= 10) {
                int a2 = cVar.mo15422a(10);
                if (a2 < 1000) {
                    sb.append(m22329a(a2 / 100));
                    sb.append(m22329a((a2 / 10) % 10));
                    sb.append(m22329a(a2 % 10));
                    i -= 3;
                } else {
                    throw C5811f.m21947a();
                }
            } else {
                throw C5811f.m21947a();
            }
        }
        if (i == 2) {
            if (cVar.mo15421a() >= 7) {
                int a3 = cVar.mo15422a(7);
                if (a3 < 100) {
                    sb.append(m22329a(a3 / 10));
                    a = a3 % 10;
                } else {
                    throw C5811f.m21947a();
                }
            } else {
                throw C5811f.m21947a();
            }
        } else if (i != 1) {
            return;
        } else {
            if (cVar.mo15421a() >= 4) {
                a = cVar.mo15422a(4);
                if (a >= 10) {
                    throw C5811f.m21947a();
                }
            } else {
                throw C5811f.m21947a();
            }
        }
        sb.append(m22329a(a));
    }
}
