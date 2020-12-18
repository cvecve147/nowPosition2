package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconNotificationBody;
import com.openlife.checkme.net.model.BeaconNotificationResponse;
import com.openlife.checkme.net.model.Sensor;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p097f.C4955e;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.beaconservice.o */
public class C4859o implements C4857m {

    /* renamed from: a */
    private C4947j f13935a = C4947j.m19536a();

    /* renamed from: b */
    private C4955e f13936b = C4955e.m19580a();

    /* renamed from: a */
    public BeaconNotificationBody mo13359a(List<Sensor> list) {
        return new BeaconNotificationBody(list);
    }

    /* renamed from: a */
    public C6433l<BeaconNotificationResponse> mo13360a(BeaconNotificationBody beaconNotificationBody) {
        return this.f13936b.mo13605b().mo13561a(beaconNotificationBody.getSignature(), beaconNotificationBody);
    }

    /* renamed from: a */
    public String mo13361a() {
        return this.f13935a.mo13555f().mo13511b();
    }

    /* renamed from: a */
    public boolean mo13362a(String str) {
        return this.f13935a.mo13555f().mo13510a(str);
    }

    /* renamed from: b */
    public void mo13363b() {
        this.f13935a.mo13555f().mo13507a();
    }

    /* renamed from: c */
    public int mo13364c() {
        return this.f13935a.mo13554e().mo13548k();
    }

    /* renamed from: g */
    public void mo13365g() {
        this.f13935a.mo13555f().mo13516e();
    }

    /* renamed from: k */
    public int mo13366k() {
        return this.f13935a.mo13554e().mo13546j();
    }

    /* renamed from: l */
    public int mo13367l() {
        return this.f13935a.mo13554e().mo13549l();
    }
}
