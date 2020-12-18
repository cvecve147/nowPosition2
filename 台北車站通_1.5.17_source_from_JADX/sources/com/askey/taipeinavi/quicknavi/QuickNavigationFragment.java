package com.askey.taipeinavi.quicknavi;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1194a;
import p267i.p274b.p282c.C6751l;

public class QuickNavigationFragment extends C1194a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1281g f4526a;
    LinearLayout mLLayMain;

    /* renamed from: com.askey.taipeinavi.quicknavi.QuickNavigationFragment$a */
    private class C1274a implements C6751l {
        private C1274a() {
        }

        /* renamed from: a */
        public void mo5549a(View view, int i) {
            QuickNavigationFragment.this.f4526a.mo5633a(view, i);
        }
    }

    /* renamed from: fa */
    private void m6292fa() {
        C1281g gVar = this.f4526a;
        if (gVar != null) {
            this.mLLayMain.addView(gVar.mo5632a(mo1396i(), this.mLLayMain, new C1274a()));
            this.f4380a.mo17238e(this.f4526a.mo5634b());
        }
    }

    /* renamed from: K */
    public void mo1324K() {
        C1281g gVar = this.f4526a;
        if (gVar != null) {
            gVar.mo5637c();
            this.f4526a = null;
        }
        super.mo1324K();
    }

    /* renamed from: O */
    public void mo1326O() {
        super.mo1326O();
    }

    /* renamed from: P */
    public void mo1327P() {
        this.f4380a.mo5542v();
        this.f4380a.mo5527b(true, (int) R.string.txt_back);
        super.mo1327P();
    }

    /* renamed from: a */
    public void mo5631a(C1281g gVar) {
        this.f4526a = gVar;
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        m6292fa();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_quick_navigation;
    }
}
