package com.openlife.checkme.p087a;

import com.openlife.checkme.C4961l;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.a.a */
class C4453a implements C6242d<Boolean> {

    /* renamed from: a */
    final /* synthetic */ C4454b f13124a;

    C4453a(C4454b bVar) {
        this.f13124a = bVar;
    }

    /* renamed from: a */
    public void accept(Boolean bool) {
        if (bool.booleanValue()) {
            this.f13124a.m17666e();
            if (this.f13124a.f13132h != null) {
                this.f13124a.f13132h.mo12574g();
            }
        } else if (this.f13124a.f13132h != null) {
            this.f13124a.f13132h.mo12569a(C4961l.g_call_gps_permission_requestion);
        }
    }
}
