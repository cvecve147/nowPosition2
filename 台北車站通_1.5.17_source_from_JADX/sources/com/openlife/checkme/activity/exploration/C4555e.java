package com.openlife.checkme.activity.exploration;

import android.location.Location;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.p087a.C4454b;

/* renamed from: com.openlife.checkme.activity.exploration.e */
class C4555e implements C4454b.C4456b {

    /* renamed from: a */
    final /* synthetic */ ExplorationFragment f13311a;

    C4555e(ExplorationFragment explorationFragment) {
        this.f13311a = explorationFragment;
    }

    /* renamed from: a */
    public void mo12568a() {
    }

    /* renamed from: a */
    public void mo12569a(int i) {
        this.f13311a.mo12755e(i);
    }

    /* renamed from: a */
    public void mo12570a(Location location) {
        double unused = this.f13311a.f13287b = location.getLatitude();
        double unused2 = this.f13311a.f13288c = location.getLongitude();
        ExplorationFragment explorationFragment = this.f13311a;
        explorationFragment.mo12751b(explorationFragment.f13287b, this.f13311a.f13288c);
        ExplorationFragment explorationFragment2 = this.f13311a;
        explorationFragment2.mo12742a(explorationFragment2.f13287b, this.f13311a.f13288c);
        this.f13311a.f13295j.mo12780a(this.f13311a.f13286a, this.f13311a.f13296k, this.f13311a.f13287b, this.f13311a.f13288c);
        this.f13311a.f13299n.mo12565b();
    }

    /* renamed from: b */
    public void mo12571b() {
        if (!this.f13311a.f13290e) {
            this.f13311a.mo12754d(C4961l.gps_high_provider);
        }
        boolean unused = this.f13311a.f13290e = true;
    }

    /* renamed from: c */
    public void mo12572c(int i) {
        this.f13311a.mo12754d(i);
    }

    /* renamed from: d */
    public void mo12573d(int i) {
        this.f13311a.mo12758h(i);
    }

    /* renamed from: g */
    public void mo12574g() {
    }
}
