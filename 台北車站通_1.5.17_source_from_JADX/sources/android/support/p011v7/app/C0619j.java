package android.support.p011v7.app;

import android.support.p011v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.j */
class C0619j implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f2336a;

    /* renamed from: b */
    final /* synthetic */ AlertController.C0578a f2337b;

    C0619j(AlertController.C0578a aVar, AlertController alertController) {
        this.f2337b = aVar;
        this.f2336a = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2337b.f2172x.onClick(this.f2336a.f2106b, i);
        if (!this.f2337b.f2140H) {
            this.f2336a.f2106b.dismiss();
        }
    }
}
