package com.askey.taipeinavi.setting;

import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1194a;
import com.askey.taipeinavi.p058d.C1212f;

public class MoreLinkFragment extends C1194a {
    /* renamed from: P */
    public void mo1327P() {
        this.f4380a.mo5533g(R.string.btxt_more_link);
        this.f4380a.mo5527b(true, (int) R.string.txt_back);
        super.mo1327P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_setting_more_link;
    }

    public void onFunTaipeiClicked() {
        C1212f.m6037b(mo1396i(), new C1284a(this));
    }
}
