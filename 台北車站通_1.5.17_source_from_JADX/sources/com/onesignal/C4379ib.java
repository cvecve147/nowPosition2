package com.onesignal;

import com.onesignal.C4306Xa;
import com.onesignal.C4390kb;
import com.onesignal.C4416rb;

/* renamed from: com.onesignal.ib */
class C4379ib extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ C4390kb.C4391a f12920a;

    C4379ib(C4390kb.C4391a aVar) {
        this.f12920a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12377a(int i, String str, Throwable th) {
        if (i == 403) {
            C4306Xa.m17135a(C4306Xa.C4316j.FATAL, "403 error getting OneSignal params, omitting further retries!");
        } else {
            new Thread(new C4375hb(this), "OS_PARAMS_REQUEST").start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12355a(String str) {
        C4390kb.m17424b(str, this.f12920a);
    }
}
