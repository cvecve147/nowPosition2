package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dn */
final class C2264Dn {

    /* renamed from: a */
    private static final C2207Bn f6904a = m9640c();

    /* renamed from: b */
    private static final C2207Bn f6905b = new C2236Cn();

    /* renamed from: a */
    static C2207Bn m9638a() {
        return f6904a;
    }

    /* renamed from: b */
    static C2207Bn m9639b() {
        return f6905b;
    }

    /* renamed from: c */
    private static C2207Bn m9640c() {
        try {
            return (C2207Bn) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
