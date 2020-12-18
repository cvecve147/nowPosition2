package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fm */
final class C2320Fm {

    /* renamed from: a */
    private static final C2263Dm<?> f6999a = new C2292Em();

    /* renamed from: b */
    private static final C2263Dm<?> f7000b = m9789c();

    /* renamed from: a */
    static C2263Dm<?> m9787a() {
        return f6999a;
    }

    /* renamed from: b */
    static C2263Dm<?> m9788b() {
        C2263Dm<?> dm = f7000b;
        if (dm != null) {
            return dm;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static C2263Dm<?> m9789c() {
        try {
            return (C2263Dm) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
