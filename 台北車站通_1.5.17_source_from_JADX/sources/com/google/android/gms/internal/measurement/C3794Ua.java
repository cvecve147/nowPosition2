package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Ua */
final class C3794Ua implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f11320a;

    /* renamed from: b */
    private final /* synthetic */ String f11321b;

    /* renamed from: c */
    private final /* synthetic */ String f11322c;

    /* renamed from: d */
    private final /* synthetic */ long f11323d;

    /* renamed from: e */
    private final /* synthetic */ C3723Ca f11324e;

    C3794Ua(C3723Ca ca, String str, String str2, String str3, long j) {
        this.f11324e = ca;
        this.f11320a = str;
        this.f11321b = str2;
        this.f11322c = str3;
        this.f11323d = j;
    }

    public final void run() {
        String str = this.f11320a;
        if (str == null) {
            this.f11324e.f11025a.mo10718r().mo10400y().mo10968a(this.f11321b, (C3894sb) null);
            return;
        }
        this.f11324e.f11025a.mo10718r().mo10400y().mo10968a(this.f11321b, new C3894sb(this.f11322c, str, this.f11323d));
    }
}
