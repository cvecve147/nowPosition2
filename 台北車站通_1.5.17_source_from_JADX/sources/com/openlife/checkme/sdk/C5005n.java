package com.openlife.checkme.sdk;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.beaconservice.C4865u;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.p093c.C4881k;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.sdk.n */
public class C5005n extends C4673l implements C4997f {

    /* renamed from: c */
    private C4865u f14201c = new C4865u(this.f13552a, this.f13553b);

    /* renamed from: a */
    public C6433l<BeaconListResponse> mo12887a(BeaconListBody beaconListBody, Long l) {
        return this.f14201c.mo12887a(beaconListBody, l);
    }

    /* renamed from: a */
    public void mo14020a(int i, int i2, int i3) {
        this.f13553b.mo13554e().mo13534e(i);
        this.f13553b.mo13554e().mo13537f(i2);
        this.f13553b.mo13554e().mo13540g(i3);
    }

    /* renamed from: a */
    public void mo12890a(BeaconService.C4838a aVar) {
        this.f14201c.mo12890a(aVar);
    }

    /* renamed from: a */
    public void mo12891a(List<String> list) {
        this.f14201c.mo12891a(list);
    }

    /* renamed from: b */
    public void mo12977b(String str) {
        this.f13553b.mo13554e().mo13538f(str);
    }

    /* renamed from: d */
    public void mo14022d(int i) {
        this.f13553b.mo13554e().mo13531d(i);
    }

    /* renamed from: e */
    public void mo14023e(String str) {
        C4881k.m19214a(str);
    }

    /* renamed from: f */
    public void mo14024f(String str) {
        if (!this.f13553b.mo13553d().mo13494j().equals(str)) {
            mo14030n();
        }
    }

    /* renamed from: h */
    public void mo14025h(String str) {
        this.f13553b.mo13553d().mo13495j(str);
    }

    /* renamed from: i */
    public void mo14026i(String str) {
        this.f13552a.mo13606b(str);
    }

    /* renamed from: j */
    public void mo14027j(String str) {
        this.f13553b.mo13554e().mo13543h(str);
    }

    /* renamed from: m */
    public BeaconListBody mo12896m() {
        return this.f14201c.mo12896m();
    }

    /* renamed from: n */
    public void mo14030n() {
        this.f13553b.mo13553d().mo13498m();
        this.f13553b.mo13552c().mo13504b();
        this.f13553b.mo13555f().mo13516e();
        this.f13553b.mo13555f().mo13513c();
        this.f13553b.mo13555f().mo13518g();
    }
}
