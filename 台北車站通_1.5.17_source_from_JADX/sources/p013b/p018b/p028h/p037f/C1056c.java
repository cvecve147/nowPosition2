package p013b.p018b.p028h.p037f;

import android.os.Handler;
import p013b.p018b.p028h.p029a.p030a.C1014d;
import p013b.p018b.p028h.p037f.C1059f;
import p013b.p018b.p028h.p037f.C1067k;

/* renamed from: b.b.h.f.c */
class C1056c implements C1067k.C1068a<C1059f.C1062c> {

    /* renamed from: a */
    final /* synthetic */ C1014d.C1015a f3976a;

    /* renamed from: b */
    final /* synthetic */ Handler f3977b;

    C1056c(C1014d.C1015a aVar, Handler handler) {
        this.f3976a = aVar;
        this.f3977b = handler;
    }

    /* renamed from: a */
    public void mo5084a(C1059f.C1062c cVar) {
        int i;
        C1014d.C1015a aVar;
        if (cVar == null) {
            aVar = this.f3976a;
            i = 1;
        } else {
            i = cVar.f3992b;
            if (i == 0) {
                this.f3976a.mo5013a(cVar.f3991a, this.f3977b);
                return;
            }
            aVar = this.f3976a;
        }
        aVar.mo5012a(i, this.f3977b);
    }
}
