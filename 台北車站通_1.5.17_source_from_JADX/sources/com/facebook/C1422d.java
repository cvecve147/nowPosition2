package com.facebook;

import android.util.Log;
import com.facebook.GraphRequest;
import com.facebook.internal.C1480ba;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.d */
class C1422d implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f4979a;

    /* renamed from: b */
    final /* synthetic */ Set f4980b;

    /* renamed from: c */
    final /* synthetic */ Set f4981c;

    /* renamed from: d */
    final /* synthetic */ C1425g f4982d;

    C1422d(C1425g gVar, AtomicBoolean atomicBoolean, Set set, Set set2) {
        this.f4982d = gVar;
        this.f4979a = atomicBoolean;
        this.f4980b = set;
        this.f4981c = set2;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        JSONArray optJSONArray;
        Set set;
        JSONObject b = h.mo5988b();
        if (b != null && (optJSONArray = b.optJSONArray("data")) != null) {
            this.f4979a.set(true);
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("permission");
                    String optString2 = optJSONObject.optString("status");
                    if (!C1480ba.m6958b(optString) && !C1480ba.m6958b(optString2)) {
                        String lowerCase = optString2.toLowerCase(Locale.US);
                        if (lowerCase.equals("granted")) {
                            set = this.f4980b;
                        } else if (lowerCase.equals("declined")) {
                            set = this.f4981c;
                        } else {
                            Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                        }
                        set.add(optString);
                    }
                }
            }
        }
    }
}
