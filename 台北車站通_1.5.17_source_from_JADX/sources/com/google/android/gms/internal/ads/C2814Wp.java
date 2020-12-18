package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wp */
final class C2814Wp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f8559a;

    /* renamed from: b */
    private final /* synthetic */ boolean f8560b;

    /* renamed from: c */
    private final /* synthetic */ C2701Sp f8561c;

    C2814Wp(C2701Sp sp, int i, boolean z) {
        this.f8561c = sp;
        this.f8559a = i;
        this.f8560b = z;
    }

    public final void run() {
        C2921_l b = this.f8561c.mo8836b(this.f8559a, this.f8560b);
        C2921_l unused = this.f8561c.f8295k = b;
        if (C2701Sp.m11182b(this.f8559a, b)) {
            this.f8561c.mo8834a(this.f8559a + 1, this.f8560b);
        }
    }
}
