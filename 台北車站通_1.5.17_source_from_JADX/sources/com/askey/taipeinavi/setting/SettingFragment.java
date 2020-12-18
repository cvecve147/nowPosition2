package com.askey.taipeinavi.setting;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1194a;
import com.askey.taipeinavi.p058d.C1212f;
import com.askey.taipeinavi.p058d.C1213g;
import p267i.p274b.p283d.C6766e;

public class SettingFragment extends C1194a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AlertDialog f4532a;

    /* renamed from: b */
    private C6766e f4533b;
    Switch mSbtnBarrierFree;
    Switch mSbtnPushMessage;
    Switch mSbtnTts;
    TextView mTxtVersion;

    /* access modifiers changed from: private */
    /* renamed from: fa */
    public void m6343fa() {
        this.f4533b.mo17255a(mo1396i(), (C6766e.C6769c) new C1289f(this));
    }

    /* renamed from: ga */
    private void m6345ga() {
        String string = mo1396i().getString(R.string.txt_version_format);
        this.mTxtVersion.setText(String.format(string, new Object[]{"1.5.17"}));
        if (!C1213g.m6068k(this.f4380a)) {
            this.mSbtnPushMessage.setChecked(false);
        }
        this.mSbtnPushMessage.setOnCheckedChangeListener(new C1286c(this));
        if (C1213g.m6062f(this.f4380a)) {
            this.mSbtnBarrierFree.setChecked(true);
        }
        this.mSbtnBarrierFree.setOnCheckedChangeListener(new C1287d(this));
        if (C1213g.m6073p(this.f4380a)) {
            this.mSbtnTts.setChecked(true);
            m6343fa();
        }
        this.mSbtnTts.setOnCheckedChangeListener(new C1288e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m6346h(boolean z) {
        this.f4380a.mo17239m();
        if (z) {
            C1213g.m6059e((Context) this.f4380a, true);
            if (C1213g.m6060e(mo1396i())) {
                m6347ha();
                C1213g.m6047a(mo1396i(), false);
                return;
            }
            return;
        }
        this.mSbtnTts.setChecked(false);
        C1212f.m6039c(mo1396i(), new C1290g(this));
    }

    /* renamed from: ha */
    private void m6347ha() {
        if (this.f4532a == null) {
            C1212f.m6044f(mo1396i(), new C1291h(this));
        }
    }

    /* renamed from: K */
    public void mo1324K() {
        C6766e eVar = this.f4533b;
        if (eVar != null) {
            eVar.mo17254a();
            this.f4533b = null;
        }
        this.f4532a = null;
        super.mo1324K();
    }

    /* renamed from: P */
    public void mo1327P() {
        this.f4380a.mo5533g(R.string.txt_setting);
        this.f4380a.mo5527b(true, (int) R.string.txt_back);
        super.mo1327P();
    }

    /* renamed from: a */
    public void mo1343a(int i, int i2, Intent intent) {
        super.mo1343a(i, i2, intent);
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        this.f4533b = new C6766e();
        m6345ga();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_setting;
    }

    public void onFacebookPageClicked() {
        this.f4381b.mo5591ja();
    }

    public void onHelloTaipeiClicked() {
        this.f4381b.mo5592ka();
    }

    public void onLanguageClicked() {
        C1212f.m6038c(mo1396i());
    }

    public void onMoreLinkClicked() {
        this.f4381b.mo5593la();
    }

    public void onTtsHintClicked() {
        m6347ha();
    }

    public void onTutorialClicked() {
        this.f4381b.mo5598qa();
    }
}
