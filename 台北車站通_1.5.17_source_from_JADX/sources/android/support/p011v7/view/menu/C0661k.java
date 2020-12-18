package android.support.p011v7.view.menu;

import android.support.p011v7.view.menu.C0681w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import p013b.p018b.p040i.p041a.C1109g;

/* renamed from: android.support.v7.view.menu.k */
public class C0661k extends BaseAdapter {

    /* renamed from: a */
    static final int f2526a = C1109g.abc_popup_menu_item_layout;

    /* renamed from: b */
    C0662l f2527b;

    /* renamed from: c */
    private int f2528c = -1;

    /* renamed from: d */
    private boolean f2529d;

    /* renamed from: e */
    private final boolean f2530e;

    /* renamed from: f */
    private final LayoutInflater f2531f;

    public C0661k(C0662l lVar, LayoutInflater layoutInflater, boolean z) {
        this.f2530e = z;
        this.f2531f = layoutInflater;
        this.f2527b = lVar;
        mo2839a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2839a() {
        C0668p f = this.f2527b.mo2888f();
        if (f != null) {
            ArrayList<C0668p> j = this.f2527b.mo2896j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f) {
                    this.f2528c = i;
                    return;
                }
            }
        }
        this.f2528c = -1;
    }

    /* renamed from: a */
    public void mo2840a(boolean z) {
        this.f2529d = z;
    }

    /* renamed from: b */
    public C0662l mo2841b() {
        return this.f2527b;
    }

    public int getCount() {
        ArrayList<C0668p> j = this.f2530e ? this.f2527b.mo2896j() : this.f2527b.mo2899n();
        return this.f2528c < 0 ? j.size() : j.size() - 1;
    }

    public C0668p getItem(int i) {
        ArrayList<C0668p> j = this.f2530e ? this.f2527b.mo2896j() : this.f2527b.mo2899n();
        int i2 = this.f2528c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2531f.inflate(f2526a, viewGroup, false);
        }
        C0681w.C0682a aVar = (C0681w.C0682a) view;
        if (this.f2529d) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        aVar.mo276a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo2839a();
        super.notifyDataSetChanged();
    }
}
