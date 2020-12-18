package android.support.p011v7.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.ea */
public class C0826ea extends C0797Ua {

    /* renamed from: h */
    private static TimeInterpolator f3404h;

    /* renamed from: i */
    private ArrayList<RecyclerView.C0778w> f3405i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<RecyclerView.C0778w> f3406j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0828b> f3407k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C0827a> f3408l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<RecyclerView.C0778w>> f3409m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0828b>> f3410n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<ArrayList<C0827a>> f3411o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C0778w> f3412p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C0778w> f3413q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C0778w> f3414r = new ArrayList<>();

    /* renamed from: s */
    ArrayList<RecyclerView.C0778w> f3415s = new ArrayList<>();

    /* renamed from: android.support.v7.widget.ea$a */
    private static class C0827a {

        /* renamed from: a */
        public RecyclerView.C0778w f3416a;

        /* renamed from: b */
        public RecyclerView.C0778w f3417b;

        /* renamed from: c */
        public int f3418c;

        /* renamed from: d */
        public int f3419d;

        /* renamed from: e */
        public int f3420e;

        /* renamed from: f */
        public int f3421f;

        private C0827a(RecyclerView.C0778w wVar, RecyclerView.C0778w wVar2) {
            this.f3416a = wVar;
            this.f3417b = wVar2;
        }

        C0827a(RecyclerView.C0778w wVar, RecyclerView.C0778w wVar2, int i, int i2, int i3, int i4) {
            this(wVar, wVar2);
            this.f3418c = i;
            this.f3419d = i2;
            this.f3420e = i3;
            this.f3421f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3416a + ", newHolder=" + this.f3417b + ", fromX=" + this.f3418c + ", fromY=" + this.f3419d + ", toX=" + this.f3420e + ", toY=" + this.f3421f + '}';
        }
    }

    /* renamed from: android.support.v7.widget.ea$b */
    private static class C0828b {

        /* renamed from: a */
        public RecyclerView.C0778w f3422a;

        /* renamed from: b */
        public int f3423b;

        /* renamed from: c */
        public int f3424c;

        /* renamed from: d */
        public int f3425d;

        /* renamed from: e */
        public int f3426e;

        C0828b(RecyclerView.C0778w wVar, int i, int i2, int i3, int i4) {
            this.f3422a = wVar;
            this.f3423b = i;
            this.f3424c = i2;
            this.f3425d = i3;
            this.f3426e = i4;
        }
    }

