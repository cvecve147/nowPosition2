package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.C4306Xa;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    /* access modifiers changed from: protected */
    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        if (!C4277O.m16965a(applicationContext, extras).mo12364a()) {
            C4290S s = new C4290S(applicationContext);
            s.f12709b = C4277O.m16977b(extras);
            C4277O.m16964a(s);
        }
    }

    /* access modifiers changed from: protected */
    public void onRegistered(String str) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.INFO;
        C4306Xa.m17135a(jVar, "ADM registration ID: " + str);
        C4448yb.m17645a(str);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(String str) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
        C4306Xa.m17135a(jVar, "ADM:onRegistrationError: " + str);
        if ("INVALID_SENDER".equals(str)) {
            C4306Xa.m17135a(C4306Xa.C4316j.ERROR, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        C4448yb.m17645a((String) null);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(String str) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.INFO;
        C4306Xa.m17135a(jVar, "ADM:onUnregistered: " + str);
    }
}
