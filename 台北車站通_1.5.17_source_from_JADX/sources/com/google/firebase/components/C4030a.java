package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
public final class C4030a<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f12002a;

    /* renamed from: b */
    private final Set<C4036f> f12003b;

    /* renamed from: c */
    private final int f12004c;

    /* renamed from: d */
    private final C4034d<T> f12005d;

    /* renamed from: com.google.firebase.components.a$a */
    public static class C4031a<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f12006a;

        /* renamed from: b */
        private final Set<C4036f> f12007b;

        /* renamed from: c */
        private int f12008c;

        /* renamed from: d */
        private C4034d<T> f12009d;

        private C4031a(Class<T> cls, Class<? super T>... clsArr) {
            this.f12006a = new HashSet();
            this.f12007b = new HashSet();
            this.f12008c = 0;
            C4050t.m16216a(cls, "Null interface");
            this.f12006a.add(cls);
            for (Class<? super T> a : clsArr) {
                C4050t.m16216a(a, "Null interface");
            }
            Collections.addAll(this.f12006a, clsArr);
        }

        /* renamed from: a */
        private final C4031a<T> m16186a(int i) {
            C4050t.m16217a(this.f12008c == 0, "Instantiation type has already been set.");
            this.f12008c = i;
            return this;
        }

        /* renamed from: a */
        public C4031a<T> mo11431a() {
            m16186a(1);
            return this;
        }

        /* renamed from: a */
        public C4031a<T> mo11432a(C4034d<T> dVar) {
            C4050t.m16216a(dVar, "Null factory");
            this.f12009d = dVar;
            return this;
        }

        /* renamed from: a */
        public C4031a<T> mo11433a(C4036f fVar) {
            C4050t.m16216a(fVar, "Null dependency");
            if (!this.f12006a.contains(fVar.mo11439a())) {
                this.f12007b.add(fVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C4030a<T> mo11434b() {
            C4050t.m16217a(this.f12009d != null, "Missing required property: factory.");
            return new C4030a(new HashSet(this.f12006a), new HashSet(this.f12007b), this.f12008c, this.f12009d);
        }
    }

    private C4030a(Set<Class<? super T>> set, Set<C4036f> set2, int i, C4034d<T> dVar) {
        this.f12002a = Collections.unmodifiableSet(set);
        this.f12003b = Collections.unmodifiableSet(set2);
        this.f12004c = i;
        this.f12005d = dVar;
    }

    /* renamed from: a */
    public static <T> C4031a<T> m16179a(Class<T> cls) {
        return new C4031a<>(cls, new Class[0]);
    }

    /* renamed from: a */
    public static <T> C4030a<T> m16180a(Class<T> cls, T t) {
        C4031a<T> a = m16179a(cls);
        a.mo11432a((C4034d<T>) new C4040j(t));
        return a.mo11434b();
    }

    /* renamed from: a */
    public final Set<Class<? super T>> mo11425a() {
        return this.f12002a;
    }

    /* renamed from: b */
    public final Set<C4036f> mo11426b() {
        return this.f12003b;
    }

    /* renamed from: c */
    public final C4034d<T> mo11427c() {
        return this.f12005d;
    }

    /* renamed from: d */
    public final boolean mo11428d() {
        return this.f12004c == 1;
    }

    /* renamed from: e */
    public final boolean mo11429e() {
        return this.f12004c == 2;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f12002a.toArray()) + ">{" + this.f12004c + ", deps=" + Arrays.toString(this.f12003b.toArray()) + "}";
    }
}
