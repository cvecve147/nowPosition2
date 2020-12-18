package p101d.p191i.p192a.p193a;

import android.widget.TextView;
import p101d.p191i.p192a.C6005c;

/* renamed from: d.i.a.a.k */
class C5955k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f16498a;

    /* renamed from: b */
    final /* synthetic */ C5961q f16499b;

    C5955k(C5961q qVar, String str) {
        this.f16499b = qVar;
        this.f16498a = str;
    }

    public void run() {
        ((TextView) this.f16499b.f16514E.findViewById(C6005c.nav_info_instruction)).setText(this.f16498a);
    }
}
