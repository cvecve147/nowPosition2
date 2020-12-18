package p101d.p191i.p192a.p193a;

import android.widget.TextView;
import p101d.p191i.p192a.C6005c;

/* renamed from: d.i.a.a.n */
class C5958n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f16505a;

    /* renamed from: b */
    final /* synthetic */ C5961q f16506b;

    C5958n(C5961q qVar, String str) {
        this.f16506b = qVar;
        this.f16505a = str;
    }

    public void run() {
        ((TextView) this.f16506b.f16514E.findViewById(C6005c.nav_info_remain)).setText(this.f16505a);
    }
}
