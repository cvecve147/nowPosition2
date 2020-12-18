package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.io.Serializable;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.g */
public class C6943g implements Serializable {

    /* renamed from: a */
    public static long f19164a = 5000;

    /* renamed from: b */
    private boolean f19165b = true;

    /* renamed from: c */
    protected long f19166c = 0;

    /* renamed from: d */
    Beacon f19167d;

    /* renamed from: e */
    protected transient C6946j f19168e = null;

    /* renamed from: f */
    private int f19169f = 0;

    public C6943g(Beacon beacon) {
        mo18898a(beacon);
    }

    /* renamed from: g */
    private C6946j m26260g() {
        if (this.f19168e == null) {
            try {
                this.f19168e = (C6946j) C6906h.m26077t().getConstructors()[0].newInstance(new Object[0]);
            } catch (Exception unused) {
                C6895d.m26024b("RangedBeacon", "Could not construct RssiFilterImplClass %s", C6906h.m26077t().getName());
            }
        }
        return this.f19168e;
    }

    /* renamed from: a */
    public void mo18896a() {
        String str;
        Object[] objArr;
        if (!m26260g().mo18914a()) {
            double b = m26260g().mo18915b();
            this.f19167d.mo18688a(b);
            this.f19167d.mo18695d(m26260g().mo18916c());
            objArr = new Object[]{Double.valueOf(b)};
            str = "calculated new runningAverageRssi: %s";
        } else {
            objArr = new Object[0];
            str = "No measurements available to calculate running average";
        }
        C6895d.m26021a("RangedBeacon", str, objArr);
        this.f19167d.mo18691b(this.f19169f);
        this.f19169f = 0;
    }

    /* renamed from: a */
    public void mo18897a(Integer num) {
        if (num.intValue() != 127) {
            this.f19165b = true;
            this.f19166c = SystemClock.elapsedRealtime();
            m26260g().mo18913a(num);
        }
    }

    /* renamed from: a */
    public void mo18898a(Beacon beacon) {
        this.f19169f++;
        this.f19167d = beacon;
        mo18897a(Integer.valueOf(this.f19167d.mo18702k()));
    }

    /* renamed from: a */
    public void mo18899a(boolean z) {
        this.f19165b = z;
    }

    /* renamed from: b */
    public Beacon mo18900b() {
        return this.f19167d;
    }

    /* renamed from: c */
    public long mo18901c() {
        return SystemClock.elapsedRealtime() - this.f19166c;
    }

    /* renamed from: d */
    public boolean mo18902d() {
        return mo18901c() > f19164a;
    }

    /* renamed from: e */
    public boolean mo18903e() {
        return this.f19165b;
    }

    /* renamed from: f */
    public boolean mo18904f() {
        return m26260g().mo18914a();
    }
}
