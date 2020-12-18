package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.C1574p;
import com.facebook.share.internal.C1582e;
import com.facebook.share.model.SharePhoto;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.f */
class C1584f implements C1582e.C1583a {
    C1584f() {
    }

    /* renamed from: a */
    public JSONObject mo6417a(SharePhoto sharePhoto) {
        Uri a = sharePhoto.mo6445a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", a.toString());
            return jSONObject;
        } catch (JSONException e) {
            throw new C1574p("Unable to attach images", e);
        }
    }
}
