package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p101d.p129g.p149d.p150a.C5578a;

/* renamed from: com.google.firebase.components.u */
public final class C4051u implements C4033c {

    /* renamed from: a */
    private final Set<Class<?>> f12027a;

    /* renamed from: b */
    private final Set<Class<?>> f12028b;

    /* renamed from: c */
    private final C4033c f12029c;

    public C4051u(Iterable<C4036f> iterable, C4033c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C4036f next : iterable) {
            if (next.mo11441c()) {
                hashSet.add(next.mo11439a());
            } else {
                hashSet2.add(next.mo11439a());
            }
        }
        this.f12027a = Collections.unmodifiableSet(hashSet);
        this.f12028b = Collections.unmodifiableSet(hashSet2);
        this.f12029c = cVar;
    }

    /* renamed from: a */
    public final <T> T mo11435a(Class<T> cls) {
        if (this.f12027a.contains(cls)) {
            return this.f12029c.mo11435a(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
    }

    /* renamed from: b */
    public final <T> C5578a<T> mo11436b(Class<T> cls) {
        if (this.f12028b.contains(cls)) {
            return this.f12029c.mo11436b(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }
}
