package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p101d.p129g.p149d.p150a.C5578a;

/* renamed from: com.google.firebase.components.p */
public final class C4046p implements C4033c {

    /* renamed from: a */
    private final List<C4030a<?>> f12017a;

    /* renamed from: b */
    private final Map<Class<?>, C4048r<?>> f12018b = new HashMap();

    public C4046p(Iterable<C4035e> iterable, C4030a<?>... aVarArr) {
        C4047q qVar;
        ArrayList<C4030a> arrayList = new ArrayList<>();
        for (C4035e components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, aVarArr);
        HashMap hashMap = new HashMap(arrayList.size());
        for (C4030a aVar : arrayList) {
            C4047q qVar2 = new C4047q(aVar);
            Iterator it = aVar.mo11425a().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    if (hashMap.put(cls, qVar2) != null) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (C4047q qVar3 : hashMap.values()) {
            for (C4036f next : qVar3.mo11450b().mo11426b()) {
                if (next.mo11441c() && (qVar = (C4047q) hashMap.get(next.mo11439a())) != null) {
                    qVar3.mo11449a(qVar);
                    qVar.mo11451b(qVar3);
                }
            }
        }
        HashSet<C4047q> hashSet = new HashSet<>(hashMap.values());
        HashSet hashSet2 = new HashSet();
        for (C4047q qVar4 : hashSet) {
            if (qVar4.mo11453c()) {
                hashSet2.add(qVar4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (!hashSet2.isEmpty()) {
            C4047q qVar5 = (C4047q) hashSet2.iterator().next();
            hashSet2.remove(qVar5);
            arrayList2.add(qVar5.mo11450b());
            for (C4047q next2 : qVar5.mo11448a()) {
                next2.mo11452c(qVar5);
                if (next2.mo11453c()) {
                    hashSet2.add(next2);
                }
            }
        }
        if (arrayList2.size() == arrayList.size()) {
            Collections.reverse(arrayList2);
            this.f12017a = Collections.unmodifiableList(arrayList2);
            for (C4030a next3 : this.f12017a) {
                C4048r rVar = new C4048r(next3.mo11427c(), new C4051u(next3.mo11426b(), this));
                for (Class put : next3.mo11425a()) {
                    this.f12018b.put(put, rVar);
                }
            }
            for (C4030a next4 : this.f12017a) {
                Iterator<C4036f> it2 = next4.mo11426b().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C4036f next5 = it2.next();
                        if (next5.mo11440b() && !this.f12018b.containsKey(next5.mo11439a())) {
                            throw new C4039i(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next4, next5.mo11439a()}));
                        }
                    }
                }
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C4047q qVar6 : hashSet) {
            if (!qVar6.mo11453c() && !qVar6.mo11454d()) {
                arrayList3.add(qVar6.mo11450b());
            }
        }
        throw new C4037g(arrayList3);
    }

    /* renamed from: a */
    public final Object mo11435a(Class cls) {
        return C4032b.m16191a(this, cls);
    }

    /* renamed from: a */
    public final void mo11447a(boolean z) {
        for (C4030a next : this.f12017a) {
            if (next.mo11428d() || (next.mo11429e() && z)) {
                mo11435a((Class) next.mo11425a().iterator().next());
            }
        }
    }

    /* renamed from: b */
    public final <T> C5578a<T> mo11436b(Class<T> cls) {
        C4050t.m16216a(cls, "Null interface requested.");
        return this.f12018b.get(cls);
    }
}
