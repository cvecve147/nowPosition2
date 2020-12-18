package android.support.p011v7.widget;

import android.support.p011v7.widget.C0892tb;
import android.support.p011v7.widget.RecyclerView;

/* renamed from: android.support.v7.widget.Ea */
class C0711Ea implements C0892tb.C0894b {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2772a;

    C0711Ea(RecyclerView recyclerView) {
        this.f2772a = recyclerView;
    }

    /* renamed from: a */
    public void mo3320a(RecyclerView.C0778w wVar) {
        RecyclerView recyclerView = this.f2772a;
        recyclerView.f2998w.mo3868a(wVar.f3093b, recyclerView.f2976l);
    }

    /* renamed from: a */
    public void mo3321a(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2) {
        this.f2772a.f2976l.mo3985c(wVar);
        this.f2772a.mo3656b(wVar, cVar, cVar2);
    }

    /* renamed from: b */
    public void mo3322b(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2) {
        this.f2772a.mo3639a(wVar, cVar, cVar2);
    }

    /* renamed from: c */
    public void mo3323c(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2) {
        wVar.mo4033a(false);
        RecyclerView recyclerView = this.f2772a;
        if (recyclerView.f2954N) {
            if (!recyclerView.f2963W.mo3822a(wVar, wVar, cVar, cVar2)) {
                return;
            }
        } else if (!recyclerView.f2963W.mo3829c(wVar, cVar, cVar2)) {
            return;
        }
        this.f2772a.mo3778t();
    }
}
