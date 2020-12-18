package p101d.p129g.p159f.p176g.p177a;

import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.p176g.C5854k;

/* renamed from: d.g.f.g.a.a */
public abstract class C5815a extends C5854k {

    /* renamed from: a */
    private final int[] f16101a = new int[4];

    /* renamed from: b */
    private final int[] f16102b = new int[8];

    /* renamed from: c */
    private final float[] f16103c = new float[4];

    /* renamed from: d */
    private final float[] f16104d = new float[4];

    /* renamed from: e */
    private final int[] f16105e;

    /* renamed from: f */
    private final int[] f16106f;

    protected C5815a() {
        int[] iArr = this.f16102b;
        this.f16105e = new int[(iArr.length / 2)];
        this.f16106f = new int[(iArr.length / 2)];
    }

    /* renamed from: a */
    protected static int m21962a(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: a */
    protected static int m21963a(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (C5854k.m22116a(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    protected static void m21964a(int[] iArr, float[] fArr) {
        float f = fArr[0];
        int i = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: b */
    protected static void m21965b(int[] iArr, float[] fArr) {
        float f = fArr[0];
        int i = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: b */
    protected static boolean m21966b(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f < 0.7916667f || f > 0.89285713f) {
            return false;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        for (int i4 : iArr) {
            if (i4 > i2) {
                i2 = i4;
            }
            if (i4 < i3) {
                i3 = i4;
            }
        }
        return i2 < i3 * 10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo15486a() {
        return this.f16102b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int[] mo15487b() {
        return this.f16101a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int[] mo15488c() {
        return this.f16106f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final float[] mo15489d() {
        return this.f16104d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int[] mo15490e() {
        return this.f16105e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final float[] mo15491f() {
        return this.f16103c;
    }
}
