package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wm */
public enum C2811Wm {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C3150hm.class, C3150hm.class, C3150hm.f9434a),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: l */
    private final Class<?> f8551l;

    /* renamed from: m */
    private final Class<?> f8552m;

    /* renamed from: n */
    private final Object f8553n;

    private C2811Wm(Class<?> cls, Class<?> cls2, Object obj) {
        this.f8551l = cls;
        this.f8552m = cls2;
        this.f8553n = obj;
    }

    /* renamed from: a */
    public final Class<?> mo9002a() {
        return this.f8552m;
    }
}
