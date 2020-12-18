package p101d.p191i.p192a.p193a;

import android.graphics.PointF;
import p101d.p191i.p192a.C6027i;

/* renamed from: d.i.a.a.g */
class C5951g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Boolean f16490a;

    /* renamed from: b */
    final /* synthetic */ C5961q f16491b;

    C5951g(C5961q qVar, Boolean bool) {
        this.f16491b = qVar;
        this.f16490a = bool;
    }

    public void run() {
        PointF g;
        if (this.f16490a.booleanValue()) {
            if (this.f16491b.f16540s != this.f16491b.f16538q.mo15918c()) {
                float currentRotateDegrees = (float) ((int) ((C6027i) this.f16491b.f16530i.get(this.f16491b.f16540s)).getCurrentRotateDegrees());
                if (currentRotateDegrees > 180.0f) {
                    currentRotateDegrees = -(360.0f - currentRotateDegrees);
                }
                while (Math.abs(currentRotateDegrees) >= 1.0f) {
                    currentRotateDegrees /= 2.0f;
                    ((C6027i) this.f16491b.f16530i.get(this.f16491b.f16540s)).getController().mo15932a(currentRotateDegrees);
                    this.f16491b.f16517H.setRotation(currentRotateDegrees);
                }
            } else {
                float currentRotateDegrees2 = (float) ((int) ((C6027i) this.f16491b.f16530i.get(this.f16491b.f16538q.mo15918c())).getCurrentRotateDegrees());
                if (currentRotateDegrees2 > 180.0f) {
                    currentRotateDegrees2 = -(360.0f - currentRotateDegrees2);
                }
                while (Math.abs(currentRotateDegrees2) >= 1.0f) {
                    currentRotateDegrees2 /= 2.0f;
                    ((C6027i) this.f16491b.f16530i.get(this.f16491b.f16538q.mo15918c())).getController().mo15932a(currentRotateDegrees2);
                    this.f16491b.f16517H.setRotation(currentRotateDegrees2);
                }
            }
        }
        C6027i iVar = (C6027i) this.f16491b.f16530i.get(this.f16491b.f16538q.mo15918c());
        if (iVar != null && (g = iVar.getLocationOverlay().mo15902g()) != null) {
            float[] a = ((C6027i) this.f16491b.f16530i.get(this.f16491b.f16538q.mo15918c())).mo15941a(g.x, g.y);
            float abs = Math.abs(((float) this.f16491b.f16542u[0]) - a[0]) + Math.abs(((float) this.f16491b.f16542u[1]) - a[1]);
            while (abs > 10.0f) {
                float[] a2 = ((C6027i) this.f16491b.f16530i.get(this.f16491b.f16538q.mo15918c())).mo15941a(g.x, g.y);
                float f = ((float) this.f16491b.f16542u[0]) - a2[0];
                float f2 = ((float) this.f16491b.f16542u[1]) - a2[1];
                abs = Math.abs(f) + Math.abs(f2);
                ((C6027i) this.f16491b.f16530i.get(this.f16491b.f16538q.mo15918c())).mo15942b(f * 0.5f, f2 * 0.5f);
                ((C6027i) this.f16491b.f16530i.get(this.f16491b.f16538q.mo15918c())).mo15935a();
            }
            this.f16491b.m22527a(2);
        }
    }
}
