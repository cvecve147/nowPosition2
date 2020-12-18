package com.onesignal;

import com.onesignal.C4306Xa;
import com.onesignal.C4327Zb;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.onesignal.La */
class C4262La implements Runnable {
    C4262La() {
    }

    public void run() {
        JSONObject jSONObject;
        C4327Zb.C4328a a = C4421sb.m17514a(!C4306Xa.f12741J);
        if (a.f12835a) {
            boolean unused = C4306Xa.f12741J = true;
        }
        synchronized (C4306Xa.f12740I) {
            Iterator it = C4306Xa.f12740I.iterator();
            while (it.hasNext()) {
                C4306Xa.C4312f fVar = (C4306Xa.C4312f) it.next();
                if (a.f12836b != null) {
                    if (!a.toString().equals("{}")) {
                        jSONObject = a.f12836b;
                        fVar.mo12433a(jSONObject);
                    }
                }
                jSONObject = null;
                fVar.mo12433a(jSONObject);
            }
            C4306Xa.f12740I.clear();
        }
    }
}
