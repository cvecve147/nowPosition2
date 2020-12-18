package android.support.p011v7.widget;

import android.support.p011v7.widget.C0844j;
import android.support.p011v7.widget.RecyclerView;

/* renamed from: android.support.v7.widget.Ga */
class C0715Ga implements C0844j.C0845a {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2787a;

    C0715Ga(RecyclerView recyclerView) {
        this.f2787a = recyclerView;
    }

    /* renamed from: a */
    public RecyclerView.C0778w mo3357a(int i) {
        RecyclerView.C0778w a = this.f2787a.mo3625a(i, true);
        if (a != null && !this.f2787a.f2982o.mo4253c(a.f3093b)) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public void mo3358a(int i, int i2) {
        this.f2787a.mo3696g(i, i2);
        this.f2787a.f2995ua = true;
    }

    /* renamed from: a */
    public void mo3359a(int i, int i2, Object obj) {
        this.f2787a.mo3630a(i, i2, obj);
        this.f2787a.f2997va = true;
    }

    /* renamed from: a */
    public void mo3360a(C0844j.C0846b bVar) {
        mo3364c(bVar);
    }

    /* renamed from: b */
    public void mo3361b(int i, int i2) {
        this.f2787a.mo3631a(i, i2, false);
        this.f2787a.f2995ua = true;
    }

    /* renamed from: b */
    public void mo3362b(C0844j.C0846b bVar) {
        mo3364c(bVar);
    }

    /* renamed from: c */
    public void mo3363c(int i, int i2) {
        this.f2787a.mo3691f(i, i2);
        this.f2787a.f2995ua = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3364c(C0844j.C0846b bVar) {
        int i = bVar.f3464a;
        if (i == 1) {
            RecyclerView recyclerView = this.f2787a;
            recyclerView.f2998w.mo3380a(recyclerView, bVar.f3465b, bVar.f3467d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f2787a;
            recyclerView2.f2998w.mo3386b(recyclerView2, bVar.f3465b, bVar.f3467d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f2787a;
            recyclerView3.f2998w.mo3382a(recyclerView3, bVar.f3465b, bVar.f3467d, bVar.f3466c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f2787a;
            recyclerView4.f2998w.mo3381a(recyclerView4, bVar.f3465b, bVar.f3467d, 1);
        }
    }

    /* renamed from: d */
    public void mo3365d(int i, int i2) {
        this.f2787a.mo3631a(i, i2, true);
        RecyclerView recyclerView = this.f2787a;
        recyclerView.f2995ua = true;
        recyclerView.f2989ra.f3071d += i2;
    }
}
