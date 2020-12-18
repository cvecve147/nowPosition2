package com.openlife.checkme.p093c;

import com.openlife.checkme.C4961l;
import com.openlife.checkme.net.model.BeaconData;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: com.openlife.checkme.c.h */
class C4877h implements C6584b<BeaconData> {

    /* renamed from: a */
    C6585c f13958a;

    /* renamed from: b */
    final /* synthetic */ C4878i f13959b;

    C4877h(C4878i iVar) {
        this.f13959b = iVar;
    }

    /* renamed from: a */
    public void mo13389a(BeaconData beaconData) {
    }

    /* renamed from: a */
    public void mo13388a(C6585c cVar) {
        this.f13958a = cVar;
        this.f13958a.request(Long.MAX_VALUE);
    }

    /* renamed from: a */
    public void mo13390a(Throwable th) {
        if (this.f13959b.f13965f != null) {
            this.f13959b.f13965f.mo13063a(th);
        }
    }

    /* renamed from: c */
    public void mo13391c() {
        if (!this.f13959b.f13962c.getBeacons().isEmpty()) {
            this.f13958a.cancel();
            if (this.f13959b.f13965f != null) {
                this.f13959b.f13965f.mo13062a(this.f13959b.f13962c);
            }
        } else if (this.f13959b.f13965f != null) {
            this.f13959b.f13965f.mo13061a(C4961l.missiondetail_a_locationerror);
        }
        if (this.f13959b.f13965f != null) {
            this.f13959b.f13965f.mo13064b();
        }
    }
}
