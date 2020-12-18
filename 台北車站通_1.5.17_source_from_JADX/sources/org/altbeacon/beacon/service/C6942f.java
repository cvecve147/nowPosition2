package org.altbeacon.beacon.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.f */
public class C6942f implements Serializable {

    /* renamed from: a */
    private static boolean f19161a = false;

    /* renamed from: b */
    private C6918a f19162b;

    /* renamed from: c */
    private Map<Beacon, C6943g> f19163c = new HashMap();

    public C6942f(C6918a aVar) {
        this.f19162b = aVar;
    }

    /* renamed from: a */
    public static void m26255a(boolean z) {
        f19161a = z;
    }

    /* renamed from: c */
    public static boolean m26256c() {
        return f19161a;
    }

    /* renamed from: a */
    public synchronized Collection<Beacon> mo18893a() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        arrayList = new ArrayList();
        synchronized (this.f19163c) {
            for (Beacon next : this.f19163c.keySet()) {
                C6943g gVar = this.f19163c.get(next);
                if (gVar != null) {
                    if (gVar.mo18903e()) {
                        gVar.mo18896a();
                        if (!gVar.mo18904f()) {
                            arrayList.add(gVar.mo18900b());
                        }
                    }
                    if (!gVar.mo18904f()) {
                        if (!f19161a || gVar.mo18902d()) {
                            gVar.mo18899a(false);
                        }
                        hashMap.put(next, gVar);
                    } else {
                        C6895d.m26021a("RangeState", "Dumping beacon from RangeState because it has no recent measurements.", new Object[0]);
                    }
                }
            }
            this.f19163c = hashMap;
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo18894a(Beacon beacon) {
        C6943g gVar = this.f19163c.get(beacon);
        if (gVar != null) {
            if (C6895d.m26023a()) {
                C6895d.m26021a("RangeState", "adding %s to existing range for: %s", beacon, gVar);
            }
            gVar.mo18898a(beacon);
            return;
        }
        if (C6895d.m26023a()) {
            C6895d.m26021a("RangeState", "adding %s to new rangedBeacon", beacon);
        }
        this.f19163c.put(beacon, new C6943g(beacon));
    }

    /* renamed from: b */
    public C6918a mo18895b() {
        return this.f19162b;
    }
}
