package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Db */
final class C2252Db implements C3262lg<C2934_y> {

    /* renamed from: a */
    private final /* synthetic */ C2223Cb f6842a;

    C2252Db(C2223Cb cb) {
        this.f6842a = cb;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo7969a(Object obj) {
        try {
            ((C2934_y) obj).mo7967b("AFMA_getAdapterLessMediationAd", this.f6842a.f6794a);
        } catch (Exception e) {
            C2227Cf.m9533b("Error requesting an ad url", e);
            C2166Ab.f6664i.mo6935b(this.f6842a.f6795b);
        }
    }
}
