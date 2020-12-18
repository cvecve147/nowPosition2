package p101d.p191i.p192a.p193a;

import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.C6027i;

/* renamed from: d.i.a.a.o */
class C5959o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5961q f16507a;

    C5959o(C5961q qVar) {
        this.f16507a = qVar;
    }

    public void run() {
        try {
            ((C6027i) this.f16507a.f16530i.get(this.f16507a.f16538q.mo15918c())).getLocationOverlay().mo15893b(4);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        this.f16507a.f16515F.setText(this.f16507a.f16525d.getString(C6024f.start_nav));
        this.f16507a.f16515F.setVisibility(0);
        this.f16507a.f16514E.setVisibility(8);
    }
}
