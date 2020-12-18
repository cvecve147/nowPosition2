package p101d.p191i.p192a.p193a;

import android.widget.TextView;
import p101d.p191i.p192a.C6005c;

/* renamed from: d.i.a.a.l */
class C5956l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f16500a;

    /* renamed from: b */
    final /* synthetic */ C5961q f16501b;

    C5956l(C5961q qVar, String str) {
        this.f16501b = qVar;
        this.f16500a = str;
    }

    public void run() {
        ((TextView) this.f16501b.f16514E.findViewById(C6005c.nav_info_instruction)).setText(this.f16500a);
    }
}
