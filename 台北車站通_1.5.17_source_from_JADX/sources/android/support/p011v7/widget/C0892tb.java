package android.support.p011v7.widget;

import android.support.p011v7.widget.RecyclerView;
import p013b.p018b.p028h.p039h.C1080b;
import p013b.p018b.p028h.p039h.C1087i;
import p013b.p018b.p028h.p039h.C1097n;
import p013b.p018b.p028h.p039h.C1098o;

/* renamed from: android.support.v7.widget.tb */
class C0892tb {

    /* renamed from: a */
    final C1080b<RecyclerView.C0778w, C0893a> f3649a = new C1080b<>();

    /* renamed from: b */
    final C1087i<RecyclerView.C0778w> f3650b = new C1087i<>();

    /* renamed from: android.support.v7.widget.tb$a */
    static class C0893a {

        /* renamed from: a */
        static C1097n<C0893a> f3651a = new C1098o(20);

        /* renamed from: b */
        int f3652b;

        /* renamed from: c */
        RecyclerView.C0753f.C0756c f3653c;

        /* renamed from: d */
        RecyclerView.C0753f.C0756c f3654d;

        private C0893a() {
        }

        /* renamed from: a */
        static void m5100a() {
            do {
            } while (f3651a.mo5227a() != null);
        }

        /* renamed from: a */
        static void m5101a(C0893a aVar) {
            aVar.f3652b = 0;
            aVar.f3653c = null;
            aVar.f3654d = null;
            f3651a.mo5228a(aVar);
        }

        /* renamed from: b */
        static C0893a m5102b() {
            C0893a a = f3651a.mo5227a();
            return a == null ? new C0893a() : a;
        }
    }

    /* renamed from: android.support.v7.widget.tb$b */
    interface C0894b {
        /* renamed from: a */
        void mo3320a(RecyclerView.C0778w wVar);

        /* renamed from: a */
        void mo3321a(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2);

        /* renamed from: b */
        void mo3322b(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2);

        /* renamed from: c */
        void mo3323c(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2);
    }

    C0892tb() {
    }

    /* renamed from: a */
    private RecyclerView.C0753f.C0756c m5083a(RecyclerView.C0778w wVar, int i) {
        C0893a d;
        RecyclerView.C0753f.C0756c cVar;
        int a = this.f3649a.mo5230a((Object) wVar);
        if (a >= 0 && (d = this.f3649a.mo5241d(a)) != null) {
            int i2 = d.f3652b;
            if ((i2 & i) != 0) {
                d.f3652b = (~i) & i2;
                if (i == 4) {
                    cVar = d.f3653c;
                } else if (i == 8) {
                    cVar = d.f3654d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((d.f3652b & 12) == 0) {
                    this.f3649a.mo5237c(a);
                    C0893a.m5101a(d);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RecyclerView.C0778w mo4716a(long j) {
        return this.f3650b.mo5147b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4717a() {
        this.f3649a.clear();
        this.f3650b.mo5153d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4718a(long j, RecyclerView.C0778w wVar) {
        this.f3650b.mo5149b(j, wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4719a(RecyclerView.C0778w wVar) {
        C0893a aVar = this.f3649a.get(wVar);
        if (aVar == null) {
            aVar = C0893a.m5102b();
            this.f3649a.put(wVar, aVar);
        }
        aVar.f3652b |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4720a(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar) {
        C0893a aVar = this.f3649a.get(wVar);
        if (aVar == null) {
            aVar = C0893a.m5102b();
            this.f3649a.put(wVar, aVar);
        }
        aVar.f3652b |= 2;
        aVar.f3653c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4721a(C0894b bVar) {
        RecyclerView.C0753f.C0756c cVar;
        RecyclerView.C0753f.C0756c cVar2;
        for (int size = this.f3649a.size() - 1; size >= 0; size--) {
            RecyclerView.C0778w b = this.f3649a.mo5236b(size);
            C0893a c = this.f3649a.mo5237c(size);
            int i = c.f3652b;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = c.f3653c;
                    if (cVar != null) {
                        cVar2 = c.f3654d;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.mo3323c(b, c.f3653c, c.f3654d);
                        } else if ((i & 4) != 0) {
                            cVar = c.f3653c;
                            cVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        C0893a.m5101a(c);
                    }
                    bVar.mo3322b(b, c.f3653c, c.f3654d);
                    C0893a.m5101a(c);
                }
                bVar.mo3321a(b, cVar, cVar2);
                C0893a.m5101a(c);
            }
            bVar.mo3320a(b);
            C0893a.m5101a(c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4722b() {
        C0893a.m5100a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4723b(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar) {
        C0893a aVar = this.f3649a.get(wVar);
        if (aVar == null) {
            aVar = C0893a.m5102b();
            this.f3649a.put(wVar, aVar);
        }
        aVar.f3654d = cVar;
        aVar.f3652b |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4724b(RecyclerView.C0778w wVar) {
        C0893a aVar = this.f3649a.get(wVar);
        return (aVar == null || (aVar.f3652b & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4725c(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar) {
        C0893a aVar = this.f3649a.get(wVar);
        if (aVar == null) {
            aVar = C0893a.m5102b();
            this.f3649a.put(wVar, aVar);
        }
        aVar.f3653c = cVar;
        aVar.f3652b |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4726c(RecyclerView.C0778w wVar) {
        C0893a aVar = this.f3649a.get(wVar);
        return (aVar == null || (aVar.f3652b & 4) == 0) ? false : true;
    }

    /* renamed from: d */
    public void mo4727d(RecyclerView.C0778w wVar) {
        mo4730g(wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public RecyclerView.C0753f.C0756c mo4728e(RecyclerView.C0778w wVar) {
        return m5083a(wVar, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public RecyclerView.C0753f.C0756c mo4729f(RecyclerView.C0778w wVar) {
        return m5083a(wVar, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4730g(RecyclerView.C0778w wVar) {
        C0893a aVar = this.f3649a.get(wVar);
        if (aVar != null) {
            aVar.f3652b &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4731h(RecyclerView.C0778w wVar) {
        int e = this.f3650b.mo5154e() - 1;
        while (true) {
            if (e < 0) {
                break;
            } else if (wVar == this.f3650b.mo5151c(e)) {
                this.f3650b.mo5148b(e);
                break;
            } else {
                e--;
            }
        }
        C0893a remove = this.f3649a.remove(wVar);
        if (remove != null) {
            C0893a.m5101a(remove);
        }
    }
}
