package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.io.Serializable;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.i */
public class C6945i implements Serializable {

    /* renamed from: a */
    private static final String f19172a = "i";

    /* renamed from: b */
    private boolean f19173b = false;

    /* renamed from: c */
    private long f19174c = 0;

    /* renamed from: d */
    private final C6918a f19175d;

    public C6945i(C6918a aVar) {
        this.f19175d = aVar;
    }

    /* renamed from: a */
    public C6918a mo18908a() {
        return this.f19175d;
    }

    /* renamed from: b */
    public boolean mo18909b() {
        return this.f19173b;
    }

    /* renamed from: c */
    public boolean mo18910c() {
        this.f19174c = SystemClock.elapsedRealtime();
        if (this.f19173b) {
            return false;
        }
        this.f19173b = true;
        return true;
    }

    /* renamed from: d */
    public void mo18911d() {
        this.f19173b = false;
        this.f19174c = 0;
    }

    /* renamed from: e */
    public boolean mo18912e() {
        if (!this.f19173b || this.f19174c <= 0 || SystemClock.elapsedRealtime() - this.f19174c <= C6906h.m26076s()) {
            return false;
        }
        C6895d.m26021a(f19172a, "We are newly outside the region because the lastSeenTime of %s was %s seconds ago, and that is over the expiration duration of %s", Long.valueOf(this.f19174c), Long.valueOf(SystemClock.elapsedRealtime() - this.f19174c), Long.valueOf(C6906h.m26076s()));
        mo18911d();
        return true;
    }
}
