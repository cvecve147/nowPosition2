package org.altbeacon.beacon.service;

import java.io.Serializable;
import java.util.HashMap;
import org.altbeacon.beacon.Beacon;

/* renamed from: org.altbeacon.beacon.service.c */
public class C6939c implements Serializable {

    /* renamed from: a */
    private final HashMap<String, HashMap<Integer, Beacon>> f19151a;

    /* renamed from: b */
    private final boolean f19152b;

    public C6939c() {
        this(true);
    }

    public C6939c(boolean z) {
        this.f19151a = new HashMap<>();
        this.f19152b = z;
    }

    /* renamed from: b */
    private String m26225b(Beacon beacon) {
        if (!this.f19152b) {
            return beacon.mo18686a();
        }
        return beacon.mo18686a() + beacon.mo18703l();
    }

    /* renamed from: c */
    private Beacon m26226c(Beacon beacon) {
        if (beacon.mo18705n()) {
            m26227d(beacon);
            return null;
        }
        String b = m26225b(beacon);
        HashMap hashMap = this.f19151a.get(b);
        if (hashMap == null) {
            hashMap = new HashMap();
        } else {
            beacon.mo18689a(((Beacon) hashMap.values().iterator().next()).mo18697f());
        }
        hashMap.put(Integer.valueOf(beacon.hashCode()), beacon);
        this.f19151a.put(b, hashMap);
        return beacon;
    }

    /* renamed from: d */
    private void m26227d(Beacon beacon) {
        HashMap hashMap = this.f19151a.get(m26225b(beacon));
        if (hashMap != null) {
            for (Beacon beacon2 : hashMap.values()) {
                beacon2.mo18693c(beacon.mo18702k());
                beacon2.mo18689a(beacon.mo18692c());
            }
        }
    }

    /* renamed from: a */
    public synchronized Beacon mo18872a(Beacon beacon) {
        if (beacon.mo18706o() || beacon.mo18703l() != -1) {
            beacon = m26226c(beacon);
        }
        return beacon;
    }
}
