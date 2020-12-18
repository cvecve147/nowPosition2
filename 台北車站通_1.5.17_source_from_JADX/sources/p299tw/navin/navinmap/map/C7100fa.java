package p299tw.navin.navinmap.map;

import android.graphics.Path;
import android.graphics.PointF;
import p299tw.navin.navinmap.map.PMISLMain;

/* renamed from: tw.navin.navinmap.map.fa */
class C7100fa implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PMISLMain.C7059a f19560a;

    /* renamed from: b */
    final /* synthetic */ Path f19561b;

    /* renamed from: c */
    final /* synthetic */ Path f19562c;

    /* renamed from: d */
    final /* synthetic */ PointF f19563d;

    /* renamed from: e */
    final /* synthetic */ boolean f19564e;

    /* renamed from: f */
    final /* synthetic */ C7102ga f19565f;

    C7100fa(C7102ga gaVar, PMISLMain.C7059a aVar, Path path, Path path2, PointF pointF, boolean z) {
        this.f19565f = gaVar;
        this.f19560a = aVar;
        this.f19561b = path;
        this.f19562c = path2;
        this.f19563d = pointF;
        this.f19564e = z;
    }

    public void run() {
        this.f19560a.mo21027a(this.f19561b, this.f19562c, this.f19563d, this.f19564e);
    }
}
