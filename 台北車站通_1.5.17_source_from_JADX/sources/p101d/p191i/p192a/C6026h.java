package p101d.p191i.p192a;

import android.graphics.PointF;

/* renamed from: d.i.a.h */
class C6026h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6027i f16854a;

    C6026h(C6027i iVar) {
        this.f16854a = iVar;
    }

    public void run() {
        do {
            boolean z = false;
            if (this.f16854a.f16859e.booleanValue() && (this.f16854a.f16857c != null)) {
                PointF g = this.f16854a.f16857c.mo15902g();
                float[] a = this.f16854a.mo15941a(g.x, g.y);
                this.f16854a.mo15942b((((float) this.f16854a.f16860f[0]) - a[0]) * 0.5f, (((float) this.f16854a.f16860f[1]) - a[1]) * 0.5f);
                this.f16854a.f16857c.mo15892b(0.0f);
                this.f16854a.f16857c.mo15897c(0.0f);
                this.f16854a.getController().mo15932a(this.f16854a.f16857c.mo15900e());
            } else {
                boolean z2 = !this.f16854a.f16859e.booleanValue();
                if (this.f16854a.f16857c != null) {
                    z = true;
                }
                if (z2 && z) {
                    this.f16854a.f16857c.mo15899d(this.f16854a.f16855a.getCurrentRotateDegrees());
                }
            }
            this.f16854a.mo15935a();
            try {
                Thread.sleep((long) this.f16854a.f16861g);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!this.f16854a.f16863i);
    }
}
