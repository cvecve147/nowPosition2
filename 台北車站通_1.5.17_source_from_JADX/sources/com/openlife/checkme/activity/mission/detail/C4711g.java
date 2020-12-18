package com.openlife.checkme.activity.mission.detail;

/* renamed from: com.openlife.checkme.activity.mission.detail.g */
public class C4711g {

    /* renamed from: a */
    private C4713i f13632a;

    /* renamed from: b */
    private C4712h f13633b;

    public C4711g(C4713i iVar, C4712h hVar) {
        this.f13632a = iVar;
        this.f13633b = hVar;
    }

    /* renamed from: a */
    public void mo13070a() {
        int b = this.f13633b.mo13068b();
        String g = this.f13633b.mo13069g();
        boolean a = this.f13633b.mo13067a();
        if (b != 0) {
            if (b == 1 || b == 2) {
                if (!a && g.isEmpty()) {
                    this.f13632a.mo13041a(b);
                    return;
                }
            } else if (b != 3) {
                return;
            }
        }
        this.f13632a.mo13040a();
    }
}
