package p101d.p191i.p192a.p193a;

/* renamed from: d.i.a.a.t */
class C5972t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5975w f16572a;

    C5972t(C5975w wVar) {
        this.f16572a = wVar;
    }

    public void run() {
        if (!this.f16572a.f16587m.booleanValue()) {
            Boolean unused = this.f16572a.f16587m = true;
            this.f16572a.f16585k.postDelayed(this, (long) this.f16572a.f16584j);
        } else if (this.f16572a.f16586l.booleanValue()) {
            this.f16572a.m22622f();
            Boolean unused2 = this.f16572a.f16586l = false;
        }
    }
}
