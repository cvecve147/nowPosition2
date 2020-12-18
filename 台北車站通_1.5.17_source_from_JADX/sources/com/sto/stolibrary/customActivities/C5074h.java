package com.sto.stolibrary.customActivities;

import android.util.Log;
import com.sto.stolibrary.customActivities.DetailActivity;
import org.json.JSONObject;
import p101d.p119e.p120a.C5288s;
import p101d.p191i.p192a.C6024f;
import p101d.p191i.p192a.p200e.C6023g;

/* renamed from: com.sto.stolibrary.customActivities.h */
class C5074h implements C5288s.C5290b<JSONObject> {

    /* renamed from: a */
    final /* synthetic */ DetailActivity.C5058b f14408a;

    C5074h(DetailActivity.C5058b bVar) {
        this.f14408a = bVar;
    }

    /* renamed from: a */
    public void mo14126a(JSONObject jSONObject) {
        Log.d(DetailActivity.f14347d, jSONObject.toString());
        DetailActivity detailActivity = DetailActivity.this;
        int unused = detailActivity.f14354k = detailActivity.f14354k + 1;
        if (DetailActivity.this.f14354k == 2) {
            C6023g.m22858a(DetailActivity.this.f14351h, DetailActivity.this.getString(C6024f.notification_enabled));
        }
    }
}
