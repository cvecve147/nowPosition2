package com.facebook.p060a;

import android.content.Context;
import com.facebook.C1601x;
import com.facebook.internal.C1485d;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.a.g */
class C1395g {

    /* renamed from: a */
    private final HashMap<C1387b, C1414w> f4916a = new HashMap<>();

    /* renamed from: b */
    private synchronized C1414w m6683b(C1387b bVar) {
        C1414w wVar;
        wVar = this.f4916a.get(bVar);
        if (wVar == null) {
            Context b = C1601x.m7386b();
            wVar = new C1414w(C1485d.m6985a(b), C1406q.m6710a(b));
        }
        this.f4916a.put(bVar, wVar);
        return wVar;
    }

    /* renamed from: a */
    public synchronized int mo6055a() {
        int i;
        i = 0;
        for (C1414w a : this.f4916a.values()) {
            i += a.mo6075a();
        }
        return i;
    }

    /* renamed from: a */
    public synchronized C1414w mo6056a(C1387b bVar) {
        return this.f4916a.get(bVar);
    }

    /* renamed from: a */
    public synchronized void mo6057a(C1387b bVar, C1392f fVar) {
        m6683b(bVar).mo6077a(fVar);
    }

    /* renamed from: a */
    public synchronized void mo6058a(C1412v vVar) {
        if (vVar != null) {
            for (C1387b next : vVar.mo6071a()) {
                C1414w b = m6683b(next);
                for (C1392f a : vVar.mo6074b(next)) {
                    b.mo6077a(a);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized Set<C1387b> mo6059b() {
        return this.f4916a.keySet();
    }
}
