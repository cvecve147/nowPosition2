package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.view.C0434L;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.view.menu.C0647D;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.view.menu.C0681w;
import android.support.p011v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import p013b.p018b.p022d.C0956b;
import p013b.p018b.p022d.C0960f;

/* renamed from: android.support.design.internal.e */
public class C0078e implements C0679v {

    /* renamed from: a */
    private NavigationMenuView f484a;

    /* renamed from: b */
    LinearLayout f485b;

    /* renamed from: c */
    private C0679v.C0680a f486c;

    /* renamed from: d */
    C0662l f487d;

    /* renamed from: e */
    private int f488e;

    /* renamed from: f */
    C0080b f489f;

    /* renamed from: g */
    LayoutInflater f490g;

    /* renamed from: h */
    int f491h;

    /* renamed from: i */
    boolean f492i;

    /* renamed from: j */
    ColorStateList f493j;

    /* renamed from: k */
    ColorStateList f494k;

    /* renamed from: l */
    Drawable f495l;

    /* renamed from: m */
    private int f496m;

    /* renamed from: n */
    int f497n;

    /* renamed from: o */
    final View.OnClickListener f498o = new C0077d(this);

    /* renamed from: android.support.design.internal.e$a */
    private static class C0079a extends C0088j {
        public C0079a(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.e$b */
    private class C0080b extends RecyclerView.C0748a<C0088j> {

        /* renamed from: c */
        private final ArrayList<C0082d> f499c = new ArrayList<>();

        /* renamed from: d */
        private C0668p f500d;

        /* renamed from: e */
        private boolean f501e;

        C0080b() {
            m378f();
        }

        /* renamed from: d */
        private void m377d(int i, int i2) {
            while (i < i2) {
                ((C0084f) this.f499c.get(i)).f506b = true;
                i++;
            }
        }

        /* renamed from: f */
        private void m378f() {
            if (!this.f501e) {
                boolean z = true;
                this.f501e = true;
                this.f499c.clear();
                this.f499c.add(new C0081c());
                int size = C0078e.this.f487d.mo2899n().size();
                int i = -1;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    C0668p pVar = C0078e.this.f487d.mo2899n().get(i2);
                    if (pVar.isChecked()) {
                        mo342a(pVar);
                    }
                    if (pVar.isCheckable()) {
                        pVar.mo2922c(false);
                    }
                    if (pVar.hasSubMenu()) {
                        SubMenu subMenu = pVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i2 != 0) {
                                this.f499c.add(new C0083e(C0078e.this.f497n, 0));
                            }
                            this.f499c.add(new C0084f(pVar));
                            int size2 = this.f499c.size();
                            int size3 = subMenu.size();
                            int i4 = 0;
                            boolean z3 = false;
                            while (i4 < size3) {
                                C0668p pVar2 = (C0668p) subMenu.getItem(i4);
                                if (pVar2.isVisible()) {
                                    if (!z3 && pVar2.getIcon() != null) {
                                        z3 = z;
                                    }
                                    if (pVar2.isCheckable()) {
                                        pVar2.mo2922c(false);
                                    }
                                    if (pVar.isChecked()) {
                                        mo342a(pVar);
                                    }
                                    this.f499c.add(new C0084f(pVar2));
                                }
                                i4++;
                                z = true;
                            }
                            if (z3) {
                                m377d(size2, this.f499c.size());
                            }
                        }
                    } else {
                        int groupId = pVar.getGroupId();
                        if (groupId != i) {
                            i3 = this.f499c.size();
                            boolean z4 = pVar.getIcon() != null;
                            if (i2 != 0) {
                                i3++;
                                ArrayList<C0082d> arrayList = this.f499c;
                                int i5 = C0078e.this.f497n;
                                arrayList.add(new C0083e(i5, i5));
                            }
                            z2 = z4;
                        } else if (!z2 && pVar.getIcon() != null) {
                            m377d(i3, this.f499c.size());
                            z2 = true;
                        }
                        C0084f fVar = new C0084f(pVar);
                        fVar.f506b = z2;
                        this.f499c.add(fVar);
                        i = groupId;
                    }
                    i2++;
                    z = true;
                }
                this.f501e = false;
            }
        }

        /* renamed from: a */
        public int mo337a() {
            return this.f499c.size();
        }

        /* renamed from: a */
        public long mo338a(int i) {
            return (long) i;
        }

