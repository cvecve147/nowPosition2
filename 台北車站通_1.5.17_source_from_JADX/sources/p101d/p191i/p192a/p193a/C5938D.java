package p101d.p191i.p192a.p193a;

import android.content.Context;
import android.util.Log;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5295x;
import p101d.p191i.p192a.p200e.C6023g;

/* renamed from: d.i.a.a.D */
class C5938D implements C5288s.C5289a {

    /* renamed from: a */
    final /* synthetic */ Context f16458a;

    C5938D(Context context) {
        this.f16458a = context;
    }

    /* renamed from: a */
    public void mo14131a(C5295x xVar) {
        String a = C5942H.f16462a;
        Log.d(a, "與資源遠端伺服器連線失敗：" + xVar.getMessage());
        C5942H.m22502b(C5942H.f16471j, "與資源遠端伺服器連線失敗");
        C6023g.m22858a(this.f16458a, "與資源遠端伺服器連線失敗，請稍候再試。");
        C5942H.m22512j();
    }
}
