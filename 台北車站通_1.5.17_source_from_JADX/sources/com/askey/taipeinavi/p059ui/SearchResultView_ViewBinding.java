package com.askey.taipeinavi.p059ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

/* renamed from: com.askey.taipeinavi.ui.SearchResultView_ViewBinding */
public class SearchResultView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchResultView f4621a;

    /* renamed from: b */
    private View f4622b;

    public SearchResultView_ViewBinding(SearchResultView searchResultView, View view) {
        this.f4621a = searchResultView;
        View a = C1153c.m5849a(view, R.id.listSearchResult, "field 'mListSearchResult' and method 'onItemClick'");
        searchResultView.mListSearchResult = (ListView) C1153c.m5850a(a, R.id.listSearchResult, "field 'mListSearchResult'", ListView.class);
        this.f4622b = a;
        ((AdapterView) a).setOnItemClickListener(new C1323f(this, searchResultView));
        searchResultView.mTxtResultEmpty = (TextView) C1153c.m5853c(view, R.id.txtResultEmpty, "field 'mTxtResultEmpty'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        SearchResultView searchResultView = this.f4621a;
        if (searchResultView != null) {
            this.f4621a = null;
            searchResultView.mListSearchResult = null;
            searchResultView.mTxtResultEmpty = null;
            ((AdapterView) this.f4622b).setOnItemClickListener((AdapterView.OnItemClickListener) null);
            this.f4622b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
