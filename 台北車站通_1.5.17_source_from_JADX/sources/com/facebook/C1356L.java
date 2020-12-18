package com.facebook;

import android.net.Uri;
import com.facebook.internal.C1480ba;
import org.json.JSONObject;

/* renamed from: com.facebook.L */
class C1356L implements C1480ba.C1481a {
    C1356L() {
    }

    /* renamed from: a */
    public void mo5992a(C1574p pVar) {
    }

    /* renamed from: a */
    public void mo5993a(JSONObject jSONObject) {
        String optString = jSONObject.optString("id");
        if (optString != null) {
            String optString2 = jSONObject.optString("link");
            Profile.m6617a(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null));
        }
    }
}
