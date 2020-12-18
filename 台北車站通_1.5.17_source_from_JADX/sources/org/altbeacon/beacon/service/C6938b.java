package org.altbeacon.beacon.service;

import android.os.SystemClock;

/* renamed from: org.altbeacon.beacon.service.b */
public class C6938b {

    /* renamed from: a */
    private static final C6938b f19149a = new C6938b();

    /* renamed from: b */
    private long f19150b = 0;

    private C6938b() {
    }

    /* renamed from: a */
    public static C6938b m26222a() {
        return f19149a;
    }

    /* renamed from: b */
    public long mo18870b() {
        return this.f19150b;
    }

    /* renamed from: c */
    public void mo18871c() {
        this.f19150b = SystemClock.elapsedRealtime();
    }
}
