package p299tw.navin.navinmap.map;

import android.graphics.PointF;
import p299tw.navin.navinmap.map.PMISLMain;

/* renamed from: tw.navin.navinmap.map.da */
class C7096da implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PMISLMain.C7059a f19551a;

    /* renamed from: b */
    final /* synthetic */ PointF f19552b;

    /* renamed from: c */
    final /* synthetic */ C7102ga f19553c;

    C7096da(C7102ga gaVar, PMISLMain.C7059a aVar, PointF pointF) {
        this.f19553c = gaVar;
        this.f19551a = aVar;
        this.f19552b = pointF;
    }

    public void run() {
        this.f19551a.mo21028a(this.f19552b);
    }
}
