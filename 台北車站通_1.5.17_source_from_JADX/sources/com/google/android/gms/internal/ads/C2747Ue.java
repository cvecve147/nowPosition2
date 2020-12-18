package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ue */
final class C2747Ue implements C2907Zz {

    /* renamed from: a */
    private final /* synthetic */ String f8383a;

    /* renamed from: b */
    private final /* synthetic */ C2858Ye f8384b;

    C2747Ue(C2632Qe qe, String str, C2858Ye ye) {
        this.f8383a = str;
        this.f8384b = ye;
    }

    /* renamed from: a */
    public final void mo8922a(C3024db dbVar) {
        String str = this.f8383a;
        String exc = dbVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        C2227Cf.m9536d(sb.toString());
        this.f8384b.mo9065a(null);
    }
}
