package p101d.p129g.p159f.p176g;

import java.util.Arrays;
import java.util.Map;
import org.apache.http.HttpStatus;
import org.apache.http.message.TokenParser;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5790d;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.c */
public final class C5846c extends C5854k {

    /* renamed from: a */
    private static final char[] f16168a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();

    /* renamed from: b */
    static final int[] f16169b = {52, 289, 97, 352, 49, HttpStatus.SC_NOT_MODIFIED, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, HttpStatus.SC_BAD_REQUEST, 208, 133, 388, 196, 148, 168, 162, 138, 42};

    /* renamed from: c */
    private static final int f16170c = f16169b[39];

    /* renamed from: d */
    private final boolean f16171d;

    /* renamed from: e */
    private final boolean f16172e;

    /* renamed from: f */
    private final StringBuilder f16173f;

    /* renamed from: g */
    private final int[] f16174g;

    public C5846c() {
        this(false);
    }

    public C5846c(boolean z) {
        this(z, false);
    }

    public C5846c(boolean z, boolean z2) {
        this.f16171d = z;
        this.f16172e = z2;
        this.f16173f = new StringBuilder(20);
        this.f16174g = new int[9];
    }

    /* renamed from: a */
    private static char m22086a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f16169b;
            if (i2 >= iArr.length) {
                throw C5882i.m22303a();
            } else if (iArr[i2] == i) {
                return f16168a[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: a */
    private static int m22087a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if (i10 * 2 >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: a */
    private static String m22088a(CharSequence charSequence) {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                charAt = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                            } else if (charAt2 == 'Z') {
                                charAt = ':';
                            } else {
                                throw C5811f.m21947a();
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw C5811f.m21947a();
                        } else {
                            i = charAt2 + TokenParser.f19315SP;
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw C5811f.m21947a();
                    } else {
                        i = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw C5811f.m21947a();
                } else {
                    i = charAt2 - '@';
                }
                charAt = (char) i;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static int[] m22089a(C5772a aVar, int[] iArr) {
        int f = aVar.mo15378f();
        int b = aVar.mo15371b(0);
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
                } else if (m22087a(iArr) != f16170c || !aVar.mo15370a(Math.max(0, i2 - ((b - i2) / 2)), i2, false)) {
                    i2 += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i--;
                } else {
                    return new int[]{i2, b};
                }
                iArr[i] = 1;
                z = !z;
            }
            b++;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        int[] iArr = this.f16174g;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f16173f;
        sb.setLength(0);
        int[] a = m22089a(aVar, iArr);
        int b = aVar.mo15371b(a[1]);
        int f = aVar.mo15378f();
        while (true) {
            C5854k.m22117a(aVar, b, iArr);
            int a2 = m22087a(iArr);
            if (a2 >= 0) {
                char a3 = m22086a(a2);
                sb.append(a3);
                int i2 = b;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int b2 = aVar.mo15371b(i2);
                if (a3 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = (b2 - b) - i4;
                    if (b2 == f || i6 * 2 >= i4) {
                        if (this.f16171d) {
                            int length = sb.length() - 1;
                            int i7 = 0;
                            for (int i8 = 0; i8 < length; i8++) {
                                i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(this.f16173f.charAt(i8));
                            }
                            if (sb.charAt(length) == f16168a[i7 % 43]) {
                                sb.setLength(length);
                            } else {
                                throw C5790d.m21877a();
                            }
                        }
                        if (sb.length() != 0) {
                            float f2 = (float) i;
                            return new C5917m(this.f16172e ? m22088a((CharSequence) sb) : sb.toString(), (byte[]) null, new C5919o[]{new C5919o(((float) (a[1] + a[0])) / 2.0f, f2), new C5919o(((float) b) + (((float) i4) / 2.0f), f2)}, C5743a.CODE_39);
                        }
                        throw C5882i.m22303a();
                    }
                    throw C5882i.m22303a();
                }
                b = b2;
            } else {
                throw C5882i.m22303a();
            }
        }
    }
}
