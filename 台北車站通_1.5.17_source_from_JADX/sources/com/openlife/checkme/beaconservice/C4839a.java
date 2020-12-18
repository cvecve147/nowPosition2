package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.p093c.C4886p;
import java.util.List;
import p208e.p221b.C6412f;

/* renamed from: com.openlife.checkme.beaconservice.a */
class C4839a implements C4886p.C4887a {

    /* renamed from: a */
    final /* synthetic */ List f13897a;

    /* renamed from: b */
    final /* synthetic */ BeaconJobService f13898b;

    C4839a(BeaconJobService beaconJobService, List list) {
        this.f13898b = beaconJobService;
        this.f13897a = list;
    }

    /* renamed from: a */
    public void mo13337a() {
        this.f13898b.m19049f(this.f13897a);
    }

    /* renamed from: a */
    public void mo13338a(String str, int i, int i2, double d) {
        C6412f<BeaconData> fVar = this.f13898b.f13869c;
        if (fVar != null && !fVar.isCancelled()) {
            this.f13898b.f13869c.mo16339a(new BeaconData(str, i, i2, d));
        }
    }

    /* renamed from: b */
    public void mo13339b() {
        C6412f<BeaconData> fVar = this.f13898b.f13869c;
        if (fVar != null) {
            fVar.mo16340c();
        }
    }
}
