package p000a.p001a.p002a;

import android.util.Log;
import java.util.List;
import p000a.p001a.p004c.C0017b;

/* renamed from: a.a.a.b */
class C0001b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0003d f1a;

    C0001b(C0003d dVar) {
        this.f1a = dVar;
    }

    public void run() {
        C0003d dVar = this.f1a;
        C0017b a = dVar.m1a((List<C0017b>) dVar.f23u);
        int[] unused = this.f1a.f14l = new int[4];
        this.f1a.f14l[0] = a.f54a.intValue();
        this.f1a.f14l[1] = a.f55b.intValue();
        this.f1a.f14l[2] = a.f56c.intValue();
        this.f1a.f14l[3] = 0;
        if (this.f1a.f21s.intValue() >= this.f1a.f19q.intValue()) {
            String b = this.f1a.f3a;
            Log.i(b, "IPS returns " + this.f1a.f14l[0] + " " + this.f1a.f14l[1] + " " + this.f1a.f14l[2] + " " + this.f1a.f14l[3]);
            this.f1a.f10h.mo12a(this.f1a.f14l);
        }
    }
}
