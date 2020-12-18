package com.openlife.checkme.activity.home;

import com.openlife.checkme.net.model.Location;
import com.openlife.checkme.p087a.C4454b;

/* renamed from: com.openlife.checkme.activity.home.i */
class C4651i implements C4454b.C4456b {

    /* renamed from: a */
    final /* synthetic */ MainFragment f13509a;

    C4651i(MainFragment mainFragment) {
        this.f13509a = mainFragment;
    }

    /* renamed from: a */
    public void mo12568a() {
        this.f13509a.f13483i.mo12901a(new Location(0.0d, 0.0d));
    }

    /* renamed from: a */
    public void mo12569a(int i) {
        this.f13509a.mo12930i(i);
    }

    /* renamed from: a */
    public void mo12570a(android.location.Location location) {
        this.f13509a.f13483i.mo12901a(new Location(location.getLongitude(), location.getLatitude()));
        this.f13509a.f13481g.mo12565b();
    }

    /* renamed from: b */
    public void mo12571b() {
    }

    /* renamed from: c */
    public void mo12572c(int i) {
        this.f13509a.mo12928e(i);
    }

    /* renamed from: d */
    public void mo12573d(int i) {
        this.f13509a.mo12929h(i);
    }

    /* renamed from: g */
    public void mo12574g() {
        this.f13509a.f13483i.mo12900a(this.f13509a.getActivity().getApplication());
    }
}
