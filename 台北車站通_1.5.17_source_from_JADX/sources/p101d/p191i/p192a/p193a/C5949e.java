package p101d.p191i.p192a.p193a;

import android.util.Log;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5295x;

/* renamed from: d.i.a.a.e */
class C5949e implements C5288s.C5289a {

    /* renamed from: a */
    final /* synthetic */ C5961q f16486a;

    C5949e(C5961q qVar) {
        this.f16486a = qVar;
    }

    /* renamed from: a */
    public void mo14131a(C5295x xVar) {
        String str = C5961q.f16509a;
        Log.d(str, "與資源遠端伺服器連線失敗：" + xVar.getMessage());
        this.f16486a.m22540b(this.f16486a.f16529h.mo15720b().mo15929b("POIROI"));
    }
}
