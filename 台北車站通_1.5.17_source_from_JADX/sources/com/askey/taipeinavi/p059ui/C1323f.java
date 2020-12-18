package com.askey.taipeinavi.p059ui;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.askey.taipeinavi.ui.f */
class C1323f implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchResultView f4635a;

    /* renamed from: b */
    final /* synthetic */ SearchResultView_ViewBinding f4636b;

    C1323f(SearchResultView_ViewBinding searchResultView_ViewBinding, SearchResultView searchResultView) {
        this.f4636b = searchResultView_ViewBinding;
        this.f4635a = searchResultView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4635a.onItemClick(i);
    }
}
