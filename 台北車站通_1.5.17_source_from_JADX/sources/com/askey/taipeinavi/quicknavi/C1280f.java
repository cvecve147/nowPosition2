package com.askey.taipeinavi.quicknavi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1198b;
import com.askey.taipeinavi.home.C1254x;
import p267i.p274b.p282c.C6751l;

/* renamed from: com.askey.taipeinavi.quicknavi.f */
class C1280f extends C1281g {
    C1280f(C1254x xVar) {
        super(xVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo5632a(Context context, ViewGroup viewGroup, C6751l lVar) {
        return C1198b.m6001f(context, viewGroup, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5633a(View view, int i) {
        C1281g gVar;
        C1254x xVar;
        String str;
        C1254x xVar2;
        if (i == 0) {
            xVar = mo5635a();
            gVar = C1283i.m6328d(mo5635a());
        } else if (i != 1) {
            if (i == 2) {
                xVar2 = mo5635a();
                str = "EXIT";
            } else if (i == 3) {
                xVar2 = mo5635a();
                str = "ATM";
            } else if (i == 4) {
                xVar = mo5635a();
                gVar = C1283i.m6330f(mo5635a());
            } else if (i == 5) {
                xVar2 = mo5635a();
                str = "LOCKERS";
            } else {
                return;
            }
            xVar2.mo5584b(str);
            return;
        } else {
            xVar = mo5635a();
            gVar = C1283i.m6325a(mo5635a());
        }
        xVar.mo5575a(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo5634b() {
        return R.string.btxt_quick_navi;
    }
}
