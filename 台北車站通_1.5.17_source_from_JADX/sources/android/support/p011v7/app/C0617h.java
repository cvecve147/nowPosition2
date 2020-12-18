package android.support.p011v7.app;

import android.content.Context;
import android.support.p011v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* renamed from: android.support.v7.app.h */
class C0617h extends ArrayAdapter<CharSequence> {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f2329a;

    /* renamed from: b */
    final /* synthetic */ AlertController.C0578a f2330b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0617h(AlertController.C0578a aVar, Context context, int i, int i2, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, i2, charSequenceArr);
        this.f2330b = aVar;
        this.f2329a = recycleListView;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f2330b.f2138F;
        if (zArr != null && zArr[i]) {
            this.f2329a.setItemChecked(i, true);
        }
        return view2;
    }
}
