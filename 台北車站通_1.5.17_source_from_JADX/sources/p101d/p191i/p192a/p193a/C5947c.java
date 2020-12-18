package p101d.p191i.p192a.p193a;

import p101d.p191i.p192a.p200e.C6019c;
import p101d.p191i.p192a.p200e.C6020d;
import p101d.p191i.p192a.p200e.C6023g;

/* renamed from: d.i.a.a.c */
class C5947c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6020d[] f16482a;

    /* renamed from: b */
    final /* synthetic */ C6019c f16483b;

    /* renamed from: c */
    final /* synthetic */ C5961q f16484c;

    C5947c(C5961q qVar, C6020d[] dVarArr, C6019c cVar) {
        this.f16484c = qVar;
        this.f16482a = dVarArr;
        this.f16483b = cVar;
    }

    public void run() {
        if (this.f16482a != null) {
            for (int i = 0; i < this.f16482a.length; i++) {
                float[] d = this.f16483b.mo15919d();
                if (((float) Math.sqrt(Math.pow((double) (this.f16482a[i].f16836a - d[0]), 2.0d) + Math.pow((double) (this.f16482a[i].f16837b - d[1]), 2.0d))) <= this.f16482a[i].f16838c) {
                    C6023g.m22859a(this.f16484c.f16525d, this.f16482a[i].f16839d, 0);
                    Boolean unused = this.f16484c.f16544w = true;
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Boolean unused2 = this.f16484c.f16544w = false;
        }
    }
}
