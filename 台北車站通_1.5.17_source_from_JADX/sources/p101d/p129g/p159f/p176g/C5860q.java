package p101d.p129g.p159f.p176g;

import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.q */
public final class C5860q extends C5859p {

    /* renamed from: h */
    private static final int[] f16208h = {1, 1, 1, 1, 1, 1};

    /* renamed from: i */
    private static final int[][] f16209i = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: j */
    private final int[] f16210j = new int[4];

    /* renamed from: a */
    private static void m22151a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f16209i[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C5882i.m22303a();
    }

    /* renamed from: b */
    public static String m22152b(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15552a(C5772a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f16210j;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int f = aVar.mo15378f();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6 && i < f) {
            int a = C5859p.m22140a(aVar, iArr2, i, C5859p.f16204d);
            sb.append((char) ((a % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a >= 10) {
                i3 = (1 << (5 - i2)) | i3;
            }
            i2++;
            i = i4;
        }
        m22151a(sb, i3);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5743a mo15553a() {
        return C5743a.UPC_E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15563a(String str) {
        return super.mo15563a(m22152b(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int[] mo15564a(C5772a aVar, int i) {
        return C5859p.m22143a(aVar, i, true, f16208h);
    }
}
