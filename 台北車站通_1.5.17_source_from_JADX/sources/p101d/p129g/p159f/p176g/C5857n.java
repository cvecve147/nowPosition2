package p101d.p129g.p159f.p176g;

import java.util.EnumMap;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5918n;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.n */
final class C5857n {

    /* renamed from: a */
    private static final int[] f16195a = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: b */
    private final int[] f16196b = new int[4];

    /* renamed from: c */
    private final StringBuilder f16197c = new StringBuilder();

    C5857n() {
    }

    /* renamed from: a */
    private static int m22133a(int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f16195a[i2]) {
                return i2;
            }
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private static int m22134a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* renamed from: a */
    private static String m22135a(String str) {
        String str2;
        char charAt = str.charAt(0);
        String str3 = "";
        if (charAt == '0') {
            str3 = "£";
        } else if (charAt == '5') {
            str3 = "$";
        } else if (charAt == '9') {
            if ("90000".equals(str)) {
                return null;
            }
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            str2 = "0" + i;
        } else {
            str2 = String.valueOf(i);
        }
        return str3 + valueOf + '.' + str2;
    }

    /* renamed from: b */
    private static Map<C5918n, Object> m22136b(String str) {
        String a;
        if (str.length() != 5 || (a = m22135a(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5918n.class);
        enumMap.put(C5918n.SUGGESTED_PRICE, a);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15560a(C5772a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f16196b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int f = aVar.mo15378f();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5 && i < f) {
            int a = C5859p.m22140a(aVar, iArr2, i, C5859p.f16204d);
            sb.append((char) ((a % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a >= 10) {
                i3 |= 1 << (4 - i2);
            }
            i = i2 != 4 ? aVar.mo15372c(aVar.mo15371b(i4)) : i4;
            i2++;
        }
        if (sb.length() == 5) {
            if (m22134a((CharSequence) sb.toString()) == m22133a(i3)) {
                return i;
            }
            throw C5882i.m22303a();
        }
        throw C5882i.m22303a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5917m mo15561a(int i, C5772a aVar, int[] iArr) {
        StringBuilder sb = this.f16197c;
        sb.setLength(0);
        int a = mo15560a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C5918n, Object> b = m22136b(sb2);
        float f = (float) i;
        C5917m mVar = new C5917m(sb2, (byte[]) null, new C5919o[]{new C5919o(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C5919o((float) a, f)}, C5743a.UPC_EAN_EXTENSION);
        if (b != null) {
            mVar.mo15695a(b);
        }
        return mVar;
    }
}
