package android.support.p011v7.widget;

/* renamed from: android.support.v7.widget.Oa */
class C0739Oa {

    /* renamed from: a */
    private int f2894a = 0;

    /* renamed from: b */
    private int f2895b = 0;

    /* renamed from: c */
    private int f2896c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f2897d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f2898e = 0;

    /* renamed from: f */
    private int f2899f = 0;

    /* renamed from: g */
    private boolean f2900g = false;

    /* renamed from: h */
    private boolean f2901h = false;

    C0739Oa() {
    }

    /* renamed from: a */
    public int mo3593a() {
        return this.f2900g ? this.f2894a : this.f2895b;
    }

    /* renamed from: a */
    public void mo3594a(int i, int i2) {
        this.f2901h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2898e = i;
            this.f2894a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2899f = i2;
            this.f2895b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3595a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f2900g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f2900g = r2
            boolean r0 = r1.f2901h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f2897d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f2898e
        L_0x0016:
            r1.f2894a = r2
            int r2 = r1.f2896c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f2896c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f2898e
        L_0x0024:
            r1.f2894a = r2
            int r2 = r1.f2897d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f2898e
            r1.f2894a = r2
        L_0x002f:
            int r2 = r1.f2899f
        L_0x0031:
            r1.f2895b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0739Oa.mo3595a(boolean):void");
    }

    /* renamed from: b */
    public int mo3596b() {
        return this.f2894a;
    }

    /* renamed from: b */
    public void mo3597b(int i, int i2) {
        this.f2896c = i;
        this.f2897d = i2;
        this.f2901h = true;
        if (this.f2900g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2894a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2895b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2894a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2895b = i2;
        }
    }

    /* renamed from: c */
    public int mo3598c() {
        return this.f2895b;
    }

    /* renamed from: d */
    public int mo3599d() {
        return this.f2900g ? this.f2895b : this.f2894a;
    }
}
