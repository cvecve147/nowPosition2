package com.askey.taipeinavi.sos;

import android.os.Bundle;
import android.support.p011v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.LinearLayout;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1202f;
import com.askey.taipeinavi.p058d.C1208b;
import com.askey.taipeinavi.p058d.C1212f;
import java.util.ArrayList;
import p267i.p274b.p282c.C6751l;
import p267i.p274b.p282c.C6756q;
import p267i.p274b.p282c.C6760r;
import p267i.p274b.p282c.C6761s;

public class SosContactFragment extends C1202f {

    /* renamed from: a */
    private C6756q f4562a;

    /* renamed from: b */
    private C6761s f4563b;

    /* renamed from: c */
    private C6751l f4564c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C1301c> f4565d;
    LinearLayout mLLaySos;

    /* renamed from: com.askey.taipeinavi.sos.SosContactFragment$a */
    private class C1298a implements C6751l {
        private C1298a() {
        }

        /* renamed from: a */
        public void mo5549a(View view, int i) {
            C1301c cVar = (C1301c) SosContactFragment.this.f4565d.get(i);
            C1212f.m6035a(SosContactFragment.this.f4390a, cVar.f4576b, new C1300b(this, cVar));
        }
    }

    /* renamed from: fa */
    private void m6364fa() {
        String[] strArr = C1208b.f4400d;
        String[] stringArray = mo1396i().getResources().getStringArray(R.array.sos_org);
        this.f4565d = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            C1301c cVar = new C1301c();
            cVar.f4575a = stringArray[i];
            cVar.f4576b = strArr[i];
            this.f4565d.add(cVar);
        }
    }

    /* renamed from: ga */
    private void m6365ga() {
        this.f4563b = new SosContactViewHolder();
        this.f4564c = new C1298a();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo1396i());
        this.f4562a = new C6756q(this.f4563b, this.f4565d, R.layout.item_sos_contact_list);
        this.mLLaySos.addView(C6760r.m25584a(mo1396i(), this.mLLaySos, linearLayoutManager, this.f4562a, this.f4564c));
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        m6364fa();
        m6365ga();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_sos_contact;
    }
}
