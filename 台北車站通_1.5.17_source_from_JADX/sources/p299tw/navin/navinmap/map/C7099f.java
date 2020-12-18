package p299tw.navin.navinmap.map;

import java.util.TimerTask;

/* renamed from: tw.navin.navinmap.map.f */
class C7099f extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ PMISLMain f19559a;

    C7099f(PMISLMain pMISLMain) {
        this.f19559a = pMISLMain;
    }

    public void run() {
        float f;
        if (this.f19559a.f19432l != null && this.f19559a.f19445y) {
            String format = String.format("Map:%s, ClientId:%s, ClientName:%s, Positon(\"No Signal\")", new Object[]{this.f19559a.f19434n.f19621c, this.f19559a.f19407A, this.f19559a.f19408B});
            if (this.f19559a.f19436p != null) {
                format = String.format("Map:%s, ClientId:%s, ClientName:%s, Positon(%f, %f)", new Object[]{this.f19559a.f19434n.f19621c, this.f19559a.f19407A, this.f19559a.f19408B, Float.valueOf(this.f19559a.f19436p.x), Float.valueOf(this.f19559a.f19436p.y)});
            }
            this.f19559a.f19432l.mo21029a(format);
            float f2 = -1.0f;
            if (this.f19559a.f19436p != null) {
                f2 = this.f19559a.f19436p.x;
                f = this.f19559a.f19436p.y;
            } else {
                f = -1.0f;
            }
            this.f19559a.f19432l.mo21030a(C7109ja.m26767a().mo21175c().f19619a, f2, f);
        }
    }
}
