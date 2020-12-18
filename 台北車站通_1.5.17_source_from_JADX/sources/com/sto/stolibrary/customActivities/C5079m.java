package com.sto.stolibrary.customActivities;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.p002a.C0007f;

/* renamed from: com.sto.stolibrary.customActivities.m */
class C5079m extends C0007f {

    /* renamed from: a */
    final /* synthetic */ JSONObject f14413a;

    /* renamed from: b */
    final /* synthetic */ FunctionSelectionActivity f14414b;

    C5079m(FunctionSelectionActivity functionSelectionActivity, JSONObject jSONObject) {
        this.f14414b = functionSelectionActivity;
        this.f14413a = jSONObject;
    }

    /* renamed from: a */
    public void mo12a(int[] iArr) {
        Log.d(FunctionSelectionActivity.f14367d, iArr.toString());
        this.f14414b.f14373j.mo15914a((float) iArr[0], (float) iArr[1], iArr[2], iArr[3]);
        try {
            this.f14414b.f14373j.mo15915a((String) this.f14413a.get(Integer.toString(iArr[2])));
        } catch (JSONException unused) {
        }
    }
}
