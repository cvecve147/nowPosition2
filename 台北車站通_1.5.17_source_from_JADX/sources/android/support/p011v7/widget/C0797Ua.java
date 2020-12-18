package android.support.p011v7.widget;

import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.Ua */
public abstract class C0797Ua extends RecyclerView.C0753f {

    /* renamed from: g */
    boolean f3315g = true;

    /* renamed from: a */
    public final void mo4349a(RecyclerView.C0778w wVar, boolean z) {
        mo4353c(wVar, z);
        mo3828c(wVar);
    }

    /* renamed from: a */
    public abstract boolean mo4350a(RecyclerView.C0778w wVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo3821a(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2) {
        if (cVar == null || (cVar.f3015a == cVar2.f3015a && cVar.f3016b == cVar2.f3016b)) {
            return mo4355f(wVar);
        }
        return mo4350a(wVar, cVar.f3015a, cVar.f3016b, cVar2.f3015a, cVar2.f3016b);
    }

    /* renamed from: a */
    public abstract boolean mo4351a(RecyclerView.C0778w wVar, RecyclerView.C0778w wVar2, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo3822a(RecyclerView.C0778w wVar, RecyclerView.C0778w wVar2, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3015a;
        int i4 = cVar.f3016b;
        if (wVar2.mo4056v()) {
            int i5 = cVar.f3015a;
            i = cVar.f3016b;
            i2 = i5;
        } else {
            i2 = cVar2.f3015a;
            i = cVar2.f3016b;
        }
        return mo4351a(wVar, wVar2, i3, i4, i2, i);
    }

    /* renamed from: b */
    public final void mo4352b(RecyclerView.C0778w wVar, boolean z) {
        mo4354d(wVar, z);
    }

    /* renamed from: b */
    public boolean mo3825b(RecyclerView.C0778w wVar) {
        return !this.f3315g || wVar.mo4046m();
    }

    /* renamed from: b */
    public boolean mo3826b(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2) {
        int i = cVar.f3015a;
        int i2 = cVar.f3016b;
        View view = wVar.f3093b;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3015a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3016b;
        if (wVar.mo4048o() || (i == left && i2 == top)) {
            return mo4356g(wVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo4350a(wVar, i, i2, left, top);
    }

    /* renamed from: c */
    public void mo4353c(RecyclerView.C0778w wVar, boolean z) {
    }

    /* renamed from: c */
    public boolean mo3829c(RecyclerView.C0778w wVar, RecyclerView.C0753f.C0756c cVar, RecyclerView.C0753f.C0756c cVar2) {
        if (cVar.f3015a == cVar2.f3015a && cVar.f3016b == cVar2.f3016b) {
            mo4359j(wVar);
            return false;
        }
        return mo4350a(wVar, cVar.f3015a, cVar.f3016b, cVar2.f3015a, cVar2.f3016b);
    }

    /* renamed from: d */
    public void mo4354d(RecyclerView.C0778w wVar, boolean z) {
    }

    /* renamed from: f */
    public abstract boolean mo4355f(RecyclerView.C0778w wVar);

    /* renamed from: g */
    public abstract boolean mo4356g(RecyclerView.C0778w wVar);

    /* renamed from: h */
    public final void mo4357h(RecyclerView.C0778w wVar) {
        mo4363n(wVar);
        mo3828c(wVar);
    }

    /* renamed from: i */
    public final void mo4358i(RecyclerView.C0778w wVar) {
        mo4364o(wVar);
    }

    /* renamed from: j */
    public final void mo4359j(RecyclerView.C0778w wVar) {
        mo4365p(wVar);
        mo3828c(wVar);
    }

    /* renamed from: k */
    public final void mo4360k(RecyclerView.C0778w wVar) {
        mo4366q(wVar);
    }

    /* renamed from: l */
    public final void mo4361l(RecyclerView.C0778w wVar) {
        mo4367r(wVar);
        mo3828c(wVar);
    }

    /* renamed from: m */
    public final void mo4362m(RecyclerView.C0778w wVar) {
        mo4368s(wVar);
    }

    /* renamed from: n */
    public void mo4363n(RecyclerView.C0778w wVar) {
    }

    /* renamed from: o */
    public void mo4364o(RecyclerView.C0778w wVar) {
    }

    /* renamed from: p */
    public void mo4365p(RecyclerView.C0778w wVar) {
    }

    /* renamed from: q */
    public void mo4366q(RecyclerView.C0778w wVar) {
    }

    /* renamed from: r */
    public void mo4367r(RecyclerView.C0778w wVar) {
    }

    /* renamed from: s */
    public void mo4368s(RecyclerView.C0778w wVar) {
    }
}