        /* renamed from: a */
        public void mo339a(Bundle bundle) {
            C0668p a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0668p a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f501e = true;
                int size = this.f499c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C0082d dVar = this.f499c.get(i2);
                    if ((dVar instanceof C0084f) && (a2 = ((C0084f) dVar).mo352a()) != null && a2.getItemId() == i) {
                        mo342a(a2);
                        break;
                    }
                    i2++;
                }
                this.f501e = false;
                m378f();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f499c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0082d dVar2 = this.f499c.get(i3);
                    if (!(!(dVar2 instanceof C0084f) || (a = ((C0084f) dVar2).mo352a()) == null || (actionView = a.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo348d(C0088j jVar) {
            if (jVar instanceof C0085g) {
                ((NavigationMenuItemView) jVar.f3093b).mo278b();
            }
        }

        /* renamed from: a */
        public void mo346b(C0088j jVar, int i) {
            int b = mo344b(i);
            if (b == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.f3093b;
                navigationMenuItemView.setIconTintList(C0078e.this.f494k);
                C0078e eVar = C0078e.this;
                if (eVar.f492i) {
                    navigationMenuItemView.setTextAppearance(eVar.f491h);
                }
                ColorStateList colorStateList = C0078e.this.f493j;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C0078e.this.f495l;
                C0487v.m2273a((View) navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C0084f fVar = (C0084f) this.f499c.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(fVar.f506b);
                navigationMenuItemView.mo276a(fVar.mo352a(), 0);
            } else if (b == 1) {
                ((TextView) jVar.f3093b).setText(((C0084f) this.f499c.get(i)).mo352a().getTitle());
            } else if (b == 2) {
                C0083e eVar2 = (C0083e) this.f499c.get(i);
                jVar.f3093b.setPadding(0, eVar2.mo351b(), 0, eVar2.mo350a());
            }
        }

        /* renamed from: a */
        public void mo342a(C0668p pVar) {
            if (this.f500d != pVar && pVar.isCheckable()) {
                C0668p pVar2 = this.f500d;
                if (pVar2 != null) {
                    pVar2.setChecked(false);
                }
                this.f500d = pVar;
                pVar.setChecked(true);
            }
        }

        /* renamed from: a */
        public void mo343a(boolean z) {
            this.f501e = z;
        }

        /* renamed from: b */
        public int mo344b(int i) {
            C0082d dVar = this.f499c.get(i);
            if (dVar instanceof C0083e) {
                return 2;
            }
            if (dVar instanceof C0081c) {
                return 3;
            }
            if (dVar instanceof C0084f) {
                return ((C0084f) dVar).mo352a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: b */
        public C0088j m388b(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C0078e eVar = C0078e.this;
                return new C0085g(eVar.f490g, viewGroup, eVar.f498o);
            } else if (i == 1) {
                return new C0087i(C0078e.this.f490g, viewGroup);
            } else {
                if (i == 2) {
                    return new C0086h(C0078e.this.f490g, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C0079a(C0078e.this.f485b);
            }
        }

        /* renamed from: d */
        public Bundle mo347d() {
            Bundle bundle = new Bundle();
            C0668p pVar = this.f500d;
            if (pVar != null) {
                bundle.putInt("android:menu:checked", pVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f499c.size();
            for (int i = 0; i < size; i++) {
                C0082d dVar = this.f499c.get(i);
                if (dVar instanceof C0084f) {
                    C0668p a = ((C0084f) dVar).mo352a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: e */
        public void mo349e() {
            m378f();
            mo3798c();
        }
    }

    /* renamed from: android.support.design.internal.e$c */
    private static class C0081c implements C0082d {
        C0081c() {
        }
    }

    /* renamed from: android.support.design.internal.e$d */
    private interface C0082d {
    }

    /* renamed from: android.support.design.internal.e$e */
    private static class C0083e implements C0082d {

        /* renamed from: a */
        private final int f503a;

        /* renamed from: b */
        private final int f504b;

        public C0083e(int i, int i2) {
            this.f503a = i;
            this.f504b = i2;
        }

        /* renamed from: a */
        public int mo350a() {
            return this.f504b;
        }

        /* renamed from: b */
        public int mo351b() {
            return this.f503a;
        }
    }

    /* renamed from: android.support.design.internal.e$f */
    private static class C0084f implements C0082d {

        /* renamed from: a */
        private final C0668p f505a;

        /* renamed from: b */
        boolean f506b;

        C0084f(C0668p pVar) {
            this.f505a = pVar;
        }

        /* renamed from: a */
        public C0668p mo352a() {
            return this.f505a;
        }
    }

    /* renamed from: android.support.design.internal.e$g */
    private static class C0085g extends C0088j {
        public C0085g(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0960f.design_navigation_item, viewGroup, false));
            this.f3093b.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: android.support.design.internal.e$h */
    private static class C0086h extends C0088j {
        public C0086h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0960f.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.e$i */
    private static class C0087i extends C0088j {
        public C0087i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0960f.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.e$j */
    private static abstract class C0088j extends RecyclerView.C0778w {
        public C0088j(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public C0681w mo311a(ViewGroup viewGroup) {
        if (this.f484a == null) {
            this.f484a = (NavigationMenuView) this.f490g.inflate(C0960f.design_navigation_menu, viewGroup, false);
            if (this.f489f == null) {
                this.f489f = new C0080b();
            }
            this.f485b = (LinearLayout) this.f490g.inflate(C0960f.design_navigation_item_header, this.f484a, false);
            this.f484a.setAdapter(this.f489f);
        }
        return this.f484a;
    }

    /* renamed from: a */
    public View mo312a(int i) {
        return this.f485b.getChildAt(i);
    }

    /* renamed from: a */
    public void mo313a(Context context, C0662l lVar) {
        this.f490g = LayoutInflater.from(context);
        this.f487d = lVar;
        this.f497n = context.getResources().getDimensionPixelOffset(C0956b.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a */
    public void mo314a(ColorStateList colorStateList) {
        this.f494k = colorStateList;
        mo321a(false);
    }

    /* renamed from: a */
    public void mo315a(Drawable drawable) {
        this.f495l = drawable;
        mo321a(false);
    }

    /* renamed from: a */
    public void mo316a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f484a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f489f.mo339a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f485b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: a */
    public void mo317a(C0434L l) {
        int e = l.mo1772e();
        if (this.f496m != e) {
            this.f496m = e;
            if (this.f485b.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.f484a;
                navigationMenuView.setPadding(0, this.f496m, 0, navigationMenuView.getPaddingBottom());
            }
        }
        C0487v.m2265a((View) this.f485b, l);
    }

    /* renamed from: a */
    public void mo318a(C0662l lVar, boolean z) {
        C0679v.C0680a aVar = this.f486c;
        if (aVar != null) {
            aVar.mo2484a(lVar, z);
        }
    }

    /* renamed from: a */
    public void mo319a(C0668p pVar) {
        this.f489f.mo342a(pVar);
    }

    /* renamed from: a */
    public void mo320a(View view) {
        this.f485b.addView(view);
        NavigationMenuView navigationMenuView = this.f484a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: a */
    public void mo321a(boolean z) {
        C0080b bVar = this.f489f;
        if (bVar != null) {
            bVar.mo349e();
        }
    }

    /* renamed from: a */
    public boolean mo322a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo323a(C0647D d) {
        return false;
    }

    /* renamed from: a */
    public boolean mo324a(C0662l lVar, C0668p pVar) {
        return false;
    }

    /* renamed from: b */
    public Parcelable mo325b() {
        if (Build.VERSION.SDK_INT < 11) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (this.f484a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f484a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C0080b bVar = this.f489f;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.mo347d());
        }
        if (this.f485b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f485b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: b */
    public View mo326b(int i) {
        View inflate = this.f490g.inflate(i, this.f485b, false);
        mo320a(inflate);
        return inflate;
    }

    /* renamed from: b */
    public void mo327b(ColorStateList colorStateList) {
        this.f493j = colorStateList;
        mo321a(false);
    }

    /* renamed from: b */
    public void mo328b(boolean z) {
        C0080b bVar = this.f489f;
        if (bVar != null) {
            bVar.mo343a(z);
        }
    }

    /* renamed from: b */
    public boolean mo329b(C0662l lVar, C0668p pVar) {
        return false;
    }

    /* renamed from: c */
    public int mo330c() {
        return this.f485b.getChildCount();
    }

    /* renamed from: c */
    public void mo331c(int i) {
        this.f488e = i;
    }

    /* renamed from: d */
    public Drawable mo332d() {
        return this.f495l;
    }

    /* renamed from: d */
    public void mo333d(int i) {
        this.f491h = i;
        this.f492i = true;
        mo321a(false);
    }

    /* renamed from: e */
    public ColorStateList mo334e() {
        return this.f493j;
    }

    /* renamed from: f */
    public ColorStateList mo335f() {
        return this.f494k;
    }

    public int getId() {
        return this.f488e;
    }
}
