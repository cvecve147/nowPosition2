package p101d.p191i.p192a.p193a;

import android.widget.TextView;
import p101d.p191i.p192a.C6005c;

/* renamed from: d.i.a.a.j */
class C5954j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f16496a;

    /* renamed from: b */
    final /* synthetic */ C5961q f16497b;

    C5954j(C5961q qVar, String str) {
        this.f16497b = qVar;
        this.f16496a = str;
    }

    public void run() {
        ((TextView) this.f16497b.f16514E.findViewById(C6005c.nav_info_instruction)).setText(this.f16496a);
    }
}
