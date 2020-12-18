package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ax */
final class C2961ax implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f8925a;

    /* renamed from: b */
    private final /* synthetic */ long f8926b;

    /* renamed from: c */
    private final /* synthetic */ C2216Bw f8927c;

    C2961ax(C2216Bw bw, String str, long j) {
        this.f8927c = bw;
        this.f8925a = str;
        this.f8926b = j;
    }

    public final void run() {
        this.f8927c.f6772a.mo10262a(this.f8925a, this.f8926b);
        this.f8927c.f6772a.mo10261a(toString());
    }
}
