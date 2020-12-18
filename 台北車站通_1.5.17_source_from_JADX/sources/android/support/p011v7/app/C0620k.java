package android.support.p011v7.app;

import android.support.p011v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.k */
class C0620k implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f2338a;

    /* renamed from: b */
    final /* synthetic */ AlertController f2339b;

    /* renamed from: c */
    final /* synthetic */ AlertController.C0578a f2340c;

    C0620k(AlertController.C0578a aVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f2340c = aVar;
        this.f2338a = recycleListView;
        this.f2339b = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f2340c.f2138F;
        if (zArr != null) {
            zArr[i] = this.f2338a.isItemChecked(i);
        }
        this.f2340c.f2142J.onClick(this.f2339b.f2106b, i, this.f2338a.isItemChecked(i));
    }
}
