package android.support.p011v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.ta */
class C0891ta implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C0896ua f3648a;

    C0891ta(C0896ua uaVar) {
        this.f3648a = uaVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0837ha haVar;
        if (i != -1 && (haVar = this.f3648a.f3673f) != null) {
            haVar.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
