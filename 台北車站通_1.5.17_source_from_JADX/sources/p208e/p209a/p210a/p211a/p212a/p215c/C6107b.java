package p208e.p209a.p210a.p211a.p212a.p215c;

import android.os.Process;
import p208e.p209a.p210a.p211a.p212a.p215c.C6110e;

/* renamed from: e.a.a.a.a.c.b */
class C6107b extends C6110e.C6115e<Params, Result> {

    /* renamed from: b */
    final /* synthetic */ C6110e f17077b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6107b(C6110e eVar) {
        super((C6101a) null);
        this.f17077b = eVar;
    }

    public Result call() {
        this.f17077b.f17093n.set(true);
        Process.setThreadPriority(10);
        C6110e eVar = this.f17077b;
        Result a = eVar.mo16103a(this.f17102a);
        Object unused = eVar.m23139e(a);
        return a;
    }
}
