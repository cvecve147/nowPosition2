package com.openlife.checkme.beaconservice;

import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.net.model.BeaconNotificationData;
import com.openlife.checkme.net.model.Sensor;
import java.util.List;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p243h.C6418a;

/* renamed from: com.openlife.checkme.beaconservice.r */
public class C4862r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4858n f13939a;

    /* renamed from: b */
    private C4857m f13940b;

    /* renamed from: c */
    private C4458a f13941c = new C4458a();

    public C4862r(C4858n nVar, C4857m mVar) {
        this.f13939a = nVar;
        this.f13940b = mVar;
    }

    /* renamed from: a */
    public void mo13370a() {
        if (!this.f13940b.mo13362a(this.f13940b.mo13361a())) {
            this.f13940b.mo13365g();
            this.f13940b.mo13363b();
        }
    }

    /* renamed from: a */
    public void mo13371a(List<Sensor> list) {
        this.f13939a.mo13318a(list);
    }

    /* renamed from: b */
    public void mo13372b() {
        this.f13939a.mo13316a(this.f13940b.mo13366k(), this.f13940b.mo13364c(), this.f13940b.mo13367l());
    }

    /* renamed from: b */
    public void mo13373b(List<Sensor> list) {
        C4458a aVar = this.f13941c;
        C4857m mVar = this.f13940b;
        aVar.mo12586a(mVar.mo13360a(mVar.mo13359a(list)).mo16545b(C6418a.m23996b()).mo16540a(C6216b.m23500a()).mo16526a(new C4860p(this), (C6242d<? super Throwable>) new C4861q(this)));
    }

    /* renamed from: c */
    public void mo13374c(List<BeaconNotificationData> list) {
        this.f13939a.mo13321c(list);
    }
}
