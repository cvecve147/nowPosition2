package p299tw.navin.navinmap.map;

import android.graphics.Path;
import p299tw.navin.navinmap.map.PMISLMain;

/* renamed from: tw.navin.navinmap.map.ea */
class C7098ea implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PMISLMain.C7059a f19555a;

    /* renamed from: b */
    final /* synthetic */ Path f19556b;

    /* renamed from: c */
    final /* synthetic */ Path f19557c;

    /* renamed from: d */
    final /* synthetic */ C7102ga f19558d;

    C7098ea(C7102ga gaVar, PMISLMain.C7059a aVar, Path path, Path path2) {
        this.f19558d = gaVar;
        this.f19555a = aVar;
        this.f19556b = path;
        this.f19557c = path2;
    }

    public void run() {
        this.f19555a.mo21026a(this.f19556b, this.f19557c);
    }
}
