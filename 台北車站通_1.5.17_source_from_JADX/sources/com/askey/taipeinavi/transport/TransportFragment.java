package com.askey.taipeinavi.transport;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1194a;
import com.askey.taipeinavi.common.C1198b;
import com.askey.taipeinavi.home.C1254x;
import p267i.p274b.p282c.C6751l;

public class TransportFragment extends C1194a {
    LinearLayout mLLayMain;

    /* renamed from: com.askey.taipeinavi.transport.TransportFragment$a */
    private class C1303a implements C6751l {
        private C1303a() {
        }

        /* renamed from: a */
        public void mo5549a(View view, int i) {
            C1254x xVar;
            String str;
            int i2;
            switch (i) {
                case 0:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_rail);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_rail;
                    break;
                case 1:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_thsr);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_hs_rail;
                    break;
                case 2:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_mrt_taipei);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_tpe_mrt;
                    break;
                case 3:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_mrt_taoyuan);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_ty_mrt;
                    break;
                case 4:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_airport_taoyuan);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_ty_airport;
                    break;
                case 5:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_airport_songshan);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_ss_airport;
                    break;
                case 6:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_youbike);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_youbike;
                    break;
                case 7:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_taipei_bus);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_tb_station;
                    break;
                case 8:
                    str = TransportFragment.this.mo1396i().getString(R.string.url_bus5284);
                    xVar = TransportFragment.this.f4381b;
                    i2 = R.string.btxt_tpe_pb;
                    break;
                default:
                    return;
            }
            xVar.mo5585b(str, i2);
        }
    }

    /* renamed from: fa */
    private void m6394fa() {
        this.mLLayMain.addView(C1198b.m6002g(mo1396i(), this.mLLayMain, new C1303a()));
        this.f4380a.mo17238e(R.string.btxt_trans);
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

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        m6394fa();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_transport;
    }
}
