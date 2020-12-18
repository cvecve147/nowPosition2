package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cm */
final class C3007cm {

    /* renamed from: a */
    private static final Class<?> f8997a = m12089a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f8998b = (m12089a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m12089a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m12090a() {
        return f8997a != null && !f8998b;
    }

    /* renamed from: b */
    static Class<?> m12091b() {
        return f8997a;
    }
}
