package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Am */
final class C2178Am {

    /* renamed from: a */
    private static final Class<?> f6693a = m9363b();

    /* renamed from: a */
    public static C2206Bm m9362a() {
        Class<?> cls = f6693a;
        if (cls != null) {
            try {
                return (C2206Bm) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C2206Bm.f6743b;
    }

    /* renamed from: b */
    private static Class<?> m9363b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
