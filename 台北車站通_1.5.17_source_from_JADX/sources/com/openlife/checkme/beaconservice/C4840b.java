package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.Execution;
import p208e.p221b.p241f.C6413a;

/* renamed from: com.openlife.checkme.beaconservice.b */
class C4840b extends C6413a<Long> {

    /* renamed from: b */
    final /* synthetic */ BeaconJobService f13899b;

    C4840b(BeaconJobService beaconJobService) {
        this.f13899b = beaconJobService;
    }

    /* renamed from: a */
    public void mo13341a(Long l) {
        this.f13899b.f13867a.mo13409c();
        if (!this.f13899b.f13870d.getBeacons().isEmpty()) {
            this.f13899b.f13871e.mo13371a(this.f13899b.f13870d.getBeacons());
        }
        Execution unused = this.f13899b.f13870d = new Execution();
        this.f13899b.f13867a.mo13408b();
    }

    /* renamed from: a */
    public void mo13342a(Throwable th) {
        this.f13899b.f13867a.mo13409c();
    }

    /* renamed from: c */
    public void mo13343c() {
        this.f13899b.f13867a.mo13409c();
    }
}
