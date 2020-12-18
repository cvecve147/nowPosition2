package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mm */
final class C3297mm {

    /* renamed from: a */
    private final C3525um f9803a;

    /* renamed from: b */
    private final byte[] f9804b;

    private C3297mm(int i) {
        this.f9804b = new byte[i];
        this.f9803a = C3525um.m14078a(this.f9804b);
    }

    /* synthetic */ C3297mm(int i, C3178im imVar) {
        this(i);
    }

    /* renamed from: a */
    public final C3150hm mo9750a() {
        this.f9803a.mo10102b();
        return new C3354om(this.f9804b);
    }

    /* renamed from: b */
    public final C3525um mo9751b() {
        return this.f9803a;
    }
}
