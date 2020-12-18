package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.p093c.C4886p;
import p208e.p221b.C6412f;

/* renamed from: com.openlife.checkme.beaconservice.g */
class C4851g implements C4886p.C4887a {

    /* renamed from: a */
    final /* synthetic */ BeaconService f13927a;

    C4851g(BeaconService beaconService) {
        this.f13927a = beaconService;
    }

    /* renamed from: a */
    public void mo13337a() {
        BeaconService beaconService = this.f13927a;
        beaconService.m19070e(beaconService.f13882a);
    }

    /* renamed from: a */
    public void mo13338a(String str, int i, int i2, double d) {
        C6412f<BeaconData> fVar = this.f13927a.f13885d;
        if (fVar != null && !fVar.isCancelled()) {
            this.f13927a.f13885d.mo16339a(new BeaconData(str, i, i2, d));
        }
    }

    /* renamed from: b */
    public void mo13339b() {
        C6412f<BeaconData> fVar = this.f13927a.f13885d;
        if (fVar != null) {
            fVar.mo16340c();
        }
    }
}
