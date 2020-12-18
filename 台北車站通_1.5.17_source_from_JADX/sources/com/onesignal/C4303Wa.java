package com.onesignal;

import com.onesignal.C4306Xa;
import org.json.JSONException;

/* renamed from: com.onesignal.Wa */
class C4303Wa implements Runnable {
    C4303Wa() {
    }

    public void run() {
        try {
            C4306Xa.m17116U();
            C4349bb.m17319a(C4306Xa.f12757c, C4306Xa.f12762h, C4355d.m17331a());
        } catch (JSONException e) {
            C4306Xa.m17136a(C4306Xa.C4316j.FATAL, "FATAL Error registering device!", (Throwable) e);
        }
    }
}
