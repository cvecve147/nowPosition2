package p013b.p018b.p028h.p037f;

import android.content.Context;
import java.util.concurrent.Callable;
import p013b.p018b.p028h.p037f.C1059f;

/* renamed from: b.b.h.f.b */
class C1055b implements Callable<C1059f.C1062c> {

    /* renamed from: a */
    final /* synthetic */ Context f3972a;

    /* renamed from: b */
    final /* synthetic */ C1054a f3973b;

    /* renamed from: c */
    final /* synthetic */ int f3974c;

    /* renamed from: d */
    final /* synthetic */ String f3975d;

    C1055b(Context context, C1054a aVar, int i, String str) {
        this.f3972a = context;
        this.f3973b = aVar;
        this.f3974c = i;
        this.f3975d = str;
    }

    public C1059f.C1062c call() {
        C1059f.C1062c a = C1059f.m5567b(this.f3972a, this.f3973b, this.f3974c);
        if (a.f3991a != null) {
            C1059f.f3979a.mo5157a(this.f3975d, a.f3991a);
        }
        return a;
    }
}
