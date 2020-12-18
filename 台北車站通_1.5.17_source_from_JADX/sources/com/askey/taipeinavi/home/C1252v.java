package com.askey.taipeinavi.home;

import com.askey.taipeinavi.home.C1254x;

/* renamed from: com.askey.taipeinavi.home.v */
class C1252v extends C1254x.C1256b {

    /* renamed from: c */
    final /* synthetic */ String f4483c;

    /* renamed from: d */
    final /* synthetic */ int f4484d;

    /* renamed from: e */
    final /* synthetic */ C1254x f4485e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1252v(C1254x xVar, boolean z, String str, int i) {
        super(z);
        this.f4485e = xVar;
        this.f4483c = str;
        this.f4484d = i;
    }

    /* renamed from: a */
    public void mo5567a() {
        super.mo5567a();
        this.f4485e.f4487ba.runOnUiThread(new C1251u(this));
    }
}
