package com.askey.taipeinavi.p059ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.askey.taipeinavi.R;
import p267i.p274b.p283d.C6775k;

/* renamed from: com.askey.taipeinavi.ui.SearchView */
public class SearchView extends LinearLayout {

    /* renamed from: a */
    private C1319b f4623a;

    /* renamed from: b */
    private boolean f4624b = false;
    EditText mEtxtSearch;
    View mIbtnClearSearch;
    View mIbtnToggleGlobalMap;
    View mTbnCancelSearch;

    public SearchView(Context context) {
        super(context);
        m6442b();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6442b();
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6442b();
    }

    /* renamed from: b */
    private void m6442b() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_search, this, true);
        ButterKnife.m5843a((Object) this, (View) this);
    }

    /* renamed from: a */
    public void mo5661a() {
        this.mEtxtSearch.setText("");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSearchTyping(java.lang.CharSequence r3) {
        /*
            r2 = this;
            boolean r0 = r2.f4624b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r3 = r3.toString()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0017
            android.view.View r0 = r2.mIbtnClearSearch
            r1 = 8
        L_0x0013:
            r0.setVisibility(r1)
            goto L_0x0023
        L_0x0017:
            android.view.View r0 = r2.mIbtnClearSearch
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0023
            android.view.View r0 = r2.mIbtnClearSearch
            r1 = 0
            goto L_0x0013
        L_0x0023:
            android.widget.EditText r0 = r2.mEtxtSearch
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x0032
            com.askey.taipeinavi.ui.b r0 = r2.f4623a
            if (r0 == 0) goto L_0x0032
            r0.mo5545a(r3)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.askey.taipeinavi.p059ui.SearchView.onSearchTyping(java.lang.CharSequence):void");
    }

    /* access modifiers changed from: package-private */
    public void onSearchViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.ibtnClearSearch) {
            mo5661a();
        } else if (id == R.id.ibtnToggleGlobalMap) {
            C1319b bVar = this.f4623a;
            if (bVar != null) {
                bVar.mo5544a();
            }
        } else if (id == R.id.tbtnCancelSearch) {
            setSearchFocus(false);
            C1319b bVar2 = this.f4623a;
            if (bVar2 != null) {
                bVar2.onCancel();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean onTouchView(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        setSearchFocus(true);
        return false;
    }

    public void setOnSearchViewListener(C1319b bVar) {
        this.f4623a = bVar;
    }

    public void setSearchFocus(boolean z) {
        this.f4624b = z;
        if (z) {
            if (!this.mEtxtSearch.getText().toString().isEmpty()) {
                this.mIbtnClearSearch.setVisibility(0);
            } else {
                this.mIbtnClearSearch.setVisibility(8);
            }
            this.mTbnCancelSearch.setVisibility(0);
            this.mTbnCancelSearch.setEnabled(true);
            this.mIbtnToggleGlobalMap.setVisibility(8);
            this.mEtxtSearch.requestFocus();
            this.mEtxtSearch.setCursorVisible(true);
            C6775k.m25616c(getContext());
            C1319b bVar = this.f4623a;
            if (bVar != null) {
                bVar.mo5546b(this.mEtxtSearch.getText().toString());
                return;
            }
            return;
        }
        this.mIbtnClearSearch.setVisibility(8);
        this.mTbnCancelSearch.setVisibility(8);
        this.mTbnCancelSearch.setEnabled(false);
        this.mIbtnToggleGlobalMap.setVisibility(0);
        this.mEtxtSearch.clearFocus();
        this.mEtxtSearch.setCursorVisible(false);
        C6775k.m25613a(getContext());
    }
}
