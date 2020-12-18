package p101d.p129g.p159f.p176g;

import java.util.Arrays;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5790d;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5916l;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5918n;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.C5920p;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.p */
public abstract class C5859p extends C5854k {

    /* renamed from: a */
    static final int[] f16201a = {1, 1, 1};

    /* renamed from: b */
    static final int[] f16202b = {1, 1, 1, 1, 1};

    /* renamed from: c */
    static final int[][] f16203c = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};

    /* renamed from: d */
    static final int[][] f16204d = new int[20][];

    /* renamed from: e */
    private final StringBuilder f16205e = new StringBuilder(20);

    /* renamed from: f */
    private final C5858o f16206f = new C5858o();

    /* renamed from: g */
    private final C5850g f16207g = new C5850g();

    static {
        System.arraycopy(f16203c, 0, f16204d, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr = f16203c[i - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[(iArr.length - i2) - 1];
            }
            f16204d[i] = iArr2;
        }
    }

    protected C5859p() {
    }

    /* renamed from: a */
    static int m22140a(C5772a aVar, int[] iArr, int i, int[][] iArr2) {
        C5854k.m22117a(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float a = C5854k.m22116a(iArr, iArr2[i3], 0.7f);
            if (a < f) {
                i2 = i3;
                f = a;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    static boolean m22141a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C5811f.m21947a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C5811f.m21947a();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }

    /* renamed from: a */
    static int[] m22142a(C5772a aVar) {
        int[] iArr = new int[f16201a.length];
        int i = 0;
        int[] iArr2 = null;
        boolean z = false;
        while (!z) {
            Arrays.fill(iArr, 0, f16201a.length, 0);
            iArr2 = m22144a(aVar, i, false, f16201a, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo15370a(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: a */
    static int[] m22143a(C5772a aVar, int i, boolean z, int[] iArr) {
        return m22144a(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: a */
    private static int[] m22144a(C5772a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int f = aVar.mo15378f();
        int c = z ? aVar.mo15372c(i) : aVar.mo15371b(i);
        int i2 = c;
        int i3 = 0;
        while (c < f) {
            boolean z2 = true;
            if (aVar.mo15369a(c) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C5854k.m22116a(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i2, c};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                if (z) {
                    z2 = false;
                }
                z = z2;
            }
            c++;
        }
        throw C5882i.m22303a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo15552a(C5772a aVar, int[] iArr, StringBuilder sb);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C5743a mo15553a();

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        return mo15557a(i, aVar, m22142a(aVar), map);
    }

    /* renamed from: a */
    public C5917m mo15557a(int i, C5772a aVar, int[] iArr, Map<C5806e, ?> map) {
        int i2;
        String a;
        int[] iArr2 = null;
        C5920p pVar = map == null ? null : (C5920p) map.get(C5806e.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (pVar != null) {
            pVar.mo11732a(new C5919o(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f16205e;
        sb.setLength(0);
        int a2 = mo15552a(aVar, iArr, sb);
        if (pVar != null) {
            pVar.mo11732a(new C5919o((float) a2, (float) i));
        }
        int[] a3 = mo15564a(aVar, a2);
        if (pVar != null) {
            pVar.mo11732a(new C5919o(((float) (a3[0] + a3[1])) / 2.0f, (float) i));
        }
        int i3 = a3[1];
        int i4 = (i3 - a3[0]) + i3;
        if (i4 >= aVar.mo15378f() || !aVar.mo15370a(i3, i4, false)) {
            throw C5882i.m22303a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C5811f.m21947a();
        } else if (mo15563a(sb2)) {
            C5743a a4 = mo15553a();
            float f = (float) i;
            C5917m mVar = new C5917m(sb2, (byte[]) null, new C5919o[]{new C5919o(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C5919o(((float) (a3[1] + a3[0])) / 2.0f, f)}, a4);
            try {
                C5917m a5 = this.f16206f.mo15562a(i, aVar, a3[1]);
                mVar.mo15694a(C5918n.UPC_EAN_EXTENSION, a5.mo15700e());
                mVar.mo15695a(a5.mo15698c());
                mVar.mo15696a(a5.mo15699d());
                i2 = a5.mo15700e().length();
            } catch (C5916l unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(C5806e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw C5882i.m22303a();
                }
            }
            if ((a4 == C5743a.EAN_13 || a4 == C5743a.UPC_A) && (a = this.f16207g.mo15554a(sb2)) != null) {
                mVar.mo15694a(C5918n.POSSIBLE_COUNTRY, a);
            }
            return mVar;
        } else {
            throw C5790d.m21877a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo15563a(String str) {
        return m22141a((CharSequence) str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo15564a(C5772a aVar, int i) {
        return m22143a(aVar, i, false, f16201a);
    }
}
