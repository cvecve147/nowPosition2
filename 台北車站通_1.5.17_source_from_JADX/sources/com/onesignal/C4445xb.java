package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.onesignal.C4306Xa;
import com.onesignal.C4441wb;

/* renamed from: com.onesignal.xb */
class C4445xb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f13104a;

    /* renamed from: b */
    final /* synthetic */ C4441wb.C4442a f13105b;

    /* renamed from: c */
    final /* synthetic */ C4448yb f13106c;

    C4445xb(C4448yb ybVar, Context context, C4441wb.C4442a aVar) {
        this.f13106c = ybVar;
        this.f13104a = context;
        this.f13105b = aVar;
    }

    public void run() {
        ADM adm = new ADM(this.f13104a);
        String registrationId = adm.getRegistrationId();
        if (registrationId == null) {
            adm.startRegister();
        } else {
            C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
            C4306Xa.m17135a(jVar, "ADM Already registered with ID:" + registrationId);
            this.f13105b.mo12409a(registrationId, 1);
        }
        try {
            Thread.sleep(30000);
        } catch (InterruptedException unused) {
        }
        if (!C4448yb.f13111b) {
            C4306Xa.m17135a(C4306Xa.C4316j.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
            C4448yb.m17645a((String) null);
        }
    }
}
