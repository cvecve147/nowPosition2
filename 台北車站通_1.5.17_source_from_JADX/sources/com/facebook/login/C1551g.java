package com.facebook.login;

import com.facebook.C1352H;
import com.facebook.C1574p;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import org.json.JSONException;

/* renamed from: com.facebook.login.g */
class C1551g implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ DeviceAuthDialog f5319a;

    C1551g(DeviceAuthDialog deviceAuthDialog) {
        this.f5319a = deviceAuthDialog;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        if (!this.f5319a.f5255ia.get()) {
            FacebookRequestError a = h.mo5987a();
            if (a != null) {
                int g = a.mo5922g();
                if (g != 1349152) {
                    switch (g) {
                        case 1349172:
                        case 1349174:
                            this.f5319a.m7158ia();
                            return;
                        case 1349173:
                            break;
                        default:
                            this.f5319a.m7140a(h.mo5987a().mo5920e());
                            return;
                    }
                }
                this.f5319a.m7154ga();
                return;
            }
            try {
                this.f5319a.m7147b(h.mo5988b().getString("access_token"));
            } catch (JSONException e) {
                this.f5319a.m7140a(new C1574p((Throwable) e));
            }
        }
    }
}
