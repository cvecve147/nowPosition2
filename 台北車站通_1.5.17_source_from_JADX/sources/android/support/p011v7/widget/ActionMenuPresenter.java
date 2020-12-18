package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.C0463e;
import android.support.p011v7.view.menu.ActionMenuItemView;
import android.support.p011v7.view.menu.C0647D;
import android.support.p011v7.view.menu.C0650b;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.C0678u;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.view.menu.C0681w;
import android.support.p011v7.view.menu.C0685z;
import android.support.p011v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1109g;
import p013b.p018b.p040i.p050h.C1135a;

/* renamed from: android.support.v7.widget.ActionMenuPresenter */
class ActionMenuPresenter extends C0650b implements C0463e.C0464a {

    /* renamed from: A */
    C0690a f2675A;

    /* renamed from: B */
    C0692c f2676B;

    /* renamed from: C */
    private C0691b f2677C;

    /* renamed from: D */
    final C0695f f2678D = new C0695f();

    /* renamed from: E */
    int f2679E;

    /* renamed from: k */
    C0693d f2680k;

    /* renamed from: l */
    private Drawable f2681l;

    /* renamed from: m */
    private boolean f2682m;

    /* renamed from: n */
    private boolean f2683n;

    /* renamed from: o */
    private boolean f2684o;

    /* renamed from: p */
    private int f2685p;

    /* renamed from: q */
    private int f2686q;

    /* renamed from: r */
    private int f2687r;

    /* renamed from: s */
    private boolean f2688s;

    /* renamed from: t */
    private boolean f2689t;

    /* renamed from: u */
    private boolean f2690u;

    /* renamed from: v */
    private boolean f2691v;

    /* renamed from: w */
    private int f2692w;

    /* renamed from: x */
    private final SparseBooleanArray f2693x = new SparseBooleanArray();

    /* renamed from: y */
    private View f2694y;

    /* renamed from: z */
    C0694e f2695z;

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0841i();