    /* renamed from: a */
    private void m4772a(List<C0827a> list, RecyclerView.C0778w wVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0827a aVar = list.get(size);
            if (m4773a(aVar, wVar) && aVar.f3416a == null && aVar.f3417b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m4773a(C0827a aVar, RecyclerView.C0778w wVar) {
        boolean z = false;
        if (aVar.f3417b == wVar) {
            aVar.f3417b = null;
        } else if (aVar.f3416a != wVar) {
            return false;
        } else {
            aVar.f3416a = null;
            z = true;
        }
        wVar.f3093b.setAlpha(1.0f);
        wVar.f3093b.setTranslationX(0.0f);
        wVar.f3093b.setTranslationY(0.0f);
        mo4349a(wVar, z);
        return true;
    }

    /* renamed from: b */
    private void m4774b(C0827a aVar) {
        RecyclerView.C0778w wVar = aVar.f3416a;
        if (wVar != null) {
            m4773a(aVar, wVar);
        }
        RecyclerView.C0778w wVar2 = aVar.f3417b;
        if (wVar2 != null) {
            m4773a(aVar, wVar2);
        }
    }

    /* renamed from: u */
    private void m4775u(RecyclerView.C0778w wVar) {
        View view = wVar.f3093b;
        ViewPropertyAnimator animate = view.animate();
        this.f3414r.add(wVar);
        animate.setDuration(mo3834f()).alpha(0.0f).setListener(new C0808Z(this, wVar, animate, view)).start();
    }

    /* renamed from: v */
    private void m4776v(RecyclerView.C0778w wVar) {
        if (f3404h == null) {
            f3404h = new ValueAnimator().getInterpolator();
        }
        wVar.f3093b.animate().setInterpolator(f3404h);
        mo3831d(wVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4464a(C0827a aVar) {
        RecyclerView.C0778w wVar = aVar.f3416a;
        View view = null;
        View view2 = wVar == null ? null : wVar.f3093b;
        RecyclerView.C0778w wVar2 = aVar.f3417b;
        if (wVar2 != null) {
            view = wVar2.f3093b;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo3830d());
            this.f3415s.add(aVar.f3416a);
            duration.translationX((float) (aVar.f3420e - aVar.f3418c));
            duration.translationY((float) (aVar.f3421f - aVar.f3419d));
            duration.alpha(0.0f).setListener(new C0820ca(this, aVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f3415s.add(aVar.f3417b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo3830d()).alpha(1.0f).setListener(new C0823da(this, aVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4465a(List<RecyclerView.C0778w> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3093b.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo4350a(RecyclerView.C0778w wVar, int i, int i2, int i3, int i4) {
        View view = wVar.f3093b;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) wVar.f3093b.getTranslationY());
        m4776v(wVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo4359j(wVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f3407k.add(new C0828b(wVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo4351a(RecyclerView.C0778w wVar, RecyclerView.C0778w wVar2, int i, int i2, int i3, int i4) {
        if (wVar == wVar2) {
            return mo4350a(wVar, i, i2, i3, i4);
        }
        float translationX = wVar.f3093b.getTranslationX();
        float translationY = wVar.f3093b.getTranslationY();
        float alpha = wVar.f3093b.getAlpha();
        m4776v(wVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        wVar.f3093b.setTranslationX(translationX);
        wVar.f3093b.setTranslationY(translationY);
        wVar.f3093b.setAlpha(alpha);
        if (wVar2 != null) {
            m4776v(wVar2);
            wVar2.f3093b.setTranslationX((float) (-i5));
            wVar2.f3093b.setTranslationY((float) (-i6));
            wVar2.f3093b.setAlpha(0.0f);
        }
        this.f3408l.add(new C0827a(wVar, wVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo3823a(RecyclerView.C0778w wVar, List<Object> list) {
        return !list.isEmpty() || super.mo3823a(wVar, list);
    }

    /* renamed from: b */
    public void mo3824b() {
        int size = this.f3407k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0828b bVar = this.f3407k.get(size);
            View view = bVar.f3422a.f3093b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4359j(bVar.f3422a);
            this.f3407k.remove(size);
        }
        for (int size2 = this.f3405i.size() - 1; size2 >= 0; size2--) {
            mo4361l(this.f3405i.get(size2));
            this.f3405i.remove(size2);
        }
        int size3 = this.f3406j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0778w wVar = this.f3406j.get(size3);
            wVar.f3093b.setAlpha(1.0f);
            mo4357h(wVar);
            this.f3406j.remove(size3);
        }
        for (int size4 = this.f3408l.size() - 1; size4 >= 0; size4--) {
            m4774b(this.f3408l.get(size4));
        }
        this.f3408l.clear();
        if (mo3835g()) {
            for (int size5 = this.f3410n.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f3410n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0828b bVar2 = (C0828b) arrayList.get(size6);
                    View view2 = bVar2.f3422a.f3093b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4359j(bVar2.f3422a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3410n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3409m.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f3409m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C0778w wVar2 = (RecyclerView.C0778w) arrayList2.get(size8);
                    wVar2.f3093b.setAlpha(1.0f);
                    mo4357h(wVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3409m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3411o.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f3411o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m4774b((C0827a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3411o.remove(arrayList3);
                    }
                }
            }
            mo4465a((List<RecyclerView.C0778w>) this.f3414r);
            mo4465a((List<RecyclerView.C0778w>) this.f3413q);
            mo4465a((List<RecyclerView.C0778w>) this.f3412p);
            mo4465a((List<RecyclerView.C0778w>) this.f3415s);
            mo3819a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4466b(RecyclerView.C0778w wVar, int i, int i2, int i3, int i4) {
        View view = wVar.f3093b;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3413q.add(wVar);
        animate.setDuration(mo3832e()).setListener(new C0817ba(this, wVar, i5, view, i6, animate)).start();
    }

    /* renamed from: d */
    public void mo3831d(RecyclerView.C0778w wVar) {
        View view = wVar.f3093b;
        view.animate().cancel();
        int size = this.f3407k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3407k.get(size).f3422a == wVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4359j(wVar);
                this.f3407k.remove(size);
            }
        }
        m4772a((List<C0827a>) this.f3408l, wVar);
        if (this.f3405i.remove(wVar)) {
            view.setAlpha(1.0f);
            mo4361l(wVar);
        }
        if (this.f3406j.remove(wVar)) {
            view.setAlpha(1.0f);
            mo4357h(wVar);
        }
        for (int size2 = this.f3411o.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f3411o.get(size2);
            m4772a((List<C0827a>) arrayList, wVar);
            if (arrayList.isEmpty()) {
                this.f3411o.remove(size2);
            }
        }
        for (int size3 = this.f3410n.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f3410n.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0828b) arrayList2.get(size4)).f3422a == wVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4359j(wVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3410n.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3409m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f3409m.get(size5);
            if (arrayList3.remove(wVar)) {
                view.setAlpha(1.0f);
                mo4357h(wVar);
                if (arrayList3.isEmpty()) {
                    this.f3409m.remove(size5);
                }
            }
        }
        this.f3414r.remove(wVar);
        this.f3412p.remove(wVar);
        this.f3415s.remove(wVar);
        this.f3413q.remove(wVar);
        mo4467j();
    }

    /* renamed from: f */
    public boolean mo4355f(RecyclerView.C0778w wVar) {
        m4776v(wVar);
        wVar.f3093b.setAlpha(0.0f);
        this.f3406j.add(wVar);
        return true;
    }

    /* renamed from: g */
    public boolean mo3835g() {
        return !this.f3406j.isEmpty() || !this.f3408l.isEmpty() || !this.f3407k.isEmpty() || !this.f3405i.isEmpty() || !this.f3413q.isEmpty() || !this.f3414r.isEmpty() || !this.f3412p.isEmpty() || !this.f3415s.isEmpty() || !this.f3410n.isEmpty() || !this.f3409m.isEmpty() || !this.f3411o.isEmpty();
    }

    /* renamed from: g */
    public boolean mo4356g(RecyclerView.C0778w wVar) {
        m4776v(wVar);
        this.f3405i.add(wVar);
        return true;
    }

    /* renamed from: i */
    public void mo3837i() {
        boolean z = !this.f3405i.isEmpty();
        boolean z2 = !this.f3407k.isEmpty();
        boolean z3 = !this.f3408l.isEmpty();
        boolean z4 = !this.f3406j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C0778w> it = this.f3405i.iterator();
            while (it.hasNext()) {
                m4775u(it.next());
            }
            this.f3405i.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3407k);
                this.f3410n.add(arrayList);
                this.f3407k.clear();
                C0801W w = new C0801W(this, arrayList);
                if (z) {
                    C0487v.m2278a(((C0828b) arrayList.get(0)).f3422a.f3093b, (Runnable) w, mo3834f());
                } else {
                    w.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3408l);
                this.f3411o.add(arrayList2);
                this.f3408l.clear();
                C0803X x = new C0803X(this, arrayList2);
                if (z) {
                    C0487v.m2278a(((C0827a) arrayList2.get(0)).f3416a.f3093b, (Runnable) x, mo3834f());
                } else {
                    x.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3406j);
                this.f3409m.add(arrayList3);
                this.f3406j.clear();
                C0805Y y = new C0805Y(this, arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long f = z ? mo3834f() : 0;
                    long e = z2 ? mo3832e() : 0;
                    if (z3) {
                        j = mo3830d();
                    }
                    C0487v.m2278a(((RecyclerView.C0778w) arrayList3.get(0)).f3093b, (Runnable) y, f + Math.max(e, j));
                    return;
                }
                y.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4467j() {
        if (!mo3835g()) {
            mo3819a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4468t(RecyclerView.C0778w wVar) {
        View view = wVar.f3093b;
        ViewPropertyAnimator animate = view.animate();
        this.f3412p.add(wVar);
        animate.alpha(1.0f).setDuration(mo3827c()).setListener(new C0814aa(this, wVar, view, animate)).start();
    }
}
