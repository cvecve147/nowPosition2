package com.onesignal;

import com.onesignal.C4306Xa;
import com.onesignal.C4416rb;

/* renamed from: com.onesignal.Wb */
class C4304Wb extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ C4327Zb f12729a;

    C4304Wb(C4327Zb zb) {
        this.f12729a = zb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12377a(int i, String str, Throwable th) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.WARN;
        C4306Xa.m17135a(jVar, "Failed last request. statusCode: " + i + "\nresponse: " + str);
        if (this.f12729a.m17240a(i, str, "already logged out of email")) {
            this.f12729a.m17252o();
        } else if (this.f12729a.m17240a(i, str, "not a valid device_type")) {
            this.f12729a.mo12418m();
        } else {
            this.f12729a.m17237a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12355a(String str) {
        this.f12729a.m17252o();
    }
}
