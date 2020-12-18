package p101d.p191i.p192a.p193a;

import android.view.View;

/* renamed from: d.i.a.a.i */
class C5953i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f16494a;

    /* renamed from: b */
    final /* synthetic */ C5961q f16495b;

    C5953i(C5961q qVar, String str) {
        this.f16495b = qVar;
        this.f16494a = str;
    }

    public void run() {
        int f = this.f16495b.f16523b;
        this.f16495b.m22527a(4);
        this.f16495b.f16536o.removeAllViews();
        this.f16495b.f16536o.addView((View) this.f16495b.f16530i.get(this.f16494a));
        this.f16495b.f16510A.setHeader(this.f16494a);
        String unused = this.f16495b.f16540s = this.f16494a;
        this.f16495b.m22527a(f);
    }
}
