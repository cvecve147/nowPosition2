package com.sto.stolibrary.customActivities;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.sto.stolibrary.customActivities.BuildingSelectActivity;
import com.sto.stolibrary.customActivities.C5061F;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p119e.p120a.C5288s;
import p101d.p191i.p192a.C6024f;

/* renamed from: com.sto.stolibrary.customActivities.b */
class C5068b implements C5288s.C5290b<JSONObject> {

    /* renamed from: a */
    final /* synthetic */ BuildingSelectActivity.C5051d f14402a;

    C5068b(BuildingSelectActivity.C5051d dVar) {
        this.f14402a = dVar;
    }

    /* renamed from: a */
    public void mo14126a(JSONObject jSONObject) {
        Log.d(BuildingSelectActivity.f14327d, jSONObject.toString());
        try {
            if (jSONObject.getJSONArray("data").length() == 0) {
                Toast.makeText(BuildingSelectActivity.this, BuildingSelectActivity.this.getString(C6024f.null_searching_result), 0).show();
                return;
            }
            Intent intent = new Intent(BuildingSelectActivity.this, SearchResultActivity.class);
            intent.putExtra("searchResult", jSONObject.toString());
            intent.putExtra("buildingID", BuildingSelectActivity.this.f14328e);
            BuildingSelectActivity.this.startActivity(intent);
            C5061F.C5062a a = C5061F.m19898b().mo14132a();
            if (a != null) {
                a.mo5622b(true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            BuildingSelectActivity buildingSelectActivity = BuildingSelectActivity.this;
            Toast.makeText(buildingSelectActivity, buildingSelectActivity.getString(C6024f.unknown_searching_error), 0).show();
        }
    }
}
