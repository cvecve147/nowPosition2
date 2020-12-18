package com.sto.stolibrary.customActivities;

import android.content.Intent;
import android.view.View;
import com.sto.stolibrary.customActivities.C5061F;

/* renamed from: com.sto.stolibrary.customActivities.o */
class C5081o implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FunctionSelectionActivity f14416a;

    C5081o(FunctionSelectionActivity functionSelectionActivity) {
        this.f14416a = functionSelectionActivity;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f14416a, SearchingActivity.class);
        intent.putExtra("buildingID", this.f14416a.f14369f);
        this.f14416a.startActivity(intent);
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5622b(false);
        }
    }
}
