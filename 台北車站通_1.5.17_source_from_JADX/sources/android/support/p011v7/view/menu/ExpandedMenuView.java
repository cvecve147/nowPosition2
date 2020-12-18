package android.support.p011v7.view.menu;

import android.content.Context;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.widget.C0829eb;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C0662l.C0664b, C0681w, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int[] f2424a = {16842964, 16843049};

    /* renamed from: b */
    private C0662l f2425b;

    /* renamed from: c */
    private int f2426c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0829eb a = C0829eb.m4793a(context, attributeSet, f2424a, i, 0);
        if (a.mo4487g(0)) {
            setBackgroundDrawable(a.mo4477b(0));
        }
        if (a.mo4487g(1)) {
            setDivider(a.mo4477b(1));
        }
        a.mo4474a();
    }

    /* renamed from: a */
    public void mo289a(C0662l lVar) {
        this.f2425b = lVar;
    }

    /* renamed from: a */
    public boolean mo2736a(C0668p pVar) {
        return this.f2425b.mo2861a((MenuItem) pVar, 0);
    }

    public int getWindowAnimations() {
        return this.f2426c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo2736a((C0668p) getAdapter().getItem(i));
    }
}
