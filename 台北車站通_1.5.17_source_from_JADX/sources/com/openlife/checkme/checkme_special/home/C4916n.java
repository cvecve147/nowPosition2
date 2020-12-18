package com.openlife.checkme.checkme_special.home;

import com.openlife.checkme.net.model.Location;
import com.openlife.checkme.p087a.C4454b;

/* renamed from: com.openlife.checkme.checkme_special.home.n */
class C4916n implements C4454b.C4456b {

    /* renamed from: a */
    final /* synthetic */ SpMainFragment f14068a;

    C4916n(SpMainFragment spMainFragment) {
        this.f14068a = spMainFragment;
    }

    /* renamed from: a */
    public void mo12568a() {
        this.f14068a.f14029b.mo12901a(new Location(0.0d, 0.0d));
    }

    /* renamed from: a */
    public void mo12569a(int i) {
        this.f14068a.mo13435h(i);
    }

    /* renamed from: a */
    public void mo12570a(android.location.Location location) {
        this.f14068a.f14029b.mo12901a(new Location(location.getLongitude(), location.getLatitude()));
        this.f14068a.f14030c.mo12566c();
    }

    /* renamed from: b */
    public void mo12571b() {
    }

    /* renamed from: c */
    public void mo12572c(int i) {
        this.f14068a.mo13436i(i);
    }

    /* renamed from: d */
    public void mo12573d(int i) {
        this.f14068a.mo13437j(i);
    }

    /* renamed from: g */
    public void mo12574g() {
        this.f14068a.f14029b.mo12900a(this.f14068a.getActivity().getApplication());
    }
}
