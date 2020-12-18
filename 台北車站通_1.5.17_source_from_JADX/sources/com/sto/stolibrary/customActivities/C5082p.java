package com.sto.stolibrary.customActivities;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.sto.stolibrary.customActivities.C5061F;

/* renamed from: com.sto.stolibrary.customActivities.p */
class C5082p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FunctionSelectionActivity f14417a;

    C5082p(FunctionSelectionActivity functionSelectionActivity) {
        this.f14417a = functionSelectionActivity;
    }

    public void onClick(View view) {
        Log.d(FunctionSelectionActivity.f14367d, "SOS");
        Intent intent = new Intent(this.f14417a, HelpPopActivity.class);
        intent.putExtra("buildingID", this.f14417a.f14369f);
        intent.putExtra("position", this.f14417a.f14373j.mo15922g());
        intent.putExtra("floorID", this.f14417a.f14373j.mo15918c());
        this.f14417a.startActivity(intent);
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5623c(false);
        }
    }
}
