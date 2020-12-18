package android.support.p011v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.view.menu.C0681w;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p013b.p018b.p040i.p041a.C1109g;

/* renamed from: android.support.v7.view.menu.j */
public class C0659j implements C0679v, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f2514a;

    /* renamed from: b */
    LayoutInflater f2515b;

    /* renamed from: c */
    C0662l f2516c;

    /* renamed from: d */
    ExpandedMenuView f2517d;

    /* renamed from: e */
    int f2518e;

    /* renamed from: f */
    int f2519f;

    /* renamed from: g */
    int f2520g;

    /* renamed from: h */
    private C0679v.C0680a f2521h;

    /* renamed from: i */
    C0660a f2522i;

    /* renamed from: j */
    private int f2523j;

    /* renamed from: android.support.v7.view.menu.j$a */
    private class C0660a extends BaseAdapter {

        /* renamed from: a */
        private int f2524a = -1;

        public C0660a() {
            mo2833a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2833a() {
            C0668p f = C0659j.this.f2516c.mo2888f();
            if (f != null) {
                ArrayList<C0668p> j = C0659j.this.f2516c.mo2896j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (j.get(i) == f) {
                        this.f2524a = i;
                        return;
                    }
                }
            }
            this.f2524a = -1;
        }

        public int getCount() {
            int size = C0659j.this.f2516c.mo2896j().size() - C0659j.this.f2518e;
            return this.f2524a < 0 ? size : size - 1;
        }

        public C0668p getItem(int i) {
            ArrayList<C0668p> j = C0659j.this.f2516c.mo2896j();
            int i2 = i + C0659j.this.f2518e;
            int i3 = this.f2524a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return j.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0659j jVar = C0659j.this;
                view = jVar.f2515b.inflate(jVar.f2520g, viewGroup, false);
            }
            ((C0681w.C0682a) view).mo276a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo2833a();
            super.notifyDataSetChanged();
        }
    }

    public C0659j(int i, int i2) {
        this.f2520g = i;
        this.f2519f = i2;
    }

    public C0659j(Context context, int i) {
        this(i, 0);
        this.f2514a = context;
        this.f2515b = LayoutInflater.from(this.f2514a);
    }

    /* renamed from: a */
    public C0681w mo2828a(ViewGroup viewGroup) {
        if (this.f2517d == null) {
            this.f2517d = (ExpandedMenuView) this.f2515b.inflate(C1109g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2522i == null) {
                this.f2522i = new C0660a();
            }
            this.f2517d.setAdapter(this.f2522i);
            this.f2517d.setOnItemClickListener(this);
        }
        return this.f2517d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.f2515b == null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo313a(android.content.Context r3, android.support.p011v7.view.menu.C0662l r4) {
        /*
            r2 = this;
            int r0 = r2.f2519f
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f2514a = r1
        L_0x000b:
            android.content.Context r3 = r2.f2514a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f2515b = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f2514a
            if (r0 == 0) goto L_0x001f
            r2.f2514a = r3
            android.view.LayoutInflater r3 = r2.f2515b
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f2516c = r4
            android.support.v7.view.menu.j$a r3 = r2.f2522i
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.view.menu.C0659j.mo313a(android.content.Context, android.support.v7.view.menu.l):void");
    }

    /* renamed from: a */
    public void mo2829a(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2517d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    public void mo316a(Parcelable parcelable) {
        mo2829a((Bundle) parcelable);
    }

    /* renamed from: a */
    public void mo318a(C0662l lVar, boolean z) {
        C0679v.C0680a aVar = this.f2521h;
        if (aVar != null) {
            aVar.mo2484a(lVar, z);
        }
    }

    /* renamed from: a */
    public void mo2695a(C0679v.C0680a aVar) {
        this.f2521h = aVar;
    }

    /* renamed from: a */
    public void mo321a(boolean z) {
        C0660a aVar = this.f2522i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo322a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo323a(C0647D d) {
        if (!d.hasVisibleItems()) {
            return false;
        }
        new C0665m(d).mo2911a((IBinder) null);
        C0679v.C0680a aVar = this.f2521h;
        if (aVar == null) {
            return true;
        }
        aVar.mo2485a(d);
        return true;
    }

    /* renamed from: a */
    public boolean mo324a(C0662l lVar, C0668p pVar) {
        return false;
    }

    /* renamed from: b */
    public Parcelable mo325b() {
        if (this.f2517d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo2830b(bundle);
        return bundle;
    }

    /* renamed from: b */
    public void mo2830b(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f2517d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: b */
    public boolean mo329b(C0662l lVar, C0668p pVar) {
        return false;
    }

    /* renamed from: c */
    public ListAdapter mo2831c() {
        if (this.f2522i == null) {
            this.f2522i = new C0660a();
        }
        return this.f2522i;
    }

    public int getId() {
        return this.f2523j;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2516c.mo2862a((MenuItem) this.f2522i.getItem(i), (C0679v) this, 0);
    }
}
