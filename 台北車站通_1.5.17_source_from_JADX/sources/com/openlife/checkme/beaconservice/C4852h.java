package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.Execution;
import p208e.p221b.p241f.C6413a;

/* renamed from: com.openlife.checkme.beaconservice.h */
class C4852h extends C6413a<Long> {

    /* renamed from: b */
    final /* synthetic */ BeaconService f13928b;

    C4852h(BeaconService beaconService) {
        this.f13928b = beaconService;
    }

    /* renamed from: a */
    public void mo13341a(Long l) {
        this.f13928b.f13883b.mo13409c();
        if (!this.f13928b.f13886e.getBeacons().isEmpty()) {
            this.f13928b.f13887f.mo13371a(this.f13928b.f13886e.getBeacons());
        }
        Execution unused = this.f13928b.f13886e = new Execution();
        this.f13928b.f13883b.mo13408b();
    }

    /* renamed from: a */
    public void mo13342a(Throwable th) {
        this.f13928b.f13883b.mo13409c();
    }

    /* renamed from: c */
    public void mo13343c() {
        this.f13928b.f13883b.mo13409c();
    }
}