        /* renamed from: a */
        public int f2696a;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2696a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2696a);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$a */
    private class C0690a extends C0678u {
        public C0690a(Context context, C0647D d, View view) {
            super(context, d, view, false, C1103a.actionOverflowMenuStyle);
            if (!((C0668p) d.getItem()).mo2941h()) {
                View view2 = ActionMenuPresenter.this.f2680k;
                mo3040a(view2 == null ? (View) ActionMenuPresenter.this.f2472i : view2);
            }
            mo3039a((C0679v.C0680a) ActionMenuPresenter.this.f2678D);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3046d() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f2675A = null;
            actionMenuPresenter.f2679E = 0;
            super.mo3046d();
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$b */
    private class C0691b extends ActionMenuItemView.C0644b {
        C0691b() {
        }

        /* renamed from: a */
        public C0685z mo2690a() {
            C0690a aVar = ActionMenuPresenter.this.f2675A;
            if (aVar != null) {
                return aVar.mo3044b();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$c */
    private class C0692c implements Runnable {

        /* renamed from: a */
        private C0694e f2699a;

        public C0692c(C0694e eVar) {
            this.f2699a = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f2466c != null) {
                ActionMenuPresenter.this.f2466c.mo2854a();
            }
            View view = (View) ActionMenuPresenter.this.f2472i;
            if (!(view == null || view.getWindowToken() == null || !this.f2699a.mo3048f())) {
                ActionMenuPresenter.this.f2695z = this.f2699a;
            }
            ActionMenuPresenter.this.f2676B = null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$d */
    private class C0693d extends AppCompatImageView implements ActionMenuView.C0696a {

        /* renamed from: c */
        private final float[] f2701c = new float[2];

        public C0693d(Context context) {
            super(context, (AttributeSet) null, C1103a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0862mb.m4963a(this, getContentDescription());
            setOnTouchListener(new C0836h(this, this, ActionMenuPresenter.this));
        }

        /* renamed from: b */
        public boolean mo2672b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo2673c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo3183j();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C1026a.m5446a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$e */
    private class C0694e extends C0678u {
        public C0694e(Context context, C0662l lVar, View view, boolean z) {
            super(context, lVar, view, z, C1103a.actionOverflowMenuStyle);
            mo3038a(8388613);
            mo3039a((C0679v.C0680a) ActionMenuPresenter.this.f2678D);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3046d() {
            if (ActionMenuPresenter.this.f2466c != null) {
                ActionMenuPresenter.this.f2466c.close();
            }
            ActionMenuPresenter.this.f2695z = null;
            super.mo3046d();
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$f */
    private class C0695f implements C0679v.C0680a {
        C0695f() {
        }

        /* renamed from: a */
        public void mo2484a(C0662l lVar, boolean z) {
            if (lVar instanceof C0647D) {
                lVar.mo2714m().mo2860a(false);
            }
            C0679v.C0680a c = ActionMenuPresenter.this.mo2812c();
            if (c != null) {
                c.mo2484a(lVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo2485a(C0662l lVar) {
            if (lVar == null) {
                return false;
            }
            ActionMenuPresenter.this.f2679E = ((C0647D) lVar).getItem().getItemId();
            C0679v.C0680a c = ActionMenuPresenter.this.mo2812c();
            if (c != null) {
                return c.mo2485a(lVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C1109g.abc_action_menu_layout, C1109g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m3479a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2472i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0681w.C0682a) && ((C0681w.C0682a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public View mo2805a(C0668p pVar, View view, ViewGroup viewGroup) {
        View actionView = pVar.getActionView();
        if (actionView == null || pVar.mo2927f()) {
            actionView = super.mo2805a(pVar, view, viewGroup);
        }
        actionView.setVisibility(pVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo313a(Context context, C0662l lVar) {
        super.mo313a(context, lVar);
        Resources resources = context.getResources();
        C1135a a = C1135a.m5761a(context);
        if (!this.f2684o) {
            this.f2683n = a.mo5313g();
        }
        if (!this.f2690u) {
            this.f2685p = a.mo5308b();
        }
        if (!this.f2688s) {
            this.f2687r = a.mo5309c();
        }
        int i = this.f2685p;
        if (this.f2683n) {
            if (this.f2680k == null) {
                this.f2680k = new C0693d(this.f2464a);
                if (this.f2682m) {
                    this.f2680k.setImageDrawable(this.f2681l);
                    this.f2681l = null;
                    this.f2682m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2680k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2680k.getMeasuredWidth();
        } else {
            this.f2680k = null;
        }
        this.f2686q = i;
        this.f2692w = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f2694y = null;
    }

    /* renamed from: a */
    public void mo3172a(Configuration configuration) {
        if (!this.f2688s) {
            this.f2687r = C1135a.m5761a(this.f2465b).mo5309c();
        }
        C0662l lVar = this.f2466c;
        if (lVar != null) {
            lVar.mo353b(true);
        }
    }

    /* renamed from: a */
    public void mo3173a(Drawable drawable) {
        C0693d dVar = this.f2680k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f2682m = true;
        this.f2681l = drawable;
    }

    /* renamed from: a */
    public void mo316a(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f2696a) > 0 && (findItem = this.f2466c.findItem(i)) != null) {
            mo323a((C0647D) findItem.getSubMenu());
        }
    }

    /* renamed from: a */
    public void mo318a(C0662l lVar, boolean z) {
        mo3177d();
        super.mo318a(lVar, z);
    }

    /* renamed from: a */
    public void mo2807a(C0668p pVar, C0681w.C0682a aVar) {
        aVar.mo276a(pVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2472i);
        if (this.f2677C == null) {
            this.f2677C = new C0691b();
        }
        actionMenuItemView.setPopupCallback(this.f2677C);
    }

    /* renamed from: a */
    public void mo3174a(ActionMenuView actionMenuView) {
        this.f2472i = actionMenuView;
        actionMenuView.mo289a(this.f2466c);
    }

    /* renamed from: a */
    public void mo321a(boolean z) {
        C0681w wVar;
        super.mo321a(z);
        ((View) this.f2472i).requestLayout();
        C0662l lVar = this.f2466c;
        boolean z2 = false;
        if (lVar != null) {
            ArrayList<C0668p> c = lVar.mo2876c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C0463e a = c.get(i).mo2748a();
                if (a != null) {
                    a.mo1934a((C0463e.C0464a) this);
                }
            }
        }
        C0662l lVar2 = this.f2466c;
        ArrayList<C0668p> j = lVar2 != null ? lVar2.mo2896j() : null;
        if (this.f2683n && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !j.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2680k == null) {
                this.f2680k = new C0693d(this.f2464a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2680k.getParent();
            if (viewGroup != this.f2472i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2680k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2472i;
                actionMenuView.addView(this.f2680k, actionMenuView.mo3191c());
            }
        } else {
            C0693d dVar = this.f2680k;
            if (dVar != null && dVar.getParent() == (wVar = this.f2472i)) {
                ((ViewGroup) wVar).removeView(this.f2680k);
            }
        }
        ((ActionMenuView) this.f2472i).setOverflowReserved(this.f2683n);
    }

    /* renamed from: a */
    public boolean mo322a() {
        int i;
        ArrayList<C0668p> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        ActionMenuPresenter actionMenuPresenter = this;
        C0662l lVar = actionMenuPresenter.f2466c;
        boolean z3 = false;
        if (lVar != null) {
            arrayList = lVar.mo2899n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.f2687r;
        int i6 = actionMenuPresenter.f2686q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f2472i;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = i5;
        for (int i10 = 0; i10 < i; i10++) {
            C0668p pVar = arrayList.get(i10);
            if (pVar.mo2949k()) {
                i7++;
            } else if (pVar.mo2948j()) {
                i8++;
            } else {
                z4 = true;
            }
            if (actionMenuPresenter.f2691v && pVar.isActionViewExpanded()) {
                i9 = 0;
            }
        }
        if (actionMenuPresenter.f2683n && (z4 || i8 + i7 > i9)) {
            i9--;
        }
        int i11 = i9 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f2693x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f2689t) {
            int i12 = actionMenuPresenter.f2692w;
            i2 = i6 / i12;
            i3 = i12 + ((i6 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = i6;
        int i15 = 0;
        while (i15 < i) {
            C0668p pVar2 = arrayList.get(i15);
            if (pVar2.mo2949k()) {
                View a = actionMenuPresenter.mo2805a(pVar2, actionMenuPresenter.f2694y, viewGroup);
                if (actionMenuPresenter.f2694y == null) {
                    actionMenuPresenter.f2694y = a;
                }
                if (actionMenuPresenter.f2689t) {
                    i2 -= ActionMenuView.m3516a(a, i3, i2, makeMeasureSpec, z3 ? 1 : 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i13 != 0) {
                    measuredWidth = i13;
                }
                int groupId = pVar2.getGroupId();
                if (groupId != 0) {
                    z2 = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z2 = true;
                }
                pVar2.mo2924d(z2);
                z = z3;
                i4 = i;
                i13 = measuredWidth;
            } else if (pVar2.mo2948j()) {
                int groupId2 = pVar2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                boolean z6 = (i11 > 0 || z5) && i14 > 0 && (!actionMenuPresenter.f2689t || i2 > 0);
                if (z6) {
                    boolean z7 = z6;
                    View a2 = actionMenuPresenter.mo2805a(pVar2, actionMenuPresenter.f2694y, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.f2694y == null) {
                        actionMenuPresenter.f2694y = a2;
                    }
                    if (actionMenuPresenter.f2689t) {
                        int a3 = ActionMenuView.m3516a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        if (a3 == 0) {
                            z7 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z6 = z7 & (!actionMenuPresenter.f2689t ? i14 + i13 > 0 : i14 >= 0);
                } else {
                    boolean z8 = z6;
                    i4 = i;
                }
                if (z6 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    int i16 = 0;
                    while (i16 < i15) {
                        C0668p pVar3 = arrayList.get(i16);
                        if (pVar3.getGroupId() == groupId2) {
                            if (pVar3.mo2941h()) {
                                i11++;
                            }
                            pVar3.mo2924d(false);
                        }
                        i16++;
                    }
                }
                if (z6) {
                    i11--;
                }
                pVar2.mo2924d(z6);
                z = false;
            } else {
                z = z3;
                i4 = i;
                pVar2.mo2924d(z);
            }
            i15++;
            z3 = z;
            i = i4;
            actionMenuPresenter = this;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2809a(int i, C0668p pVar) {
        return pVar.mo2941h();
    }

    /* renamed from: a */
    public boolean mo323a(C0647D d) {
        boolean z = false;
        if (!d.hasVisibleItems()) {
            return false;
        }
        C0647D d2 = d;
        while (d2.mo2717s() != this.f2466c) {
            d2 = (C0647D) d2.mo2717s();
        }
        View a = m3479a(d2.getItem());
        if (a == null) {
            return false;
        }
        this.f2679E = d.getItem().getItemId();
        int size = d.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = d.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f2675A = new C0690a(this.f2465b, d, a);
        this.f2675A.mo3042a(z);
        this.f2675A.mo3047e();
        super.mo323a(d);
        return true;
    }

    /* renamed from: a */
    public boolean mo2810a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f2680k) {
            return false;
        }
        return super.mo2810a(viewGroup, i);
    }

    /* renamed from: b */
    public Parcelable mo325b() {
        SavedState savedState = new SavedState();
        savedState.f2696a = this.f2679E;
        return savedState;
    }

    /* renamed from: b */
    public C0681w mo2811b(ViewGroup viewGroup) {
        C0681w wVar = this.f2472i;
        C0681w b = super.mo2811b(viewGroup);
        if (wVar != b) {
            ((ActionMenuView) b).setPresenter(this);
        }
        return b;
    }

    /* renamed from: b */
    public void mo3175b(boolean z) {
        this.f2691v = z;
    }

    /* renamed from: c */
    public void mo3176c(boolean z) {
        this.f2683n = z;
        this.f2684o = true;
    }

    /* renamed from: d */
    public boolean mo3177d() {
        return mo3179f() | mo3180g();
    }

    /* renamed from: e */
    public Drawable mo3178e() {
        C0693d dVar = this.f2680k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f2682m) {
            return this.f2681l;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo3179f() {
        C0681w wVar;
        C0692c cVar = this.f2676B;
        if (cVar == null || (wVar = this.f2472i) == null) {
            C0694e eVar = this.f2695z;
            if (eVar == null) {
                return false;
            }
            eVar.mo3037a();
            return true;
        }
        ((View) wVar).removeCallbacks(cVar);
        this.f2676B = null;
        return true;
    }

    /* renamed from: g */
    public boolean mo3180g() {
        C0690a aVar = this.f2675A;
        if (aVar == null) {
            return false;
        }
        aVar.mo3037a();
        return true;
    }

    /* renamed from: h */
    public boolean mo3181h() {
        return this.f2676B != null || mo3182i();
    }

    /* renamed from: i */
    public boolean mo3182i() {
        C0694e eVar = this.f2695z;
        return eVar != null && eVar.mo3045c();
    }

    /* renamed from: j */
    public boolean mo3183j() {
        C0662l lVar;
        if (!this.f2683n || mo3182i() || (lVar = this.f2466c) == null || this.f2472i == null || this.f2676B != null || lVar.mo2896j().isEmpty()) {
            return false;
        }
        this.f2676B = new C0692c(new C0694e(this.f2465b, this.f2466c, this.f2680k, true));
        ((View) this.f2472i).post(this.f2676B);
        super.mo323a((C0647D) null);
        return true;
    }
}
