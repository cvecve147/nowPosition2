package com.onesignal;

import android.webkit.ValueCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.dc */
class C4358dc implements ValueCallback<String> {

    /* renamed from: a */
    final /* synthetic */ C4362ec f12883a;

    C4358dc(C4362ec ecVar) {
        this.f12883a = ecVar;
    }

    /* renamed from: a */
    public void onReceiveValue(String str) {
        System.out.println("2nd pageRectToViewHeight");
        try {
            this.f12883a.f12887a.m17397a(Integer.valueOf(C4384jc.m17400b(this.f12883a.f12887a.f12931f, new JSONObject(str))));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
