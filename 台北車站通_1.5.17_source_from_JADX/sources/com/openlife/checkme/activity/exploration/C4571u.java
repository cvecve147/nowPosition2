package com.openlife.checkme.activity.exploration;

import com.openlife.checkme.net.model.MapData;
import com.openlife.checkme.p097f.C4953c;
import java.util.List;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.exploration.u */
class C4571u implements C6242d<C4953c> {

    /* renamed from: a */
    final /* synthetic */ double f13327a;

    /* renamed from: b */
    final /* synthetic */ double f13328b;

    /* renamed from: c */
    final /* synthetic */ C4572v f13329c;

    C4571u(C4572v vVar, double d, double d2) {
        this.f13329c = vVar;
        this.f13327a = d;
        this.f13328b = d2;
    }

    /* renamed from: a */
    public void accept(C4953c cVar) {
        if (this.f13329c.mo13153a(cVar)) {
            this.f13329c.f13330d = (List) cVar.getData();
            if (!this.f13329c.f13330d.isEmpty()) {
                this.f13329c.f13331e.mo12748a(this.f13329c.f13330d);
                if (!(this.f13327a == 0.0d || this.f13328b == 0.0d)) {
                    this.f13329c.f13331e.mo12742a(this.f13327a, this.f13328b);
                }
                this.f13329c.f13331e.mo12749a(this.f13329c.f13330d, (MapData) null);
                return;
            }
            this.f13329c.f13331e.mo12750b();
        }
    }
}
