package com.askey.taipeinavi.parking;

import com.askey.taipeinavi.p058d.C1210d;
import p101d.p191i.p192a.p193a.C5942H;

/* renamed from: com.askey.taipeinavi.parking.a */
class C1268a implements C5942H.C5944b {

    /* renamed from: a */
    final /* synthetic */ C1269b f4519a;

    C1268a(C1269b bVar) {
        this.f4519a = bVar;
    }

    /* renamed from: a */
    public void mo5612a() {
        C1210d.m6028a("sto onUpdatedFinish");
        boolean unused = this.f4519a.f4522c = true;
        C5942H.m22510h();
        if (this.f4519a.f4521b != null) {
            this.f4519a.f4521b.mo5573a();
        }
        this.f4519a.m6274d();
    }

    /* renamed from: a */
    public void mo5613a(int i, String str) {
    }

    /* renamed from: b */
    public void mo5614b() {
        C1210d.m6028a("sto onTimeout");
        boolean unused = this.f4519a.f4522c = true;
        C5942H.m22510h();
        if (this.f4519a.f4521b != null) {
            this.f4519a.f4521b.mo5573a();
        }
        this.f4519a.m6274d();
    }
}
