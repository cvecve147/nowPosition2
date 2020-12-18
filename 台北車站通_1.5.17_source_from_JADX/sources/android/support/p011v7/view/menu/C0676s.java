package android.support.p011v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.s */
abstract class C0676s implements C0685z, C0679v, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f2606a;

    C0676s() {
    }

    /* renamed from: a */
    protected static int m3371a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0661k m3372a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0661k) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0661k) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m3373b(C0662l lVar) {
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = lVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo2693a(int i);

    /* renamed from: a */
    public void mo313a(Context context, C0662l lVar) {
    }

    /* renamed from: a */
    public void mo3033a(Rect rect) {
        this.f2606a = rect;
    }

    /* renamed from: a */
    public abstract void mo2694a(C0662l lVar);

    /* renamed from: a */
    public abstract void mo2696a(View view);

    /* renamed from: a */
    public abstract void mo2697a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public boolean mo324a(C0662l lVar, C0668p pVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo2698b(int i);

    /* renamed from: b */
    public abstract void mo2699b(boolean z);

    /* renamed from: b */
    public boolean mo329b(C0662l lVar, C0668p pVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo2700c(int i);

    /* renamed from: c */
    public abstract void mo2701c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2824c() {
        return true;
    }

    /* renamed from: d */
    public Rect mo3034d() {
        return this.f2606a;
    }

    public int getId() {
        return 0;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m3372a(listAdapter).f2527b.mo2862a((MenuItem) listAdapter.getItem(i), (C0679v) this, mo2824c() ? 0 : 4);
    }
}
