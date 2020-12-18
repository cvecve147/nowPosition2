package android.support.p011v7.widget;

import android.support.p011v7.widget.C0701B;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.C */
class C0705C implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0701B f2749a;

    /* renamed from: b */
    final /* synthetic */ C0701B.C0703b f2750b;

    C0705C(C0701B.C0703b bVar, C0701B b) {
        this.f2750b = bVar;
        this.f2749a = b;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0701B.this.setSelection(i);
        if (C0701B.this.getOnItemClickListener() != null) {
            C0701B.C0703b bVar = this.f2750b;
            C0701B.this.performItemClick(view, i, bVar.f2742L.getItemId(i));
        }
        this.f2750b.dismiss();
    }
}
