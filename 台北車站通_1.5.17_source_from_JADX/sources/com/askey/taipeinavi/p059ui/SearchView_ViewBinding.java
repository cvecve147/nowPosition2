package com.askey.taipeinavi.p059ui;

import android.annotation.SuppressLint;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

/* renamed from: com.askey.taipeinavi.ui.SearchView_ViewBinding */
public class SearchView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchView f4625a;

    /* renamed from: b */
    private View f4626b;

    /* renamed from: c */
    private View f4627c;

    /* renamed from: d */
    private View f4628d;

    /* renamed from: e */
    private TextWatcher f4629e;

    /* renamed from: f */
    private View f4630f;

    @SuppressLint({"ClickableViewAccessibility"})
    public SearchView_ViewBinding(SearchView searchView, View view) {
        this.f4625a = searchView;
        View a = C1153c.m5849a(view, R.id.tbtnCancelSearch, "field 'mTbnCancelSearch' and method 'onSearchViewClicked'");
        searchView.mTbnCancelSearch = a;
        this.f4626b = a;
        a.setOnClickListener(new C1324g(this, searchView));
        View a2 = C1153c.m5849a(view, R.id.ibtnToggleGlobalMap, "field 'mIbtnToggleGlobalMap' and method 'onSearchViewClicked'");
        searchView.mIbtnToggleGlobalMap = a2;
        this.f4627c = a2;
        a2.setOnClickListener(new C1325h(this, searchView));
        View a3 = C1153c.m5849a(view, R.id.etxtSearch, "field 'mEtxtSearch', method 'onSearchTyping', and method 'onTouchView'");
        searchView.mEtxtSearch = (EditText) C1153c.m5850a(a3, R.id.etxtSearch, "field 'mEtxtSearch'", EditText.class);
        this.f4628d = a3;
        this.f4629e = new C1326i(this, searchView);
        ((TextView) a3).addTextChangedListener(this.f4629e);
        a3.setOnTouchListener(new C1327j(this, searchView));
        View a4 = C1153c.m5849a(view, R.id.ibtnClearSearch, "field 'mIbtnClearSearch' and method 'onSearchViewClicked'");
        searchView.mIbtnClearSearch = a4;
        this.f4630f = a4;
        a4.setOnClickListener(new C1328k(this, searchView));
    }

    /* renamed from: a */
    public void mo5375a() {
        SearchView searchView = this.f4625a;
        if (searchView != null) {
            this.f4625a = null;
            searchView.mTbnCancelSearch = null;
            searchView.mIbtnToggleGlobalMap = null;
            searchView.mEtxtSearch = null;
            searchView.mIbtnClearSearch = null;
            this.f4626b.setOnClickListener((View.OnClickListener) null);
            this.f4626b = null;
            this.f4627c.setOnClickListener((View.OnClickListener) null);
            this.f4627c = null;
            ((TextView) this.f4628d).removeTextChangedListener(this.f4629e);
            this.f4629e = null;
            this.f4628d.setOnTouchListener((View.OnTouchListener) null);
            this.f4628d = null;
            this.f4630f.setOnClickListener((View.OnClickListener) null);
            this.f4630f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
