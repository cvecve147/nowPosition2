package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconNotificationBody;
import com.openlife.checkme.net.model.BeaconNotificationResponse;
import com.openlife.checkme.net.model.Sensor;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.beaconservice.m */
public interface C4857m {
    /* renamed from: a */
    BeaconNotificationBody mo13359a(List<Sensor> list);

    /* renamed from: a */
    C6433l<BeaconNotificationResponse> mo13360a(BeaconNotificationBody beaconNotificationBody);

    /* renamed from: a */
    String mo13361a();

    /* renamed from: a */
    boolean mo13362a(String str);

    /* renamed from: b */
    void mo13363b();

    /* renamed from: c */
    int mo13364c();

    /* renamed from: g */
    void mo13365g();

    /* renamed from: k */
    int mo13366k();

    /* renamed from: l */
    int mo13367l();
}
