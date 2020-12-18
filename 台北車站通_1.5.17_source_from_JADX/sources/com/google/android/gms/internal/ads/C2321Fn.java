package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.ads.Fn */
final class C2321Fn {

    /* renamed from: a */
    private static final C2321Fn f7001a = new C2321Fn();

    /* renamed from: b */
    private final C2521Mn f7002b;

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, C2493Ln<?>> f7003c = new ConcurrentHashMap();

    private C2321Fn() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        C2521Mn mn = null;
        for (int i = 0; i <= 0; i++) {
            mn = m9791a(strArr[0]);
            if (mn != null) {
                break;
            }
        }
        this.f7002b = mn == null ? new C3209jn() : mn;
    }

    /* renamed from: a */
    public static C2321Fn m9790a() {
        return f7001a;
    }

    /* renamed from: a */
    private static C2521Mn m9791a(String str) {
        try {
            return (C2521Mn) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <T> C2493Ln<T> mo8084a(Class<T> cls) {
        C2641Qm.m10989a(cls, "messageType");
        C2493Ln<T> ln = (C2493Ln) this.f7003c.get(cls);
        if (ln != null) {
            return ln;
        }
        C2493Ln<T> a = this.f7002b.mo8547a(cls);
        C2641Qm.m10989a(cls, "messageType");
        C2641Qm.m10989a(a, "schema");
        C2493Ln<T> putIfAbsent = this.f7003c.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: a */
    public final <T> C2493Ln<T> mo8085a(T t) {
        return mo8084a(t.getClass());
    }
}
