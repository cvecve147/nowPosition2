package com.facebook.p060a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.a.v */
class C1412v implements Serializable {

    /* renamed from: a */
    private HashMap<C1387b, List<C1392f>> f4957a = new HashMap<>();

    /* renamed from: com.facebook.a.v$a */
    static class C1413a implements Serializable {

        /* renamed from: a */
        private final HashMap<C1387b, List<C1392f>> f4958a;

        private C1413a(HashMap<C1387b, List<C1392f>> hashMap) {
            this.f4958a = hashMap;
        }

        private Object readResolve() {
            return new C1412v(this.f4958a);
        }
    }

    public C1412v() {
    }

    public C1412v(HashMap<C1387b, List<C1392f>> hashMap) {
        this.f4957a.putAll(hashMap);
    }

    private Object writeReplace() {
        return new C1413a(this.f4957a);
    }

    /* renamed from: a */
    public Set<C1387b> mo6071a() {
        return this.f4957a.keySet();
    }

    /* renamed from: a */
    public void mo6072a(C1387b bVar, List<C1392f> list) {
        if (!this.f4957a.containsKey(bVar)) {
            this.f4957a.put(bVar, list);
        } else {
            this.f4957a.get(bVar).addAll(list);
        }
    }

    /* renamed from: a */
    public boolean mo6073a(C1387b bVar) {
        return this.f4957a.containsKey(bVar);
    }

    /* renamed from: b */
    public List<C1392f> mo6074b(C1387b bVar) {
        return this.f4957a.get(bVar);
    }
}
