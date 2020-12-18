package com.google.firebase.components;

/* renamed from: com.google.firebase.components.t */
public final class C4050t {
    /* renamed from: a */
    public static <T> T m16216a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static void m16217a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
