package org.altbeacon.beacon.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.u */
public class C6960u {

    /* renamed from: a */
    private static final C6960u f19230a = new C6960u();

    /* renamed from: b */
    private static final SimpleDateFormat f19231b = new SimpleDateFormat("HH:mm:ss.SSS");

    /* renamed from: c */
    private ArrayList<C6961a> f19232c;

    /* renamed from: d */
    private long f19233d = 0;

    /* renamed from: e */
    private boolean f19234e;

    /* renamed from: f */
    private boolean f19235f;

    /* renamed from: g */
    private boolean f19236g;

    /* renamed from: h */
    private C6961a f19237h;

    /* renamed from: org.altbeacon.beacon.service.u$a */
    public static class C6961a {

        /* renamed from: a */
        public long f19238a = 0;

        /* renamed from: b */
        public long f19239b;

        /* renamed from: c */
        public Date f19240c;

        /* renamed from: d */
        public Date f19241d;

        /* renamed from: e */
        public Date f19242e;

        /* renamed from: f */
        public Date f19243f;
    }

    private C6960u() {
        mo18968a();
    }

    /* renamed from: a */
    private String m26348a(Date date) {
        String format;
        if (date == null) {
            return "";
        }
        synchronized (f19231b) {
            format = f19231b.format(date);
        }
        return format;
    }

    /* renamed from: a */
    private void m26349a(C6961a aVar, boolean z) {
        if (z) {
            C6895d.m26021a("Stats", "sample start time, sample stop time, first detection time, last detection time, max millis between detections, detection count", new Object[0]);
        }
        C6895d.m26021a("Stats", "%s, %s, %s, %s, %s, %s", m26348a(aVar.f19242e), m26348a(aVar.f19243f), m26348a(aVar.f19240c), m26348a(aVar.f19241d), Long.valueOf(aVar.f19239b), Long.valueOf(aVar.f19238a));
    }

    /* renamed from: b */
    public static C6960u m26350b() {
        return f19230a;
    }

    /* renamed from: e */
    private void m26351e() {
        boolean z = true;
        C6895d.m26021a("Stats", "--- Stats for %s samples", Integer.valueOf(this.f19232c.size()));
        Iterator<C6961a> it = this.f19232c.iterator();
        while (it.hasNext()) {
            m26349a(it.next(), z);
            z = false;
        }
    }

    /* renamed from: f */
    private void m26352f() {
        if (this.f19237h == null || (this.f19233d > 0 && new Date().getTime() - this.f19237h.f19242e.getTime() >= this.f19233d)) {
            mo18971d();
        }
    }

    /* renamed from: a */
    public void mo18968a() {
        this.f19232c = new ArrayList<>();
        mo18971d();
    }

    /* renamed from: a */
    public void mo18969a(Beacon beacon) {
        m26352f();
        C6961a aVar = this.f19237h;
        aVar.f19238a++;
        if (aVar.f19240c == null) {
            aVar.f19240c = new Date();
        }
        if (this.f19237h.f19241d != null) {
            long time = new Date().getTime() - this.f19237h.f19241d.getTime();
            C6961a aVar2 = this.f19237h;
            if (time > aVar2.f19239b) {
                aVar2.f19239b = time;
            }
        }
        this.f19237h.f19241d = new Date();
    }

    /* renamed from: c */
    public boolean mo18970c() {
        return this.f19236g;
    }

    /* renamed from: d */
    public void mo18971d() {
        Date date = new Date();
        C6961a aVar = this.f19237h;
        if (aVar != null) {
            date = new Date(aVar.f19242e.getTime() + this.f19233d);
            C6961a aVar2 = this.f19237h;
            aVar2.f19243f = date;
            if (!this.f19235f && this.f19234e) {
                m26349a(aVar2, true);
            }
        }
        this.f19237h = new C6961a();
        C6961a aVar3 = this.f19237h;
        aVar3.f19242e = date;
        this.f19232c.add(aVar3);
        if (this.f19235f) {
            m26351e();
        }
    }
}
