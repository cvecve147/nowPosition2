package com.google.android.gms.iid;

/* renamed from: com.google.android.gms.iid.k */
abstract class C2147k {

    /* renamed from: a */
    private static C2147k f6638a;

    C2147k() {
    }

    /* renamed from: a */
    static synchronized C2147k m9258a() {
        C2147k kVar;
        synchronized (C2147k.class) {
            if (f6638a == null) {
                f6638a = new C2141e();
            }
            kVar = f6638a;
        }
        return kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C2148l<Boolean> mo7762a(String str, boolean z);
}
