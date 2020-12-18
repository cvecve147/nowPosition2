package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ve */
final class C2774Ve extends C3580wj {

    /* renamed from: r */
    private final /* synthetic */ byte[] f8433r;

    /* renamed from: s */
    private final /* synthetic */ Map f8434s;

    /* renamed from: t */
    private final /* synthetic */ C3548vf f8435t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2774Ve(C2632Qe qe, int i, String str, C3426rA rAVar, C2907Zz zz, byte[] bArr, Map map, C3548vf vfVar) {
        super(i, str, rAVar, zz);
        this.f8433r = bArr;
        this.f8434s = map;
        this.f8435t = vfVar;
    }

    /* renamed from: a */
    public final Map<String, String> mo7901a() {
        Map<String, String> map = this.f8434s;
        return map == null ? super.mo7901a() : map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7905a(String str) {
        this.f8435t.mo10122a(str);
        super.mo8945c(str);
    }

    /* renamed from: n */
    public final byte[] mo7914n() {
        byte[] bArr = this.f8433r;
        return bArr == null ? super.mo7914n() : bArr;
    }
}
