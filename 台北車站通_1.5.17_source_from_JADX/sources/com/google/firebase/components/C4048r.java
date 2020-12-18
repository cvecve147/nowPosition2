package com.google.firebase.components;

import p101d.p129g.p149d.p150a.C5578a;

/* renamed from: com.google.firebase.components.r */
final class C4048r<T> implements C5578a<T> {

    /* renamed from: a */
    private static final Object f12022a = new Object();

    /* renamed from: b */
    private volatile Object f12023b = f12022a;

    /* renamed from: c */
    private volatile C5578a<T> f12024c;

    C4048r(C4034d<T> dVar, C4033c cVar) {
        this.f12024c = new C4049s(dVar, cVar);
    }

    public final T get() {
        T t = this.f12023b;
        if (t == f12022a) {
            synchronized (this) {
                t = this.f12023b;
                if (t == f12022a) {
                    t = this.f12024c.get();
                    this.f12023b = t;
                    this.f12024c = null;
                }
            }
        }
        return t;
    }
}
