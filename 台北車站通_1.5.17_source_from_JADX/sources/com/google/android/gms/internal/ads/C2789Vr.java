package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vr */
public final class C2789Vr implements C2220C {

    /* renamed from: a */
    private int f8462a;

    /* renamed from: b */
    private int f8463b;

    /* renamed from: c */
    private final int f8464c;

    /* renamed from: d */
    private final float f8465d;

    public C2789Vr() {
        this(2500, 1, 1.0f);
    }

    private C2789Vr(int i, int i2, float f) {
        this.f8462a = 2500;
        this.f8464c = 1;
        this.f8465d = 1.0f;
    }

    /* renamed from: F */
    public final int mo7924F() {
        return this.f8463b;
    }

    /* renamed from: K */
    public final int mo7925K() {
        return this.f8462a;
    }

    /* renamed from: a */
    public final void mo7926a(C3024db dbVar) {
        boolean z = true;
        this.f8463b++;
        int i = this.f8462a;
        this.f8462a = (int) (((float) i) + (((float) i) * this.f8465d));
        if (this.f8463b > this.f8464c) {
            z = false;
        }
        if (!z) {
            throw dbVar;
        }
    }
}
