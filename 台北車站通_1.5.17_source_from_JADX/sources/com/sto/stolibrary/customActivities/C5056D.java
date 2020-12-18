package com.sto.stolibrary.customActivities;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.sto.stolibrary.customActivities.C5061F;
import com.sto.stolibrary.customActivities.SearchingActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.C5288s;
import p101d.p191i.p192a.C6024f;

/* renamed from: com.sto.stolibrary.customActivities.D */
class C5056D implements C5288s.C5290b<JSONObject> {

    /* renamed from: a */
    final /* synthetic */ SearchingActivity.C5066a f14346a;

    C5056D(SearchingActivity.C5066a aVar) {
        this.f14346a = aVar;
    }

    /* renamed from: a */
    public void mo14126a(JSONObject jSONObject) {
        Log.d(SearchingActivity.f14396d, jSONObject.toString());
        try {
            if (jSONObject.getJSONArray("data").length() == 0) {
                Toast.makeText(SearchingActivity.this, SearchingActivity.this.getString(C6024f.null_searching_result), 0).show();
                return;
            }
            Intent intent = new Intent(SearchingActivity.this, SearchResultActivity.class);
            intent.putExtra("searchResult", jSONObject.toString());
            intent.putExtra("buildingID", SearchingActivity.this.f14399g);
            SearchingActivity.this.startActivity(intent);
            C5061F.C5062a a = C5061F.m19898b().mo14132a();
            if (a != null) {
                a.mo5622b(true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            SearchingActivity searchingActivity = SearchingActivity.this;
            Toast.makeText(searchingActivity, searchingActivity.getString(C6024f.unknown_searching_error), 0).show();
        }
    }
}
