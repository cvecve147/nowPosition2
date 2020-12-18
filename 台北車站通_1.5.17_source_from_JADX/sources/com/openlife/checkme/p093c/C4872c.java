package com.openlife.checkme.p093c;

import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.p093c.C4886p;

/* renamed from: com.openlife.checkme.c.c */
class C4872c implements C4886p.C4887a {

    /* renamed from: a */
    final /* synthetic */ C4878i f13953a;

    C4872c(C4878i iVar) {
        this.f13953a = iVar;
    }

    /* renamed from: a */
    public void mo13337a() {
        this.f13953a.m19196d();
    }

    /* renamed from: a */
    public void mo13338a(String str, int i, int i2, double d) {
        if (this.f13953a.f13964e != null && !this.f13953a.f13964e.isCancelled()) {
            this.f13953a.f13964e.mo16339a(new BeaconData(str, i, i2, d));
        }
    }

    /* renamed from: b */
    public void mo13339b() {
        this.f13953a.f13964e.mo16340c();
    }
}
