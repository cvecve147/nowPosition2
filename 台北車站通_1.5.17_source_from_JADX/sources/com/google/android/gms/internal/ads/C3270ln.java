package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ln */
final class C3270ln implements C3469sn {

    /* renamed from: a */
    private C3469sn[] f9749a;

    C3270ln(C3469sn... snVarArr) {
        this.f9749a = snVarArr;
    }

    /* renamed from: a */
    public final boolean mo8581a(Class<?> cls) {
        for (C3469sn a : this.f9749a) {
            if (a.mo8581a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C3441rn mo8582b(Class<?> cls) {
        for (C3469sn snVar : this.f9749a) {
            if (snVar.mo8581a(cls)) {
                return snVar.mo8582b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
