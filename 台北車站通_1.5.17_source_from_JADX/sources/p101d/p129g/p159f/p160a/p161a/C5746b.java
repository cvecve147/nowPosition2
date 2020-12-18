package p101d.p129g.p159f.p160a.p161a;

import java.util.Arrays;
import java.util.List;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p160a.C5744a;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5782e;
import p101d.p129g.p159f.p167c.p169b.C5776a;
import p101d.p129g.p159f.p167c.p169b.C5778c;
import p101d.p129g.p159f.p167c.p169b.C5779d;

/* renamed from: d.g.f.a.a.b */
public final class C5746b {

    /* renamed from: a */
    private static final String[] f15878a = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: b */
    private static final String[] f15879b = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f15880c = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f15881d = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: e */
    private static final String[] f15882e = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: f */
    private C5744a f15883f;

    /* renamed from: d.g.f.a.a.b$a */
    private enum C5747a {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    private static int m21705a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    /* renamed from: a */
    private static int m21706a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static C5747a m21707a(char c) {
        return c != 'B' ? c != 'D' ? c != 'P' ? c != 'L' ? c != 'M' ? C5747a.UPPER : C5747a.MIXED : C5747a.LOWER : C5747a.PUNCT : C5747a.DIGIT : C5747a.BINARY;
    }

    /* renamed from: a */
    private static String m21708a(C5747a aVar, int i) {
        int i2 = C5745a.f15877a[aVar.ordinal()];
        if (i2 == 1) {
            return f15878a[i];
        }
        if (i2 == 2) {
            return f15879b[i];
        }
        if (i2 == 3) {
            return f15880c[i];
        }
        if (i2 == 4) {
            return f15881d[i];
        }
        if (i2 == 5) {
            return f15882e[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: a */
    private boolean[] m21709a(boolean[] zArr) {
        C5776a aVar;
        int i = 8;
        if (this.f15883f.mo15329d() <= 2) {
            i = 6;
            aVar = C5776a.f15953c;
        } else if (this.f15883f.mo15329d() <= 8) {
            aVar = C5776a.f15957g;
        } else if (this.f15883f.mo15329d() <= 22) {
            i = 10;
            aVar = C5776a.f15952b;
        } else {
            i = 12;
            aVar = C5776a.f15951a;
        }
        int c = this.f15883f.mo15328c();
        int length = zArr.length / i;
        if (length >= c) {
            int i2 = length - c;
            int[] iArr = new int[length];
            int length2 = zArr.length % i;
            int i3 = 0;
            while (i3 < length) {
                iArr[i3] = m21706a(zArr, length2, i);
                i3++;
                length2 += i;
            }
            try {
                new C5778c(aVar).mo15420a(iArr, i2);
                int i4 = (1 << i) - 1;
                int i5 = 0;
                for (int i6 = 0; i6 < c; i6++) {
                    int i7 = iArr[i6];
                    if (i7 == 0 || i7 == i4) {
                        throw C5811f.m21947a();
                    }
                    if (i7 == 1 || i7 == i4 - 1) {
                        i5++;
                    }
                }
                boolean[] zArr2 = new boolean[((c * i) - i5)];
                int i8 = 0;
                for (int i9 = 0; i9 < c; i9++) {
                    int i10 = iArr[i9];
                    if (i10 == 1 || i10 == i4 - 1) {
                        Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                        i8 += i - 1;
                    } else {
                        int i11 = i - 1;
                        while (i11 >= 0) {
                            int i12 = i8 + 1;
                            zArr2[i8] = ((1 << i11) & i10) != 0;
                            i11--;
                            i8 = i12;
                        }
                    }
                }
                return zArr2;
            } catch (C5779d e) {
                throw C5811f.m21948a(e);
            }
        } else {
            throw C5811f.m21947a();
        }
    }

    /* renamed from: b */
    private static String m21710b(boolean[] zArr) {
        int length = zArr.length;
        C5747a aVar = C5747a.UPPER;
        StringBuilder sb = new StringBuilder(20);
        C5747a aVar2 = aVar;
        C5747a aVar3 = aVar2;
        int i = 0;
        while (i < length) {
            if (aVar2 == C5747a.BINARY) {
                if (length - i >= 5) {
                    int a = m21706a(zArr, i, 5);
                    int i2 = i + 5;
                    if (a == 0) {
                        if (length - i2 < 11) {
                            break;
                        }
                        a = m21706a(zArr, i2, 11) + 31;
                        i2 += 11;
                    }
                    int i3 = i2;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= a) {
                            i = i3;
                            break;
                        } else if (length - i3 < 8) {
                            i = length;
                            break;
                        } else {
                            sb.append((char) m21706a(zArr, i3, 8));
                            i3 += 8;
                            i4++;
                        }
                    }
                } else {
                    break;
                }
            } else {
                int i5 = aVar2 == C5747a.DIGIT ? 4 : 5;
                if (length - i < i5) {
                    break;
                }
                int a2 = m21706a(zArr, i, i5);
                i += i5;
                String a3 = m21708a(aVar2, a2);
                if (a3.startsWith("CTRL_")) {
                    C5747a a4 = m21707a(a3.charAt(5));
                    if (a3.charAt(6) == 'L') {
                        aVar2 = a4;
                        aVar3 = aVar2;
                    } else {
                        aVar2 = a4;
                    }
                } else {
                    sb.append(a3);
                }
            }
            aVar2 = aVar3;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C5782e mo15331a(C5744a aVar) {
        this.f15883f = aVar;
        return new C5782e((byte[]) null, m21710b(m21709a(mo15332a(aVar.mo15438a()))), (List<byte[]>) null, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean[] mo15332a(C5775b bVar) {
        C5775b bVar2 = bVar;
        boolean e = this.f15883f.mo15330e();
        int d = this.f15883f.mo15329d();
        int i = e ? (d * 4) + 11 : (d * 4) + 14;
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[m21705a(d, e)];
        int i2 = 2;
        if (e) {
            for (int i3 = 0; i3 < iArr.length; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < d) {
            int i10 = e ? ((d - i8) * 4) + 9 : ((d - i8) * 4) + 12;
            int i11 = i8 * 2;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 * 2;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = bVar2.mo15389b(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = bVar2.mo15389b(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = bVar2.mo15389b(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = bVar2.mo15389b(iArr[i20], iArr[i16]);
                    i15++;
                    i2 = 2;
                    d = d;
                    e = e;
                }
                boolean z = e;
                int i21 = d;
                i13++;
                i2 = 2;
            }
            boolean z2 = e;
            int i22 = d;
            i9 += i10 * 8;
            i8++;
            i2 = 2;
        }
        return zArr;
    }
}
