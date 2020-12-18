package p101d.p191i.p192a.p193a;

import android.os.Handler;

/* renamed from: d.i.a.a.h */
class C5952h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Handler f16492a;

    /* renamed from: b */
    final /* synthetic */ C5961q f16493b;

    C5952h(C5961q qVar, Handler handler) {
        this.f16493b = qVar;
        this.f16492a = handler;
    }

    public void run() {
        if (this.f16493b.mo15772d()) {
            this.f16492a.removeCallbacks(this);
        } else {
            this.f16492a.postDelayed(this, 1000);
        }
    }
}
