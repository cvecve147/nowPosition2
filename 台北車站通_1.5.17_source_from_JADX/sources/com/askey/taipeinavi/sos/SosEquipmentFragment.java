package com.askey.taipeinavi.sos;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1202f;
import p101d.p204k.p205a.C6053f;
import p299tw.navin.navinmap.map.C7089b;
import p299tw.navin.navinmap.map.C7101g;

public class SosEquipmentFragment extends C1202f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7089b f4569a = null;

    /* renamed from: b */
    private View f4570b;
    LinearLayout mRootLayout;

    /* renamed from: fa */
    private void m6374fa() {
        this.f4569a.mo20995a(C7101g.GROUP_SOS);
        this.f4570b = this.f4569a.mo21011d();
        this.f4390a.mo17239m();
        new C6053f(this.f4390a).mo16004c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").mo16543b(new C1302d(this));
        this.mRootLayout.addView(this.f4570b, 0, new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: M */
    public void mo1293M() {
        this.mRootLayout.removeView(this.f4570b);
        C7089b bVar = this.f4569a;
        if (bVar != null) {
            bVar.mo21013f();
            this.f4569a.mo21017j();
        }
        this.f4570b = null;
        super.mo1293M();
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        this.f4569a = this.f4391b.mo5587ga();
        if (this.f4391b.mo5589ha()) {
            m6374fa();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_sos_equipment;
    }
}
