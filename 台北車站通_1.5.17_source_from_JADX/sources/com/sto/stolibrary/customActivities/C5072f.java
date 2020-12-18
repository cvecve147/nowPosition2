package com.sto.stolibrary.customActivities;

import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.C5288s;

/* renamed from: com.sto.stolibrary.customActivities.f */
class C5072f implements C5288s.C5290b<JSONObject> {

    /* renamed from: a */
    final /* synthetic */ DetailActivity f14406a;

    C5072f(DetailActivity detailActivity) {
        this.f14406a = detailActivity;
    }

    /* renamed from: a */
    public void mo14126a(JSONObject jSONObject) {
        try {
            if (jSONObject.getJSONArray("data").length() > 0) {
                this.f14406a.m19892a(jSONObject.getJSONArray("data").getJSONObject(0));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
