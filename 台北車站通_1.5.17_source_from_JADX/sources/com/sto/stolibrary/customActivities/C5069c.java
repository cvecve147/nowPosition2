package com.sto.stolibrary.customActivities;

import android.util.Log;
import android.widget.Toast;
import com.sto.stolibrary.customActivities.BuildingSelectActivity;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5295x;
import p101d.p191i.p192a.C6024f;

/* renamed from: com.sto.stolibrary.customActivities.c */
class C5069c implements C5288s.C5289a {

    /* renamed from: a */
    final /* synthetic */ BuildingSelectActivity.C5051d f14403a;

    C5069c(BuildingSelectActivity.C5051d dVar) {
        this.f14403a = dVar;
    }

    /* renamed from: a */
    public void mo14131a(C5295x xVar) {
        Log.d(BuildingSelectActivity.f14327d, xVar.toString());
        BuildingSelectActivity buildingSelectActivity = BuildingSelectActivity.this;
        Toast.makeText(buildingSelectActivity, buildingSelectActivity.getString(C6024f.unknown_searching_error), 0).show();
    }
}
