package android.support.p011v7.view.menu;

import android.content.Context;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.view.menu.C0681w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C0650b implements C0679v {

    /* renamed from: a */
    protected Context f2464a;

    /* renamed from: b */
    protected Context f2465b;

    /* renamed from: c */
    protected C0662l f2466c;

    /* renamed from: d */
    protected LayoutInflater f2467d;

    /* renamed from: e */
    protected LayoutInflater f2468e;

    /* renamed from: f */
    private C0679v.C0680a f2469f;

    /* renamed from: g */
    private int f2470g;

    /* renamed from: h */
    private int f2471h;

    /* renamed from: i */
    protected C0681w f2472i;

    /* renamed from: j */
    private int f2473j;

    public C0650b(Context context, int i, int i2) {
        this.f2464a = context;
        this.f2467d = LayoutInflater.from(context);
        this.f2470g = i;
        this.f2471h = i2;
    }

    /* renamed from: a */
    public C0681w.C0682a mo2804a(ViewGroup viewGroup) {
        return (C0681w.C0682a) this.f2467d.inflate(this.f2471h, viewGroup, false);
    }

    /* renamed from: a */
    public View mo2805a(C0668p pVar, View view, ViewGroup viewGroup) {
        C0681w.C0682a a = view instanceof C0681w.C0682a ? (C0681w.C0682a) view : mo2804a(viewGroup);
        mo2807a(pVar, a);
        return (View) a;
    }

    /* renamed from: a */
    public void mo2806a(int i) {
        this.f2473j = i;
    }

    /* renamed from: a */
    public void mo313a(Context context, C0662l lVar) {
        this.f2465b = context;
        this.f2468e = LayoutInflater.from(this.f2465b);
        this.f2466c = lVar;
    }

    /* renamed from: a */
    public void mo318a(C0662l lVar, boolean z) {
        C0679v.C0680a aVar = this.f2469f;
        if (aVar != null) {
            aVar.mo2484a(lVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo2807a(C0668p pVar, C0681w.C0682a aVar);

    /* renamed from: a */
    public void mo2695a(C0679v.C0680a aVar) {
        this.f2469f = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2808a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2472i).addView(view, i);
    }

    /* renamed from: a */
    public void mo321a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f2472i;
        if (viewGroup != null) {
            C0662l lVar = this.f2466c;
            int i = 0;
            if (lVar != null) {
                lVar.mo2872b();
                ArrayList<C0668p> n = this.f2466c.mo2899n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0668p pVar = n.get(i3);
                    if (mo2809a(i2, pVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0668p itemData = childAt instanceof C0681w.C0682a ? ((C0681w.C0682a) childAt).getItemData() : null;
                        View a = mo2805a(pVar, childAt, viewGroup);
                        if (pVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo2808a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo2810a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo2809a(int i, C0668p pVar);

    /* renamed from: a */
    public boolean mo323a(C0647D d) {
        C0679v.C0680a aVar = this.f2469f;
        if (aVar != null) {
            return aVar.mo2485a(d);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo324a(C0662l lVar, C0668p pVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2810a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public C0681w mo2811b(ViewGroup viewGroup) {
        if (this.f2472i == null) {
            this.f2472i = (C0681w) this.f2467d.inflate(this.f2470g, viewGroup, false);
            this.f2472i.mo289a(this.f2466c);
            mo321a(true);
        }
        return this.f2472i;
    }

    /* renamed from: b */
    public boolean mo329b(C0662l lVar, C0668p pVar) {
        return false;
    }

    /* renamed from: c */
    public C0679v.C0680a mo2812c() {
        return this.f2469f;
    }

    public int getId() {
        return this.f2473j;
    }
}
