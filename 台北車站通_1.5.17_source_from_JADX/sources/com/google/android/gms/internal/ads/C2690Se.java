package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;

/* renamed from: com.google.android.gms.internal.ads.Se */
final class C2690Se implements C2341Gf<Throwable, T> {

    /* renamed from: a */
    private final /* synthetic */ C2803We f8245a;

    C2690Se(C2632Qe qe, C2803We we) {
        this.f8245a = we;
    }

    /* renamed from: b */
    public final /* synthetic */ C2804Wf mo6904b(Object obj) {
        Throwable th = (Throwable) obj;
        C2227Cf.m9533b("Error occurred while dispatching http response in getter.", th);
        C1697X.m7702i().mo8319a(th, "HttpGetter.deliverResponse.1");
        return C2483Lf.m10495a(this.f8245a.mo8778a());
    }
}
