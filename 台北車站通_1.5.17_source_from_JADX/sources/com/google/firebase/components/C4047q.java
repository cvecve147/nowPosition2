package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.q */
final class C4047q {

    /* renamed from: a */
    private final C4030a<?> f12019a;

    /* renamed from: b */
    private final Set<C4047q> f12020b = new HashSet();

    /* renamed from: c */
    private final Set<C4047q> f12021c = new HashSet();

    C4047q(C4030a<?> aVar) {
        this.f12019a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set<C4047q> mo11448a() {
        return this.f12020b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11449a(C4047q qVar) {
        this.f12020b.add(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4030a<?> mo11450b() {
        return this.f12019a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11451b(C4047q qVar) {
        this.f12021c.add(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11452c(C4047q qVar) {
        this.f12021c.remove(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo11453c() {
        return this.f12021c.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo11454d() {
        return this.f12020b.isEmpty();
    }
}
