package com.askey.taipeinavi.p059ui;

import android.view.View;
import butterknife.p051a.C1152b;

/* renamed from: com.askey.taipeinavi.ui.h */
class C1325h extends C1152b {

    /* renamed from: c */
    final /* synthetic */ SearchView f4639c;

    /* renamed from: d */
    final /* synthetic */ SearchView_ViewBinding f4640d;

    C1325h(SearchView_ViewBinding searchView_ViewBinding, SearchView searchView) {
        this.f4640d = searchView_ViewBinding;
        this.f4639c = searchView;
    }

    /* renamed from: a */
    public void mo5377a(View view) {
        this.f4639c.onSearchViewClicked(view);
    }
}
