package p101d.p191i.p192a.p193a;

import android.graphics.PointF;
import android.util.Log;
import java.util.HashMap;
import p101d.p191i.p192a.p193a.C5961q;
import p101d.p191i.p192a.p199d.C6011b;

/* renamed from: d.i.a.a.r */
class C5970r implements C5961q.C5962a {

    /* renamed from: a */
    final /* synthetic */ C5975w f16568a;

    C5970r(C5975w wVar) {
        this.f16568a = wVar;
    }

    /* renamed from: a */
    public void mo15773a(C6011b bVar, int i) {
        PointF g = bVar.mo15902g();
        String a = C5975w.f16575a;
        Log.d(a, "position: " + g + ", floor: " + i);
        this.f16568a.mo15794a(i, g.x, g.y);
    }

    /* renamed from: a */
    public void mo15774a(String str, HashMap hashMap) {
        this.f16568a.f16578d.mo15767a(str, this.f16568a.f16591q);
    }
}
