package com.facebook.login;

import com.facebook.C1352H;
import com.facebook.C1574p;
import com.facebook.GraphRequest;
import com.facebook.login.DeviceAuthDialog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.c */
class C1547c implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ DeviceAuthDialog f5314a;

    C1547c(DeviceAuthDialog deviceAuthDialog) {
        this.f5314a = deviceAuthDialog;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        if (!this.f5314a.f5260na) {
            if (h.mo5987a() != null) {
                this.f5314a.m7140a(h.mo5987a().mo5920e());
                return;
            }
            JSONObject b = h.mo5988b();
            DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
            try {
                requestState.mo6285b(b.getString("user_code"));
                requestState.mo6282a(b.getString("code"));
                requestState.mo6281a(b.getLong("interval"));
                this.f5314a.m7134a(requestState);
            } catch (JSONException e) {
                this.f5314a.m7140a(new C1574p((Throwable) e));
            }
        }
    }
}
