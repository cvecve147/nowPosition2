package com.askey.taipeinavi.home;

import android.app.Activity;
import android.os.Bundle;
import com.askey.taipeinavi.p053a.C1178b;
import com.askey.taipeinavi.p053a.C1182c;
import com.askey.taipeinavi.p053a.p054a.C1176c;
import com.askey.taipeinavi.p053a.p054a.C1177d;
import com.askey.taipeinavi.p058d.C1213g;

/* renamed from: com.askey.taipeinavi.home.I */
class C1229I extends C1178b {
    C1229I(Activity activity, C1178b.C1181c cVar) {
        super(activity, cVar);
    }

    /* renamed from: a */
    private void m6159a(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("binding_code", str);
        super.mo5470b(i, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1182c mo5467a(int i, Bundle bundle) {
        String c = C1213g.m6051c(this.f4351a);
        switch (i) {
            case 100:
                return C1182c.m5937a(new C1176c(this.f4351a, new C1178b.C1179a(), i), c, bundle);
            case 101:
            case 102:
                return C1182c.m5939b(new C1177d(this.f4351a, new C1178b.C1179a(), i), c, bundle);
            default:
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5552a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("uupon_token", str);
        super.mo5470b(100, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo5553b() {
        return (String) mo5468a(100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo5554b(int i) {
        return (String) mo5468a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5555b(String str) {
        m6159a(str, 101);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5556c(String str) {
        m6159a(str, 102);
    }
}
