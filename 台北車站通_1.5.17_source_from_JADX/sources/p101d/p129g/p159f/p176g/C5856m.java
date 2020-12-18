package p101d.p129g.p159f.p176g;

import java.util.EnumMap;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5918n;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.m */
final class C5856m {

    /* renamed from: a */
    private final int[] f16193a = new int[4];

    /* renamed from: b */
    private final StringBuilder f16194b = new StringBuilder();

    C5856m() {
    }

    /* renamed from: a */
    private static Map<C5918n, Object> m22130a(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C5918n.class);
        enumMap.put(C5918n.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15558a(C5772a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f16193a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int f = aVar.mo15378f();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 2 && i < f) {
            int a = C5859p.m22140a(aVar, iArr2, i, C5859p.f16204d);
            sb.append((char) ((a % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a >= 10) {
                i3 = (1 << (1 - i2)) | i3;
            }
            i = i2 != 1 ? aVar.mo15372c(aVar.mo15371b(i4)) : i4;
            i2++;
        }
        if (sb.length() != 2) {
            throw C5882i.m22303a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i3) {
            return i;
        } else {
            throw C5882i.m22303a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5917m mo15559a(int i, C5772a aVar, int[] iArr) {
        StringBuilder sb = this.f16194b;
        sb.setLength(0);
        int a = mo15558a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C5918n, Object> a2 = m22130a(sb2);
        float f = (float) i;
        C5917m mVar = new C5917m(sb2, (byte[]) null, new C5919o[]{new C5919o(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C5919o((float) a, f)}, C5743a.UPC_EAN_EXTENSION);
        if (a2 != null) {
            mVar.mo15695a(a2);
        }
        return mVar;
    }
}
