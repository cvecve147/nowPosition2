package com.facebook.login;

import com.facebook.C1352H;
import com.facebook.C1574p;
import com.facebook.C1601x;
import com.facebook.GraphRequest;
import com.facebook.internal.C1430A;
import com.facebook.internal.C1473X;
import com.facebook.internal.C1480ba;
import com.facebook.p062b.p063a.C1419b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.j */
class C1554j implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ String f5325a;

    /* renamed from: b */
    final /* synthetic */ DeviceAuthDialog f5326b;

    C1554j(DeviceAuthDialog deviceAuthDialog, String str) {
        this.f5326b = deviceAuthDialog;
        this.f5325a = str;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        if (!this.f5326b.f5255ia.get()) {
            if (h.mo5987a() != null) {
                this.f5326b.m7140a(h.mo5987a().mo5920e());
                return;
            }
            try {
                JSONObject b = h.mo5988b();
                String string = b.getString("id");
                C1480ba.C1482b a = C1480ba.m6920a(b);
                String string2 = b.getString("name");
                C1419b.m6749a(this.f5326b.f5258la.mo6286c());
                if (!C1430A.m6778b(C1601x.m7389c()).mo6252g().contains(C1473X.RequireConfirm) || this.f5326b.f5261oa) {
                    this.f5326b.m7141a(string, a, this.f5325a);
                    return;
                }
                boolean unused = this.f5326b.f5261oa = true;
                this.f5326b.m7142a(string, a, this.f5325a, string2);
            } catch (JSONException e) {
                this.f5326b.m7140a(new C1574p((Throwable) e));
            }
        }
    }
}
