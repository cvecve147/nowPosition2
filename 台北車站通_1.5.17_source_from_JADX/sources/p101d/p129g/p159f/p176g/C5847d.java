package p101d.p129g.p159f.p176g;

import java.util.Arrays;
import java.util.Map;
import okhttp3.internal.http.StatusLine;
import org.apache.http.HttpStatus;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5790d;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.d */
public final class C5847d extends C5854k {

    /* renamed from: a */
    private static final char[] f16175a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: b */
    private static final int[] f16176b = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, HttpStatus.SC_FAILED_DEPENDENCY, HttpStatus.SC_METHOD_FAILURE, 418, HttpStatus.SC_NOT_FOUND, HttpStatus.SC_PAYMENT_REQUIRED, 394, 360, 356, 354, StatusLine.HTTP_PERM_REDIRECT, 282, 344, 332, 326, HttpStatus.SC_MULTIPLE_CHOICES, 278, 436, 434, 428, HttpStatus.SC_UNPROCESSABLE_ENTITY, HttpStatus.SC_NOT_ACCEPTABLE, HttpStatus.SC_GONE, 364, 358, 310, 314, HttpStatus.SC_MOVED_TEMPORARILY, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};

    /* renamed from: c */
    private static final int f16177c = f16176b[47];

    /* renamed from: d */
    private final StringBuilder f16178d = new StringBuilder(20);

    /* renamed from: e */
    private final int[] f16179e = new int[6];

    /* renamed from: a */
    private static char m22091a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f16176b;
            if (i2 >= iArr.length) {
                throw C5882i.m22303a();
            } else if (iArr[i2] == i) {
                return f16175a[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: a */
    private static int m22092a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                int i5 = i3;
                for (int i6 = 0; i6 < round; i6++) {
                    i5 = (i5 << 1) | 1;
                }
                i3 = i5;
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static void m22093a(CharSequence charSequence) {
        int length = charSequence.length();
        m22094a(charSequence, length - 2, 20);
        m22094a(charSequence, length - 1, 15);
    }

    /* renamed from: a */
    private static void m22094a(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f16175a[i3 % 47]) {
            throw C5790d.m21877a();
        }
    }

    /* renamed from: a */
    private int[] m22095a(C5772a aVar) {
        int f = aVar.mo15378f();
        int b = aVar.mo15371b(0);
        Arrays.fill(this.f16179e, 0);
        int[] iArr = this.f16179e;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = b;
        while (b < f) {
            if (aVar.mo15369a(b) ^ z) {
                iArr[i] = iArr[i] + 1;
            } else {
                int i3 = length - 1;
                if (i != i3) {
                    i++;
                } else if (m22092a(iArr) == f16177c) {
                    return new int[]{i2, b};
                } else {
                    i2 += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            b++;
        }
        throw C5882i.m22303a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m22096b(java.lang.CharSequence r9) {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r0) goto L_0x009b
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x0094
            r5 = 100
            if (r4 > r5) goto L_0x0094
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x008f
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0082;
                case 98: goto L_0x004c;
                case 99: goto L_0x003b;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = r2
            goto L_0x0094
        L_0x002f:
            if (r5 < r8) goto L_0x0036
            if (r5 > r7) goto L_0x0036
            int r5 = r5 + 32
            goto L_0x0088
        L_0x0036:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x003b:
            if (r5 < r8) goto L_0x0042
            if (r5 > r6) goto L_0x0042
            int r5 = r5 + -32
            goto L_0x0088
        L_0x0042:
            if (r5 != r7) goto L_0x0047
            r4 = 58
            goto L_0x0094
        L_0x0047:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x004c:
            if (r5 < r8) goto L_0x0055
            r4 = 69
            if (r5 > r4) goto L_0x0055
            int r5 = r5 + -38
            goto L_0x0088
        L_0x0055:
            r4 = 70
            if (r5 < r4) goto L_0x0060
            r4 = 74
            if (r5 > r4) goto L_0x0060
            int r5 = r5 + -11
            goto L_0x0088
        L_0x0060:
            r4 = 75
            if (r5 < r4) goto L_0x0069
            if (r5 > r6) goto L_0x0069
            int r5 = r5 + 16
            goto L_0x0088
        L_0x0069:
            r4 = 80
            if (r5 < r4) goto L_0x0074
            r4 = 83
            if (r5 > r4) goto L_0x0074
            int r5 = r5 + 43
            goto L_0x0088
        L_0x0074:
            r4 = 84
            if (r5 < r4) goto L_0x007d
            if (r5 > r7) goto L_0x007d
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x0094
        L_0x007d:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x0094
        L_0x008a:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x008f:
            d.g.f.f r9 = p101d.p129g.p159f.C5811f.m21947a()
            throw r9
        L_0x0094:
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009b:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p176g.C5847d.m22096b(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        int[] a = m22095a(aVar);
        int b = aVar.mo15371b(a[1]);
        int f = aVar.mo15378f();
        int[] iArr = this.f16179e;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f16178d;
        sb.setLength(0);
        while (true) {
            C5854k.m22117a(aVar, b, iArr);
            int a2 = m22092a(iArr);
            if (a2 >= 0) {
                char a3 = m22091a(a2);
                sb.append(a3);
                int i2 = b;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int b2 = aVar.mo15371b(i2);
                if (a3 == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (b2 == f || !aVar.mo15369a(b2)) {
                        throw C5882i.m22303a();
                    } else if (sb.length() >= 2) {
                        m22093a((CharSequence) sb);
                        sb.setLength(sb.length() - 2);
                        float f2 = (float) i;
                        return new C5917m(m22096b(sb), (byte[]) null, new C5919o[]{new C5919o(((float) (a[1] + a[0])) / 2.0f, f2), new C5919o(((float) b) + (((float) i4) / 2.0f), f2)}, C5743a.CODE_93);
                    } else {
                        throw C5882i.m22303a();
                    }
                } else {
                    b = b2;
                }
            } else {
                throw C5882i.m22303a();
            }
        }
    }
}
