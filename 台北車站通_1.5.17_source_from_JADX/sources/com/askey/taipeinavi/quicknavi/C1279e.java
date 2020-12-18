package com.askey.taipeinavi.quicknavi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.C1198b;
import com.askey.taipeinavi.home.C1254x;
import p267i.p274b.p282c.C6751l;

/* renamed from: com.askey.taipeinavi.quicknavi.e */
class C1279e extends C1281g {
    C1279e(C1254x xVar) {
        super(xVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo5632a(Context context, ViewGroup viewGroup, C6751l lVar) {
        return C1198b.m5999d(context, viewGroup, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5633a(View view, int i) {
        String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : "DISABLED_RESTROOM" : "RESTROOM_PARENTS" : "FEMALE_RESTROOM" : "MALE_RESTROOM";
        if (str != null) {
            mo5635a().mo5584b(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo5634b() {
        return R.string.btxt_toilet;
    }
}
