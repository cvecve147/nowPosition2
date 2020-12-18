package com.facebook;

import android.content.Context;
import com.facebook.C1601x;
import com.facebook.p060a.C1406q;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.v */
class C1599v implements Callable<Void> {

    /* renamed from: a */
    final /* synthetic */ C1601x.C1602a f5390a;

    /* renamed from: b */
    final /* synthetic */ Context f5391b;

    C1599v(C1601x.C1602a aVar, Context context) {
        this.f5390a = aVar;
        this.f5391b = context;
    }

    public Void call() {
        C1425g.m6764c().mo6096d();
        C1359O.m6608b().mo6001c();
        if (AccessToken.m6460b() != null && Profile.m6618b() == null) {
            Profile.m6616a();
        }
        C1601x.C1602a aVar = this.f5390a;
        if (aVar != null) {
            aVar.mo6463a();
        }
        C1406q.m6714b(this.f5391b.getApplicationContext()).mo6067a();
        return null;
    }
}
