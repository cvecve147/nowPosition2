package com.openlife.checkme.activity.exploration;

import com.openlife.checkme.activity.exploration.C4567q;
import com.openlife.checkme.activity.exploration.C4569s;
import com.openlife.checkme.activity.p088a.C4464g;
import com.openlife.checkme.net.model.MapData;
import java.util.ArrayList;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.exploration.v */
public class C4572v<V extends C4569s, M extends C4567q> extends C4568r {

    /* renamed from: d */
    List<MapData> f13330d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4569s f13331e;

    /* renamed from: f */
    private C4567q f13332f;

    public C4572v(V v, M m) {
        super(v, m);
        this.f13331e = v;
        this.f13332f = m;
    }

    /* renamed from: a */
    private void m18060a(C6433l lVar, double d, double d2) {
        C4464g.m17699a(mo13150a(), lVar, new C4571u(this, d, d2), this.f13331e);
    }

    /* renamed from: c */
    private void m18061c(MapData mapData) {
        this.f13331e.mo12749a(this.f13330d, mapData);
        this.f13331e.mo12747a(mapData, mapData.getDistance());
        this.f13331e.mo12741a();
    }

    /* renamed from: a */
    public void mo12778a(MapData mapData) {
        this.f13331e.mo12746a(mapData);
        m18061c(mapData);
        this.f13331e.mo12742a(mapData.getLocation().getLat(), mapData.getLocation().getLon());
    }

    /* renamed from: a */
    public void mo12779a(String str, int i) {
        mo12780a(str, i, 0.0d, 0.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12780a(java.lang.String r8, int r9, double r10, double r12) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = -821471938(0xffffffffcf09553e, float:-2.30406502E9)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1668466781(0x6372c85d, float:4.4785498E21)
            if (r0 == r1) goto L_0x0020
            r1 = 1787432300(0x6a8a0d6c, float:8.344757E25)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "MISSION"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0034
            r8 = r3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "COMPANY"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "SURROUND"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0034
            r8 = 0
            goto L_0x0035
        L_0x0034:
            r8 = -1
        L_0x0035:
            if (r8 == 0) goto L_0x0058
            if (r8 == r3) goto L_0x0047
            if (r8 == r2) goto L_0x003c
            goto L_0x0068
        L_0x003c:
            com.openlife.checkme.activity.exploration.q r8 = r7.f13332f
            com.openlife.checkme.net.model.MissionLocationBody r0 = r8.mo12775b((double) r10, (double) r12)
            e.b.l r2 = r8.mo12773a((com.openlife.checkme.net.model.MissionLocationBody) r0, (int) r9)
            goto L_0x0051
        L_0x0047:
            com.openlife.checkme.activity.exploration.q r8 = r7.f13332f
            com.openlife.checkme.net.model.MissionLocationBody r0 = r8.mo12775b((double) r10, (double) r12)
            e.b.l r2 = r8.mo12776b((com.openlife.checkme.net.model.MissionLocationBody) r0, (int) r9)
        L_0x0051:
            r1 = r7
            r3 = r10
            r5 = r12
            r1.m18060a(r2, r3, r5)
            goto L_0x0068
        L_0x0058:
            com.openlife.checkme.activity.exploration.q r8 = r7.f13332f
            com.openlife.checkme.net.model.StoreSurroundingBody r9 = r8.mo12772a((double) r10, (double) r12)
            e.b.l r1 = r8.mo12774a(r9)
            r0 = r7
            r2 = r10
            r4 = r12
            r0.m18060a(r1, r2, r4)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.openlife.checkme.activity.exploration.C4572v.mo12780a(java.lang.String, int, double, double):void");
    }

    /* renamed from: b */
    public void mo12683b(int i) {
        if (i == 11) {
            i = 12;
        } else if (i == 12) {
            i = 11;
        }
        this.f13331e.mo12743a(i);
    }

    /* renamed from: b */
    public void mo12781b(MapData mapData) {
        m18061c(mapData);
        this.f13331e.mo12753c(this.f13330d.indexOf(mapData));
        this.f13331e.mo12741a();
    }
}
