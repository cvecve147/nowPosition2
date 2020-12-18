package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.l */
public class C6948l implements C6946j {

    /* renamed from: a */
    private static long f19176a = 20000;

    /* renamed from: b */
    private ArrayList<C6949a> f19177b = new ArrayList<>();

    /* renamed from: org.altbeacon.beacon.service.l$a */
    private class C6949a implements Comparable<C6949a> {

        /* renamed from: a */
        Integer f19178a;

        /* renamed from: b */
        long f19179b;

        private C6949a() {
        }

        /* renamed from: a */
        public int compareTo(C6949a aVar) {
            return this.f19178a.compareTo(aVar.f19178a);
        }
    }

    /* renamed from: d */
    private synchronized void m26283d() {
        ArrayList<C6949a> arrayList = new ArrayList<>();
        Iterator<C6949a> it = this.f19177b.iterator();
        while (it.hasNext()) {
            C6949a next = it.next();
            if (SystemClock.elapsedRealtime() - next.f19179b < f19176a) {
                arrayList.add(next);
            }
        }
        this.f19177b = arrayList;
        Collections.sort(this.f19177b);
    }

    /* renamed from: a */
    public void mo18913a(Integer num) {
        C6949a aVar = new C6949a();
        aVar.f19178a = num;
        aVar.f19179b = SystemClock.elapsedRealtime();
        this.f19177b.add(aVar);
    }

    /* renamed from: a */
    public boolean mo18914a() {
        return this.f19177b.size() == 0;
    }

    /* renamed from: b */
    public double mo18915b() {
        int i;
        m26283d();
        int size = this.f19177b.size();
        int i2 = size - 1;
        if (size > 2) {
            int i3 = size / 10;
            i = i3 + 1;
            i2 = (size - i3) - 2;
        } else {
            i = 0;
        }
        double d = 0.0d;
        for (int i4 = i; i4 <= i2; i4++) {
            d += (double) this.f19177b.get(i4).f19178a.intValue();
        }
        double d2 = d / ((double) ((i2 - i) + 1));
        C6895d.m26021a("RunningAverageRssiFilter", "Running average mRssi based on %s measurements: %s", Integer.valueOf(size), Double.valueOf(d2));
        return d2;
    }

    /* renamed from: c */
    public int mo18916c() {
        return this.f19177b.size();
    }
}
