package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bz */
final class C2219Bz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3681zz f6790a;

    /* renamed from: b */
    private final /* synthetic */ C2191Az f6791b;

    C2219Bz(C2191Az az, C3681zz zzVar) {
        this.f6791b = az;
        this.f6790a = zzVar;
    }

    public final void run() {
        synchronized (this.f6791b.f6721i) {
            if (this.f6791b.f6731s == -2) {
                C2626Pz unused = this.f6791b.f6730r = this.f6791b.m9427d();
                if (this.f6791b.f6730r == null) {
                    this.f6791b.mo7858a(4);
                } else if (!this.f6791b.m9429e() || this.f6791b.m9424b(1)) {
                    this.f6790a.mo10287a((C2305Ez) this.f6791b);
                    this.f6791b.m9419a(this.f6790a);
                } else {
                    String f = this.f6791b.f6713a;
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(f);
                    sb.append(" as delayed impression is not supported");
                    C2227Cf.m9536d(sb.toString());
                    this.f6791b.mo7858a(2);
                }
            }
        }
    }
}
