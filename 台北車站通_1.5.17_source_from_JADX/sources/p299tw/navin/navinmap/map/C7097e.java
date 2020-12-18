package p299tw.navin.navinmap.map;

import android.graphics.PointF;
import java.util.TimerTask;

/* renamed from: tw.navin.navinmap.map.e */
class C7097e extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ PMISLMain f19554a;

    C7097e(PMISLMain pMISLMain) {
        this.f19554a = pMISLMain;
    }

    public void run() {
        if (this.f19554a.f19445y && this.f19554a.f19413G) {
            float f = 0.0f;
            if (this.f19554a.f19421a) {
                float refreshFrequency = this.f19554a.f19426f.refreshFrequency(this.f19554a.f19439s, this.f19554a.f19440t);
                int unused = this.f19554a.f19440t = 0;
                if (this.f19554a.f19412F) {
                    double d = (double) refreshFrequency;
                    if (d < 2.5d && d - 0.8d >= 0.0d) {
                        f = refreshFrequency;
                    }
                } else {
                    return;
                }
            }
            if (this.f19554a.f19412F) {
                PMISLMain pMISLMain = this.f19554a;
                PointF a = pMISLMain.adjustPosition(f * pMISLMain.f19442v, this.f19554a.f19441u);
                if (this.f19554a.f19445y) {
                    this.f19554a.m26533a(a);
                }
            }
        }
    }
}
