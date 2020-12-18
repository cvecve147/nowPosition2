package org.altbeacon.beacon.p292b;

import org.altbeacon.beacon.p292b.C6889g;
import org.altbeacon.beacon.p293c.C6895d;
import org.json.JSONException;

/* renamed from: org.altbeacon.beacon.b.e */
class C6887e implements C6889g.C6890a {

    /* renamed from: a */
    final /* synthetic */ C6888f f18976a;

    C6887e(C6888f fVar) {
        this.f18976a = fVar;
    }

    /* renamed from: a */
    public void mo18733a(String str, Exception exc, int i) {
        Object[] objArr;
        String str2;
        if (exc != null) {
            objArr = new Object[]{exc, this.f18976a.f18982f};
            str2 = "Cannot updated distance models from online database at %s";
        } else if (i != 200) {
            objArr = new Object[]{this.f18976a.f18982f, Integer.valueOf(i)};
            str2 = "Cannot updated distance models from online database at %s due to HTTP status code %s";
        } else {
            C6895d.m26021a("ModelSpecificDistanceCalculator", "Successfully downloaded distance models from online database", new Object[0]);
            try {
                this.f18976a.mo18735a(str);
                if (this.f18976a.m25995c(str)) {
                    boolean unused = this.f18976a.m25994c();
                    C6885c unused2 = this.f18976a.f18979c = this.f18976a.mo18734a(this.f18976a.f18981e);
                    C6895d.m26026c("ModelSpecificDistanceCalculator", "Successfully updated distance model with latest from online database", new Object[0]);
                    return;
                }
                return;
            } catch (JSONException e) {
                C6895d.m26025b(e, "ModelSpecificDistanceCalculator", "Cannot parse json from downloaded distance model", new Object[0]);
                return;
            }
        }
        C6895d.m26027d("ModelSpecificDistanceCalculator", str2, objArr);
    }
}
