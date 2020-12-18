package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qn */
final class C3412qn {

    /* renamed from: a */
    private static final C3355on f10088a = m13567c();

    /* renamed from: b */
    private static final C3355on f10089b = new C3384pn();

    /* renamed from: a */
    static C3355on m13565a() {
        return f10088a;
    }

    /* renamed from: b */
    static C3355on m13566b() {
        return f10089b;
    }

    /* renamed from: c */
    private static C3355on m13567c() {
        try {
            return (C3355on) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
