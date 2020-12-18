package p299tw.navin.navinmap.map;

/* renamed from: tw.navin.navinmap.map.B */
class C7026B implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f19323a;

    /* renamed from: b */
    final /* synthetic */ boolean f19324b;

    /* renamed from: c */
    final /* synthetic */ boolean f19325c;

    /* renamed from: d */
    final /* synthetic */ C7030F f19326d;

    C7026B(C7030F f, boolean z, boolean z2, boolean z3) {
        this.f19326d = f;
        this.f19323a = z;
        this.f19324b = z2;
        this.f19325c = z3;
    }

    public void run() {
        if (this.f19326d.f19351f != null) {
            this.f19326d.f19351f.mo21089d();
        }
        this.f19326d.m26422b(this.f19323a, this.f19324b);
        this.f19326d.mo20999a(this.f19323a, this.f19324b);
        this.f19326d.m26425c(false);
        this.f19326d.mo21124b(this.f19325c);
    }
}
